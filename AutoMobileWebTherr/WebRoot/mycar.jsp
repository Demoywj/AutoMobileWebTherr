<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="zh-CN">

<head>
    <!-- 请求元标记 -->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="chrome">
    <title>我的爱车</title>

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
                            <a class="nav-link active" href="mycar.jsp">我的爱车</a>
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
            <div class="col-md-9 mt-3">
                <!-- 爱车信息部分 -->
                <div class="card bg-white vehicle">
                    <h5 class="card-header">我的爱车</h5>
                    <!-- 我的爱车信息 -->
                    <div class="card-body" >
                        <div class="row" id="mycarifo">
                            <!-- <div class="col-md-6 mb-2" id="mycarifo">
                                 <div class="card">
                                    <div class="overlay">
                                        <img src="imgs/Audi.jpg" class="card-img-top" alt="...">
                                        <div class="card-img-overlay">
                                            <a href="#editCarModel" data-toggle="modal" class="text-white">
                                                <i class="fa fa-edit" aria-hidden="true"></i></a>
                                        </div>
                                    </div>
                                    <ul class="list-group list-group-flush">
                                        <li class="list-group-item">奔驰 A级 A260 2.0T 2018年产</li>
                                        <li class="list-group-item">车牌号：云A·88888</li>
                                        <li class="list-group-item">行驶里程：10000km</li>
                                        <li class="list-group-item">购买日期：2017-5-1</li>
                                    </ul>
                                </div> 
                            </div> -->
                            
                            <!-- 添加爱车按钮 -->
                            <div class="col-md-6 mb-2">
                                <div class="card add-card">
                                    <a href="#addCarModel" data-toggle="modal"><i class="fa fa-plus"
                                            aria-hidden="true"></i></a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- 编辑爱车信息模态框 -->
                    <div class="modal fade" id="editCarModel" tabindex="-1" role="dialog" aria-labelledby="modelTitleId"
                        aria-hidden="true">
                        <div class="modal-dialog" role="document">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h5 class="modal-title">编辑我的爱车</h5>
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                    </button>
                                </div>
                                <div class="modal-body">
                                    <form>
                                        <!-- 上传爱车图片 -->
                                        <div class="custom-file mb-3">
                                            <label class="custom-file-label" for="customFile">请选择上传图片</label>
                                            <input type="file" class="custom-file-input" id="customFile">
                                        </div>
                                        <!-- 编辑车牌号 -->
                                        <div class="form-group">
                                            <label for="licence">车牌：</label>
                                            <input type="text" class="form-control" id="licence" value="云A·88888">
                                        </div>
                                        <!-- 编辑行驶里程 -->
                                        <div class="form-group">
                                            <label for="mileage">行驶里程：</label>
                                            <input type="text" class="form-control" id="mileage" value="10000km">
                                        </div>
                                        <!-- 购买日期时间 -->
                                        <div class="form-group">
                                            <label for="time">购买日期：</label>
                                            <input type="date" class="form-control" id="time" value="2017-5-1">
                                        </div>

                                    </form>
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-success">保存</button>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- 选择车型模态框 -->
                    <div class="modal fade" id="addCarModel" tabindex="-1" role="dialog" aria-labelledby="model"
                        aria-hidden="true">
                        <div class="modal-dialog modal-dialog-centered modal-lg" role="dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h5 class="modal-title">添加我的爱车</h5>
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                    </button>
                                </div>
                                <div class="modal-body">
                                    <div class="container-fluid">
                                        <!-- 车辆类型选择步骤 -->
                                        <ul class="choose-progress nav">
                                            <li class="nav-item show" id="choose-brand">
                                                <a id="brand-tab" data-toggle="tab" data-target="#car-brand" role="tab"
                                                    aria-controls="car-brand" aria-selected="true">
                                                    <span class="badge badge-pill badge-danger">1</span> 选择车辆品牌
                                                </a>
                                            </li>
                                            <li class="nav-item" id="choose-type">
                                                <a id="type-tab" data-toggle="tab" data-target="#car-type" role="tab"
                                                    aria-controls="car-type" aria-selected="false">
                                                    <span class="badge badge-pill badge-danger">2</span> 选择车辆车系
                                                </a>
                                            </li>
                                            <li class="nav-item" id="choose-config">
                                                <a id="config-tab" data-toggle="tab" data-target="#car-config"
                                                    role="tab" aria-controls="car-config" aria-selected="false">
                                                    <span class="badge badge-pill badge-danger">3</span> 选择车辆配置
                                                </a>
                                            </li>
                                        </ul>

                                        <!-- 已选车型 -->
                                        <div class="car-selected d-flex mt-3 sr-only" id="car-selected">
                                            <h6 class="mt-1">已选车型</h6>
                                            <div class="alert sr-only" id="alert-brand" role="alert">
                                                <span id="selected-brand"></span>
                                                <button type="button" class="close" data-dismiss="alert"
                                                    aria-label="Close">
                                                    <span aria-hidden="true">&times;</span>
                                                </button>
                                            </div>
                                            <div class="alert sr-only" id="alert-type" role="alert">
                                                <span id="selected-type"></span>
                                                <button type="button" class="close" data-dismiss="alert"
                                                    aria-label="Close">
                                                    <span aria-hidden="true">&times;</span>
                                                </button>
                                            </div>
                                        </div>

                                        <!-- 选择汽车品牌、类型、配置选项卡 -->
                                        <div class="tab-content" id="progress">
                                            <!-- 车辆品牌分类 -->
                                            <div class="tab-pane fade show active" id="car-brand" role="tabpanel"
                                                aria-labelledby="brand-tab">
                                                <ul class="nav nav-tabs brand mt-3" role="tablist">
                                                    <li class="nav-item">
                                                        <a class="nav-link active" href="#hot" id="hot-tab"
                                                            data-toggle="tab" role="tab" aria-controls="hot"
                                                            aria-selected="true">热门</a>
                                                    </li>
                                                    <li class="nav-item">
                                                        <a class="nav-link" href="#A" id="a-tab" data-toggle="tab"
                                                            role="tab" aria-controls="a" aria-selected="false">A</a>
                                                    </li>
                                                    <li class="nav-item">
                                                        <a class="nav-link" href="#B" id="b-tab" data-toggle="tab"
                                                            role="tab" aria-controls="b" aria-selected="false">B</a>
                                                    </li>
                                                    <li class="nav-item">
                                                        <a class="nav-link" href="#C" id="c-tab" data-toggle="tab"
                                                            role="tab" aria-controls="c" aria-selected="false">C</a>
                                                    </li>
                                                    <li class="nav-item">
                                                        <a class="nav-link" href="#D" id="d-tab" data-toggle="tab"
                                                            role="tab" aria-controls="d" aria-selected="false">D</a>
                                                    </li>
                                                    <li class="nav-item">
                                                        <a class="nav-link" href="#E" id="e-tab" data-toggle="tab"
                                                            role="tab" aria-controls="e" aria-selected="false">E</a>
                                                    </li>
                                                    <li class="nav-item">
                                                        <a class="nav-link" href="#F" id="f-tab" data-toggle="tab"
                                                            role="tab" aria-controls="f" aria-selected="false">F</a>
                                                    </li>
                                                    <li class="nav-item">
                                                        <a class="nav-link" href="#G" id="g-tab" data-toggle="tab"
                                                            role="tab" aria-controls="g" aria-selected="false">G</a>
                                                    </li>
                                                    <li class="nav-item">
                                                        <a class="nav-link" href="#H" id="h-tab" data-toggle="tab"
                                                            role="tab" aria-controls="h" aria-selected="false">H</a>
                                                    </li>
                                                    <li class="nav-item">
                                                        <a class="nav-link" href="#I" id="i-tab" data-toggle="tab"
                                                            role="tab" aria-controls="i" aria-selected="false">I</a>
                                                    </li>
                                                    <li class="nav-item">
                                                        <a class="nav-link" href="#J" id="j-tab" data-toggle="tab"
                                                            role="tab" aria-controls="j" aria-selected="false">J</a>
                                                    </li>
                                                    <li class="nav-item">
                                                        <a class="nav-link" href="#K" id="k-tab" data-toggle="tab"
                                                            role="tab" aria-controls="k" aria-selected="false">K</a>
                                                    </li>
                                                    <li class="nav-item">
                                                        <a class="nav-link" href="#L" id="l-tab" data-toggle="tab"
                                                            role="tab" aria-controls="l" aria-selected="false">L</a>
                                                    </li>
                                                    <li class="nav-item">
                                                        <a class="nav-link" href="#M" id="m-tab" data-toggle="tab"
                                                            role="tab" aria-controls="m" aria-selected="false">M</a>
                                                    </li>
                                                    <li class="nav-item">
                                                        <a class="nav-link" href="#N" id="n-tab" data-toggle="tab"
                                                            role="tab" aria-controls="n" aria-selected="false">N</a>
                                                    </li>
                                                    <li class="nav-item">
                                                        <a class="nav-link" href="#O" id="o-tab" data-toggle="tab"
                                                            role="tab" aria-controls="o" aria-selected="false">O</a>
                                                    </li>
                                                    <li class="nav-item">
                                                        <a class="nav-link" href="#P" id="p-tab" data-toggle="tab"
                                                            role="tab" aria-controls="p" aria-selected="false">P</a>
                                                    </li>
                                                    <li class="nav-item">
                                                        <a class="nav-link" href="#Q" id="q-tab" data-toggle="tab"
                                                            role="tab" aria-controls="q" aria-selected="false">Q</a>
                                                    </li>
                                                    <li class="nav-item">
                                                        <a class="nav-link" href="#R" id="r-tab" data-toggle="tab"
                                                            role="tab" aria-controls="r" aria-selected="false">R</a>
                                                    </li>
                                                    <li class="nav-item">
                                                        <a class="nav-link" href="#S" id="s-tab" data-toggle="tab"
                                                            role="tab" aria-controls="s" aria-selected="false">S</a>
                                                    </li>
                                                    <li class="nav-item">
                                                        <a class="nav-link" href="#T" id="t-tab" data-toggle="tab"
                                                            role="tab" aria-controls="t" aria-selected="false">T</a>
                                                    </li>
                                                    <li class="nav-item">
                                                        <a class="nav-link" href="#U" id="u-tab" data-toggle="tab"
                                                            role="tab" aria-controls="u" aria-selected="false">U</a>
                                                    </li>
                                                    <li class="nav-item">
                                                        <a class="nav-link" href="#V" id="v-tab" data-toggle="tab"
                                                            role="tab" aria-controls="v" aria-selected="false">V</a>
                                                    </li>
                                                    <li class="nav-item">
                                                        <a class="nav-link" href="#W" id="w-tab" data-toggle="tab"
                                                            role="tab" aria-controls="w" aria-selected="false">W</a>
                                                    </li>
                                                    <li class="nav-item">
                                                        <a class="nav-link" href="#X" id="x-tab" data-toggle="tab"
                                                            role="tab" aria-controls="x" aria-selected="false">X</a>
                                                    </li>
                                                    <li class="nav-item">
                                                        <a class="nav-link" href="#Y" id="y-tab" data-toggle="tab"
                                                            role="tab" aria-controls="y" aria-selected="false">Y</a>
                                                    </li>
                                                    <li class="nav-item">
                                                        <a class="nav-link" href="#Z" id="z-tab" data-toggle="tab"
                                                            role="tab" aria-controls="z" aria-selected="false">Z</a>
                                                    </li>
                                                </ul>
                                                <div class="tab-content mt-2">
                                                    <div class="tab-pane fade show active" id="hot" role="tabpanel"
                                                        aria-labelledby="hot-tab">
                                                        <div class="row">
                                                            <div class="col-sm-3">
                                                                <div class="car-brand">
                                                                    <img src="imgs/logo/benchi.png" alt="奔驰">
                                                                    <span>奔驰</span>
                                                                </div>
                                                            </div>
                                                            <div class="col-sm-3">
                                                                <div class="car-brand">
                                                                    <img src="imgs/logo/baoma.png" alt="宝马">
                                                                    <span>宝马</span>
                                                                </div>
                                                            </div>
                                                            <div class="col-sm-3">
                                                                <div class="car-brand">
                                                                    <img src="imgs/logo/aodi.png" alt="奥迪">
                                                                    <span>奥迪</span>
                                                                </div>
                                                            </div>
                                                            <div class="col-sm-3">
                                                                <div class="car-brand">
                                                                    <img src="imgs/logo/dazhong.png" alt="大众">
                                                                    <span>大众</span>
                                                                </div>
                                                            </div>
                                                            <div class="col-sm-3">
                                                                <div class="car-brand">
                                                                    <img src="imgs/logo/mashaladi.png" alt="马萨拉蒂">
                                                                    <span>马萨拉蒂</span>
                                                                </div>
                                                            </div>
                                                            <div class="col-sm-3">
                                                                <div class="car-brand">
                                                                    <img src="imgs/logo/baoshijie.png" alt="保时捷">
                                                                    <span>保时捷</span>
                                                                </div>
                                                            </div>
                                                            <div class="col-sm-3">
                                                                <div class="car-brand">
                                                                    <img src="imgs/logo/lanbojini.png" alt="兰博基尼">
                                                                    <span>兰博基尼</span>
                                                                </div>
                                                            </div>
                                                            <div class="col-sm-3">
                                                                <div class="car-brand">
                                                                    <img src="imgs/logo/falali.png" alt="法拉利">
                                                                    <span>法拉利</span>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="tab-pane fade" id="A" role="tabpanel"
                                                        aria-labelledby="a-tab">
                                                        这是A类车型
                                                    </div>
                                                    <div class="tab-pane fade" id="B" role="tabpanel"
                                                        aria-labelledby="b-tab">
                                                        这是B类车型
                                                    </div>
                                                    <div class="tab-pane fade" id="C" role="tabpanel"
                                                        aria-labelledby="c-tab">
                                                        这是C类车型
                                                    </div>
                                                    <div class="tab-pane fade" id="D" role="tabpanel"
                                                        aria-labelledby="d-tab">
                                                        这是D类车型
                                                    </div>
                                                    <div class="tab-pane fade" id="E" role="tabpanel"
                                                        aria-labelledby="e-tab">
                                                        这是E类车型
                                                    </div>
                                                    <div class="tab-pane fade" id="F" role="tabpanel"
                                                        aria-labelledby="f-tab">
                                                        这是F类车型
                                                    </div>
                                                    <div class="tab-pane fade" id="G" role="tabpanel"
                                                        aria-labelledby="g-tab">
                                                        这是G类车型
                                                    </div>
                                                    <div class="tab-pane fade" id="h" role="tabpanel"
                                                        aria-labelledby="h-tab">
                                                        这是H类车型
                                                    </div>
                                                    <div class="tab-pane fade" id="I" role="tabpanel"
                                                        aria-labelledby="i-tab">
                                                        这是I类车型
                                                    </div>
                                                    <div class="tab-pane fade" id="J" role="tabpanel"
                                                        aria-labelledby="j-tab">
                                                        这是J类车型
                                                    </div>
                                                    <div class="tab-pane fade" id="K" role="tabpanel"
                                                        aria-labelledby="k-tab">
                                                        这是K类车型
                                                    </div>
                                                    <div class="tab-pane fade" id="L" role="tabpanel"
                                                        aria-labelledby="l-tab">
                                                        这是L类车型
                                                    </div>
                                                    <div class="tab-pane fade" id="M" role="tabpanel"
                                                        aria-labelledby="m-tab">
                                                        这是M类车型
                                                    </div>
                                                    <div class="tab-pane fade" id="N" role="tabpanel"
                                                        aria-labelledby="n-tab">
                                                        这是N类车型
                                                    </div>
                                                    <div class="tab-pane fade" id="O" role="tabpanel"
                                                        aria-labelledby="o-tab">
                                                        这是O类车型
                                                    </div>
                                                    <div class="tab-pane fade" id="P" role="tabpanel"
                                                        aria-labelledby="p-tab">
                                                        这是P类车型
                                                    </div>
                                                    <div class="tab-pane fade" id="Q" role="tabpanel"
                                                        aria-labelledby="q-tab">
                                                        这是Q类车型
                                                    </div>
                                                    <div class="tab-pane fade" id="R" role="tabpanel"
                                                        aria-labelledby="r-tab">
                                                        这是R类车型
                                                    </div>
                                                    <div class="tab-pane fade" id="s" role="tabpanel"
                                                        aria-labelledby="s-tab">
                                                        这是S类车型
                                                    </div>
                                                    <div class="tab-pane fade" id="T" role="tabpanel"
                                                        aria-labelledby="t-tab">
                                                        这是T类车型
                                                    </div>
                                                    <div class="tab-pane fade" id="U" role="tabpanel"
                                                        aria-labelledby="u-tab">
                                                        这是U类车型
                                                    </div>
                                                    <div class="tab-pane fade" id="V" role="tabpanel"
                                                        aria-labelledby="v-tab">
                                                        这是V类车型
                                                    </div>
                                                    <div class="tab-pane fade" id="W" role="tabpanel"
                                                        aria-labelledby="w-tab">
                                                        这是W类车型
                                                    </div>
                                                    <div class="tab-pane fade" id="X" role="tabpanel"
                                                        aria-labelledby="x-tab">
                                                        这是X类车型
                                                    </div>
                                                    <div class="tab-pane fade" id="Y" role="tabpanel"
                                                        aria-labelledby="y-tab">
                                                        这是Y类车型
                                                    </div>
                                                    <div class="tab-pane fade" id="Z" role="tabpanel"
                                                        aria-labelledby="z-tab">
                                                        这是Z类车型
                                                    </div>
                                                </div>
                                            </div>
                                            <!-- 车辆类型 -->
                                            <div class="tab-pane fade" id="car-type" role="tabpanel"
                                                aria-labelledby="type-tab">
                                                <div class="tab-content mt-2">
                                                    <div class="tab-pane fade show active" id="" role="tabpanel"
                                                        aria-labelledby="benchi-A-tab">
                                                        <div class="row">
                                                            <div class="col-sm-3">
                                                                <div class="car-type">
                                                                    A级
                                                                </div>
                                                            </div>
                                                            <div class="col-sm-3">
                                                                <div class="car-type">
                                                                    B级
                                                                </div>
                                                            </div>
                                                            <div class="col-sm-3">
                                                                <div class="car-type">
                                                                    C级
                                                                </div>
                                                            </div>
                                                            <div class="col-sm-3">
                                                                <div class="car-type">
                                                                    G级(国产)
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <!-- 车辆配置 -->
                                            <div class="tab-pane fade" id="car-config" role="tabpanel"
                                                aria-labelledby="brand-tab">
                                                <div class="tab-content mt-2">
                                                    <div class="tab-pane fade show active" id="" role="tabpanel"
                                                        aria-labelledby="">
                                                        <div class="row">
                                                            <div class="col-sm-3">
                                                                <div class="car-config">
                                                                    A260 2.0T 2018年产
                                                                </div>
                                                            </div>
                                                            <div class="col-sm-3">
                                                                <div class="car-config">
                                                                    A260 2.0T 2017年产
                                                                </div>
                                                            </div>
                                                            <div class="col-sm-3">
                                                                <div class="car-config">
                                                                    A260 2.0T 2016年产
                                                                </div>
                                                            </div>
                                                            <div class="col-sm-3">
                                                                <div class="car-config">
                                                                    A260 2.0T 2015年产
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>

                                    </div>
                                </div>
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
    <script>
        // 选择品牌后跳转到类型选项卡
        $('.car-brand').click(function () {
            $('#type-tab').click();
        });
        // 选择类型后跳转到配置选项卡
        $('.car-type').click(function () {
            $('#config-tab').click();
        });
        //获取选中品牌、类型、配置的值
        $('.car-brand').on('click', function () {
            // 添加和删除class属性值
            $('#choose-type').addClass('show');
            $('#choose-brand').addClass('show');
            $('#selected-brand').text($(this).text().trim());
            $('#car-selected').removeClass('sr-only');
            $('#alert-brand').removeClass('sr-only');
            // 获取选中的值
            console.log($(this).text().trim());
        });
        $('.car-type').on('click', function () {
            $('#choose-config').addClass('show');
            $('#choose-type').removeClass('sr-only');
            $('#selected-type').text($(this).text().trim());
            $('#alert-type').removeClass('sr-only');
            console.log($(this).text().trim());
        });
        $('.car-config').on('click', function () {
            $('#selected-car').removeAttr('hidden').text($('#selected-brand').text() + ' ' + $('#selected-type')
                .text() + ' ' + $(this).text().trim());
            //关闭模态框
            $('#addCarModel').modal('hide');
            console.log($(this).text().trim());
        });
    </script>
</body>
<script type="text/javascript">
		
		
		
   			$.ajax({
					type : 'get',
					url : "userifo/getAllusercar",
					async:false, 
					datatype : 'json',
					success : function(menudata) {
						
								var menu= '';
							for (var i = 0; i < menudata.resultObject.length; i++) {
						
									menu+='<div class="col-md-6 mb-2">'
                               menu+=' <div class="card">'
                                    menu+='<div class="overlay">'
                                   
                                      menu+='<img src="../uploadnps/'+menudata.resultObject[i].carphoto+'"class="card-img-top" alt="...">'
                                        menu+='<div class="card-img-overlay">'
                                           menu+=' <i class="fa fa-edit" aria-hidden="true"></i>'
                                       menu+=' </div>'
                                   menu+=' </div>'
                                   menu+=' <ul class="list-group list-group-flush">'
                                       menu+=' <li class="list-group-item">'+menudata.resultObject[i].brandname+menudata.resultObject[i].typename+menudata.resultObject[i].configname +'</li>'
                                        menu+=' <li class="list-group-item">车牌号:'+menudata.resultObject[i].carnum+'</li>'
                                       menu+=' <li class="list-group-item">行驶里程:'+menudata.resultObject[i].mileage+'</li>'
                                        menu+='<li class="list-group-item">购买日期:'+menudata.resultObject[i].purchasedate+'</li>'
                                   menu+=' </ul>'
                                menu+='</div>'
                           menu+=' </div>'
									
								
									
							}
										
							$("#mycarifo").html(menu);
						
					},
					error : function() {},
				});
		
		
		
	</script>
</html>