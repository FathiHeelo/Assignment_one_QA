package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing removeDamaged()")
public class ProductStock_RemoveDamaged_Test {

    ProductStock stock;

    @BeforeEach
    void init() {
        stock = new ProductStock("P001","WH-1",20,5,50);
    }

    @Test
    @DisplayName("Remove damaged units successfully")
    void remove_valid() {
        stock.removeDamaged(5);
        assertEquals(15, stock.getOnHand());
    }

    @Test
    @DisplayName("Reject removing > onHand")
    void remove_exceed() {
        assertThrows(IllegalStateException.class, () -> stock.removeDamaged(50));
    }

    @Test
    @DisplayName("Reject removing zero")
    void remove_zero() {
        assertThrows(IllegalArgumentException.class, () -> stock.removeDamaged(0));
    }
}