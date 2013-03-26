<%@ include file="../header.jsp"%>

    <div class="navbar  navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <a class="brand" href="index.jsp">Enem Viewer</a>
          <div class="nav-collapse collapse">
            <ul class="nav">
              <li><a href="<c:url value="/"/>"><i class="icon-home"></i> Home</a></li>
              <li><a href="<c:url value="/painel/chart"/>"><i class="icon-folder-close"> </i> Painel</a></li>
              <li  class="active"><a href="<c:url value="/importador/form"/>"><i class="icon-download-alt"> </i> Importar Dados</a></li>
              <li><a href="<c:url value="/visualizador/form"/>"><i class="icon-eye-open"> </i> Visualizar</a></li>
              <li><a href="<c:url value="/ajuda.jsp"/>"><i class="icon-question-sign"> </i> Ajuda</a></li>              
            </ul>
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>

	<div class="container">
	
		<form class="form-vertical" action="<c:url value="/importador/importar"/>">
			<fieldset>
				<label>Selecionar Arquivo: </label>
				<input type="text" /> <br/>
				<button type="submit" class="btn btn-primary">Importar</button>
			</fieldset>
		</form>
		<hr>

<%@ include file="../footer.jsp" %>