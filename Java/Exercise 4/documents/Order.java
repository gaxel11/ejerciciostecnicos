package documents;

import java.time.LocalDate;
import java.util.List;

public class Order extends Document {
    String customerName;
    String shippingAddress;
    List<String> requestedProducts;
    Integer totalAmount;

    /**
     * 
     * Order class constructor.
     *
     * @param orderNumber       Order number.
     * @param issueDate         Issue date of the order.
     * @param customerName      Customer name.
     * @param shippingAddress   Shipping address.
     * @param requestedProducts List of requested products.
     * @param totalAmount       Total amount of the order.
     */
    public Order(Integer orderNumber, LocalDate issueDate, String customerName, String shippingAddress,
            List<String> requestedProducts, Integer totalAmount) {
        super(orderNumber, issueDate);
        this.customerName = customerName;
        this.shippingAddress = shippingAddress;
        this.requestedProducts = requestedProducts;
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Order [orderNumber=" + this.id + ", issueDate=" + this.creationDate + ", customerName=" + customerName
                + ", shippingAddress=" + shippingAddress + ", requestedProducts=" + requestedProducts + ", totalAmount="
                + totalAmount + "]";
    }

}
