package com.pluralsight.finance;

public class Jewelry extends FixedAsset {

    private String material;

    public Jewelry(String name, double marketValue, String material) {

        super(name, marketValue);

        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
