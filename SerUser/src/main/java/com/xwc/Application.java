package com.xwc;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 创建人：徐卫超
 * 创建时间：2019/5/8  14:09
 * 业务：
 * 功能：
 */
@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient
@EnableOAuth2Sso
public class Application {
    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class)
                .web(WebApplicationType.SERVLET).run(args);
    }
}
