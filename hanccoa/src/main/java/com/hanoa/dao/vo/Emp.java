package com.hanoa.dao.vo;

import javax.persistence.Column;
import java.util.Date;

/**
 * Created by txsk on 2018/2/22.
 */

public class Emp {
    private String id;
    @Column(name = "dept_Id")
    private String deptId;
    @Column(name = "level_Id")
    private String levelId;
    private String name;
    private String salary;
    @Column(name = "tel_num")
    private String telNum;
    private String password;
    private String photo;
    private String message;
    @Column(name = "first_date")
    private Date firstDate;
    //入职雇员编号
    @Column(name = "emp_number")
    private String empNumber;
    //锁定标记
    @Column(name = "lock_sign")
    private int lockSign;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getLevelId() {
        return levelId;
    }

    public void setLevelId(String levelId) {
        this.levelId = levelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getFirstDate() {
        return firstDate;
    }

    public void setFirstDate(Date firstDate) {
        this.firstDate = firstDate;
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(String empNumber) {
        this.empNumber = empNumber;
    }

    public int getLockSign() {
        return lockSign;
    }

    public void setLockSign(int lockSign) {
        this.lockSign = lockSign;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Emp{");
        sb.append("id='").append(id).append('\'');
        sb.append(", deptId='").append(deptId).append('\'');
        sb.append(", levelId='").append(levelId).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", salary='").append(salary).append('\'');
        sb.append(", telNum='").append(telNum).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", photo='").append(photo).append('\'');
        sb.append(", message='").append(message).append('\'');
        sb.append(", firstDate=").append(firstDate);
        sb.append(", empNumber='").append(empNumber).append('\'');
        sb.append(", lockSign=").append(lockSign);
        sb.append('}');
        return sb.toString();
    }
}
