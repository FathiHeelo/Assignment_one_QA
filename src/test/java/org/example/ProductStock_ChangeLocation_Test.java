package org.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing changeLocation()")
public class ProductStock_ChangeLocation_Test {

    ProductStock stock;

    @BeforeEach
    void init() {
        stock = new ProductStock("P001","WH-1",20,5,50);
    }

    // Test 1: valid location update
    @Test
    @DisplayName("Change location successfully")
    void changeLocation_valid() {
        stock.changeLocation("WH-2");
        assertEquals("WH-2", stock.getLocation());
    }

    // Test 2: reject null input
    @Test
    @DisplayName("Reject null location")
    void changeLocation_null() {
        assertThrows(IllegalArgumentException.class, () -> stock.changeLocation(null));
    }

    // Test 3: reject blank location
    @Test
    @DisplayName("Reject blank location")
    void changeLocation_blank() {
        assertThrows(IllegalArgumentException.class, () -> stock.changeLocation(""));
    }
}