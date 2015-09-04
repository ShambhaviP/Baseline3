package com.tw.baseline;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SalesTaxTest {

    @Test
    public void shouldBeZeroIfTheItemPurchasedIsAFood() {
        Item item = new Item("chocolate", 0.75);

        assertEquals(0.0, item.basicSalesTax(), 0.0001);
    }

}