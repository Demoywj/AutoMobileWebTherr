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
                            <a class="nav-link active" href="myorder.jsp">我的订单</a>
                             <a class="nav-link" href="MyRepMaiOrder.jsp">维保记录</a>
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
                                    role="tab" aria-controls="all" aria-selected="true">全部订单</a>
                                <a class="nav-item nav-link" id="accepting-tab" data-toggle="tab" href="#accepting"
                                    role="tab" aria-controls="accepting" aria-selected="true">待受理</a>
                                <a class="nav-item nav-link" id="accepted-tab" data-toggle="tab" href="#accepted"
                                    role="tab" aria-controls="accepted" aria-selected="true">已受理</a>
                                <a class="nav-item nav-link" id="paying-tab" data-toggle="tab" href="#paying" role="tab"
                                    aria-controls="paying" aria-selected="true">待付款</a>
                                
                            </div>
                        </nav>
                        <!-- 导航内容 -->
                        <div class="tab-content order px-3" id="order-tabContent">
                            <!-- 全部订单 -->
                            <div class="tab-pane fade show active" id="all" role="tabpanel" aria-labelledby="all-tab">
                                <div class="mt-2">
                                    <div class="card-title">
                                    	<label>订单编号：</label>
                                        <a href="orderinfo.jsp">TH63607599</a>
                                        <a class="btn btn-outline-warning float-right" href="javascript:;">取消订单</a>
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
                                                <td>待受理</td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                                
                            </div>
                            <!-- 待受理订单 -->
                            <div class="tab-pane fade" id="accepting" role="tabpanel" aria-labelledby="accepting-tab">
                                <div class="mt-2">
                                    <div class="card-title">
										<label>订单编号：</label>
                                        <a href="orderinfo.jsp">TH63607599</a>
                                        <a class="btn btn-outline-warning float-right" href="javascript:;">取消订单</a>
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
                                                <td>待受理</td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                            <!-- 已受理订单 -->
                            <div class="tab-pane fade" id="accepted" role="tabpanel" aria-labelledby="accepted-tab">
                                <div class="mt-2">
                                    <div class="card-title">订单编号：
                                        <a href="orderinfo.jsp">TH63607599</a>
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
                                                <td>已受理</td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                            
                            <!-- 已付款订单 -->
                            <div class="tab-pane fade" id="paid" role="tabpanel" aria-labelledby="paid-tab">
                               
                            </div>
                            <!-- 待评价订单 -->
                            <div class="tab-pane fade" id="evaluating" role="tabpanel" aria-labelledby="evaluating-tab">
                                
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

</html>