package BookingService;

public class BookingService {

    private final PaymentService paymentService;

    public BookingService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void bookService(double amount) {
        // Business logic for booking a service
        // Call processPayment when a booking is made
        paymentService.processPayment(amount);
    }
}
