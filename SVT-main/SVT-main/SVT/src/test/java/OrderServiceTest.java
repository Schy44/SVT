import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    //Que 4
    private ShippingService shippingServiceMock;
    private OrderService orderService;

    @BeforeEach
    void setUp() {
        shippingServiceMock = mock(ShippingService.class);
        orderService = new OrderService(shippingServiceMock);
    }

    @Test
    @DisplayName("Can be 11 pens")
    void testPlaceOrder_ValidQuantity() {
        String item = "pens";
        int quantity = 11;

        when(shippingServiceMock.ship(item, quantity)).thenReturn(true);

        boolean result = orderService.placeOrder(item, quantity);

        assertTrue(result, "Order should be placed successfully");

        verify(shippingServiceMock).ship(item, quantity);
    }


    @Test
    @DisplayName("Can't be -3 books")
    void testPlaceOrder_InvalidQuantity() {
        String item = "books";
        int quantity = -3;

        boolean result = orderService.placeOrder(item, quantity);

        assertFalse(result, "Order should not be placed with invalid quantity");

        verify(shippingServiceMock, never()).ship(item, quantity);
    }

    @Test
    @DisplayName("Can be 5 boxs")
    void testPlaceOrder_ShipmentFailure() {
        String item = "boxs";
        int quantity = 5;

        when(shippingServiceMock.ship(item, quantity)).thenReturn(false);

        boolean result = orderService.placeOrder(item, quantity);

        assertFalse(result, "Order should fail when shipment fails");

        verify(shippingServiceMock).ship(item, quantity);
    }
}
