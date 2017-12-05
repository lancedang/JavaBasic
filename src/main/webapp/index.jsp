<html>
<head>
<script type='text/javascript' src='WEB-INF/myCavas.js'></script>
</head>
<body>
	<h2>Hello World!</h2>
	<script type="text/javascript">
		var c = document.getElementById("myCanvas");
		var cxt = c.getContext("2d");
		cxt.fillStyle = "#FF0000";
		cxt.beginPath();
		cxt.arc(70, 18, 15, 0, Math.PI * 2, true);
		cxt.closePath();
		cxt.fill();
	</script>
	<canvas id="myCanvas" width="200" height="100"
		style="border: 1px solid #c3c3c3;">
Your browser does not support the canvas element.
</canvas>

	<canvas id='canvas' width='640' height='480'></canvas>

</body>
</html>
