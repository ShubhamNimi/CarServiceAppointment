import java.sql.*;
import java.util.Scanner;

public class AppointmentManager {

    public static void scheduleAppointment(Scanner scanner) {
        System.out.print("Enter Customer ID: ");
        int customerId = scanner.nextInt();
        System.out.print("Enter Service ID: ");
        int serviceId = scanner.nextInt();
        System.out.print("Enter Appointment Date (YYYY-MM-DD): ");
        String date = scanner.next();
        System.out.print("Enter Appointment Time (HH:MM:SS): ");
        String time = scanner.next();
        
        String query = "INSERT INTO Appointment (customer_id, service_id, appointment_date, appointment_time) VALUES (?, ?, ?, ?)";
        
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            stmt.setInt(1, customerId);
            stmt.setInt(2, serviceId);
            stmt.setDate(3, Date.valueOf(date));
            stmt.setTime(4, Time.valueOf(time));
            stmt.executeUpdate();
            System.out.println("Appointment scheduled successfully!");
            
        } catch (SQLException e) {
            System.err.println("Error scheduling appointment: " + e.getMessage());
        }
    }

    public static void viewAppointmentDetails(Scanner scanner) {
        // Implementation to view appointment details
    }

    public static void updateAppointment(Scanner scanner) {
        // Implementation to update appointment information
    }

    public static void cancelAppointment(Scanner scanner) {
        // Implementation to cancel appointments
    }
}
