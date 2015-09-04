//Instantiates item objects with their names,prices,quantities and calculates the sales tax and import duty as applicable
package com.tw.baseline;

public class Item {

    private String itemName;
    private double itemPrice;
    private int quantity;

    Item(String itemName, double itemPrice, int quantity) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
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
            return 0.1 * itemPrice * quantity;
        }
    }

    public double importDutyApplicable() {
        if(itemName.contains("imported")) {
            return 0.05 * itemPrice * quantity;
        }
        else {
        return 0.0;
        }
    }
}