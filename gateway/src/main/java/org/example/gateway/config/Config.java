package org.example.gateway.config;

import lombok.Data;

import java.util.List;

/**
 * 过滤器配置
 */
@Data
public class Config {
    /**
     * 白名单前置配置
     */
    private List<String> whitePathList;
}
