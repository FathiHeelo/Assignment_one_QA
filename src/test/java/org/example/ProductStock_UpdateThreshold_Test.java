package org.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing updateReorderThreshold()")
public class ProductStock_UpdateThreshold_Test {

    ProductStock stock;

    @BeforeEach
    void init() {
        stock = new ProductStock("P001","WH-1",20,5,50);
    }

    @Test
    @DisplayName("Update valid threshold")
    void threshold_valid() {
        stock.updateReorderThreshold(20);
        assertEquals(20, stock.getReorderThreshold());
    }

    @Test
    @DisplayName("Reject threshold > max capacity")
    void threshold_exceed() {
        assertThrows(IllegalArgumentException.class, () -> stock.updateReorderThreshold(100));
    }


    @Test
    @DisplayName("Reject negative threshold")
    void threshold_negative() {
        assertThrows(IllegalArgumentException.class, () -> stock.updateReorderThreshold(-5));
    }
}