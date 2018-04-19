<html>
	<body>
		<form action="adicionaAjuste" method="post"> 
			Trabalhador: <input type="text" name="trabalhador" required="true"/>
			<pre></pre>
			Data: <input type="date" class="date" name="data" required="true"/>
			<pre></pre>
			Data Inicial: <input type="datetime-local" class="date" name="horaInicial" required="true"/>
			<pre></pre>
			Data Final: <input pattern="HH:mm" type="datetime-local" class="date" name="horaFinal" required="true"/>
			<pre></pre>
			Justificativa: <input type="text" class="text" name="justificativa" Placeholder="Justificativa" required="true"/>
			<pre></pre>
			<input type="submit" value="ADICIONAR"> 
		</form> 	
	</body>
</html>