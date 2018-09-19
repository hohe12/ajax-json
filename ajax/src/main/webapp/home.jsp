<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<a href="responsebody.json">ResponseBody이용</a><br/><br/>
	<a href="jacksonview.json">JacksonView이용</a><br/><br/>
	<a href="restcontroller.json">RestController이용</a><br/><br/>
	<a href="#">ajax 이용</a><br/><br/><br/>
	
	<div id="disp"></div>
	
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>
document.getElementById("ajax").addEventListener("click", function(){
	$.ajax({
		type : 'get',
		url:"tools.json",
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
</script>

</body>
</html>