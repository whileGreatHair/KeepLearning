package DesignPatterns.FactoryPattern.Example.idcard;

import DesignPatterns.FactoryPattern.Example.framework.Factory;
import DesignPatterns.FactoryPattern.Example.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {
    private final List<String> owners = new ArrayList<>();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    public List<String> getOwners() {
        return owners;
    }
}
