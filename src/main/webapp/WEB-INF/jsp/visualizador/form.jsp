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

	<form action="<c:url value="/visualizador/table"/>" class="form-inline">
		<fieldset>
			<legend>Selecione uma Unidade Federativa</legend>
			<label>Unidades Federativas (UF):</label> 
			<select name="unidadeFederativa.id">
				<c:forEach items="${list}" var="unidade">
					<option value="${unidade.id}">${unidade.nome}</option>
				</c:forEach>
			</select>
			<button type="submit" class="btn btn-primary">Gerar Tabela</button>
		</fieldset>
	</form>

	<%@ include file="../footer.jsp" %>		