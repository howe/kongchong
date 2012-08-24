<%@ page contentType="text/html; charset=utf-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta name="keywords" content="空中充值系统,点卡充值,点券,牛币,牛币充值,卡易售,官方充值,点券充值">
<title>充值结果 - 空中充值系统 - ESUP网游</title>
</head>

<body>
<div class="container">
<%@include file="head.jsp"%>
<form class="form-horizontal">
  <legend>充值结果</legend>
  <div class="well" style="max-width: 70%; margin: 0 auto 10px;">
    <div class="progress progress-striped active">
      <div class="bar" style="width: 60%;">60</div>
    </div>
    <div class="alert alert-error">
        <strong>充值提交失败！</strong> 请<a class="btn btn-link btn-danger" href="javascript:history.back(-1)" title="返回">返回</a>上一页面重新提交充值。       
    </div>
    <div class="alert alert-success">
        <strong>充值提交成功！</strong> 将在10分钟内充值到账，请稍后进入游戏查询充值结果。
        <br /> 
        <p><a class="btn btn-small btn-info" href="http://chong.esup.cn/" title="返回首页">返回首页</a></p>
    </div>
  </div>
</form>
<%@include file="foot.jsp"%>
</div>
</body>
</html>
