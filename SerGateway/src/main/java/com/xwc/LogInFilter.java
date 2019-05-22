package com.xwc;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

/**
 * 创建人：徐卫超
 * 创建时间：2019/5/21  20:52
 * 业务：
 * 功能：
 */
public class LogInFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "per";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        return null;
    }
}
