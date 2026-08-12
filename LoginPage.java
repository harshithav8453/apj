package studentmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage extends JFrame implements ActionListener {

    JLabel lblTitle, lblUsername, lblPassword;
    JTextField txtUsername;
    JPasswordField txtPassword;
    JButton btnLogin, btnClear;

    public LoginPage() {

        setTitle("Student Management System - Login");
        setSize(450, 320);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Title
        lblTitle = new JLabel("STUDENT MANAGEMENT SYSTEM");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 20));
        lblTitle.setBounds(50, 20, 350, 30);
        add(lblTitle);

        // Username
        lblUsername = new JLabel("Username:");
        lblUsername.setBounds(50, 80, 100, 25);
        add(lblUsername);

        txtUsername = new JTextField();
        txtUsername.setBounds(150, 80, 200, 30);
        add(txtUsername);

        // Password
        lblPassword = new JLabel("Password:");
        lblPassword.setBounds(50, 130, 100, 25);
        add(lblPassword);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(150, 130, 200, 30);
        add(txtPassword);

        // Login Button
        btnLogin = new JButton("Login");
        btnLogin.setBounds(80, 200, 100, 35);
        btnLogin.addActionListener(this);
        add(btnLogin);

        // Clear Button
        btnClear = new JButton("Clear");
        btnClear.setBounds(220, 200, 100, 35);

        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtUsername.setText("");
                txtPassword.setText("");
            }
        });

        add(btnClear);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String username = txtUsername.getText();
        String password = String.valueOf(txtPassword.getPassword());

        if (username.equals("admin") && password.equals("1234")) {

            JOptionPane.showMessageDialog(this, "Login Successful");

            dispose();   // Close Login Page

            new HomePage();   // Open Home Page

        } else {

            JOptionPane.showMessageDialog(this,
                    "Invalid Username or Password");

        }
    }

    public static void main(String[] args) {
        new LoginPage();
    }
}