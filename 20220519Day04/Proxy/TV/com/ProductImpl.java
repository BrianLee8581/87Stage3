package com;

/**
 * @Author： Brian
 * @Todo：
 * @Date： 2022/5/19 9:58
 * @Version： 1.0
 */
public class ProductImpl implements Product {
    /**
     * 得到名字
     *
     * @return {@link String}
     */
    @Override
    public String getName() {
        return "这是一台笔记本";
    }

    /**
     * 功能
     */
    @Override
    public void toDo() {
        System.out.println("我可以编码");
    }

}
