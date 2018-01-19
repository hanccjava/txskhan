package com.hanoa.dao.vo;

import org.springframework.beans.factory.annotation.Value;
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
    @Value("${leader.value}")
    private String value;

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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
