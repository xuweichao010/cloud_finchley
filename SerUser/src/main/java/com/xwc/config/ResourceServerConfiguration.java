package com.xwc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

/**
 * 创建人：徐卫超
 * 创建时间：2019/5/28  15:46
 * 业务：
 * 功能：
 */
@Configuration
@EnableResourceServer
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {


    @Override
    public void configure(HttpSecurity http) throws Exception {
        //配置资源权限
        http.authorizeRequests()
                .antMatchers("/auth/**").permitAll().anyRequest().authenticated(); // 配置order访问控制，必须认证后才可以访问
    }
}
