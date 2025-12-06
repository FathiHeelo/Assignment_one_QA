package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing reserve()")
public class ProductStock_Reserve_Test {

    ProductStock stock;

    @BeforeEach
    void init() {
        stock = new ProductStock("P001","WH-1",20,5,50);
    }


    @Test
    @DisplayName("Reserve valid amount")
    void reserve_valid() {
        stock.reserve(8);
        assertEquals(8, stock.getReserved());
        assertEquals(12, stock.getAvailable());
    }

    @Test
    @DisplayName("Reject reserve > available")
    void reserve_exceed() {
        assertThrows(IllegalStateException.class, () -> stock.reserve(25));
    }

    @Test
    @DisplayName("Reject zero reserve")
    void reserve_zero() {
        assertThrows(IllegalArgumentException.class, () -> stock.reserve(0));
    }
}