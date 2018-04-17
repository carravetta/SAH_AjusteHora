<html>
	<body>
		<form action="salvarAprovacaoReprovacao" method="post"> 
			Trabalhador : ${trabalhadorAprovar}																		
			<pre></pre>
			Data : ${ajusteAprovarReprovar.data}   
			<pre></pre>
			Hora Inicial : ${ajusteAprovarReprovar.horaInicial}
			<pre></pre>
			Hora Final : ${ajusteAprovarReprovar.horaFinal}
			<pre></pre>
			Justificativa : ${ajusteAprovarReprovar.justificativa}
			<pre></pre>
			
			OBSERVAÇÂO: <input type="text" name="obs"></input>
			<input type="checkbox" name="aprovou"> Aprovar </input>
			<input type="checkbox" name="reprovou"> Reprovar </input>
			
			<pre></pre>
			<input type="submit" value="SALVAR"> 
		</form> 	
	</body>
</html>