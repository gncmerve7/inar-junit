package test.java;

import main.java.OrderStatusManager;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*Test Case 1: Transition from New to Pending
Test Case 2: Transition from Pending to Shipped
Test Case 3: Transition from Shipped to Delivered
Test Case 4: No Transition from Delivered
Test Case 5: No Transition from Cancelled
Test Case 6: Cancel from New State
Test Case 7: Cancel from Pending State
Test Case 8: No Cancellation from Shipped State
Test Case 9: No Cancellation from Delivered State
Test Case 10: No Cancellation from Already Cancelled State*/

public class OrderStatusManagerTest {
    OrderStatusManager currentStatus = new OrderStatusManager();

    @ParameterizedTest
    @CsvSource({"NEW,PENDING",
            "PENDING,SHIPPED",
            "SHIPPED,DELIVERED",
            "DELIVERED,DELIVERED",
            "CANCELLED,CANCELLED",
    })
    void orderStatus(OrderStatusManager.OrderState input, OrderStatusManager.OrderState expected) {
        assertEquals(expected, currentStatus.nextState(input));
    }

    @ParameterizedTest
    @CsvSource({"NEW,CANCELLED",
            "PENDING,CANCELLED",
            "SHIPPED,SHIPPED",
            "DELIVERED,DELIVERED",
            "CANCELLED,CANCELLED"
    })
    void orderStatusOfCancellation(OrderStatusManager.OrderState input, OrderStatusManager.OrderState expected) {
        assertEquals(expected, currentStatus.cancelOrder(input));
    }
}