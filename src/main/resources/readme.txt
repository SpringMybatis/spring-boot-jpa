静态资源优先级顺序：
META/resources > resources > static > public 

自定义静态资源映射：
/myres/* 映射到 classpath:/myres/* 
可以多次使用 addResourceLocations 添加目录，优先级先添加的高于后添加的



http://412887952-qq-com.iteye.com/blog/2293846