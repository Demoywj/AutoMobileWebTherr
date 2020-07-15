<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="zh-CN">

<head>
    <!-- 请求元标记 -->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="chrome">
    <title>宝马车系配件</title>

    <!-- bootstrap、自定义 CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/font-awesome.min.css">
</head>

<body>
     <!-- 页面头部导航栏部分开始 -->
	<%@ include file="header.jsp" %>
	<!-- 页面头部导航栏部分结束 -->

    <!-- 车系维修内容部分开始 -->
    <div class="wrap">
        <div class="container">
            <h3 class="pt-3">宝马车系配件</h3>
            <!-- 选择汽车类型 -->
            <div class="row">
                <div class="form-group col-sm-5">
                    <label for="car-config" class="sr-only">选择车系</label>
                    <select id="car-config" class="form-control" name="car-config">
                        <option>请选择车型</option>
                        <option>BMW 1系运动型两厢轿车 2015年款</option>
                        <option>BMW 2系双门轿跑车 2014年款</option>
                        <option>BMW 2系敞篷轿跑车 2015年款</option>
                        <option>BMW 2系旅行车 2016年款</option>
                        <option>BMW 2系多功能旅行车 2015年款</option>
                        <option>BMW 3系旅行轿车 2015年款</option>
                        <option>BMW 3系标准轴距 2015年款</option>
                        <option>BMW 3系长轴距版 2015年款</option>
                        <option>BMW 3系GT 2013年款</option>
                        <option>BMW 4系双门轿跑车 2013年款</option>
                        <option>BMW 4系四门轿跑车 2014年款</option>
                        <option>BMW 5系标准轴距 2010年款</option>
                        <option>BMW 5系长轴距版 2010年款</option>
                        <option>BMW 5系长轴距版 2010年款</option>
                    </select>
                </div>
            </div>
            <!-- 汽车配件 -->
            <div class="row">
                <div class="col-sm-6 col-md-4 col-lg-3">
                    <div class="card mb-4">
                        <img class="card-img-top" src="imgs/accessories/bnwlt1x.jpg" alt="轮胎-1系">
                        <div class="card-body">
                            <h5 class="card-title">轮胎-1系</h5>
                            <p class="card-text">36112352867</p>
                            <p class="card-text">￥36,600.00</p>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6 col-md-4 col-lg-3">
                    <div class="card mb-4">
                        <img class="card-img-top" src="imgs/accessories/bnwcz2x.jpg" alt="车罩-2系">
                        <div class="card-body">
                            <h5 class="card-title">车罩-2系</h5>
                            <p class="card-text">82152350053</p>
                            <p class="card-text">￥2,720.00</p>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6 col-md-4 col-lg-3">
                    <div class="card mb-4">
                        <img class="card-img-top" src="imgs/accessories/bnwdnb3x.jpg" alt="挡泥板-3系">
                        <div class="card-body">
                            <h5 class="card-title">挡泥板-3系</h5>
                            <p class="card-text">82162218983</p>
                            <p class="card-text">￥485.00</p>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6 col-md-4 col-lg-3">
                    <div class="card mb-4">
                        <img class="card-img-top" src="imgs/accessories/bnwxlj4x.jpg" alt="车顶行李架系统-4系">
                        <div class="card-body">
                            <h5 class="card-title">车顶行李架系统-4系</h5>
                            <p class="card-text">82712350212</p>
                            <p class="card-text">￥3,230.00</p>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6 col-md-4 col-lg-3">
                    <div class="card mb-4">
                        <img class="card-img-top" src="imgs/accessories/bnwdcl4x.jpg" alt="锻造车轮-4系">
                        <div class="card-body">
                            <h5 class="card-title">锻造车轮-4系</h5>
                            <p class="card-text">36112352867</p>
                            <p class="card-text">￥36,600.00</p>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6 col-md-4 col-lg-3">
                    <div class="card mb-4">
                        <img class="card-img-top" src="imgs/accessories/bwnlt7x.jpg" alt="轮胎-7系">
                        <div class="card-body">
                            <h5 class="card-title">轮胎-7系</h5>
                            <p class="card-text">36112408923</p>
                            <p class="card-text">￥55,900.01</p>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6 col-md-4 col-lg-3">
                    <div class="card mb-4">
                        <img class="card-img-top" src="imgs/accessories/bnwzdz.jpg" alt="折叠桌">
                        <div class="card-body">
                            <h5 class="card-title">折叠桌</h5>
                            <p class="card-text">51952183853</p>
                            <p class="card-text">￥1,450.00</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- 车系维修内容部分结束 -->

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