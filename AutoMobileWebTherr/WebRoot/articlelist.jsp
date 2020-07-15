<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="zh-CN">

<head>
    <!-- 请求元标记 -->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="chrome">
    <title>文章列表</title>
    <!-- bootstrap、自定义 CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/font-awesome.min.css">
</head>

<body>
     <!-- 页面头部导航栏部分开始 -->
	<%@ include file="header.jsp" %>
	<!-- 页面头部导航栏部分结束 -->

    <!-- 文章部分开始 -->
    <section class="wrap">
        <div class="container">
            <!-- 面包屑导航 -->
            <nav aria-label="breadcrumb">
                <ol class="breadcrumb">
                    <li class="breadcrumb-item"><a href="index.jsp">首页</a></li>
                    <li class="breadcrumb-item">车友文章</li>
                </ol>
            </nav>

            <!-- 文章内容部分 -->
            <section class="card p-2 mb-4">
                <ul class="list-unstyled article-list">
                    <li class="media">
                        <img src="imgs/article1.jpg" class="mr-3" alt="这次剩下的机油下次保养还想用？这样做每次能省不少钱">
                        <div class="media-body">
                            <h5 class="mt-0 mb-1 text-ellipsis">这次剩下的机油下次保养还想用？这样做每次能省不少钱
                            </h5>
                            <div class="media-time text-right text-muted">2019-2-22</div>
                            <div class="media-content text-clamp">
                                我们绝大多数的车在保养时总是会多出来那么点机油，留着想下次保养继续用，又担心机油变质会伤害车子。今天，小编就带大家来看看如何在下次保养上继续使用这部分机油。
                            </div>
                            <div class="media-interaction text-muted">
                                <i class="fa fa-eye" aria-hidden="true"></i><span> 17249 </span>
                                <i class="fa fa-thumbs-o-up" aria-hidden="true"></i><span> 17249 </span>
                                <i class="fa fa-commenting-o" aria-hidden="true"></i><span> 17249 </span>
                            </div>
                            <div class="media-link text-right">
                                <a href="article.jsp">查看全文</a>
                            </div>
                        </div>
                    </li>
                    <li class="media">
                        <img src="imgs/article2.jpg" class="mr-3" alt="【DIY】一分钟小检查，轻松解决“假异响”">
                        <div class="media-body">
                            <h5 class="mt-0 mb-1 text-ellipsis">【DIY】一分钟小检查，轻松解决“假异响”</h5>
                            <div class="media-time text-right text-muted">2019-2-22</div>
                            <div class="media-content text-clamp">
                                这些天小编的车遇到了“咯咯咯”的异响，几乎随时都在发生，一开始怀疑是不是悬挂松动，开去检查也没有发现问题，然后查内饰的过程中发现门上的储物格里有几枚1元硬币。至此“假异响”问题便解决了。
                            </div>
                            <div class="media-interaction text-muted">
                                <i class="fa fa-eye" aria-hidden="true"></i><span> 17249 </span>
                                <i class="fa fa-thumbs-o-up" aria-hidden="true"></i><span> 17249 </span>
                                <i class="fa fa-commenting-o" aria-hidden="true"></i><span> 17249 </span>
                            </div>
                            <div class="media-link text-right">
                                <a href="javascript:;">查看全文</a>
                            </div>
                        </div>
                    </li>
                    <li class="media">
                        <img src="imgs/article3.jpg" class="mr-3" alt="过减速带有诀窍！错误方法小心汽车“暗伤”来袭">
                        <div class="media-body">
                            <h5 class="mt-0 mb-1 text-ellipsis">过减速带有诀窍！错误方法小心汽车“暗伤”来袭
                            </h5>
                            <div class="media-time text-right text-muted">2019-2-22</div>
                            <div class="media-content text-clamp">
                                在城市的路面上，常常可以看见一条条黄黑相间的减速带。这些减速带的存在，本来是想更好的控制驾驶员的车速，保证车辆和路上行人的安全。然而，如果没有学到过减速带的正确姿势，它带给你的，除了安全还有遍体“暗伤”。
                            </div>
                            <div class="media-interaction text-muted">
                                <i class="fa fa-eye" aria-hidden="true"></i><span> 17249 </span>
                                <i class="fa fa-thumbs-o-up" aria-hidden="true"></i><span> 17249 </span>
                                <i class="fa fa-commenting-o" aria-hidden="true"></i><span> 17249 </span>
                            </div>
                            <div class="media-link text-right">
                                <a href="javascript:;">查看全文</a>
                            </div>
                        </div>
                    </li>
                    <li class="media">
                        <img src="imgs/article4.jpg" class="mr-3" alt="变速箱油加错了？送给那些喜欢乱来的人">
                        <div class="media-body">
                            <h5 class="mt-0 mb-1 text-ellipsis">变速箱油加错了？送给那些喜欢乱来的人</h5>
                            <div class="media-time text-right text-muted">2019-2-22</div>
                            <div class="media-content text-clamp">
                                针对变速箱油，诺诺的技师一直都是很谨慎……
                                （本文来自微信公众号：爱车的诺诺icheNuonuo，买车用车口碑看诺诺）
                            </div>
                            <div class="media-interaction text-muted">
                                <i class="fa fa-eye" aria-hidden="true"></i><span> 17249 </span>
                                <i class="fa fa-thumbs-o-up" aria-hidden="true"></i><span> 17249 </span>
                                <i class="fa fa-commenting-o" aria-hidden="true"></i><span> 17249 </span>
                            </div>
                            <div class="media-link text-right">
                                <a href="javascript:;">查看全文</a>
                            </div>
                        </div>
                    </li>
                </ul>
            </section>

            <!-- 分页 -->
            <nav aria-label="Page navigation example">
                <ul class="pagination justify-content-end">
                    <li class="page-item disabled">
                        <a class="page-link" href="#" tabindex="-1" aria-disabled="true">上一页</a>
                    </li>
                    <li class="page-item"><a class="page-link" href="#">1</a></li>
                    <li class="page-item"><a class="page-link" href="#">2</a></li>
                    <li class="page-item"><a class="page-link" href="#">3</a></li>
                    <li class="page-item">
                        <a class="page-link" href="#">下一页</a>
                    </li>
                </ul>
            </nav>
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
</body>

</html>