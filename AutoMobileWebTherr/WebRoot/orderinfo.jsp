<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="zh-CN">

<head>
<!-- 请求元标记 -->
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="chrome">
<title>订单信息</title>

<!-- bootstrap、自定义 CSS -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/font-awesome.min.css">
</head>

<body>
	<!-- 页面头部导航栏部分开始 -->
	<%@ include file="header.jsp"%>
	<!-- 页面头部导航栏部分结束 -->

	<!-- 订单信息部分开始 -->
	<div class="container wrap" style="min-height: 522px">
		<!-- 面包屑菜单 -->
		<nav aria-label="breadcrumb">
			<ol class="breadcrumb">
				<li class="breadcrumb-item"><a href="myorder.jsp">我的订单</a></li>
				<li class="breadcrumb-item active" aria-current="page">订单信息</li>
			</ol>
		</nav>
		<div class="row">
			<div class="col-md-3 center-menu mb-3">
				<div class="nav flex-column" aria-orientation="vertical">
					<!-- 左侧菜单部分 -->
					<ul class="list-group">
						<li class="list-group-item"><span class="nav-header">订单中心</span>
						</li>
						<li class="list-group-item"><a class="nav-link"
							href="myorder.jsp">我的订单</a> <a class="nav-link active"
							href="MyRepMaiOrder.jsp">维保记录</a></li>
						<li class="list-group-item"><span class="nav-header">爱车中心</span>
						</li>
						<li class="list-group-item"><a class="nav-link"
							href="mycar.jsp">我的爱车</a></li>
						<li class="list-group-item"><span class="nav-header">消息中心</span>
						</li>
						<li class="list-group-item"><a class="nav-link"
							href="mymessage.jsp">消息通知</a></li>
						<li class="list-group-item"><span class="nav-header">个人中心</span>
						</li>
						<li class="list-group-item"><a class="nav-link"
							href="myinfo.jsp">我的信息</a> <a class="nav-link" href="editpwd.jsp">修改密码</a>
						</li>
					</ul>
				</div>
			</div>
			<div class="col-md-9" id="myinventory">
				<!--  <div class="card">
                    <h5 class="card-header">订单信息</h5>

                    订单头部
                    <div class="p-3">
                        <div class="row">
                            <div class="col-sm-6">订单编号：TH63607599</div>
                            <div class="col-sm-6">订单时间：2019/6/25 16:25:00</div>
                            <div class="col-sm-6">车主：李四</div>
                            <div class="col-sm-6">手机号码：15008811605</div>
                            <div class="col-sm-6">车牌号：云A·88888</div>
                            <div class="col-sm-6">操作人员：张三</div>
                        </div>
                    </div>

                    订单体
                    <table class="table">
                        <thead>
                            <tr>
                                <th>项目名称</th>
                                <th>数量</th>
                                <th>价格</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>美孚/Mobil 新速霸1000合成机油</td>
                                <td>1</td>
                                <td>￥139.00</td>
                            </tr>
                            <tr>
                                <td>马勒/MAHLE 机油滤清器 OC515</td>
                                <td>1</td>
                                <td>￥29.00</td>
                            </tr>
                        </tbody>
                    </table>
                    <div class="p-2 text-right">
                        <span class="text-danger">总价：￥168.00</span>
                    </div>
                </div> -->
			</div>
		</div>
	</div>
	<!-- 订单信息部分结束 -->

	<!-- 页面尾部地址开始 -->
	<footer class="footer bg-dark text-white mt-5">
		<div class="container pl-3">
			<p>CopyRight © 2019- 版权由云南工商学院所有</p>
			<p>地址：昆明市嵩明县杨林执教园区云南工商学院</p>
		</div>
	</footer>
	<!-- 页面尾部地址结束 -->

	<!-- 页面头部导航栏部分结束 -->
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="js/jquery-3.3.1.min.js"></script>
	<script src="js/popper.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
<script type="text/javascript">
	var a = GetRequest();
	var repmaiid = a.repmaiid;

	

	function GetRequest() {
		var url = location.search; //获取url中"?"符后的字串
		var theRequest = new Object();
		if (url.indexOf("?") != -1) {
			var str = url.substr(1);
			strs = str.split("&");
			for (var i = 0; i < strs.length; i++) {
				theRequest[strs[i].split("=")[0]] = decodeURIComponent(strs[i].split("=")[1]);
			}
		}
		return theRequest;
	}


	$.ajax({
		type : 'get',
		url : "userifo/getuserinventory?repmaiid=" + repmaiid,
		async : false,
		datatype : 'json',
		success : function(menudata) {
		
			var menu = '';
		     menu+='<div class="card">'
              menu+=' <h5 class="card-header">订单信息</h5>'

                    <!-- 订单头部 -->
                   menu+='  <div class="p-3">'
                        menu+=' <div class="row">'
                           menu+='  <div class="col-sm-6">编号：'+menudata.resultObject[0].inventoryid+'</div>'
                            menu+=' <div class="col-sm-6">时间：'+menudata.resultObject[0].repmainordertime+'</div>'
                              menu+=' <div class="col-sm-6">车主：'+menudata.resultObject[0].userid+'</div>'
                                menu+=' <div class="col-sm-6">手机号码：'+menudata.resultObject[0].userphone+'</div>'
                                  menu+=' <div class="col-sm-6">车牌号：'+menudata.resultObject[0].carnum+'</div>'
                                    menu+=' <div class="col-sm-6">操作人员：'+menudata.resultObject[0].adiminid+'</div>'
                            
                       menu+=' </div>'
                    menu+=' </div>'
                    <!-- 订单体 -->
                     menu+=' <table class="table">'
                       menu+='  <thead>'
                          menu+='<tr><th>项目名称</th><th>数量</th><th>价格</th> </tr>'
                         menu+=' </thead> <tbody>'
                      
			for (var i = 0; i < menudata.resultObject.length; i++) { 
                            menu+='<tr>'
                                menu+='<td>'+menudata.resultObject[i].procontentname+'</td>'
                                 menu+='<td>'+menudata.resultObject[i].number+'</td>'
                                 menu+='<td>'+menudata.resultObject[i].pronumprice+'</td>'
                             menu+='</tr>'
                         
   

			}
 						menu+='</tbody></table>'
                   menu+=' <div class="p-2 text-right">'
                       menu+=' <span class="text-danger">总价：'+menudata.resultObject[0].inventoryprice+'</span>'
                    menu+=' </div>'
                menu+=' </div>'
			$("#myinventory").html(menu);

		},
		error : function() {},
	});
</script>
</html>