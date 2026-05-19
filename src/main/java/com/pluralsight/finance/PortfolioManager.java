package com.pluralsight.finance;

public class PortfolioManager {

    public static Valuable getMostValuable(Portfolio portfolio) {

        Valuable mostValuable = portfolio.getValuables()[0];

        for (Valuable valuable : portfolio.getValuables()) {
            if (valuable.getValue() > mostValuable.getValue()) {
                mostValuable = valuable;
            }
        }

        return mostValuable;
    }

    public static Valuable getLeastValuable(Portfolio portfolio) {

        Valuable leastValuable = portfolio.getValuables()[0];

        for (Valuable valuable : portfolio.getValuables()) {
            if (valuable.getValue() < leastValuable.getValue()) {
                leastValuable = valuable;
            }
        }

        return leastValuable;
    }
}