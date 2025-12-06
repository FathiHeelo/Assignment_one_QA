package org.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing isReorderNeeded()")
public class ProductStock_Reorder_Test {

    ProductStock stock;

    @BeforeEach
    void init() {
        stock = new ProductStock("P001","WH-1",20,5,50);
    }

    @Test
    @DisplayName("Reorder needed")
    void reorder_needed() {
        stock.reserve(18);
        assertTrue(stock.isReorderNeeded());
    }

    @Test
    @DisplayName("Reorder not needed")
    void reorder_not_needed() {
        assertFalse(stock.isReorderNeeded());
    }}