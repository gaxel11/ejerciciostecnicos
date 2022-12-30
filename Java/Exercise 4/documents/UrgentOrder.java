package documents;

import java.time.LocalDate;
import java.util.List;

public class UrgentOrder extends Order {

    public UrgentOrder(Integer orderNumber, LocalDate issueDate, String customerName, String shippingAddress,
            List<String> requestedProducts, Integer totalAmount) {
        super(orderNumber, issueDate, customerName, shippingAddress, requestedProducts, totalAmount);
    }
    
    
}
