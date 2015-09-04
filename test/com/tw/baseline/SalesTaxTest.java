package com.tw.baseline;

import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SalesTaxTest {

    @Test
    public void shouldBeZeroIfTheItemPurchasedIsAFood() {
        Item item = new Item("chocolate", 0.75);

        assertEquals(0.0, item.basicSalesTax(), 0.0001);
    }

    @Test
    public void shouldBeZeroForAMedicalProduct() {
        Item item = new Item("headache pills", 1.22);

        assertEquals(0.0, item.basicSalesTax(), 0.0001);
    }
}