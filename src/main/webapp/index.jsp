<%@ include file="header.jsp" %>

    <div class="navbar  navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <a class="brand" href="<c:url value="/"/>">Enem Viewer</a>
          <div class="nav-collapse collapse">
            <ul class="nav">
              <li  class="active"><a href="<c:url value="/"/>"><i class="icon-home"></i> Home</a></li>
              <li><a href="<c:url value="/painel/chart"/>"><i class="icon-folder-close"> </i> Painel</a></li>
              <li><a href="<c:url value="/importador/form"/>"><i class="icon-download-alt"> </i> Importar Dados</a></li>
              <li><a href="<c:url value="/visualizador/form"/>"><i class="icon-eye-open"> </i> Visualizar</a></li>
              <li><a href="<c:url value="/ajuda.jsp"/>"><i class="icon-question-sign"> </i> Ajuda</a></li>              
            </ul>
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>

    <div class="container">

      <div class="row-fluid">
      	<div class="span8">
      		<div class="hero-unit">
		        <h1>Enem Viewer 2013!</h1>
		        <br/>
		        <ol>
		        	<li>Visualize o desempenho dos estudantes de sua cidade</li>
		        	<li><a href="http://enade.hozano.com/" target="_blank">Dados do ENADE 2011 (http://enade.hozano.com/)</a></li>
		        </ol>
      		</div>
      	</div>
      	<div class="span4">
      		<h2> Cadastre-se </h2>
			<form class="form-vertical">
				<input type="text" placeholder="Nome"/>
				<input type="text" placeholder="E-mail" />
				<input type="password" placeholder="Senha" />
				<br />	
	        	<button type="submit" class="btn btn-primary">Cadastrar</button>
			</form>      		
      	</div>
      </div>

      <hr>
      
<%@ include file="footer.jsp" %>      
