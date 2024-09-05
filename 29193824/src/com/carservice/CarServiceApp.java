import java.sql.*;
import java.util.Scanner;

public class CarServiceApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Car Service Appointment System");
            System.out.println("1. Manage Appointments");
            System.out.println("2. Manage Customers");
            System.out.println("3. Manage Services");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    manageAppointments(scanner);
                    break;
                case 2:
                    manageCustomers(scanner);
                    break;
                case 3:
                    manageServices(scanner);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void manageAppointments(Scanner scanner) {
        // Implementation for appointment management
    }

    private static void manageCustomers(Scanner scanner) {
        // Implementation for customer management
    }

    private static void manageServices(Scanner scanner) {
        // Implementation for service management
    }
}
