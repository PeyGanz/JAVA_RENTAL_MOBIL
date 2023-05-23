package Controller;
import java.sql.*;
import javax.swing.JOptionPane;

public class Connector {
    static final String DBurl="jdbc:mysql://localhost/rental_mobil";
    static final String DBusername="root";
    static final String DBpassword="";
    public Connection con;
    public Statement stt;

    public Connector() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(DBurl, DBusername, DBpassword);
            //System.out.println("Connection Succesfull");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println("Connection Failed");
        }
    }
}
