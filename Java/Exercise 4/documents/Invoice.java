package documents;

import java.time.LocalDate;
import java.util.List;

public class Invoice extends Document {
    String customerName;
    List<String> billedProducts;
    Integer totalAmount;
    LocalDate expirationDate;

    /**
     * 
     * Invoice class constructor.
     *
     * @param invoiceNumber  Invoice number.
     * @param issueDate      Issue date of the invoice.
     * @param customerName   Customer name.
     * @param billedProducts Billed products or services.
     * @param totalAmount    Total amount of the invoice.
     * @param expirationDate Expiration date of the invoice.
     */
    public Invoice(Integer invoiceNumber, LocalDate issueDate, String customerName, List<String> billedProducts,
            Integer totalAmount, LocalDate expirationDate) {
        super(invoiceNumber, issueDate);
        this.customerName = customerName;
        this.billedProducts = billedProducts;
        this.totalAmount = totalAmount;
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "Invoice [invoiceNumber=" + this.id + ", issueDate=" + this.creationDate + ", customerName="
                + customerName
                + ", billedProducts=" + billedProducts + ", totalAmount=" + totalAmount + ", expirationDate="
                + expirationDate + "]";
    }

}
