package test.java;

import main.java.ShippingCostCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*Test Case 1: Local Destination with Standard Delivery
Test Case 2: Local Destination with Express Delivery
Test Case 3: International Destination with Standard Delivery
Test Case 4: International Destination with Express Delivery
Test Case 5: Zero Weight Local Standard Delivery
Test Case 6: Zero Weight Local Express Delivery
Test Case 7: Zero Weight International Standard Delivery
Test Case 8: Zero Weight International Express Delivery
Test Case 9: Negative Weight Local Standard Delivery
Test Case 10: Negative Weight Local Express Delivery
Test Case 11: Negative Weight International Standard Delivery Test Case 12: Negative Weight International Express Delivery*/

public class ShippingCostCalculatorTest {
    ShippingCostCalculator costCalculator = new ShippingCostCalculator();

    @Test
    void localDestinationWithStandardDelivery() {
        double result = costCalculator.calculateCost(10, "local", "standard");
        assertEquals(10, result);
    }

    @Test
    void localDestinationWithExpressDelivery() {
        double result = costCalculator.calculateCost(10, "local", "express");
        assertEquals(25, result);
    }

    @Test
    void internationalDestinationWithStandardDelivery() {
        double result = costCalculator.calculateCost(10, "international", "standard");
        assertEquals(50, result);
    }

    @Test
    void internationalDestinationWithExpressDelivery() {
        double result = costCalculator.calculateCost(10, "international", "express");
        assertEquals(125, result);
    }

    @Test
    void zeroWeightLocalStandardDelivery() {
        double result = costCalculator.calculateCost(0, "local", "standard");
        assertEquals(0, result);
    }

    @Test
    void zeroWeightLocalExpressDelivery() {
        double result = costCalculator.calculateCost(0, "local", "express");
        assertEquals(0, result);
    }

    @Test
    void zeroWeightInternationalStandardDelivery() {
        double result = costCalculator.calculateCost(0, "international", "standard");
        assertEquals(0, result);
    }

    @Test
    void zeroWeightInternationalExpressDelivery() {
        double result = costCalculator.calculateCost(0, "international", "express");
        assertEquals(0, result);
    }

    @Test
    void negativeWeightLocalStandardDelivery() {
        double result = costCalculator.calculateCost(-10, "local", "standard");
        assertEquals(-10, result);
    }

    @Test
    void negativeWeightLocalExpressDelivery() {
        double result = costCalculator.calculateCost(-10, "local", "express");
        assertEquals(-25, result);
    }

    @Test
    void negativeWeightInternationalStandardDelivery() {
        double result = costCalculator.calculateCost(-10, "international", "standard");
        assertEquals(-50, result);
    }

    @Test
    void negativeWeightInternationalExpressDelivery() {
        double result = costCalculator.calculateCost(-10, "international", "express");
        assertEquals(-125, result);
    }

}