package FactoryPattern.Example.idcard;

import FactoryPattern.Example.framework.Product;

public class IDCard extends Product {
    private final String owner;

    IDCard(String owner) {
        System.out.println("制作" + owner + "的IDCard");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的IDCard");
    }

    public String getOwner() {
        return owner;
    }
}
