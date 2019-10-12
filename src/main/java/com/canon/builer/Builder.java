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

    protected abstract void builderPartA();

    protected abstract void builderPartB();

    protected abstract void builderPartC();

    protected abstract void build();

    public Product getResult() {
        build();
        return this.product;
    }

}
