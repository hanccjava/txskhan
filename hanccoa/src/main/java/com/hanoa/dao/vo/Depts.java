package com.hanoa.dao.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by txsk on 2018/2/22.
 */
@Table(name = "dept")
@Entity
public class Depts {
    @Id
    private String id;
    private String name;
    @Column(name = "leaderId")
    private String leaderId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(String leaderId) {
        this.leaderId = leaderId;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Depts{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", leaderId='").append(leaderId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
