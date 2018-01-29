package com.smartstudy.paysdk.bean;

/**
 * Created by louis on 2017/12/27.
 */

public class ParamsBean {
    private String orderId;
    private String token;
    private String productsName;
    private String pid;
    private String appVersion;

    public ParamsBean(String orderId, String token, String productsName, String pid, String appVersion) {
        this.orderId = orderId;
        this.token = token;
        this.productsName = productsName;
        this.pid = pid;
        this.appVersion = appVersion;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getProductsName() {
        return productsName;
    }

    public void setProductsName(String productsName) {
        this.productsName = productsName;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }
}
