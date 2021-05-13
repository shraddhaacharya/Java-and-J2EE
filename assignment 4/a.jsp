<!DOCTYPE html>
<html>
<head>
	<title>LOGIN</title>
</head>
<body>
	<% String n=request.getParameter("t1");
		String p=request.getParameter("t2");
	%>
	<% if(n.equals("admin")&&p.equals("1234"))
	{
	out.println("WELCOME TO FORM PROCESSING");
	}
	else
	{
		out.println("INCORRECT USERNAME OR PASSWORD");
	}
	%>
</body>
</html>