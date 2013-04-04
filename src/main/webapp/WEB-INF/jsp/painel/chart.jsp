<%@ include file="../header.jsp"%>

    <div class="navbar  navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <a class="brand" href="<c:url value="/"/>">Enem Viewer</a>
          <div class="nav-collapse collapse">
            <ul class="nav">
              <li><a href="<c:url value="/"/>"><i class="icon-home"></i> Home</a></li>
              <li class="active"><a href="<c:url value="/painel/chart"/>"><i class="icon-folder-close"> </i> Painel</a></li>
              <li><a href="<c:url value="/visualizador/form"/>"><i class="icon-eye-open"> </i> Visualizar Dados</a></li>
              <li><a href="<c:url value="/graficos/form"/>"><i class="icon-signal"> </i> Gráficos</a></li>
              <li><a href="<c:url value="/ajuda.jsp"/>"><i class="icon-question-sign"> </i> Ajuda</a></li>              
            </ul>
            
            <c:if test="${usuario != null}">
	            <ul class="nav pull-right">
	            	<li><a href="<c:url value="/"/>"><i class="icon-user"> </i>${usuario.nome}</a></li>
	            </ul>
            </c:if>
            
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>

	<div class="container">
	
		<div id="chart1" style="height:400px;width:300px; "></div>
		
		<script>		
			$.jqplot('chart1',  [[34.53, 56.32, 25.1, 18.6]], {series:[{renderer:$.jqplot.BarRenderer}]});
		</script>
				
		<ul>
			<c:forEach items="${mediasRN}" var="media">
				<li><a href="<c:url value="/" />">${media[0]}</a> (${media[1]})</li>	
			</c:forEach>
		</ul>

<%@ include file="../footer.jsp" %>