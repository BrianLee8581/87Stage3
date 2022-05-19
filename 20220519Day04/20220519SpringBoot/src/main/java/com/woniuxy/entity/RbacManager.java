package com.woniuxy.entity;

/**
 * @Author： Brian
 * @Todo：
 * @Date： 2022/5/19 20:16
 * @Version： 1.0
 */
public class RbacManager {
    String account;
    String password;
    String status;

    public RbacManager() {
    }

    public RbacManager(String account, String password, String status) {
        this.account = account;
        this.password = password;
        this.status = status;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "RbacManager{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
