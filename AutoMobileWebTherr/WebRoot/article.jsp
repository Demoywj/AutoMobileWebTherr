
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="zh-CN">

<head>
<!-- 请求元标记 -->
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="chrome">
<title>车友文章</title>
<!-- bootstrap、自定义 CSS -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/font-awesome.min.css">
</head>

<body>
	<!-- 页面头部导航栏部分开始 -->
	<%@ include file="header.jsp"%>
	<!-- 页面头部导航栏部分结束 -->

	<!-- 文章部分开始 -->
	<section class="wrap">
		<div class="container">
			<!-- 面包屑导航 -->
			<nav aria-label="breadcrumb">
				<ol class="breadcrumb">
					<li class="breadcrumb-item"><a href="index.jsp">首页</a></li>
					<li class="breadcrumb-item"><a href="articlelist.jsp">车友文章</a></li>
					<li class="breadcrumb-item">正文</li>
				</ol>
			</nav>

			<!-- 文章内容部分 -->
			<section class="card p-4 mb-4">
				<h3 class="article-title" id="articletitle"></h3>
				<div class="text-muted">
					<i class="fa fa-eye" aria-hidden="true"></i><span> 17249 </span> <i
						class="fa fa-thumbs-o-up" aria-hidden="true"></i><span>
						17249 </span> <i class="fa fa-commenting-o" aria-hidden="true"></i><span>
						17249 </span> <span class="float-right" id="articletime"></span>
				</div>

				<div class="article-content">
					<section>
						<p id="articlecontent"></p>
						<img id="articlephoto" class="text-center" src="" width="100%">


					</section>



					<!-- 点赞 -->
					<section class="like">
						<i class="fa fa-thumbs-o-up" aria-hidden="true"></i>
						<div>
							<strong>70</strong>
						</div>
					</section>

				</div>
				<!-- 评论部分 -->
				<section class="mt-5 review">
					<section>
						<h5>评论(20)</h5>
						<div class="form-group text-right">
							<label for="review" class="sr-only">评论</label>
							<textarea id="review" class="form-control" name="review" rows="3"
								placeholder="发表您的伟大评论"></textarea>

							<button type="button" id="btnreview" class="btn btn-success mt-2">发表评论</button>
							<h5 id="qxlogin" style="color: red" hidden="hidden">请先登录</h5>
							<h5 id="conre" style="color: red" hidden="hidden">评论内容不能为空</h5>
						</div>
					</section>
					<div id="re"></div>


				</section>
		</div>
	</section>
	<!-- 文章部分结束 -->

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

	<script type="text/javascript">
	var a =  GetRequest();
	var articleid = a.articleid;
		
		//alert(brandid + brandname)
		
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
					url : "articlereviewcontroller/getarticlereviewlist?articleid="+articleid,
					async:false, 
					datatype : 'json',
					success : function(menudata) {
						//console.log(menudata);
						//返回menu的json数据
						$("#articletitle").text(menudata.resultObject.article.articletitle)
						
						$("#articletime").text(menudata.resultObject.article.articletime)
							$("#articlecontent").text(menudata.resultObject.article.articlecontent)
							$("#articlephoto").attr("src","../uploadnps/"+menudata.resultObject.article.articlephoto)
						
						var munu='<div id="re">';
						
						for(var i=0;i<menudata.resultObject.listreview.length;i++){
						
							munu+='<section class="mt-2 review-item"> <div class="review-header">'
							munu+='<span class="text-muted">'+menudata.resultObject.listreview[i].userid+'</span>'
							munu+='<span class="text-muted float-right">'+menudata.resultObject.listreview[i].createtime+'</span>'
							munu+='</div><div class="review-body mt-3">'+menudata.resultObject.listreview[i].reviewcontent+'</div>'
							munu+='<div class="review-footer text-right"><i class="fa fa-thumbs-o-up" aria-hidden="true"> <span>(2)</span></i></div></section>'
						
						}
						munu+='</div>'
							$("#re").html(munu);
						

					},
					error : function() {},
				});
    
		
		
		$("#btnreview").one('click', function() {

        var tuser = '<%= session.getAttribute("tuser")%>';;
        var review=$("#review").val().trim();  
　　　	var articleid = a.articleid;
		
		
		if(tuser=="null"){ 
		$("#qxlogin").removeAttr("hidden"); 
		return;
		}
		if(review==""){
		$("#conre").removeAttr("hidden"); 
		return;
		}
	
			$.ajax({
					type : 'get',
					url : 'articlereviewcontroller/addreview?articleid='+articleid+'&review='+review,
					datatype : 'json',
					success : function(data) {
						if (data.code == 10001) {										
						$("#re").load(location.href+"#re"); 
						$("#review").val("")
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