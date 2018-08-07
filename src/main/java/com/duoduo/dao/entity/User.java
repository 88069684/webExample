package com.duoduo.dao.entity;

import java.math.BigDecimal;

public class User {
    private Integer id;

    private String userName;

    private String password;

    private Integer age;

    private Boolean tinyInt;

    private BigDecimal bigDecimals;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getTinyInt() {
        return tinyInt;
    }

    public void setTinyInt(Boolean tinyInt) {
        this.tinyInt = tinyInt;
    }

    public BigDecimal getBigDecimals() {
        return bigDecimals;
    }

    public void setBigDecimals(BigDecimal bigDecimals) {
        this.bigDecimals = bigDecimals;
    }
}