package com.kgeek.cn.demo.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "com.guazi")
@Data
@Component
public class ConfigCompoment {
    private String baseUrl;
    private String group;
}
