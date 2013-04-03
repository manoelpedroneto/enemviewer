<%@ include file="../header.jsp"%>

    <div class="navbar  navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <a class="brand" href="<c:url value="/"/>">Enem Viewer</a>
          <div class="nav-collapse collapse">
            <ul class="nav">
              <li><a href="<c:url value="/"/>"><i class="icon-home"></i> Home</a></li>
              <li><a href="<c:url value="/painel/chart"/>"><i class="icon-folder-close"> </i> Painel</a></li>
              <li><a href="<c:url value="/visualizador/form"/>"><i class="icon-eye-open"> </i> Visualizar Dados</a></li>
              <li  class="active"><a href="<c:url value="/graficos/form"/>"><i class="icon-signal"> </i> Graficos</a></li>
              <li><a href="<c:url value="/ajuda.jsp"/>"><i class="icon-question-sign"> </i> Ajuda</a></li>              
            </ul>
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>

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
								<option>Nota da Redação</option>
						</select>
					</li>
				
					<li class="thumbnail">
						<b>Questionário Socio Econômico:</b> <br/>
						<select multiple="multiple" style="height: 150px;">
								<option>Q7 - Quantidade de pessoas que moram no domicílio</option>
								<option>Q8 - Quantidade de irmãos do candidato do ENEM</option>
								<option>Q9 - Quantidade de filhos do candidato do ENEM</option>
								<option>Q10 - O grau de escolaridade do pai do candidato</option>
								<option>Q11 - Qual a profissão ou ocupação do pai</option>
						</select>
					</li>
				</ul>
				
				<button type="submit" class="btn btn-primary">Gerar Gráfico</button>
		</form>
		
		

<%@ include file="../footer.jsp" %>