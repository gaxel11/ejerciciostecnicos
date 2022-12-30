import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import documents.Document;
import documents.Invoice;
import documents.Order;
import documents.UrgentOrder;
import documents.HumanResources.Contract;

public class App {
  public static void main(String[] args) {
    boolean exit = false;
    Scanner sc = new Scanner(System.in);
    Document document = null;
    while (!exit) {
      System.out.println("Choose the type of document: ");
      System.out.println("1. Contract");
      System.out.println("2. Invoice");
      System.out.println("3. Order");
      System.out.println("0. Exit");
      int choice = sc.nextInt();
      switch (choice) {
        case 1:
          document = createContract();
          exit = true;
          break;
        case 2:
          document = createInvoice();
          exit = true;
          break;
        case 3:
          document = createOrder();
          exit = true;
          break;
        case 0:
          exit = true;
          break;
        default:
          System.out.println("Option does not exist");
      }
    }
    sc.close();
    // Print only the values of document
    System.out.println(document.toString());
  }

  /**
   * Allows you to create an instance of the Contract document.
   * It asks the user for the necessary data to create the document and then
   * instantiates the selected class.
   * 
   * @return returns an instance of Contract.
   */
  private static Contract createContract() {
    Integer id;
    LocalDate creationDate;
    List<String> involvedPartiesNames = new ArrayList<String>();
    LocalDate contractTerm;
    Scanner scInt = new Scanner(System.in);
    Scanner scString = new Scanner(System.in);
    // Load data
    System.out.println("Document id: ");
    id = scInt.nextInt();
    System.out.print("Enter the contract issue date (in dd/MM/yyyy format): ");
    creationDate = LocalDate.parse(scString.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    System.out.println("Enter the involved parties (enter 0 to finish): ");
    String name;
    do {
      name = scString.nextLine();
      if (!name.equals("0")) {
        involvedPartiesNames.add(name);
      }
    } while (!name.equals("0"));
    System.out.print("Enter the contract term (in dd/MM/yyyy format): ");
    contractTerm = LocalDate.parse(scString.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    scString.close();
    scInt.close();
    // The class is instantiated
    return new Contract(involvedPartiesNames, id, creationDate, contractTerm);
  }

  /**
   * Allows you to create an instance of the Invoice document.
   * It asks the user for the necessary data to create the document and then
   * instantiates the selected class.
   * 
   * @return returns an instance of Invoice.
   */
  private static Invoice createInvoice() {
    Integer id;
    LocalDate creationDate;
    String customerName;
    List<String> billedProducts = new ArrayList<String>();
    Integer totalAmount;
    LocalDate expirationDate;
    Scanner scInt = new Scanner(System.in);
    Scanner scString = new Scanner(System.in);
    // Load data
    System.out.println("Document id: ");
    id = scInt.nextInt();
    System.out.print("Enter the contract issue date (in dd/MM/yyyy format): ");
    creationDate = LocalDate.parse(scString.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    System.out.print("Enter the contract expiration date (in dd/MM/yyyy format): ");
    expirationDate = LocalDate.parse(scString.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    System.out.println("Customer name: ");
    customerName = scString.nextLine();
    // Add products
    System.out.println("Enter the products (enter 0 to finish): ");
    String product;
    do {
      product = scString.nextLine();
      if (!product.equals("0")) {
        billedProducts.add(product);
      }
    } while (!product.equals("0"));
    System.out.println("Total amount: ");
    totalAmount = scInt.nextInt();
    scString.close();
    scInt.close();
    // The class is instantiated
    return new Invoice(id, creationDate, customerName, billedProducts, totalAmount, expirationDate);

  }

  /**
   * 
   * This class allows you to create an instance of Order or UrgentOrder.
   * It asks the user for the necessary data to create the document and then
   * instantiates the selected class.
   * 
   * @return returns an instance of Order or UrgentOrder depending on the option
   *         chosen by the user.
   * 
   */
  private static Order createOrder() {
    Integer id;
    String customerName;
    String shippingAddress;
    List<String> requestedProducts = new ArrayList<String>();
    Integer totalAmount;
    LocalDate creationDate;
    Scanner scInt = new Scanner(System.in);
    Scanner scString = new Scanner(System.in);
    int choice = -1;
    // Choose if it is a normal order or an urgent one
    do {
      System.out.println("1. Just Order");
      System.out.println("2. Urgent Order");
      choice = scInt.nextInt();
      if (choice < 1 || choice > 2) {
        System.out.println("Option does not exist");
      }
    } while (choice < 1 || choice > 2);

    // Load data
    System.out.println("Document id: ");
    id = scInt.nextInt();
    System.out.print("Enter the contract issue date (in dd/MM/yyyy format): ");
    creationDate = LocalDate.parse(scString.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    System.out.println("Customer name: ");
    customerName = scString.nextLine();
    System.out.println("Shipping Address: ");
    shippingAddress = scString.nextLine();
    // Add products
    System.out.println("Enter the products (enter 0 to finish): ");
    String product;
    do {
      product = scString.nextLine();
      if (!product.equals("0")) {
        requestedProducts.add(product);
      }
    } while (!product.equals("0"));

    System.out.println("Total amount: ");
    totalAmount = scInt.nextInt();
    scString.close();
    scInt.close();
    // The class is instantiated
    switch (choice) {
      case 1:
        return new Order(
            id,
            LocalDate.now(),
            customerName,
            shippingAddress,
            requestedProducts,
            totalAmount);
      case 2:
        return new UrgentOrder(
            id,
            LocalDate.now(),
            customerName,
            shippingAddress,
            requestedProducts,
            totalAmount);
    }
    return null;
  }
}
