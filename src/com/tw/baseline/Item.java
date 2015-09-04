//Instantiates item objects with their names and prices and calculates the sales tax and import duty as applicable
package com.tw.baseline;

public class Item {

    private String itemName;
    private double itemPrice;

    Item(String itemName, double itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public double basicSalesTax() {
        return 0;
    }
}