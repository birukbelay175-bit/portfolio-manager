package com.pluralsight.finance;

public class Portfolio {

    private String name;
    private Valuable[] valuables;

    public Portfolio(String name, Valuable[] valuables) {
        this.name = name;
        this.valuables = valuables;
    }

    public String getName() {
        return name;
    }

    public Valuable[] getValuables() {
        return valuables;
    }

    public double getValue() {

        double total = 0;

        for (Valuable valuable : valuables) {
            total += valuable.getValue();
        }

        return total;
    }
}