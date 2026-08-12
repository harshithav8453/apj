package studentmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {

    JButton btnAdd, btnView, btnSearch, btnUpdate, btnDelete, btnLogout;

    public Dashboard() {

        setTitle("Student Management System Dashboard");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel title = new JLabel("STUDENT MANAGEMENT SYSTEM");
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setBounds(140, 20, 400, 30);
        add(title);

        JLabel welcome = new JLabel("Welcome Admin");
        welcome.setFont(new Font("Arial", Font.PLAIN, 18));
        welcome.setBounds(250, 60, 200, 30);
        add(welcome);

        JLabel total = new JLabel("Total Students : " + StudentData.students.size());
        total.setFont(new Font("Arial", Font.BOLD, 18));
        total.setBounds(220, 100, 250, 30);
        add(total);

        btnAdd = new JButton("Add Student");
        btnAdd.setBounds(70, 180, 220, 40);
        add(btnAdd);

        btnView = new JButton("View Students");
        btnView.setBounds(380, 180, 220, 40);
        add(btnView);

        btnSearch = new JButton("Search Student");
        btnSearch.setBounds(70, 250, 220, 40);
        add(btnSearch);

        btnUpdate = new JButton("Update Student");
        btnUpdate.setBounds(380, 250, 220, 40);
        add(btnUpdate);

        btnDelete = new JButton("Delete Student");
        btnDelete.setBounds(70, 320, 220, 40);
        add(btnDelete);

        btnLogout = new JButton("Logout");
        btnLogout.setBounds(380, 320, 220, 40);
        add(btnLogout);

        btnAdd.addActionListener(this);
        btnView.addActionListener(this);
        btnSearch.addActionListener(this);
        btnUpdate.addActionListener(this);
        btnDelete.addActionListener(this);
        btnLogout.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnAdd) {
            new AddStudent();
        } else if (e.getSource() == btnView) {
            new ViewStudent();
        } else if (e.getSource() == btnSearch) {
            new SearchStudent();
        } else if (e.getSource() == btnUpdate) {
            new UpdateStudent();
        } else if (e.getSource() == btnDelete) {
            new DeleteStudent();
        } else if (e.getSource() == btnLogout) {
            dispose();
            new LoginPage();
        }

    }
}