package com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyConfig extends WebMvcConfigurerAdapter {
    @Autowired
    private LoginHandlerInterceptor loginHandlerInterceptor;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }
    @Bean
    public WebMvcConfigurerAdapter WebMvcConfigurerAdapter() {
        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {
            /**添加拦截器*/
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                registry.addInterceptor(loginHandlerInterceptor).addPathPatterns("/admin/**")
                        .addPathPatterns("/user/center")
                        .excludePathPatterns("/admin").
                        excludePathPatterns("/admin/login");
            }

            /**静态资源处理*/
            /**
             * springboot中配置addResourceHandler和addResourceLocations，使得可以从磁盘中读取图片、视频、音频等
             * /pic/**表示在磁盘pic/目录下的所有资源会被解析为以下的路径
             * @param registry
             */
            @Override
            public void addResourceHandlers(ResourceHandlerRegistry registry) {
//                registry.addResourceHandler("/pic/**").addResourceLocations("classpath:/file/");
                registry.addResourceHandler("/pic/**").addResourceLocations("file:D:/file/");
                super.addResourceHandlers(registry);
            }
        };
        return adapter;
    }
}