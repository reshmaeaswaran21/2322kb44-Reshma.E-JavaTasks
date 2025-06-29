
package Project;



import java.sql.Connection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (Connection conn = DBConnection.getConnection()) {
            while (true) {
                System.out.println("\nInventory Management System");
                System.out.println("1. Add Item");
                System.out.println("2. View Items");
                System.out.println("3. Update Item");
                System.out.println("4. Delete Item");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1 -> InventoryDAO.addItem(conn, sc);
                    case 2 -> InventoryDAO.viewItems(conn);
                    case 3 -> InventoryDAO.updateItem(conn, sc);
                    case 4 -> InventoryDAO.deleteItem(conn, sc);
                    case 5 -> {
                        System.out.println("Exiting...");
                        return;
                    }
                    default -> System.out.println("Invalid choice!");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}