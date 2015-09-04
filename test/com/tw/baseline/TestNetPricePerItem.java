package com.tw.baseline;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestNetPricePerItem {

    @Test
    public void shouldBeEqualToTheOriginalPriceIfNoBasicSalesTaxAndImportDutyIsApplicable() {
        Item item = new Item("chocolate", 0.99, 1);

        assertEquals(0.99, item.netPricePerItem(), 0.0001);
    }
}
