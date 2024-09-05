import java.sql.*;
import java.util.Scanner;

public class ServiceManager {

    public static void addService(Scanner scanner) {
        System.out.print("Enter Service Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Description: ");
        String description = scanner.nextLine();
        System.out.print("Enter Duration (in minutes): ");
        int duration = scanner.nextInt();
        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();
        
        String query = "INSERT INTO Service (service_name, description, duration, price) VALUES (?, ?, ?, ?)";
        
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            stmt.setString(1, name);
            stmt.setString(2, description);
            stmt.setInt(3, duration);
            stmt.setDouble(4, price);
            stmt.executeUpdate();
            System.out.println("Service added successfully!");
            
        } catch (SQLException e) {
            System.err.println("Error adding service: " + e.getMessage());
        }
    }

    public static void viewServiceDetails(Scanner scanner) {
        // Implementation to view service details
    }

    public static void updateService(Scanner scanner) {
        // Implementation to update service information
    }

    public static void deleteService(Scanner scanner) {
        // Implementation to delete services
    }
}
