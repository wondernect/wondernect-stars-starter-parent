package com.wondernect.stars.starter.config;

/**
 * Copyright (C), 2017-2019, wondernect.com
 * FileName: ServerConfig
 * Author: chenxun
 * Date: 2019/12/1 15:11
 * Description:
 */

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(StarsServerConfigProperties.class)
public class StarsServerConfig {

}
