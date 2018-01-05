package com.hanoa.controller.dao.vo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by txsk on 2018/1/5.
 */
@Component
@ConfigurationProperties(prefix = "leader")
public class LeaderProperties {
    private String CEO;
    private String CFO;

    public String getCEO() {
        return CEO;
    }

    public void setCEO(String CEO) {
        this.CEO = CEO;
    }

    public String getCFO() {
        return CFO;
    }

    public void setCFO(String CFO) {
        this.CFO = CFO;
    }
}
