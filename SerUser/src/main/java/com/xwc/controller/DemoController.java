package com.xwc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 创建人：徐卫超
 * 创建时间：2019/5/8  14:15
 * 业务：
 * 功能：
 */
@RestController
public class DemoController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/demo")
    public String dc() {
        return "demo:" + port+2;
    }
}
