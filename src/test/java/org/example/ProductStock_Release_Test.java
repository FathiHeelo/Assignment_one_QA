package org.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing releaseReservation()")
public class ProductStock_Release_Test {

    ProductStock stock;

    @BeforeEach
    void init() {
        stock = new ProductStock("P001","WH-1",20,5,50);
    }

    @Test
    @DisplayName("Release valid reserved stock")
    void release_valid() {
        stock.reserve(10);
        stock.releaseReservation(5);
        assertEquals(5, stock.getReserved());
    }

    @Test
    @DisplayName("Reject release > reserved")
    void release_exceed() {
        stock.reserve(5);
        assertThrows(IllegalStateException.class, () -> stock.releaseReservation(10));
    }

    @Test
    @DisplayName("Reject zero release")
    void release_zero() {
        stock.reserve(10);
        assertThrows(IllegalArgumentException.class, () -> stock.releaseReservation(0));
    }
}