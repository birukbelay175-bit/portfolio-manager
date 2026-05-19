package com.pluralsight;

import com.pluralsight.finance.*;

public class App {

    public static void main(String[] args) {

        Valuable[] valuables = {
                new BankAccount("BA123", 2500),
                new CreditCard("CC456", 500),
                new Gold("Gold Bar", 3000, 2.5),
                new House("Family House", 250000, 2015, 2000, 4),
                new Jewelry("Diamond Ring", 5000, "Diamond")
        };

        Portfolio portfolio = new Portfolio("Biruk Portfolio", valuables);

        System.out.println("Portfolio Name: " + portfolio.getName());
        System.out.println("Total Portfolio Value: $" + portfolio.getValue());
    }
}
