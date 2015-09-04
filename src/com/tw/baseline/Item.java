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
        if(itemName.equalsIgnoreCase("chocolate")) {
            return 0.0;
        }
        else if(itemName.equalsIgnoreCase("headache pills")) {
            return 0.0;
        }
        else if(itemName.equalsIgnoreCase("book")) {
            return 0.0;
        }
        else {
            return 0.1 * itemPrice;
        }
    }

    public double importDutyApplicable() {
        if(itemName.contains("imported")) {
            return 0.05 * itemPrice;
        }
        else {
        return 0.0;
        }
    }
}