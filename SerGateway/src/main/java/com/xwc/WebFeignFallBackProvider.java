package com.xwc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.netflix.appinfo.RefreshableAmazonInfoProvider;
import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

/**
 * 创建人：徐卫超
 * 创建时间：2019/5/21  20:38
 * 业务：
 * 功能：
 */
@Component
public class WebFeignFallBackProvider implements FallbackProvider {
    @Override
    public String getRoute() {
        return "fegin-service";
    }

    @Override
    public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
        return new ClientHttpResponse() {
            @Override
            public HttpStatus getStatusCode() throws IOException {
                return HttpStatus.OK;
            }

            @Override
            public int getRawStatusCode() throws IOException {
                return HttpStatus.OK.value();
            }

            @Override
            public String getStatusText() throws IOException {
                return HttpStatus.OK.getReasonPhrase();
            }

            @Override
            public void close() {

            }

            @Override
            public InputStream getBody() throws IOException {
                ObjectMapper objectMapper = new ObjectMapper();
                HashMap<String, Object> message = new HashMap<>();
                message.put("status", 200);
                message.put("msg", "无法连接,请检查网络");
                return new ByteArrayInputStream(objectMapper.writeValueAsString(message).getBytes("utf-8"));
            }

            @Override
            public HttpHeaders getHeaders() {
                HttpHeaders httpHeaders = new HttpHeaders();
                httpHeaders.setContentType(MediaType.APPLICATION_JSON);
                return httpHeaders;
            }
        };
    }
}
