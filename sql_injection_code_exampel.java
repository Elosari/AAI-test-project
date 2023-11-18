import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class sql_injection_code_exampel {

    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gib einen Text ein: "); 
        String benutzerEingabe = scanner.nextLine();

        try (Connection conn = DriverManager.getConnection("", "user", "password");) {
            PreparedStatement ps =  conn.prepareStatement("SELECT spalten_name FROM meine_tabelle WHERE bedingung = ?");
            ps.setString(1, benutzerEingabe); // UNION SELECT username, password FROM user --
        } catch (Exception e) {
            System.err.println("Fehler beim Laden des JDBC-Treibers");
            e.printStackTrace(); 
        scanner.close();
    }
}   
}
