package com.canon.model;

/**
 * @Author Canon
 * @Date:Created in 1:32 2019/10/26
 * @Modify By: canon
 * @Despricction:
 * @since 1.0
 */
public class SubModel extends DefaultModel {

    public SubModel() {
    }

    public SubModel(DefaultModel defaultModel) {
        super(defaultModel);
    }

    private String subDefaultKey;

    public String getSubDefaultKey() {
        return subDefaultKey;
    }

    public void setSubDefaultKey(String subDefaultKey) {
        this.subDefaultKey = subDefaultKey;
    }


    @Override
    public String toString() {
        return "SubModel{" +
                "subDefaultKey='" + subDefaultKey + '\'' +
                '}';
    }
}
