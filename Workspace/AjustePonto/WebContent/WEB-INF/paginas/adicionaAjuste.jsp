<html>
	<body>
		<form action="adicionaAjuste" method="post"> 
			<input type="text" name="trabalhador" required="true"/>
			<input type="date" class="date" name="data" required="true"/>
			<input type="datetime" class="date" name="horaInicial" required="true"/>
			<input type="datetime" class="date" name="horaFinal" required="true"/>
			
			<input type="text" class="text" name="justificativa" Placeholder="Justificativa" required="true"/>
		
			<input type="submit" value="ADICIONAR"> 
		</form> 	
	</body>
</html>