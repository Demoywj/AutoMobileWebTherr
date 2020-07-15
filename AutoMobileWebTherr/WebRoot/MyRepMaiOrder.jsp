<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="zh-CN">

<head>
    <!-- 请求元标记 -->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="chrome">
    <title>我的订单</title>

    <!-- bootstrap、自定义 CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/font-awesome.min.css">
</head>

<body>
     <!-- 页面头部导航栏部分开始 -->
	<%@ include file="header.jsp" %>
	<!-- 页面头部导航栏部分结束 -->

    <!-- 用户中心内容部分开始 -->
    <div class="container wrap" style="min-height: 522px">
        <div class="row">
            <div class="col-md-3 mt-3 center-menu">
                <div class="nav flex-column" aria-orientation="vertical">
                    <!-- 左侧菜单部分 -->
                    <ul class="list-group">
                        <li class="list-group-item">
                            <span class="nav-header">订单中心</span>
                        </li>
                        <li class="list-group-item">
                            <a class="nav-link" href="myorder.jsp">我的订单</a>
                             <a class="nav-link active" href="MyRepMaiOrder.jsp">维保记录</a>
                        </li>
                        <li class="list-group-item">
                            <span class="nav-header">爱车中心</span>
                        </li>
                        <li class="list-group-item">
                            <a class="nav-link" href="mycar.jsp">我的爱车</a>
                        </li>
                        <li class="list-group-item">
                            <span class="nav-header">消息中心</span>
                        </li>
                        <li class="list-group-item">
                            <a class="nav-link" href="mymessage.jsp">消息通知</a>
                        </li>
                        <li class="list-group-item">
                            <span class="nav-header">个人中心</span>
                        </li>
                        <li class="list-group-item">
                            <a class="nav-link" href="myinfo.jsp">我的信息</a>
                            <a class="nav-link" href="editpwd.jsp">修改密码</a>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="col-md-9 mt-3">
                <!-- 我的订单部分 -->
                <div class="card bg-white">
                    <h5 class="card-header">我的订单</h5>
                    <div class="card-body">
                        <!-- 导航菜单 -->
                        <nav>
                            <div class="nav nav-pills" id="order-tab" role="tablist">
                                <a class="nav-item nav-link active" id="all-tab" data-toggle="tab" href="#all"
                                    role="tab" aria-controls="all" aria-selected="true">全部记录</a>
                                
                                <a class="nav-item nav-link" id="evaluating-tab" data-toggle="tab" href="#evaluating"
                                    role="tab" aria-controls="evaluating" aria-selected="true">待评价</a>
                            </div>
                        </nav>
                        <!-- 导航内容 -->
                        <div class="tab-content order px-3" id="order-tabContent">
                            
                           
                             <!-- 全部订单 -->
                            <div class="tab-pane fade show active" id="all" role="tabpanel" aria-labelledby="all-tab">
                                <div class="mt-2" id="myRepMaiOrder">
                                   <!--  <div class="card-title">
                                    	<label>订单编号：</label>
                                        <a href="orderinfo.jsp">TH63607599</a>
                                        
                                    </div>
                                    <table class="table">
                                        <thead>
                                            <tr>
                                                <th>订单项目</th>
                                                <th>下单时间</th>
                                                <th>订单金额</th>
                                                <th></th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>小保养</td>
                                                <td>2019-6-29</td>
                                                <td>¥451.00</td>
                                                <td><a href="orderinfo.jsp" class="btn btn-outline-success">查看详情</a></td>
                                            </tr>
                                        </tbody>
                                    </table> -->
                                </div>
                                
                            </div>
                            
                           
                            <!-- 待评价订单 -->
                            <div class="tab-pane fade" id="evaluating" role="tabpanel" aria-labelledby="evaluating-tab">
                                <div class="mt-2">
                                    <div class="card-title">
                                    	<label>订单编号：</label>
                                        <a href="orderinfo.jsp">TH63607599</a>
                                        <a href="evaluation.jsp" class="btn btn-outline-success float-right">去晒单</a>
                                    </div>
                                    <table class="table">
                                        <thead>
                                            <tr>
                                                <th>订单项目</th>
                                                <th>下单时间</th>
                                                <th>订单金额</th>
                                                <th>订单状态</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>小保养</td>
                                                <td>2019-6-29</td>
                                                <td>¥451.00</td>
                                                <td>待评价</td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- 用户中心内容部分结束 -->

    <!-- 页面尾部地址开始 -->
    <footer class="footer bg-dark text-white mt-5">
        <div class="container pl-3">
            <p>CopyRight © 2019- 版权由云南工商学院所有</p>
            <p>地址：昆明市嵩明县杨林执教园区云南工商学院</p>
        </div>
    </footer>
    <!-- 页面尾部地址结束 -->

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="js/jquery-3.3.1.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</body>
<script type="text/javascript">
		
		
		
   			$.ajax({
					type : 'get',
					url : "userifo/getuserRepmaiOrder",
					async:false, 
					datatype : 'json',
					success : function(menudata) {
						
								var menu= '';
							for (var i = 0; i < menudata.resultObject.length; i++) {
						
									menu+='<div class="card-title">'
                                    	menu+='<label>订单编号：</label>'
                                        menu+='<a href="">'+menudata.resultObject[i].repmaiid+'</a>'
                                        
                                    menu+='</div>'
                                    menu+='<table class="table">'
                                       menu+=' <thead>'
                                            menu+='<tr>'
                                               menu+=' <th>项目</th>'
                                                menu+='<th>时间</th>'
                                               menu+='<th>金额</th>'
                                                menu+='<th></th>'
                                           menu+=' </tr>'
                                       menu+=' </thead>'
                                      menu+=' <tbody>'
                                          menu+='  <tr>'
                                               menu+=' <td>'+menudata.resultObject[i].repmaiid+'</td>'
                                               menu+=' <td>'+menudata.resultObject[i].repmainordertime+'</td>'
                                               menu+=' <td>'+menudata.resultObject[i].inventoryprice+'</td>'                    
                                               menu+='<td><a href="orderinfo.jsp?repmaiid='+menudata.resultObject[i].repmaiid+'" class="btn btn-outline-success">查看详情</a></td>'
                                            menu+='</tr>'
                                        menu+='</tbody>'
                                   menu+='</table>'
									
								
									
							}
										
							$("#myRepMaiOrder").html(menu);
						
					},
					error : function() {},
				});
		
		
		
	</script>
</html>