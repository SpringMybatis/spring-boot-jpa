package com.example;

import java.util.List;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.example.config.MyProperties;
import com.example.util.SpringUtil;

/**
 * @author Administrator
 * 
 * 第一种方法就是：
 * （1）启动类继承extends WebMvcConfigurerAdapter
 * （2）覆盖方法configureMessageConverters
 * 
 */
@SpringBootApplication
@EnableConfigurationProperties({MyProperties.class})  
// @ServletComponentScan("com.example.web.servlet")
// @Import(value={SpringUtil.class})
// @ComponentScan(basePackages={"com.example.web.servlet","com.example.web.filter"})
public class ApiCoreApp extends WebMvcConfigurerAdapter {

	public static void main(String[] args) {
		
		/*
         * Banner.Mode.OFF:关闭;
         * Banner.Mode.CONSOLE:控制台输出，默认方式;
         * Banner.Mode.LOG:日志输出方式;
         */
		SpringApplication application = new SpringApplication(ApiCoreApp.class);
        application.setBannerMode(Banner.Mode.OFF); 
        application.run(args); 
		
		// SpringApplication.run(ApiCoreApp.class, args);
	}
	
	 /**注册Spring Util
     * 这里为了和上一个冲突，所以方面名为：springUtil2
     * 实际中使用springUtil
     */
    @Bean
    public SpringUtil springUtil2(){return new SpringUtil();}
	
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		super.configureMessageConverters(converters);
		FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
		fastConverter.setFastJsonConfig(fastJsonConfig);
		converters.add(fastConverter);
	}
	
	
}
