package Project;



import java.sql.*;
import java.util.Scanner;

public class InventoryDAO {

    public static void addItem(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Enter item name: ");
        sc.nextLine(); // consume leftover newline
        String name = sc.nextLine();
        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        String sql = "INSERT INTO items (name, quantity, price) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setInt(2, qty);
            stmt.setDouble(3, price);
            stmt.executeUpdate();
            System.out.println("Item added successfully.");
        }
    }

    public static void viewItems(Connection conn) throws SQLException {
        String sql = "SELECT * FROM items";
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            System.out.printf("%-5s %-20s %-10s %-10s\n", "ID", "Name", "Quantity", "Price");
            while (rs.next()) {
                System.out.printf("%-5d %-20s %-10d %-10.2f\n",
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("quantity"),
                        rs.getDouble("price"));
            }
        }
    }

    public static void updateItem(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Enter item ID to update: ");
        int id = sc.nextInt();
        System.out.print("Enter new quantity: ");
        int qty = sc.nextInt();
        System.out.print("Enter new price: ");
        double price = sc.nextDouble();

        String sql = "UPDATE items SET quantity = ?, price = ? WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, qty);
            stmt.setDouble(2, price);
            stmt.setInt(3, id);
            int updated = stmt.executeUpdate();
            if (updated > 0)
                System.out.println("Item updated.");
            else
                System.out.println("Item not found.");
        }
    }

    public static void deleteItem(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Enter item ID to delete: ");
        int id = sc.nextInt();
        String sql = "DELETE FROM items WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            int deleted = stmt.executeUpdate();
            if (deleted > 0)
                System.out.println("Item deleted.");
            else
                System.out.println("Item not found.");
        }
    }
}
