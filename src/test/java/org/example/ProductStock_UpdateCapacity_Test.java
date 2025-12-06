package org.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing updateMaxCapacity()")
public class ProductStock_UpdateCapacity_Test {

    ProductStock stock;

    @BeforeEach
    void init() {
        stock = new ProductStock("P001","WH-1",20,5,50);
    }

    @Test
    @DisplayName("Valid max capacity update")
    void capacity_valid() {
        stock.updateMaxCapacity(100);
        assertEquals(100, stock.getMaxCapacity());
    }

    @Test
    @DisplayName("Reject zero capacity")
    void capacity_zero() {
        assertThrows(IllegalArgumentException.class, () -> stock.updateMaxCapacity(0));
    }

    @Test
    @DisplayName("Reject capacity < onHand")
    void capacity_lower_than_onHand() {
        assertThrows(IllegalStateException.class, () -> stock.updateMaxCapacity(10));
    }
}