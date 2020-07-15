<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="zh-CN">

<head>
    <!-- 请求元标记 -->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="chrome">
    <title>我的信息</title>

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
                            <a class="nav-link active" href="myinfo.jsp">我的信息</a>
                            <a class="nav-link" href="editpwd.jsp">修改密码</a>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="col-md-9 mt-3">
                <!-- 基础信息部分 -->
                <div class="card bg-white">
                    <h5 class="card-header">
                        完善基础信息
                        <a href="#editInfoModel" data-toggle="modal" class="float-right"><i class="fa fa-edit"></i></a>
                    </h5>
                    <div class="card-body" id="card-body">
                        
                    </div>
                </div>
                <!-- 完善基础信息模态框 -->
                <div class="modal fade" id="editInfoModel" tabindex="-1" role="dialog" aria-hidden="true">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title">完善基础信息</h5>
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                    <span aria-hidden="true">&times;</span>
                                </button>
                            </div>
                            <div class="modal-body">
                                <form>
                                    <div class="form-group">
                                        <label for="username" class="col-form-label">账号:</label>
                                        <input type="text" class="form-control" id="username" value="大海" disabled>
                                    </div>

                                    <div class="form-group">
                                        <label for="realname" class="col-form-label">姓名:</label>
                                        <input type="text" class="form-control" id="realname" value="张光泽" disabled>
                                    </div>

                                    <div class="form-group">
                                        <label for="phone" class="col-form-label">电话:</label>
                                        <input type="tel" class="form-control" aria-describedby="phoneHelp" id="phone"
                                            value="15126877634" required>
                                        <small id="phoneHelp" class="form-text text-muted text-danger">电话不能为空</small>
                                    </div>

                                    <div class="form-group">
                                        <label for="gender" class="col-form-label">性别:</label><br>
                                        <div class="custom-control custom-radio custom-control-inline">
                                            <input type="radio" id="male" name="gender" class="custom-control-input">
                                            <label class="custom-control-label" for="male">男</label>
                                        </div>
                                        <div class="custom-control custom-radio custom-control-inline">
                                            <input type="radio" id="female" name="gender" class="custom-control-input">
                                            <label class="custom-control-label" for="female">女</label>
                                        </div>
                                    </div>
                                </form>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-success">保存</button>
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
					url : "userifo/getuserifobyuiserid",
					async:false, 
					datatype : 'json',
					success : function(menudata) {
						//console.log(menudata);
						
						//返回menu的json数据
								var menu= '<div class="card-body">';
							for (var i = 0; i < menudata.resultObject.length; i++) {
						
									//menu+='<div class="card-body">'	
									menu+='<p>账号：'+menudata.resultObject[i].userid+'</p>'
									menu+='<p>姓名：'+menudata.resultObject[i].realname+'</p>'
									menu+='<p>电话：'+menudata.resultObject[i].userphone+'</p>'
									menu+='<p>性别：'+menudata.resultObject[i].gender+'</p>'
									
								
									
							}
										menu+='</div>'	
							$("#card-body").html(menu);
						
					},
					error : function() {},
				});
		
		
		
	</script>
	
</html>