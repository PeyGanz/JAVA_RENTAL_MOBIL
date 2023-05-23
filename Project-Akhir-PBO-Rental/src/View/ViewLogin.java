package View;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class ViewLogin extends JFrame{
    JLabel ljudul=new JLabel("LOGIN ADMIN", SwingConstants.CENTER);
    JLabel lusername=new JLabel("Masukkan Username : ", SwingConstants.CENTER);
    JLabel lpass=new JLabel("Masukkan Password : ", SwingConstants.CENTER);
    JTextField fuser=new JTextField();
    JPasswordField fpass=new JPasswordField();
    public JButton blogin=new JButton("LOGIN");

    public ViewLogin() {
        setTitle("RENTAL MOBIL");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(300,280);
        setLayout(null);
        setVisible(true);
        setResizable(false);
        this.getContentPane().setBackground(new java.awt.Color(255, 153, 0));
        
        blogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/login.png")));
        
        //Tambah komponen
        add(ljudul);add(lusername);add(lpass);
        add(fuser);add(fpass);
        add(blogin);
        
        //Letak komponen
        ljudul.setBounds(0, 10, 300, 30);
        ljudul.setFont(new java.awt.Font("Perpetua", 1, 20));
        lusername.setBounds(0, 40, 300, 30);
        fuser.setBounds(75, 70, 150, 30);
        lpass.setBounds(0, 100, 300, 30);
        fpass.setBounds(75, 130, 150, 30);
        blogin.setBounds(85, 185, 130, 35);
        
      
    }

    public String getFuser() {
        return fuser.getText();
    }

    public String getFpass() {
        return String.valueOf(fpass.getPassword());
    }

    public void setFuser(String fuser) {
        this.fuser.setText(fuser);
    }

    public void setFpass(String fpass) {
        this.fpass.setText(fpass);
    }
    
}
