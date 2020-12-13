package com.collionson.vending;

public class Main {

    public static void main(String[] args) {
        SimpleVendingMachine vendingMachine = new SimpleVendingMachine();
        vendingMachine.initialize();
        vendingMachine.takeUserInput();
    }
}
