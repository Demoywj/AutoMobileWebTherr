<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="zh-CN">

<head>
    <!-- 请求元标记 -->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="chrome">
    <title>修改密码</title>

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
                            <a class="nav-link active" href="editpwd.jsp">修改密码</a>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="col-md-9 mt-3">
                <!-- 修改密码部分 -->
                <div class="card bg-white">
                    <h5 class="card-header">修改密码</h5>
                    <div class="card-body">
                        <form class="col-sm-6">
                            <div class="form-group">
                                <label for="currentPwd">当前密码：</label>
                                <input type="password" class="form-control" name="" id="currentPwd"
                                    aria-describedby="helpId" required placeholder="密码长度6到32位，包含数字和字母">
                                <small id="helpId" class="form-text text-muted" hidden>当前密码不能为空</small>
                            </div>
                            <div class="form-group">
                                <label for="newPwd">新密码：</label>
                                <input type="password" class="form-control" name="" id="newPwd"
                                    aria-describedby="helpId" required placeholder="请输入新密码">
                                <small id="helpId" class="form-text text-muted" hidden>新密码不能为空</small>
                            </div>
                            <div class="form-group">
                                <label for="confirmPwd">确认密码：</label>
                                <input type="password" class="form-control" name="" id="confirmPwd"
                                    aria-describedby="helpId" required placeholder="请输入新密码">
                                <small id="helpId" class="form-text text-muted" hidden>新密码不能为空</small>
                            </div>
                            <div class="form-group">
                                <a class="btn btn-link" href="#" role="button">忘记密码？</a>
                                <button type="submit" id="editPwdBtn"
                                    class="btn btn-outline-warning float-right">修改密码</button>
                            </div>
                        </form>
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