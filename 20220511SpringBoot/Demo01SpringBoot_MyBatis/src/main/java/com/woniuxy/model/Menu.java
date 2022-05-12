package com.woniuxy.model;

/**
 * @Author： Brian
 * @Todo：菜单类
 * @Date： 2022/5/11 20:12
 * @Version： 1.0
 */
public class Menu {
    private Integer id;
    private String name;
    private String url;
    private String desc;
    private Integer order;
    //自联接
    private Menu parentMenu;//多对一

    public Menu() {
    }

    public Menu(Integer id, String name, String url, String desc, Integer order) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.desc = desc;
        this.order = order;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Menu getParentMenu() {
        return parentMenu;
    }

    public void setParentMenu(Menu parentMenu) {
        this.parentMenu = parentMenu;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", desc='" + desc + '\'' +
                ", order=" + order +
                ", parentMenu=" + parentMenu +
                '}';
    }
}
