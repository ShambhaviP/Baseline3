package com.tw.baseline;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ImportDutyTest {

    @Test
    public void shouldHaveZeroImportDutyOnNonImportedItems() {
        Item item = new Item("pencil box", 5.3, 3);

        assertEquals(0.0, item.importDutyApplicable(), 0.0001);
    }

    @Test
    public void shouldHaveFivePercentImportDutyOnImportedItems() {
        Item item = new Item("imported perfume bottle", 5.66, 2);

        assertEquals(0.5660, item.importDutyApplicable(), 0.0001);
    }
}
