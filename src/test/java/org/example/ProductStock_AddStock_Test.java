package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


@DisplayName("Testing addStock()")
public class ProductStock_AddStock_Test {

    ProductStock stock;

    @BeforeEach
    void setup() {
        stock = new ProductStock("P001","WH-1",20,5,50);
    }

    @Test
    @DisplayName("Add valid stock")
    void addStock_valid_success() {
        stock.addStock(10);
        assertEquals(30, stock.getOnHand());
    }

    @Test
    @DisplayName("Reject zero stock add")
    void addStock_zero_rejected() {
        assertThrows(IllegalArgumentException.class, () -> stock.addStock(0));
    }

    @Test
    @DisplayName("Reject adding beyond capacity")
    void addStock_exceed_capacity() {
        ProductStock s = new ProductStock("P002","WH-2",45,5,50);
        assertThrows(IllegalStateException.class, () -> s.addStock(10));
    }
}