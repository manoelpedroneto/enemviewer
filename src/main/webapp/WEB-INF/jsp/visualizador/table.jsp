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
              <li><a href="<c:url value="/graficos/form"/>"><i class="icon-signal"> </i> Gráficos</a></li>
              <li><a href="<c:url value="/ajuda.jsp"/>"><i class="icon-question-sign"> </i> Ajuda</a></li>              
            </ul>
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>

	<div class="container">
		<fieldset>
			<legend><strong> ${uf.nome} </strong> com a quantidade de inscritos agrupados por Sexo</legend>
			<table class="table table-hover">
				<thead>
					<tr>
						<th>#</th>
						<th>Cidade</th>
						<th>Masculino</th>
						<th>Feminino</th>
					</tr>
				</thead>
				<tbody>				
					<c:forEach items="${list}" var="obj" varStatus="status">
						<tr>
							<td>${status.count}</td> 
							<td>${obj[0]}</td> 
							<td><a href="<c:url value="/" />">${obj[1]}</a></td>  
							<td><a href="<c:url value="/" />">${obj[2]}</a></td> 
						</tr>	
					</c:forEach>
				</tbody>
			</table>
		</fieldset>

		
<%@ include file="../footer.jsp" %>