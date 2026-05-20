package com.pluralsight;

import com.pluralsight.finance.*;

public class PortfolioApp {

    public static void main(String[] args) {

        Portfolio portfolio =
                new Portfolio("My Portfolio", "Biruk");

        portfolio.add(new BankAccount("Checking",
                "BA123", 1500));

        portfolio.add(new CreditCard("Visa",
                "CC456", 500));

        portfolio.add(new Gold("Gold Bar",
                3000, 2.5));

        portfolio.add(new House("Family House",
                250000, 2015, 2000, 4));

        portfolio.add(new Jewelry("Diamond Ring",
                5000, 18));

        System.out.println("Portfolio Value: $" +
                portfolio.getValue());

        System.out.println("Most Valuable Asset: $" +
                portfolio.getMostValuable().getValue());

        System.out.println("Least Valuable Asset: $" +
                portfolio.getLeastValuable().getValue());
    }
}