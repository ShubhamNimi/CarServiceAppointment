import java.sql.*;
import java.util.Scanner;

public class CustomerManager {

    public static void registerCustomer(Scanner scanner) {
        System.out.print("Enter Customer Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Phone Number: ");
        String phone = scanner.nextLine();
        
        String query = "INSERT INTO Customer (customer_name, email, phone_number) VALUES (?, ?, ?)";
        
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setString(3, phone);
            stmt.executeUpdate();
            System.out.println("Customer registered successfully!");
            
        } catch (SQLException e) {
            System.err.println("Error registering customer: " + e.getMessage());
        }
    }

    public static void viewCustomerDetails(Scanner scanner) {
        // Implementation to view customer details
    }

    public static void updateCustomer(Scanner scanner) {
        // Implementation to update customer information
    }

    public static void deleteCustomer(Scanner scanner) {
        // Implementation to delete customer accounts
    }
}
