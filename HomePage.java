package studentmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HomePage extends JFrame implements ActionListener {

    JButton btnAdd;
    JButton btnView;
    JButton btnSearch;
    JButton btnUpdate;
    JButton btnDelete;
    JButton btnLogout;

    JLabel title;

    public HomePage() {

        setTitle("Student Management System");
        setSize(600, 550);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Title
        title = new JLabel("STUDENT MANAGEMENT SYSTEM");
        title.setFont(new Font("Arial", Font.BOLD, 22));
        title.setBounds(110, 30, 400, 30);
        add(title);

        // Add Student Button
        btnAdd = new JButton("Add Student");
        btnAdd.setBounds(180, 90, 220, 40);
        btnAdd.addActionListener(this);
        add(btnAdd);

        // View Students Button
        btnView = new JButton("View Students");
        btnView.setBounds(180, 150, 220, 40);
        btnView.addActionListener(this);
        add(btnView);

        // Search Student Button
        btnSearch = new JButton("Search Student");
        btnSearch.setBounds(180, 210, 220, 40);
        btnSearch.addActionListener(this);
        add(btnSearch);

        // Update Student Button
        btnUpdate = new JButton("Update Student");
        btnUpdate.setBounds(180, 270, 220, 40);
        btnUpdate.addActionListener(this);
        add(btnUpdate);

        // Delete Student Button
        btnDelete = new JButton("Delete Student");
        btnDelete.setBounds(180, 330, 220, 40);
        btnDelete.addActionListener(this);
        add(btnDelete);

        // Logout Button
        btnLogout = new JButton("Logout");
        btnLogout.setBounds(180, 390, 220, 40);
        btnLogout.addActionListener(this);
        add(btnLogout);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnAdd) {

            new AddStudent();

        } 
        else if (e.getSource() == btnView) {

            new ViewStudent();

        } 
        else if (e.getSource() == btnSearch) {

            new SearchStudent();

        } 
        else if (e.getSource() == btnUpdate) {

            new UpdateStudent();

        } 
        else if (e.getSource() == btnDelete) {

            new DeleteStudent();

        } 
        else if (e.getSource() == btnLogout) {

            dispose();
            new LoginPage();

        }

    }

}