<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<nav id="h" class="blog-nav layui-header">
			<div class="blog-container">

				<a href="/QQ/qqLogin" class="blog-user">
					<i class="fa fa-qq"></i>
				</a>

				<a class="blog-logo" href="index.html">Long</a>

				<ul class="layui-nav" lay-filter="nav">
				 <li class="layui-nav-item">
								<a href="index.html"><i class="fa fa-home fa-fw"></i>&nbsp;首页</a>
						</li>
					<c:forEach  items="${categorys}"  var="category"> 
					   <li class="layui-nav-item">
								<a href="category/${category }"><i class="fa fa-home fa-fw"></i>&nbsp;${category.name }</a>
						</li>
					</c:forEach>
					 <li class="layui-nav-item">
								<a href="about.html"><i class="fa fa-home fa-fw"></i>&nbsp;关于本站</a>
						</li>
					<span class="layui-nav-bar"></span>
				</ul>

				<a class="blog-navicon" href="javascript:;">
					<i class="fa fa-navicon"></i>
				</a>
			</div>
</nav>