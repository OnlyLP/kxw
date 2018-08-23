<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<footer id="f" class="blog-footer">
		     <div class="blog-module-title"><i class="fa fa-link"></i>&nbsp;友情链接</div>
							<ul class="blogroll">
							<c:forEach items="${ links}" var="link">
								<li>
									<a target="_blank" href="http://${link.linkUrl }" title="${link.linkName }">${link.linkName }</a>
								</li>
							</c:forEach>
							</ul>
			<p><span>Copyright</span><span>©</span><span>2018</span>
				<a href="http://www.long225.cn">Long博客</a><span>Design By Longwang</span></p>
			<p>
				<a href="http://www.miitbeian.gov.cn" target="_blank">湘ICP备18010289号</a>
			</p>
</footer>