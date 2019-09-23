package com.just.teachersystem.Config;


import com.just.teachersystem.Intercepter.AdminIntercepter;
import com.just.teachersystem.Intercepter.OnlineIntercepter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 拦截器配置
 */
@Configuration
public class IntercetorConfig implements WebMvcConfigurer {
    @Override
//
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new OnlineIntercepter()).addPathPatterns("/app/v1/record/online/*/**","/app/v1/user/online/*/**");
        registry.addInterceptor(new AdminIntercepter()).addPathPatterns("/app/v1/admin/*/**");
        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
