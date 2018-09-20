<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<br/><br/>
	&nbsp;&nbsp;<h3>@RestController이용 <input type="button" value="AJAX!" id="ajaxBtn"></h3>
	<hr>	
	<div id="disp"></div>
	
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>


$(document).ready(function(){
	$('#ajaxBtn').click(function(){
		 var array = new Array();
		     array[0] = "a";
		     array[1] = "b";
	$.ajax({
		type : 'get',
		url:"restcontroller.json",
		dataType:"json",
		success:function(data){
			console.log(data);
			output = '';
			$.each(data, function(){
				output += '<span>';
				output += '<h4>' + this.name + '</h4>';
				output += '<p>' + this.description + '</p>';
				output += '</span>';
			})
			document.getElementById('disp').innerHTML = output;
		},
		error : function(error) {
            /* console.log(error); 
            console.log(error.status); */
		}
	});
});
});


</script>

</body>
</html>