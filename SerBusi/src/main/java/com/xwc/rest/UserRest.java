package com.xwc.rest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 创建人：徐卫超
 * 创建时间：2019/5/15  21:05
 * 业务：
 * 功能：
 */
@FeignClient(value = "user-service", fallback = Hiystras.class)
public interface UserRest {

    @GetMapping("/demo")
    String getDemo();
}
