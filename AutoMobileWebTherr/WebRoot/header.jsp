<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>       
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<header class="header bg-dark fixed-top">
		<div class="container">
			<nav class="navbar navbar-expand-md navbar-dark" id="navbar">
				<a class="navbar-brand" href="index.jsp">车主服务平台</a>
				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#collapsibleNav" aria-controls="collapsibleNav"
					aria-expanded="false" aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="collapsibleNav">
					<ul class="navbar-nav mr-auto">
						<li class="nav-item"><a class="nav-link"
							href="appointment.jsp">预约服务</a></li>
						<li class="nav-item"><a class="nav-link"
							href="index.jsp#maintain">维保服务</a></li>
						<li class="nav-item"><a class="nav-link"
							href="index.jsp#carAccessories">车系配件</a></li>
						<li class="nav-item"><a class="nav-link"
							href="articlelist.jsp">车友文章</a></li>
					</ul>
					 <c:if test="${tuser.userid==null }">
					<ul class="navbar-nav">
						<li class="nav-item"><a href="login.jsp" class="nav-link">
								登录 </a></li>
					</ul>
					</c:if>
					 <c:if test="${tuser.userid!=null }">
					 <ul class="navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link notice" href="mymessage.jsp">
                                <i class="fa fa-bell-o" aria-hidden="true"></i>
                            </a>
                        </li>
                        <li class="nav-item">
                            <span class="navbar-text">您好，</span>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="dropdownMenu" role="button"
                                data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">${tuser.realname }</a>
                            <div class="dropdown-menu" aria-labelledby="dropdownMenu">
                                <a class="dropdown-item" href="myinfo.jsp">用户中心</a>
                                <a class="dropdown-item" href="javascript:void(0)" onclick = "outlogin()">退出</a>
                            </div>
                        </li>
                    </ul>
					</c:if>
					
					
					
				</div>
			</nav>
		</div>
	</header>
	
	
	<script src="js/jquery-3.3.1.min.js"></script>

	<script type="text/javascript">
	function outlogin(){
	
	$.ajax({
					type : 'get',
					url : "useroutlogincontroller/outuserlogin",
					datatype : 'json',
					
				
					
				});
	 location.reload();
	
	}
				
				
				
				
	
	</script>
</body>
</html>