<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!doctype html>
<html lang="zh">

<head>
    <title>登录</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/font-awesome.min.css">
    <link rel="stylesheet" href="css/style.css">
</head>

<body class="login">
    <section>
        <div class="container d-flex flex-column">
            <div class="row align-items-center justify-content-center no-gutters min-vh-100">
                <div class="col-sm-5">
                    <div class="card">
                        <div class="card-body">
                            <h4 class="text-center">用户登录</h4>
                            <hr>
                            <form method="POST" action="#">
                                <div class="form-group">
                                    <label for="userId" class="sr-only">用户名</label>
                                    <input type="text" class="form-control" name="userId" id="userId"
                                        aria-describedby="helpId" required placeholder="可通过电话号码及账号进行登录">
                                    <small id="helpId" class="form-text text-muted" hidden>用户名不能为空</small>
                                </div>
                                <div class="form-group">
                                    <label for="pwd" class="sr-only">密码</label>
                                    <input type="password" class="form-control" name="pwd" id="pwd"
                                        aria-describedby="helpId" required placeholder="请输入密码">
                                    <small id="helpId" class="form-text text-muted" hidden>密码不能为空</small>
                                </div>
                                <div class="form-group form-row">
                                    <div class="col-8">
                                        <label for="verificationCode" class="sr-only">验证码</label>
                                        <input type="text" class="form-control" name="" id="verificationCode"
                                            aria-describedby="helpId" required placeholder="请输入验证码">
                                        <small id="helpId" class="form-text text-muted" hidden>密码不能为空</small>
                                    </div>
                                    <div class="col">
                                       
                                        <img src="safecode.do" width="110px" height="35px"/>
                                    </div>
                                </div>
                                <div class="form-group form-row">
                                    <div class="col">                 
                                        <div class="custom-control custom-checkbox">   
                                            <a class="float-right" href="#" role="button">忘记密码？</a>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <button type="button" name="" id="loginBtn"
                                        class="btn btn-outline-success btn-block">登录</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="js/jquery-3.3.1.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script type="text/javascript">
   	/* 点击登录 */	
			$("#loginBtn").on('click', function() {
				var username=$("#userId").val().trim();
				var password=$("#pwd").val().trim();
				var verificationCode=$("#verificationCode").val().trim();
		
				if(username==null || username=="" || username==undefined){
					$("#userId").focus();
					return;
				}
				if(password==null || password=="" || password==undefined){
					$("#pwd").focus();
					return;
				}
				if(verificationCode==null || verificationCode=="" || verificationCode==undefined){
					$("#verificationCode").focus();
					return;
				}
							
				//var enpwd = hex_md5(fix(username,password));
				//$("#inppassword").val(enpwd);	
				$.ajax({
					type : 'get',
					url : 'userlogincontroller/userlogin?userid='+username+'&pwd='+password+'&verificationCode='+verificationCode,
					datatype : 'json',
					success : function(data) {
						if (data.code == 10001) {				
							window.location.href = "index.jsp";		
							window.event.returnValue=false	
						} else {								
						alert(data.msg);				
						}
							
						
					},
					error:function(){		
	    	        	alert(data.msg);
	    	        }
				});
			});
    
    </script>
    
    
</body>

</html>