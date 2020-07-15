<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="zh-CN">

<head>
<!-- 请求元标记 -->
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="chrome">
<title>车主服务平台</title>

<!-- bootstrap、自定义 CSS -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/font-awesome.min.css">

<!-- 评分插件css -->
<link rel="stylesheet" href="css/star-rating.min.css">
</head>

<body>
	<!-- 页面头部导航栏部分开始 -->
	<%@ include file="header.jsp" %>
	<!-- 页面头部导航栏部分结束 -->

	<!-- 活动轮播部分开始 -->
	<section class="wrap">
		<div id="carouselActivity" class="carousel slide" data-ride="carousel">
			<ol class="carousel-indicators">
				<li data-target="#carouselActivity" data-slide-to="0" class="active"></li>
				<li data-target="#carouselActivity" data-slide-to="1"></li>
				<li data-target="#carouselActivity" data-slide-to="2"></li>
			</ol>
			<div class="carousel-inner">
				<div class="carousel-item active">
					<img src="imgs/at3.jpg" class="d-block w-100" alt="宣传图片">
					<div class="carousel-caption">
						<h2>根据您的爱车，</h2>
						<p>我们为您提供最省钱、最优质、最快捷的服务。</p>
						<a class="btn btn-outline-success" href="appointment.jsp"
							role="button">预约服务</a>
					</div>
				</div>
				<div class="carousel-item">
					<a href="activity.jsp"><img src="imgs/activity1.jpg"
						class="d-block w-100" alt="乐享归途·友邻相伴"></a>
				</div>
				<div class="carousel-item">
					<a href="javascript:;"><img src="imgs/at2.jpg"
						class="d-block w-100" alt="乐享归途·友邻相伴"></a>
				</div>
			</div>
			<a class="carousel-control-prev" href="#carouselActivity"
				role="button" data-slide="prev"> <span
				class="carousel-control-prev-icon" aria-hidden="true"></span> <span
				class="sr-only">Previous</span>
			</a> <a class="carousel-control-next" href="#carouselActivity"
				role="button" data-slide="next"> <span
				class="carousel-control-next-icon" aria-hidden="true"></span> <span
				class="sr-only">Next</span>
			</a>
		</div>
	</section>
	<!-- 活动轮播部分结束 -->

	<!-- 维保服务部分开始 -->
	<section id="maintain" class="maintain pt-4 pb-5">
		<div class="container">
			<h1 class="section-title">维保服务</h1>
			<div class="row">
				<div class="col-sm-12 col-lg-6">
					<div class="card text-center">
						<a href="appointment.jsp"> <svg class="icon"
								aria-hidden="true">
                                <use xlink:href="#icon-dabaoyang"></use>
                            </svg> <span>大保养</span>
						</a>
					</div>
				</div>
				<div class="col-sm-6 col-md-4 col-lg-6">
					<div class="card text-center">
						<a href="appointment.jsp"> <svg class="icon"
								aria-hidden="true">
                                <use xlink:href="#icon-xiaobaoyang"></use>
                            </svg> <span>小保养</span>
						</a>
					</div>
				</div>
				<div class="col-sm-6 col-md-4 col-lg-2">
					<div class="card text-center">
						<a href="appointment.jsp"> <svg class="icon"
								aria-hidden="true">
                                <use xlink:href="#icon-lvqingqi"></use>
                            </svg> <span>更换空调滤清器</span>
						</a>
					</div>
				</div>
				<div class="col-sm-6 col-md-4 col-lg-2">
					<div class="card text-center">
						<a href="appointment.jsp"> <svg class="icon"
								aria-hidden="true">
                                <use xlink:href="#icon-shachepian"></use>
                            </svg> <span>更换刹车片</span>
						</a>
					</div>
				</div>
				<div class="col-sm-6 col-md-4 col-lg-2">
					<div class="card text-center">
						<a href="appointment.jsp"> <svg class="icon"
								aria-hidden="true">
                                <use xlink:href="#icon-yuguapian"></use>
                            </svg> <span>更换雨刮片</span>
						</a>
					</div>
				</div>
				<div class="col-sm-6 col-md-4 col-lg-2">
					<div class="card text-center">
						<a href="appointment.jsp"> <svg class="icon"
								aria-hidden="true">
                                <use xlink:href="#icon-luntai"></use>
                            </svg> <span>更换轮胎</span>
						</a>
					</div>
				</div>
				<div class="col-sm-6 col-md-4 col-lg-2">
					<div class="card text-center">
						<a href="appointment.jsp"> <svg class="icon"
								aria-hidden="true">
                                <use xlink:href="#icon-lungu"></use>
                            </svg> <span>更换轮毂</span>
						</a>
					</div>
				</div>
				<div class="col-sm-6 col-md-4 col-lg-2">
					<div class="card text-center">
						<a href="appointment.jsp"> <svg class="icon"
								aria-hidden="true">
                                <use xlink:href="#icon-shacheyou"></use>
                            </svg> <span>更换刹车油</span>
						</a>
					</div>
				</div>
				<div class="col-sm-6 col-md-4 col-lg-2">
					<div class="card text-center">
						<a href="appointment.jsp"> <svg class="icon"
								aria-hidden="true">
                                <use xlink:href="#icon-huohuasai"></use>
                            </svg> <span>更换火花塞</span>
						</a>
					</div>
				</div>
				<div class="col-sm-6 col-md-4 col-lg-2">
					<div class="card text-center">
						<a href="appointment.jsp"> <svg class="icon"
								aria-hidden="true">
                                <use xlink:href="#icon-dianping"></use>
                            </svg> <span>更换电瓶</span>
						</a>
					</div>
				</div>
				<div class="col-sm-6 col-md-4 col-lg-2">
					<div class="card text-center">
						<a href="appointment.jsp"> <svg class="icon"
								aria-hidden="true">
                                <use xlink:href="#icon-dadeng"></use>
                            </svg> <span>更换大灯</span>
						</a>
					</div>
				</div>
				<div class="col-sm-6 col-md-4 col-lg-2">
					<div class="card text-center">
						<a href="appointment.jsp"> <svg class="icon"
								aria-hidden="true">
                                <use xlink:href="#icon-biansuyouxiang"></use>
                            </svg> <span>更换变速油箱</span>
						</a>
					</div>
				</div>
				<div class="col-sm-6 col-md-4 col-lg-2">
					<div class="card text-center">
						<a href="appointment.jsp"> <svg class="icon"
								aria-hidden="true">
                                <use
									xlink:href="#icon-kongtiaozhilengji"></use>
                            </svg> <span>更换空调制冷器</span>
						</a>
					</div>
				</div>
				<div class="col-sm-6 col-md-4 col-lg-2">
					<div class="card text-center">
						<a href="appointment.jsp"> <svg class="icon"
								aria-hidden="true">
                                <use xlink:href="#icon-shachepan"></use>
                            </svg> <span>更换刹车盘</span>
						</a>
					</div>
				</div>
				<div class="col-sm-6 col-md-4 col-lg-2">
					<div class="card text-center">
						<a href="appointment.jsp"> <svg class="icon"
								aria-hidden="true">
                                <use xlink:href="#icon-lengqueye"></use>
                            </svg> <span>更换防冻冷却液</span>
						</a>
					</div>
				</div>
				<div class="col-sm-6 col-md-4 col-lg-2">
					<div class="card text-center">
						<a href="appointment.jsp"> <svg class="icon"
								aria-hidden="true">
                                <use xlink:href="#icon-jiyou"></use>
                            </svg> <span>更换机油</span>
						</a>
					</div>
				</div>
				<div class="col-sm-6 col-md-4 col-lg-2">
					<div class="card text-center">
						<a href="appointment.jsp"> <svg class="icon"
								aria-hidden="true">
                                <use xlink:href="#icon-zhuanxiangyou"></use>
                            </svg> <span>更换助力转向油</span>
						</a>
					</div>
				</div>
				<div class="col-sm-6 col-md-4 col-lg-2">
					<div class="card text-center">
						<a href="appointment.jsp"> <svg class="icon"
								aria-hidden="true">
                                <use xlink:href="#icon-zhengshipidai"></use>
                            </svg> <span>更换正时皮带</span>
						</a>
					</div>
				</div>
				<div class="col-sm-6 col-md-4 col-lg-2">
					<div class="card text-center">
						<a href="appointment.jsp"> <svg class="icon"
								aria-hidden="true">
                                <use xlink:href="#icon-waipidai"></use>
                            </svg> <span>更换外部皮带</span>
						</a>
					</div>
				</div>
				<div class="col-sm-6 col-md-4 col-lg-2">
					<div class="card text-center">
						<a href="appointment.jsp"> <svg class="icon"
								aria-hidden="true">
                                <use xlink:href="#icon-jianzhenqi"></use>
                            </svg> <span>更换减震器</span>
						</a>
					</div>
				</div>
				<div class="col-sm-6 col-md-4 col-lg-2">
					<div class="card text-center">
						<a href="appointment.jsp"> <svg class="icon"
								aria-hidden="true">
                                <use xlink:href="#icon-ranyouxitong"></use>
                            </svg> <span>燃油系统养护</span>
						</a>
					</div>
				</div>
				<div class="col-sm-6 col-md-4 col-lg-2">
					<div class="card text-center">
						<a href="appointment.jsp"> <svg class="icon"
								aria-hidden="true">
                                <use xlink:href="#icon-fadongjixitong"></use>
                            </svg> <span>发动机内部养护</span>
						</a>
					</div>
				</div>
				<div class="col-sm-6 col-md-4 col-lg-2">
					<div class="card text-center">
						<a href="appointment.jsp"> <svg class="icon"
								aria-hidden="true">
                                <use xlink:href="#icon-kongtiaoxitong"></use>
                            </svg> <span>空调系统养护</span>
						</a>
					</div>
				</div>
				<div class="col-sm-6 col-md-4 col-lg-2">
					<div class="card text-center">
						<a href="appointment.jsp"> <svg class="icon"
								aria-hidden="true">
                                <use xlink:href="#icon-lengquexitong"></use>
                            </svg> <span>冷却系统养护</span>
						</a>
					</div>
				</div>
				<div class="col-sm-6 col-md-4 col-lg-2">
					<div class="card text-center">
						<a href="appointment.jsp"> <svg class="icon"
								aria-hidden="true">
                                <use xlink:href="#icon-paijinqixitong"></use>
                            </svg> <span>排进气系统养护</span>
						</a>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- 维保服务部分结束 -->

	<!-- 车系配件部分开始 -->
	<section id="carAccessories" class="carAccessories pt-5 pb-4">
		<div class="container">
			<h1 class="section-title">车系配件</h1>
			<div class="row" id="row">
				
				
				
			
			
			
			
			
			
				
			</div>
		</div>
	</section>
	<!-- 车系部分结束 -->

	<!-- 车主文章、晒单部分开始 -->
	<section id="article" class="article pt-4 pb-5">
		<div class="container">
			<div class="row">
				<div class="col-lg-9">
					<ul class="list-unstyled">

					</ul>
				</div>
				<div class="col-lg-3">
					<div class="evaluate">
						<div class="d-flex">
							<h1 class="section-title">车友晒单</h1>
							<a class="ml-auto" href="evaluatelist.jsp">>>更多</a>
						</div>
						<div class="card">
							
							
							<div id="card-body" class="card-body">
								
							</div>
							<div class="card-btn p-2">
								<a href="myorder.jsp#evaluating-tab"
									class="btn btn-outline-success btn-block" role="button">我要晒单</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- 车主文章、晒单部分结束 -->

	<!-- 公告部分开始 -->
	<section id="announcement" class="announcement">
		<div class="container" id="container">
		
		</div>
	</section>
	<!-- 公告部分结束 -->

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
	<!-- iconfont js -->
	<script src="js/iconfont.js"></script>
	<script>
        $('.carousel').carousel({
            interval: 10000
        })        
    </script>
	<script type="text/javascript">
				/* 获取类型menu */
				$.ajax({
					type : 'get',
					url : "indexcontroller/getarticlelist",
					async:false, 
					datatype : 'json',
					success : function(menudata) {
						//console.log(menudata);
						//返回menu的json数据
									var menu= '<ul class="list-unstyled"><h1 class="section-title">车友文章</h1><div class="card p-4">';
							for (var i = 0; i < menudata.resultObject.length; i++) {
							menu+='<li class="media"><img src="../uploadnps/'+menudata.resultObject[i].articlephoto+'" class="mr-3" alt="'+menudata.resultObject[i].articletitle+'">'						
							menu+='<div class="media-body">'
							menu+='<h5 class="mt-0 mb-1 text-ellipsis">'+menudata.resultObject[i].articletitle+' </h5>'
							menu+='	<div class="media-time text-right text-muted">'+menudata.resultObject[i].articletime+'</div>'
							menu+='<div class="media-content text-clamp">'+menudata.resultObject[i].articlecontent+'</div>'
							menu+='	<div class="media-interaction text-muted">'
							menu+='<i class="fa fa-eye" aria-hidden="true"></i><span>17249</span>'
							menu+='<i class="fa fa-thumbs-o-up" aria-hidden="true"></i><span>17249</span>'
							menu+='<i class="fa fa-commenting-o" aria-hidden="true"></i><span>17249</span>'
							menu+='</div><div class="media-link text-right"><a href="article.jsp?articleid='+menudata.resultObject[i].articleid +'">查看全文</a></div></div></li>'
							
							}	
								menu+='</div></ul>'				
							$(".list-unstyled").html(menu);
						
					},
					error : function() {},
				});
    
    
     
    
   			$.ajax({
					type : 'get',
					url : "indexcontroller/getscorelist",
					async:false, 
					datatype : 'json',
					success : function(menudata) {
						//console.log(menudata);
						//返回menu的json数据
								var menu= "";
							for (var i = 0; i < menudata.resultObject.length; i++) {
									menu+='<div class="card-body">'	
									menu+='<h5 class="card-title">'+menudata.resultObject[i].realname+'车主'+'</h5>'		
									menu+='<div class="text-muted mb-2">'+menudata.resultObject[i].brandname+''+ menudata.resultObject[i].typename+''+menudata.resultObject[i].configname+'</div>'	
									menu+='<div class="card-text text-three">'
									menu+='<a href="evaluate.jsp">'+menudata.resultObject[i].scorecontent+'</a></div>'	
									menu+='<div class="card-evaluate">'
									menu+='<i class="fa fa-star" aria-hidden="true"></i> <i	class="fa fa-star" aria-hidden="true"></i> <i class="fa fa-star" aria-hidden="true"></i> <i class="fa fa-star" aria-hidden="true"></i> <i class="fa fa-star" aria-hidden="true"></i>'
									menu+='</div></div>'
							}
														
							$("#card-body").html(menu);
						
					},
					error : function() {},
				});
    
    
   		$.ajax({
					type : 'get',
					url : "indexcontroller/getannouncementlist",
					async:false, 
					datatype : 'json',
					success : function(menudata) {
						//console.log(menudata);
						//返回menu的json数据
								var menu= '<div class="container" id="container">';		
									for (var i = 0; i < menudata.resultObject.length; i++) {
									menu+='<h1 class="section-title">本店公告</h1>'
									menu+='	<div class="announcement-content text-muted text-center">'+menudata.resultObject[i].ancontent+'</div>'
									menu+='<div class="text-right">——<cite>'+menudata.resultObject[i].antime+'</cite></div>'	
									}
									menu+='</div>'												
							$("#container").html(menu);
						
					},
					error : function() {},
				});
    
    			
				$.ajax({
					type : 'get',
					url : "indexcontroller/getcarbrandlist",
					async:false, 
					datatype : 'json',
					success : function(menudata) {
						//console.log(menudata);
						//返回menu的json数据
						
								var menu= '<div class="row" id="row">';		
									for (var i = 0; i < menudata.resultObject.length; i++) {
									
									menu+='<div class="col-md-4 col-lg-3"><div class="card">'
									menu+='<a href="audiseries.jsp?brandid='+menudata.resultObject[i].brandid+''+"&brandname="+''+menudata.resultObject[i].brandname+'"><img class="card-img-top" src="../uploadnps/'+menudata.resultObject[i].brandpicture+'" alt="'+menudata.resultObject[i].brandname+'系列配件"></a>'
									menu+='<div class="card-body"><p class="card-text text-truncate">'+menudata.resultObject[i].brandname+'系列配件</p></div></div></div>'
									}
									menu+='</div>'												
							$("#row").html(menu);
						
					},
					error : function() {},
				});				
								
							
			
		
			
				
						
						
								
								
								
									
							
    
    
    
    </script>
</body>

</html>