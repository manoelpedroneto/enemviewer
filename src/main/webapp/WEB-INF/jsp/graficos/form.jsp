<%@ include file="../header.jsp"%>
   
	<div class="container">
	
		<form action="/visualizador/chart">
				<ul class="row thumbnails">
					<li class="thumbnail">
						<b>Dados do Inscrito:</b> <br/>
						<select multiple="multiple" style="height: 150px;">
								<option>Idade</option>
								<option>Sexo</option>
								<option>Ano do Enem</option>
								<option>Cidade</option>
						</select>
					</li>
					
					<li class="thumbnail">
						<b>Desempenho:</b><br/>
						<select multiple="multiple" style="height: 150px;">
								<option>Nota Geral da Prova Objetiva</option>
								<option>Nota da Reda��o</option>
						</select>
					</li>
				
					<li class="thumbnail">
						<b>Question�rio Socio Econ�mico:</b> <br/>
						<select multiple="multiple" style="height: 150px;">
								<option>Q7 - Quantidade de pessoas que moram no domic�lio</option>
								<option>Q8 - Quantidade de irm�os do candidato do ENEM</option>
								<option>Q9 - Quantidade de filhos do candidato do ENEM</option>
								<option>Q10 - O grau de escolaridade do pai do candidato</option>
								<option>Q11 - Qual a profiss�o ou ocupa��o do pai</option>
						</select>
					</li>
				</ul>
				
				<button type="submit" class="btn btn-primary">Gerar Gr�fico</button>
		</form>
		
		

<%@ include file="../footer.jsp" %>