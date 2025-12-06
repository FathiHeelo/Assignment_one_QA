package org.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing shipReserved()")
public class ProductStock_ShipReserved_Test {

    ProductStock stock;

    @BeforeEach
    void init() {
        stock = new ProductStock("P001","WH-1",20,5,50);
    }

    @Test
    @DisplayName("Ship reserved reduces onHand & reserved")
    void ship_valid() {
        stock.reserve(10);
        stock.shipReserved(5);
        assertEquals(15, stock.getOnHand());
        assertEquals(5, stock.getReserved());
    }

    @Test
    @DisplayName("Reject ship zero")
    void ship_zero() {
        stock.reserve(10);
        assertThrows(IllegalArgumentException.class, () -> stock.shipReserved(0));
    }

    @Test
    @DisplayName("Reject ship > reserved")
    void ship_exceed() {
        stock.reserve(5);
        assertThrows(IllegalStateException.class, () -> stock.shipReserved(10));
    }
}