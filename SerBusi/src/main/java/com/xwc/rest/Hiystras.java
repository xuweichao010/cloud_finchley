package com.xwc.rest;

import org.springframework.stereotype.Component;

/**
 * 创建人：徐卫超
 * 创建时间：2019/5/20  21:17
 * 业务：
 * 功能：
 */
@Component
public class Hiystras implements UserRest {
    @Override
    public String getDemo() {
        return "请求错误1231231";
    }
}
