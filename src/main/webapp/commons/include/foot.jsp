<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<footer class="site-footer">
    <div class="wrapper">
        <p class="">
             版权所有©1995-<%java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(    
				     "yyyy");    
			   java.util.Date currentTime = new java.util.Date();    
			   java.lang.String time = simpleDateFormat.format(currentTime).toString();
			   out.println( time);  %> 苏州科达科技股份有限公司 (苏ICP备10015492号-1) 
        </p>
    </div>
</footer>
</body>
</html>