<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="zh-CN">

<head>
    <!-- 请求元标记 -->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="chrome">
    <title>我要晒单</title>

    <!-- bootstrap、自定义 CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/font-awesome.min.css">
    <link rel="stylesheet" href="css/star-rating.min.css">
    <link rel="stylesheet" href="css/style.css">

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/star-rating.min.js"></script>
</head>

<body>
      <!-- 页面头部导航栏部分开始 -->
	<%@ include file="header.jsp" %>
	<!-- 页面头部导航栏部分结束 -->
  

    <!-- 晒单部分开始 -->
    <div class="container wrap" style="min-height: 522px">
        <!-- 面包屑菜单 -->
        <nav aria-label="breadcrumb">
            <ol class="breadcrumb">
                <li class="breadcrumb-item"><a href="myorder.jsp">我的订单</a></li>
                <li class="breadcrumb-item active" aria-current="page">我要晒单</li>
            </ol>
        </nav>
        <div class="row">
            <div class="col-md-3 center-menu">
                <div class="nav flex-column" aria-orientation="vertical">
                    <!-- 左侧菜单部分 -->
                    <ul class="list-group">
                        <li class="list-group-item">
                            <span class="nav-header">订单中心</span>
                        </li>
                        <li class="list-group-item">
                            <a class="nav-link active" href="myorder.jsp">我的订单</a>
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
            <div class="col-md-9">
                <div class="card">
                    <h5 class="card-header">我要晒单</h5>
                    <form class="px-3">
                        <div class="form-group pt-2">
                            <label for="evaluate" class="control-label">服务评分：</label>
                            <input id="evaluate" type="text" class="kv-fa rating-loading" data-size="xs" value=""
                                required>
                        </div>
                        <div class="form-group">
                            <label for="content" class="control-label">评价内容：</label>
                            <textarea id="content" class="form-control" placeholder="发表您的伟大言论" rows="3" required></textarea>
                        </div>
                        <div class="form-group text-right">
                            <button type="submit" class="btn btn-success">提交</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <!-- 晒单部分结束 -->

    <!-- 页面尾部地址开始 -->
    <footer class="footer bg-dark text-white mt-5">
        <div class="container pl-3">
            <p>CopyRight © 2019- 版权由云南工商学院所有</p>
            <p>地址：昆明市嵩明县杨林执教园区云南工商学院</p>
        </div>
    </footer>
    <!-- 页面尾部地址结束 -->

    <script>
        $(document).on('ready', function () {
            $('.kv-fa').rating({
                theme: 'krajee-fa',
                filledStar: '<i class="fa fa-star"></i>',
                emptyStar: '<i class="fa fa-star-o"></i>'
            });
            $('.kv-fa-heart').rating({
                defaultCaption: '{rating} hearts',
                starCaptions: function (rating) {
                    return rating == 1 ? 'One heart' : rating + ' hearts';
                },
                theme: 'krajee-fa',
                filledStar: '<i class="fa fa-heart"></i>',
                emptyStar: '<i class="fa fa-heart-o"></i>'
            });

            $('.rating,.kv-fa,.kv-fa-heart').on('change', function () {
                console.log('Rating selected: ' + $(this).val());
            });

        });
    </script>
</body>

</html>