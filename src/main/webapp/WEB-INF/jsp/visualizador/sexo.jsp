<%@ include file="../header.jsp"%>

	<div class="container">

	<form action="<c:url value="/visualizador/sexo"/>" class="form-inline" method="post">
		<fieldset>
			<legend>Selecione uma Unidade Federativa</legend>
			<label>Unidades Federativas (UF):</label> 
			<select name="unidadeFederativa.id">
				<c:forEach items="${ufs}" var="unidade">
					<option value="${unidade.id}">${unidade.nome}</option>
				</c:forEach>
			</select>
			<button type="submit" class="btn btn-primary">Gerar Tabela</button>
		</fieldset>
	</form>
	
	<c:if test="${list != null}">
		<fieldset>
			<legend><strong> ${uf.nome} </strong> com a quantidade de inscritos agrupados por <strong>Sexo</strong></legend>
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
	</c:if>
	

	<%@ include file="../footer.jsp" %>		