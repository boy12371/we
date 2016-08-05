<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE>
<html lang="en">
<head>
<base href="<%=basePath%>">

<title>首页</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript" src="js/com.js"></script>
</head>

<body>
	<div style="width:100%;height:150px"></div>
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span12">
				<ul class="nav nav-tabs">
					<li class="active"><a href="#">首页</a>
					</li>
					<li><a href="#">娱乐</a>
					</li>
					<li><a href="#">电影</a>
					</li>
					<li><a href="#">电视剧</a>
					</li>
				</ul>
			</div>
		</div>
	</div>
	<input id="test" type="text">
	<a href="javascript:test();">test</a>
</body>
<script type="text/javascript">
    	function test(){
    		alert($("#test").val());
    	}
    
</script>
</html>
