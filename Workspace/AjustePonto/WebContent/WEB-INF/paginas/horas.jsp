<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<body>
		Horas totais
		<ul>
			<table border="1">
			<tr>
			    <th>Data</th>
			    <th>Data Inicial</th> 
			    <th>Data Final</th>
			    <th>Justificativa</th>
			    <th>Status</th>
			  </tr>
		        <c:forEach items="${pontos}" var="ajuste">
		        	<tr>
		        	    <td>${pontos.data}</td>
					    <td>${pontos.horaInicial}</td>
					    <td>${pontos.horaFinal}</td>
					    <td>${pontos.justificativa}</td>
					    <td>${pontos.status}</td>
				</tr>
		        </c:forEach>
		        
	        </table>
	    </ul>
		

		<form action="escolherPerfil" method="post"> 
			<input type="submit" value="VOLTAR"> 
		</form>			
		
		<form action="logout" method="post"> 
			<input type="submit" value="SAIR"> 
		</form>	
	</body>
</html>