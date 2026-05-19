package com.pluralsight.finance;

public class CreditCard implements Valuable {

    private String cardNumber;
    private double balanceOwed;

    public CreditCard(String cardNumber, double balanceOwed) {
        this.cardNumber = cardNumber;
        this.balanceOwed = balanceOwed;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public double getBalanceOwed() {
        return balanceOwed;
    }

    @Override
    public double getValue() {
        return -balanceOwed;
    }
}