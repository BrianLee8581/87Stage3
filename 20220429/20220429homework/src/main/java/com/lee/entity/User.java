package com.lee.entity;

/**
 * @Author： Brian
 * @Todo：
 * @Date： 2022/5/3 17:28
 * @Version： 1.0
 */
public class User {
    private int id;
    private String username;
    private String password;
    private String email;
    private String image;
    private String status;
    private String code;

    public User() {
    }

    public User(int id, String username, String password, String email, String image, String status, String code) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.image = image;
        this.status = status;
        this.code = code;
    }

    public User(String username, String password, String email, String image, String code) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.image = image;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", image='" + image + '\'' +
                ", status='" + status + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
