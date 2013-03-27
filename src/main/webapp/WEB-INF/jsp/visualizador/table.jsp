<%@ include file="../header.jsp"%>

    <div class="navbar  navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <a class="brand" href="<c:url value="/"/>">Enem Viewer</a>
          <div class="nav-collapse collapse">
            <ul class="nav">
              <li><a href="<c:url value="/"/>"><i class="icon-home"></i> Home</a></li>
              <li><a href="<c:url value="/painel/chart"/>"><i class="icon-folder-close"> </i> Painel</a></li>
              <li class="active"><a href="<c:url value="/visualizador/form"/>"><i class="icon-eye-open"> </i> Visualizar Dados</a></li>
              <li><a href="<c:url value="/graficos/form"/>"><i class="icon-signal"> </i> Gr�ficos</a></li>
              <li><a href="<c:url value="/ajuda.jsp"/>"><i class="icon-question-sign"> </i> Ajuda</a></li>              
            </ul>
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>

	<div class="container">

		Tabela com dados do resultado da busca + Gr�fico.

		
<%@ include file="../footer.jsp" %>