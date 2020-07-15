<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="zh-CN">

<head>
<!-- 请求元标记 -->
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="chrome">
<title>奥迪车系配件</title>

<!-- bootstrap、自定义 CSS -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/font-awesome.min.css">
</head>

<body>
	<!-- 页面头部导航栏部分开始 -->
	<%@ include file="header.jsp"%>
	<!-- 页面头部导航栏部分结束 -->


	<!-- 车系维修内容部分开始 -->
	<div class="wrap">
		<div class="container">
			<h3 class="pt-3" id="brandname"></h3>
			<!-- 选择汽车类型 -->
			<div class="row">
				<div class="form-group col-sm-5">
					<label for="car-config" class="sr-only">选择车系</label> <select
						id="car-config" class="form-control" name="car-config"
						onchange="show_sub(this.options[this.options.selectedIndex].value)">
						<option>请选择车系</option>

					</select> <select id="car-CarType" class="form-control" name="car-config" onchange="show(this.options[this.options.selectedIndex].value)">
						<option>请选择配置</option>

					</select>

				</div>
			</div>
			<!-- 汽车配件 -->
			<div id ="row" class="row">
			
			

			
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

	<script type="text/javascript">
    
    	var a = GetRequest();
		//console.log("articleid:" + a['articleid']) //打印出传过来的id  
		var brandid = a.brandid;
		var brandname =a.brandname;
		//alert(brandid + brandname)
		$("#brandname").text(brandname+"车系配件")
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
					url : "audiseriescontroller/getcarbrandtypelist?brandid="+brandid,
					async:false, 
					datatype : 'json',
					success : function(menudata) {
						//console.log(menudata);
						//返回menu的json数据
								var menu= ' <select id="car-config" class="form-control" name="car-config">';		
									for (var i = 0; i < menudata.resultObject.length; i++) {
										menu+='<option  value="'+menudata.resultObject[i].typeid+'">'+menudata.resultObject[i].typename+'</option>'
									}
									menu+='</select>'												
							$("#car-config").html(menu);
						
					},
					error : function() {},
				});
    
    
     function show_sub(car){   
    // alert(car)
	 	$.ajax({
		url:"audiseriescontroller/gettypeConfiglist?typeid="+car,//后台请求url，传入值
		type:'GET',//使用get请求，如果用post，值写在data里
		cache:true,//缓存
		dataType:'json',//返回的数据类型，就是后台返回回来的类型，可以是html，或xml
		async:true,//使用异步方式
		success:function(data){//成功后返回值data
		
 		 			var menu='<select id="car-CarType" class="form-control" name="car-config">';		
									for (var i = 0; i < data.resultObject.length; i++) {
										menu+='<option  value="'+data.resultObject[i].configid+'">'+data.resultObject[i].configname+'</option>'
									}
									menu+='</select>'												
							$("#car-CarType").html(menu);
 		 		
}, 
error:function(){//失败的处理
}
})
 
 
}
    
          function show(car){   
    
	 	$.ajax({
		url:"audiseriescontroller/getConfigPartifolist?configid="+car,//后台请求url，传入值
		type:'GET',//使用get请求，如果用post，值写在data里
		cache:true,//缓存
		dataType:'json',//返回的数据类型，就是后台返回回来的类型，可以是html，或xml
		async:true,//使用异步方式
		success:function(data){//成功后返回值data
		
 		 			var menu='<div id ="row" class="row">';		
									for (var i = 0; i < data.resultObject.length; i++) {
										menu+='<div class="col-sm-6 col-md-4 col-lg-3"><div class="card mb-4">'
										menu+='<img class="card-img-top" src="../uploadnps/'+data.resultObject[i].partphoto+'" alt="'+data.resultObject[i].partname+'">'
										menu+='<div class="card-body"><h5 class="card-title">'+data.resultObject[i].partname+'</h5><p class="card-text">'+data.resultObject[i].specification+'</p><p class="card-text">￥'+data.resultObject[i].partprice+'</p></div>'
										menu+='</div></div>'
									}
									menu+='</div>'												
							$("#row").html(menu);
 		 		
}, 
error:function(){//失败的处理
}
})
 
 
}
                       
    
    	
						
						
				
    
    
    </script>
</body>

</html>