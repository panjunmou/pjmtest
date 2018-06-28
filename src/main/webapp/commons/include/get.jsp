<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="display" uri="http://displaytag.sf.net" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<spring:htmlEscape defaultHtmlEscape="true"/>
<html>
<head>
    <title>科达总代管理系统</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=9; IE=8; IE=7; IE=EDGE"/>

    <%--<link rel="icon" href="${ctx}/favicon.ico" type="image/x-icon"/>
    <link rel="shortcut icon" href="${ctx}/favicon.ico" type="image/x-icon"/>
    <link href="${ctx}/css/common.css" rel="stylesheet" type="text/css"/>
    <link href="${ctx}/css/main.css" rel="stylesheet" type="text/css"/>--%>

    <link rel="stylesheet" href="${ctx}/css/bootstrap.min.css">
    <link href="${ctx}/js/bootstrap3-editable/css/bootstrap-editable.css" rel="stylesheet">
    <link rel="stylesheet" href="${ctx}/css/bootstrap-table.min.css">
    <link rel="stylesheet" href="${ctx}/css/bootstrapValidator.css">
    <link rel="stylesheet" href="${ctx}/css/style.css">
    <link rel="stylesheet" type="text/css" href="${ctx}/js/skin/default/layer.css">
    <link rel="stylesheet" type="text/css" href="${ctx}/js/toastr.css">
    <link href="${ctx}/css/bootstrap-datetimepicker.css" rel="stylesheet">


    <!-- end: CSS -->

    <!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <link id="ie-style" href="${ctx}/css/ie.css" rel="stylesheet">
    <![endif]-->
    <!--[if IE 9]>
    <link id="ie9style" href="${ctx}/css/ie9.css" rel="stylesheet">
    <![endif]-->
    <!-- start: Favicon -->
    <link rel="shortcut icon" href="${ctx}/images/kedacom_64X64.ico">
    <!-- end: Favicon -->

    <!-- strat javascript -->
    <script src="${ctx}/js/jquery-1.9.1.min.js"></script>
    <script src="${ctx}/js/jquery.blockUI.js"></script>
    <script src="${ctx}/js/bootstrap.js"></script>
    <script src="${ctx}/js/bootstrapValidator/bootstrapValidator.js" type="text/javascript"></script>
    <script src="${ctx}/js/bootstrap-table.min.js"></script>
    <script src="${ctx}/js/bootstrap-table-zh-CN.min.js"></script>
    <script src="${ctx}/js/jquery.serializeObject.js"></script>
    <script src="${ctx}/js/sysDialog.js"></script>
    <script src="${ctx}/js/base.js"></script>
    <script src="${ctx}/js/toastr.js"></script>
    <script src="${ctx}/js/jquery.validate.min.js"></script>
    <script src="${ctx}/js/bootstrap-datetimepicker.js"></script>
    <script src="${ctx}/js/bootstrap-datetimepicker.zh-CN.js"></script>
    <script src="${ctx}/js/jquery.serializeObject.js" type="text/javascript"></script>
    <script type="text/javascript" src="${ctx}/js/layer.js"></script>
    <script type="text/javascript" src="${ctx}/js/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${ctx}/js/bootstrap-treeview.js"></script>
    <script type="text/javascript" src="${ctx}/js/bootstrap3-editable/js/bootstrap-editable.js"></script>
    <script type="text/javascript" src="${ctx}/js/bootstrap3-editable/js/bootstrap-table-editable.js"></script>

    <link rel="stylesheet" type="text/css" href="${ctx}/js/bootstrap-select/css/bootstrap-select.css">
    <script type="text/javascript" src="${ctx}/js/bootstrap-select/js/bootstrap-select.js"></script>
    <script type="text/javascript" src="${ctx}/js/bootstrap-select/js/i18n/defaults-zh_CN.js"></script>


</head>
<script type="text/javascript">
    __ctx = '${ctx}';

    function back() {
        window.history.go(-1);
    }

    var Keybord = {
        ENTER: 13
    }

</script>
<style type="text/css">
    #gridRedForZxq {
        color: red;
    }

    .gridBlueZxq {
        color: blue;
        font-weight: bold
    }
</style>
