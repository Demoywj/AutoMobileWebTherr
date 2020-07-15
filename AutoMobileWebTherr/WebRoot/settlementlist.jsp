<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="zh-CN">

<head>
    <!-- 请求元标记 -->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="chrome">
    <title>订单结算</title>

    <!-- bootstrap、自定义 CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/font-awesome.min.css">
</head>

<body>
      <!-- 页面头部导航栏部分开始 -->
	<%@ include file="header.jsp" %>
	<!-- 页面头部导航栏部分结束 -->

    <!-- 结算清单内容部分开始 -->
    <div class="container wrap">
        <!-- 我的车型 -->
        <section class="my-model pt-4">
            <h1 class="appointment-title">我的车型</h1>
            <ul class="list-group">
                <li class="list-group-item">车辆品牌：奔驰</li>
                <li class="list-group-item">车辆类型：G级(国产)</li>
                <li class="list-group-item">车辆配置：2.0T 2018年产</li>
            </ul>
        </section>

        <!-- 已选服务 -->
        <section class="selected-service pt-4">
            <h1 class="appointment-title">已选服务</h1>
            <div class="table-responsive">
                <table class="table table-bordered text-nowrap">
                    <thead class="thead-light">
                        <tr>
                            <th>配件名称</th>
                            <th>价格</th>
                            <th>数量</th>
                            <th>小计</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td scope="row">美孚/Mobil 新速霸1000合成机油</td>
                            <td>￥139.00</td>
                            <td>1</td>
                            <td>￥139.00</td>
                        </tr>
                        <tr>
                            <td scope="row">马勒/MAHLE 机油滤清器 OC515</td>
                            <td>￥29.00</td>
                            <td>1</td>
                            <td>￥29.00</td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </section>

        <!-- 用户信息 -->
        <section class="user-info pt-4">
            <h1 class="appointment-title">用户信息</h1>
            <form>
                <div class="form-group row">
                    <label for="username" class="col-sm-2 col-lg-1 col-form-label">姓名：</label>
                    <div class="col-sm-6 col-lg-3">
                        <input type="text" class="form-control" id="username" aria-describedby="usernameHelpBlock" required>
                    </div>
                    <div class="col-sm-4">
                        <small id="usernameHelpBlock" class="mt-2 form-text text-muted sr-only">姓名不能为空</small>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="phone" class="col-sm-2 col-lg-1 col-form-label">电话：</label>
                    <div class="col-sm-6 col-lg-3">
                        <input type="tel" class="form-control" id="phone" aria-describedby="phoneHelpBlock" required>
                    </div>
                    <div class="col-sm-4">
                        <small id="phoneHelpBlock" class="mt-2 form-text text-muted sr-only">电话不能为空</small>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="license" class="col-sm-2 col-lg-1 col-form-label">车牌：</label>
                    <div class="col-sm-6 col-lg-3">
                        <input type="text" class="form-control" id="license" aria-describedby="licenseHelpBlock" required>
                    </div>
                    <div class="col-sm-4">
                        <small id="licenseHelpBlock" class="mt-2 form-text text-muted sr-only">车牌不能为空</small>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="message" class="col-sm-2 col-lg-1 col-form-label">留言：</label>
                    <div class="col">
                        <textarea class="form-control" id="message"></textarea>
                    </div>
                </div>
                <div class="form-group text-right">
                    <strong class="text-danger">应收金额：¥168.00</strong>
                    <input name="" id="" class="btn btn-success" type="submit" value="提交订单">
                </div>
            </form>
        </section>
    </div>
    <!-- 结算清单内容部分结束 -->

    <!-- 页面尾部地址开始 -->
    <footer class="footer bg-dark text-white">
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