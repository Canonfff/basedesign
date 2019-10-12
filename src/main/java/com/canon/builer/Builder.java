package com.canon.builer;

/**
 * @program: basedesign
 * @Auther: canon
 * @Date: 2019/10/12 09:57
 * @Description:
 */
public abstract class Builder {

    protected Product product = new Product();

    protected Material material = null;

    public Builder(Material material) {
        this.material = material;
    }

    protected void builderPartA() {
        System.out.println("super set partA");
        product.setPartB("super set partA");
    }

    protected void builderPartB() {
        System.out.println("super set partB");
        product.setPartB("super set partB");
    }

    protected void builderPartC() {
        System.out.println("super set partC");
        product.setPartC("super set partC");
    }

    protected void build() {
        builderPartA();
        builderPartB();
        builderPartC();
        System.out.println("finish build");
    }

    public Product getResult() {
        build();
        return this.product;
    }

}
