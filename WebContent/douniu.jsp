<%@ page contentType="text/html; charset=utf-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta name="keywords" content="空中充值系统,点卡充值,点券,牛币,牛币充值,卡易售,官方充值,点券充值">
<title>牛币充值 - 空中充值系统 - ESUP网游</title>
</head>

<body>

<div class="container">
<%@include file="head.jsp"%>
<form class="form-horizontal">
  <legend><img src="http://www.fj123.cn/assets/ctx/beta1/style/images/index_03.gif" width="70" class="img-rounded"/><a href="http://www.fj123.cn/" title="斗牛棋牌" target="_blank">斗牛棋牌</a>银子充值</legend>
  <div class="well" style="max-width: 60%; margin: 0 auto 10px;">
    <div class="control-group">
      <label class="control-label" for="inputEmail">充值卡号</label>
      <div class="controls">
        <input type="text" id="inputEmail" placeholder="充值卡号">
        &nbsp;<span class="badge badge-info"><strong>牛币</strong>1000两</span>&nbsp;<span class="label label-important">请输入充值卡号</span>
      </div>
    </div>
    <div class="alert alert-error">
      <button type="button" class="close" data-dismiss="alert">×</button>
      <strong>此充值卡已使用，</strong><a href="http://www.esup.cn/" target="_blank">详情</a></div>
    <div class="alert alert-info">
      <button type="button" class="close" data-dismiss="alert">×</button>
      <h4 class="alert-heading">充值卡类型不匹配</h4>
      <p>此卡为XXX充值卡，您可以点击以下按钮去充值</p>
      <p><a class="btn btn-primary" href="#">点此去充值</a></p>
    </div>
    <div class="control-group">
      <label class="control-label" for="inputEmail">充值密码</label>
      <div class="controls">
        <input type="text" id="inputEmail" placeholder="充值密码">
        &nbsp;<span class="label label-important">请输入充值密码</span></div>
    </div>
    <div class="alert alert-error">
      <button type="button" class="close" data-dismiss="alert">×</button>
      充值卡号或密码<strong>错误!</strong></div>
    <div class="control-group">
      <label class="control-label" for="inputEmail">充值帐号</label>
      <div class="controls">
        <input type="text" id="inputEmail" placeholder="充值帐号">
        &nbsp;<span class="label label-important">请输入充值帐号</span></div>
    </div>
    <div class="control-group">
      <label class="control-label" for="inputEmail">确认帐号</label>
      <div class="controls">
        <input type="text" id="inputEmail" placeholder="确认帐号">
        &nbsp;<span class="label label-info">确认帐号不一致</span></div>
    </div>
    <div class="control-group">
      <label class="control-label" for="inputEmail">电子邮件</label>
      <div class="controls">
        <input type="password" id="inputPassword" placeholder="电子邮件">
        &nbsp;<span class="badge">选填，便于查询使用</span></div>
    </div>
    <div class="control-group">
      <div class="controls">
        <button type="submit" class="btn btn-primary">充值</button>
        &nbsp;&nbsp;&nbsp;&nbsp;
        <button type="reset" class="btn">清空</button>
      </div>
    </div>
  </div>
</form>
<%@include file="foot.jsp"%>
</div>
</body>
</html>
