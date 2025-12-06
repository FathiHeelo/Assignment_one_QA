package org.example;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.jupiter.api.DisplayName;

@Suite
@DisplayName("ProductStock Full Test Suite")
@SelectClasses({
        ProductStock_Constructor_Test.class,
        ProductStock_AddStock_Test.class,
        ProductStock_Reserve_Test.class,
        ProductStock_Release_Test.class,
        ProductStock_ShipReserved_Test.class,
        ProductStock_RemoveDamaged_Test.class,
        ProductStock_Reorder_Test.class,
        ProductStock_UpdateThreshold_Test.class,
        ProductStock_UpdateCapacity_Test.class,
        ProductStock_ChangeLocation_Test.class
})
public class ProductStockSuite {
}