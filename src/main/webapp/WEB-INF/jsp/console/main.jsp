<%@ page import="com.kedacom.security.util.ContextUtil" %>
﻿
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!-- head引入 -->
<%@include file="/commons/include/get.jsp" %>
<body>
<!-- header start -->
<div class="navbar navbar-fixed-top">

    <div class="navbar-inner">
        <div class="container-fluid">
            <a class="brand" href="main.do">
                <div class="logo"></div>
            </a>
            <!-- start: Header Menu -->
            <div class="nav pull-right right-nav">
                您好，<%=ContextUtil.getCurrentUser().getFullname()%>&nbsp;
                <a href="${ctx}/j_spring_security_logout">&nbsp;&nbsp;<i class="glyphicon glyphicon-share"></i>&nbsp;&nbsp;退出</a>
            </div>
        </div>
    </div>
</div>
<!-- header end -->
<!-- 内容开始 -->
<div id="wrapper" class="container-fluid all">
    <div class="row">
        <div id="sidebar" class="col-lg-2 col-md-2 col-sm-2 col-xs-2 sidebar ">
            <ul class="nav" id="left">
            </ul>
        </div>
        <div id="maincontent" class="col-lg-10 col-md-10 col-sm-10 col-xs-10 maincontent">
            <div id="rightContain"></div>
        </div>
    </div>
</div>
<div class="modal fade" id="loadingModal" data-backdrop="false">
    <div style="width: 200px;height:20px; z-index: 20000; position: absolute; text-align: center; left: 50%; top: 50%;margin-left:-100px;margin-top:-10px">
        <div class="progress progress-striped active" style="margin-bottom: 0;">
            <div class="progress-bar" style="width: 100%;"></div>
        </div>
        <h5>努力加载中,请稍后...</h5>
    </div>
</div>
<div><form id="tempSearchForm"></form></div>
<!-- 内容结束 -->
<%@include file="/commons/include/foot.jsp" %>
<script type="text/javascript">

    $(function () {
        var resList = eval('${resList}');
        $.each(resList, function (i, v) {
            $("#left").append
            (
                '<li id="' + v.resId + '">\n' +
                '    <a id="link' + v.resId + '" href="javascript:void(0);" data-url=" ${ctx}' + v.defaultUrl + '">\n' +
                '        <i class="glyphicon glyphicon-book"></i>' + v.resName + '\n' +
                '    </a>\n' +
                '</li>'
            );
        });

        $("#left li a").on("click", function () {
            $("#rightContain").load($(this).attr("data-url"));
            $("#left li a").removeClass("active");
            $(this).addClass("active");
            $("#tempSearchForm").html('');
        });

        var leftLiAList = $("#left li a");
        if (leftLiAList != undefined && leftLiAList != null && leftLiAList.length > 0) {
            $("#left li a:eq(0)").click();
        }
    });

</script>