package com.wondernect.stars.starter;

import com.wondernect.stars.starter.config.StarsServerConfigProperties;
import com.wondernect.stars.starter.event.StarsEvent;
import com.wondernect.stars.starter.event.StarsEventType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Copyright (C), 2020, wondernect.com
 * FileName: WondernectStarsApplication
 * Author: chenxun
 * Date: 2020-06-24 09:47
 * Description:
 */
@ComponentScans({
        @ComponentScan(basePackages = "com.wondernect.*")
})
@EntityScan(basePackages = {
        "com.wondernect.*"
})
@EnableJpaRepositories(basePackages = {
        "com.wondernect.*"
})
@SpringBootApplication
public abstract class WondernectStarsApplication implements CommandLineRunner {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private StarsServerConfigProperties starsServerConfigProperties;

    @Override
    public void run(String... args) throws Exception {
        applicationContext.publishEvent(new StarsEvent(this, StarsEventType.BOOT));
        System.out.println("service start success at port " + starsServerConfigProperties.getPort() + " .....");
    }
}
