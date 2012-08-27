<%@ page contentType="text/html; charset=utf-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="空中充值系统">
<meta name="author" content="@howechiang">
<meta name="keywords" content="空中充值系统,点卡充值,点券,牛币,卡易售,官方充值,点券充值">
<title>空中充值系统 - ESUP网游</title>
</head>

<body>
<%@include file="head.jsp"%>
<div class="container-fluid">
  <div class="row-fluid">
    <div class="span3">
      <div class="well sidebar-nav">
        <ul class="nav nav-list">
          <li class="nav-header">Sidebar</li>
          <li class="active"><a href="#">Link</a></li>
          <li><a href="#">Link</a></li>
          <li><a href="#">Link</a></li>
          <li><a href="#">Link</a></li>
          <li class="nav-header">Sidebar</li>
          <li class="dropdown-submenu">
            <a tabindex="-1" href="#">More options</a>
            <ul class="dropdown-menu">
                    <li><a tabindex="-1" href="#">Second level link</a></li>
                    <li><a tabindex="-1" href="#">Second level link</a></li>
                    <li><a tabindex="-1" href="#">Second level link</a></li>
                    <li><a tabindex="-1" href="#">Second level link</a></li>
                    <li><a tabindex="-1" href="#">Second level link</a></li>
            </ul>
          </li>
          <li class="divider"></li>
          <li><a href="#">帮助</a></li>
        </ul>
      </div>
      <!--/.well -->
    </div>
    <!--/span-->
    <div class="span9">
      <div class="container-fluid">
        <div id="myCarousel" class="carousel slide" align="center">
          <div class="carousel-inner">
            <div class="item active"><a href="douniu.jsp"><img src="./images/douniu.jpg" alt=""></a>
              <div class="carousel-caption">
                <h4>斗牛棋牌网银子充值</h4>
                <p>一起逗留，一起斗牛。</p>
              </div>
            </div>
            <div class="item"><img src="./images/dnf.jpg" alt="">
              <div class="carousel-caption">
                <h4>地下城与勇士</h4>
                <p>DNF黑钻充值</p>
              </div>
            </div>
            <div class="item"><img src="./images/mh.jpg" alt="">
              <div class="carousel-caption">
                <h4>梦幻西游</h4>
                <p>网易一卡通充值</p>
              </div>
            </div>
            <div class="item"><img src="./images/ms.jpg" alt="">
              <div class="carousel-caption">
                <h4>魔兽世界</h4>
                <p>战网一卡通充值</p>
              </div>
            </div>
            <div class="item"><img src="./images/wm.jpg" alt="">
              <div class="carousel-caption">
                <h4>完美世界</h4>
                <p>完美一卡通充值</p>
              </div>
            </div>
          </div>
          <a class="left carousel-control" href="#myCarousel" data-slide="prev">‹</a><a class="right carousel-control" href="#myCarousel" data-slide="next">›</a></div>
      </div>
      <div class="row-fluid">
        <div class="span4">
          <h2>关于我们</h2>
          <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui.</p>
          <p><a class="btn" href="#about" role="button" data-toggle="modal">查看详细 &raquo;</a></p>
        </div>
        <div id="about" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="aboutLabel" aria-hidden="true">
            <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
              <h3 id="myModalLabel">关于我们</h3>
            </div>
            <div class="modal-body">
              <h4>Text in a modal</h4>
              <p>Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem.</p>

              <h4>Popover in a modal</h4>
              <p>This <a href="#" role="button" class="btn popover-test" title="A Title" data-content="And here's some amazing content. It's very engaging. right?">button</a> should trigger a popover on hover.</p>

              <h4>Tooltips in a modal</h4>
              <p><a href="#" class="tooltip-test" title="Tooltip">This link</a> and <a href="#" class="tooltip-test" title="Tooltip">that link</a> should have tooltips on hover.</p>

              <hr>

              <h4>Overflowing text to show optional scrollbar</h4>
              <p>We set a fixed <code>max-height</code> on the <code>.modal-body</code>. Watch it overflow with all this extra lorem ipsum text we've included.</p>
              <p>Cras mattis consectetur purus sit amet fermentum. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Morbi leo risus, porta ac consectetur ac, vestibulum at eros.</p>
              <p>Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor.</p>
              <p>Aenean lacinia bibendum nulla sed consectetur. Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Donec sed odio dui. Donec ullamcorper nulla non metus auctor fringilla.</p>
              <p>Cras mattis consectetur purus sit amet fermentum. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Morbi leo risus, porta ac consectetur ac, vestibulum at eros.</p>
              <p>Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor.</p>
              <p>Aenean lacinia bibendum nulla sed consectetur. Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Donec sed odio dui. Donec ullamcorper nulla non metus auctor fringilla.</p>
            </div>
            <div class="modal-footer">
              <button class="btn" data-dismiss="modal">关闭</button>
            </div>
          </div>
        <!--/span-->
        <div class="span4">
           <h2>联系方式</h2>
          <p>地址：江苏省南京市玄武区玄武大道699-8号</p>
          <p>电话：025-6******6</p>
          <p>邮件：<a href="mailto:info@esup.cn" target="_blank">info#esup.cn</a> #换成@</p>
          <br />
          <p><a class="btn" href="#contact" role="button" data-toggle="modal">更多详细 &raquo;</a></p>
        </div>
        <div id="contact" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="contactLabel" aria-hidden="true">
            <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
              <h3 id="myModalLabel">联系方式</h3>
            </div>
            <div class="modal-body">
              <h4>Text in a modal</h4>
              <p>Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem.</p>

              <h4>Popover in a modal</h4>
              <p>This <a href="#" role="button" class="btn popover-test" title="A Title" data-content="And here's some amazing content. It's very engaging. right?">button</a> should trigger a popover on hover.</p>

              <h4>Tooltips in a modal</h4>
              <p><a href="#" class="tooltip-test" title="Tooltip">This link</a> and <a href="#" class="tooltip-test" title="Tooltip">that link</a> should have tooltips on hover.</p>

              <hr>

              <h4>Overflowing text to show optional scrollbar</h4>
              <p>We set a fixed <code>max-height</code> on the <code>.modal-body</code>. Watch it overflow with all this extra lorem ipsum text we've included.</p>
              <p>Cras mattis consectetur purus sit amet fermentum. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Morbi leo risus, porta ac consectetur ac, vestibulum at eros.</p>
              <p>Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor.</p>
              <p>Aenean lacinia bibendum nulla sed consectetur. Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Donec sed odio dui. Donec ullamcorper nulla non metus auctor fringilla.</p>
              <p>Cras mattis consectetur purus sit amet fermentum. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Morbi leo risus, porta ac consectetur ac, vestibulum at eros.</p>
              <p>Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor.</p>
              <p>Aenean lacinia bibendum nulla sed consectetur. Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Donec sed odio dui. Donec ullamcorper nulla non metus auctor fringilla.</p>
            </div>
            <div class="modal-footer">
              <button class="btn" data-dismiss="modal">关闭</button>
            </div>
          </div>
          
        <!--/span-->
        <div class="span4">
          <h2>充值帮助</h2>
          <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui.</p>
          <p><a class="btn" href="#">详情 &raquo;</a></p>
        </div>
        <!--/span-->
      </div>
      <!--/row-->
    </div>
    <!--/row-->
  </div>
  <!--/span-->
</div>
<!--/row-->
<%@include file="foot.jsp"%>
</body>
</html>
