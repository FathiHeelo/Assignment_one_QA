package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductStock_Constructor_Test {

    @Test
    void testValidConstructor() {
        ProductStock stock = new ProductStock("P001", "WH-1", 10, 5, 50);

        assertEquals("P001", stock.getProductId());
        assertEquals("WH-1", stock.getLocation());
        assertEquals(10, stock.getOnHand());
        assertEquals(5, stock.getReorderThreshold());
        assertEquals(50, stock.getMaxCapacity());
    }

    @Test
    void testInvalidProductId_Null() {
        assertThrows(IllegalArgumentException.class,
                () -> new ProductStock(null, "WH-1", 10, 5, 50));
    }

    @Test
    void testInvalidProductId_Blank() {
        assertThrows(IllegalArgumentException.class,
                () -> new ProductStock("", "WH-1", 10, 5, 50));
    }

    @Test
    void testInvalidLocation_Null() {
        assertThrows(IllegalArgumentException.class,
                () -> new ProductStock("P001", null, 10, 5, 50));
    }

    @Test
    void testInvalidOnHand() {
        assertThrows(IllegalArgumentException.class,
                () -> new ProductStock("P001", "WH-1", -1, 5, 50));
    }

    @Test
    void testInvalidReorderThreshold() {
        assertThrows(IllegalArgumentException.class,
                () -> new ProductStock("P001", "WH-1", 10, -1, 50));
    }

    @Test
    void testInvalidMaxCapacity() {
        assertThrows(IllegalArgumentException.class,
                () -> new ProductStock("P001", "WH-1", 10, 5, 0));
    }
}