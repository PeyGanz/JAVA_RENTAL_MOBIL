package Controller;
import Model.ModelRental;
import View.ViewLogin;
import View.ViewRental;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;


public class ControllerLogin {
    ViewLogin login;
    public ControllerLogin(ViewLogin login) {
        this.login = login;
        login.blogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user=login.getFuser();String cekuser=null;  
                String pass=login.getFpass();String cekpass=null;
                try{
                    Connector connector = new Connector();
                    Statement stt = connector.con.createStatement();
                    String query = "SELECT * FROM admin WHERE Username = '" + user + "' AND Pass = '" + pass +"'";
                    ResultSet resultSet=stt.executeQuery(query);
                    while (resultSet.next()) {
                        cekuser = resultSet.getString("Username");
                        cekpass = resultSet.getString("Pass");
                    }
                    resultSet.close();stt.close();
                }catch (SQLException ex){
                    System.out.println("Error");
                }
                if (cekuser == null && cekpass == null) {
                    JOptionPane.showMessageDialog(null,"Username atau Password anda salah","LOGIN",JOptionPane.INFORMATION_MESSAGE);
                    login.setFuser("");
                    login.setFpass("");
                }else{
                    JOptionPane.showMessageDialog(null,"Login Berhasil !","LOGIN",JOptionPane.INFORMATION_MESSAGE);
                    new ViewRental().setVisible(true);
                    login.dispose();
                }
            }
        });
    }
}
