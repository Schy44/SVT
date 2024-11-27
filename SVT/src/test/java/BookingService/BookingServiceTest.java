package BookingService;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class BookingServiceTest {


    @Mock
    private PaymentService paymentService;


    @InjectMocks
    private BookingService bookingService;

    @BeforeEach
    void setUp() {

        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testBookServiceCallsProcessPayment() {

        double amount = 100.0;

        bookingService.bookService(amount);

        verify(paymentService, times(1)).processPayment(amount);
    }
}
