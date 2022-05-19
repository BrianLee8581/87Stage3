package com;

/**
 * @Author： Brian
 * @Todo：
 * @Date： 2022/5/19 10:00
 * @Version： 1.0
 */
public class ProductProxy implements Product {
    private Product product;

    public ProductProxy(Product product) {
        this.product = product;
    }

    /**
     * 得到名字
     *
     * @return {@link String}
     */
    @Override
    public String getName() {
        String name = product.getName();
        name += " "+"败家之眼出品，必属精品！";
        return name;
    }

    /**
     * 功能
     */
    @Override
    public void toDo() {
        product.toDo();
        System.out.println("十二代桌面级i9处理器，更高性能，更强韧性，更高性价比！");
        System.out.println("最高可选RTX3080Ti显卡，不让硬件成为你上分的绊脚石");
    }

    public static void main(String[] args) {
        Product product = new ProductImpl();
        Product proxy = new ProductProxy(product);
        System.out.println(proxy.getName());
        proxy.toDo();
    }
}
