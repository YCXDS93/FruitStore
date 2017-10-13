package com.bwie.fruitsstore.home.model.bean;

/**
 * Created by ${hujiqiang} on 2017/08/10.
 */

public class ClassifShoppBean {
    String name;
    String price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bean{" + "name='" + name + '\'' + ", price='" + price + '\'' + '}';
    }

    public ClassifShoppBean(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public ClassifShoppBean() {
    }
}
