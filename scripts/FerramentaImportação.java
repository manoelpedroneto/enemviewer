package txttosql;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TxtTosql {

    public static void main(String[] args) throws FileNotFoundException, SQLException, ClassNotFoundException, IOException {

// Conexão ao banco e acesso ao banco
// Poderia ter feito com apenas um comando mas desta forma fica melhor explicado
// Caso queira testar apenas a saída do programa comente esta parte do código para que ele
// Não tente acessar o banco
        String caminho = "jdbc:postgresql://10.1.168.130:5432/enem";
        String usuario = "postgres";
        String senha = "postgres";
		Connection conexao = null;

        Class.forName("org.postgresql.Driver");
        conexao = DriverManager.getConnection(caminho, usuario, senha);
        Statement stm = conexao.createStatement(); 
// Fim da conexão ao banco
//================================================================================================================================
        
// Leitura do arquivo de configurações dos campos "C:\Campos.txt" apenas para contar 
// o número de linhas e armazenar na variável contCampos que será útil durante a execução
// do programa
        
        Scanner lerCampos = new Scanner(System.in);
        String arqCampos = "c:\\Campos.txt"; // Caso queiram testar coloquem estes arquivos no raíz do C: ou mudem o caminho aqui.
        
        FileReader arquivoCampos1 = new FileReader(arqCampos);
        BufferedReader lerArqCampos = new BufferedReader(arquivoCampos1);
        String linhaCampos = lerArqCampos.readLine(); // Leitura da primeira linha
        int contCampos = 0;
        
        while (linhaCampos != null){ // A variável linha receberá null ao final do arquivo saindo do laço
            contCampos++;
            linhaCampos = lerArqCampos.readLine(); // Leitura da próxima linha
        }
// Fim da contagem, neste momento a variável contCampos já está atualizada
// Caso queira verificar o valor da variável contCampos descomente a linha abaixo
	// System.out.println("O valor da variável contCampos é: " + contCampos);
//================================================================================================================================
       

// Criar as variáveis que armazenarão temporariamente o conteúdo de cada linha de Campos.txt
// os valores serão passados ao final de cada TOKEN encontrado para vetores com tamanho igual à
// quantidade de campos, por isso a variável contCampos
        String tmpNome = "";
        String tmpTipo = "";
        String tmpTamanho = ""; 
        String tmpValor = "";
        
// Criar as variáveis de modo dinâmico baseado na quantidade de campos no arquivo Campos.txt
// estes vetores armazenarão temporariamente os dados de cada linha, ao final da linha  já é possível
// preencher a consulta SQL para inserir o registro com os dados destes vetores
        String[] nomeCampo = new String[contCampos]; // Vetor que receberá os nomes dos campos
        String[] tipoCampo = new String[contCampos]; // Vetor que receberá os tipos dos campos (1 - Inteiro e 2 - String)       
        int[] tamanhoCampo = new int[contCampos]; // Vetor que receberá os tamanhos de cada campo, é muito importante, pois define quando um campo termina
        String[] valorCampo = new String[contCampos]; // Vetor que receberá os valores dos campos
        int numeroColunas = 0;

// Fim da criação das principais variáveis        
//================================================================================================================================
     
        
// Preencher os vetores com os valores dos campos (Nome, Tipo, Tamanho)
        FileReader arquivoCampos2 = new FileReader(arqCampos);
        lerArqCampos = new BufferedReader(arquivoCampos2);
        
        linhaCampos = lerArqCampos.readLine(); // Leitura da primeira linha
        int contPosicao = 0;
        int saida = 0;
        int contador = 0;
      
        while (linhaCampos != null){
            for(; saida == 0; contPosicao++){
               if(linhaCampos.charAt(contPosicao) != '|'){
                   tmpNome = tmpNome + linhaCampos.charAt(contPosicao); // Preenche caracter a caracter o nome do campo até localizar o Token " | "
               }else{
                   saida = 1; // Encontrou o primeiro Token " | "
               }
            }
            for(; saida == 1; contPosicao++){
               if(linhaCampos.charAt(contPosicao) != '|'){
                   tmpTipo = tmpTipo + linhaCampos.charAt(contPosicao); // Preenche o tipo do campo até localizar o Token " | " 
               }else{
                   saida = 2; // Encontrou o segundo Token " | "
               }  
            }
            for(; saida == 2; contPosicao++){
               if(linhaCampos.charAt(contPosicao) != '|'){
                   tmpTamanho = tmpTamanho + linhaCampos.charAt(contPosicao); // Preenche o tamanho do campo até localizar o Token " | "  
               }else{
                   saida = 3; // Encontrou o terceiro Token " | "
               }                
            }
            
            linhaCampos = lerArqCampos.readLine(); // Leitura da primeira linha e retorno ao laço até que seja a última linha do arquivo
		   		   
// Preencher os três vetores com as informações dos campos obtidos no laço acima
            nomeCampo[contador] = tmpNome; 
            tipoCampo[contador] = tmpTipo;
            tamanhoCampo[contador] = Integer.parseInt(tmpTamanho);            

            
            tmpNome = "";
            tmpTipo = "";
            tmpTamanho = "";  
            contPosicao = 0;
            saida = 0; 
            contador++;
        }
// Fim do preenchimento das variáveis temporárias que darão as informações necessárias à criação dos vetores 
// Fim do preenchimento dos vetores "nomeCampo", "tipoCampo" e "tamanhoCampo" que são importantes para percorrer
// o arquivo de textos montando a consulta       
//================================================================================================================================		
        
// Calcular o número de colunas que o arquivo de Dados.txt conterá
        numeroColunas = tamanhoCampo[0];
        for(contador = 0; contador < contCampos; contador++){
            numeroColunas = numeroColunas + tamanhoCampo[contador];
        }
// Fim do cálculo do número de colunas
        
// Fim do preenchimento dos três vetores com as informações dos campos        
        registro reg = new registro();  

// Leitura do arquivo de dados

        Scanner lerBanco = new Scanner(System.in);
        String arqBanco = "c:\\DADOS_ENEM_2010.txt"; // Caso queiram testar coloquem estes arquivos no raíz do C: ou mudem o caminho aqui.
        
        FileReader arquivoBanco = new FileReader(arqBanco);
        BufferedReader lerArqBanco = new BufferedReader(arquivoBanco);
        String linhaBanco = lerArqBanco.readLine(); // Lê a primeira linha  

// Preencher a consulta SQL que popula o banco
        int contarLacos = 0;        
        
        while(linhaBanco != null){
            contarLacos++;
            contador = 0;
            int tamanho = 0;
            for(contPosicao = 0; contPosicao < numeroColunas; contPosicao++){
                if(contador < contCampos){
                    //Verificar se o caracter é um apóstrofo e duplica o mesmo
                    if(linhaBanco.charAt(contPosicao) == '\''){
                        tmpValor = tmpValor + linhaBanco.charAt(contPosicao);
                    }                    
                    tmpValor = tmpValor + linhaBanco.charAt(contPosicao);
                    tamanho++;
                    if(tamanho == tamanhoCampo[contador]){
                        valorCampo[contador] = tmpValor;
                        tmpValor = "";
                        contador++;
                        tamanho = 0;
                    }
                }
            }

            // Preenchimento da consulta SQL para popular o banco        
            // Variáveis String que receberão as consultas SQL
			// Para ficar mais organizado eu criei três variáveis, poderia ser apenas uma.
            String consulta = "INSERT INTO enem(";
            String conNomeCampo = "";
            String conValor = "";
            // Fim

            // Percorrer o vetor nomeCampo para preencher a primeira parte da consulta
            for(contador = 0; contador < contCampos; contador++){
                if(valorCampo[contador].toString().trim().isEmpty()){ // Só preencherá o valor encontrado no vetor valorCampo no índice "contador" for diferente de vazio
                }else{
                    if(contador == 0){
                        conNomeCampo = conNomeCampo + nomeCampo[contador];
                    }else{
                        conNomeCampo = conNomeCampo + ", " + nomeCampo[contador];
                    }
                }
            }
            consulta = consulta + conNomeCampo + ") VALUES (";
            // Fim

            // Percorrer o vetor valorCampo para preencher a segunda parte da consulta
            for(contador = 0; contador < contCampos; contador++){
               if(valorCampo[contador].toString().trim().isEmpty()){ // Só preencherá o valor encontrado no vetor valorCampo no índice "contador" for diferente de vazio
                  }else{
                        if(contador == 0){
                            if(tipoCampo[contador].equals("1")){
                                conValor = conValor + valorCampo[contador];
                            }else{
                                conValor = conValor + "'" + valorCampo[contador] + "'";
                            }                    
                        }else{
                            if(tipoCampo[contador].equals("1")){
                                conValor = conValor + ", " + valorCampo[contador];
                            }else{
                                conValor = conValor + ", '" + valorCampo[contador] + "'";
                           }                  
                     }
                }
            }

            consulta = consulta + conValor + ");";
            // Fim da consulta SQL 

            // Para imprimir o resultado da consulta gerada descomente a linha abaixo
            //System.out.println(consulta);
            
            // Popular a tabela com os dados obtidos
            // Para executar a consulta SQL gerada descomente a linha abaixo
            // stm.executeUpdate(consulta);
            linhaBanco = lerArqBanco.readLine(); // Leitura da próxima linha
        }
    }
}
