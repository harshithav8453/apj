package studentmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddStudent extends JFrame implements ActionListener {

    JLabel lblTitle, lblId, lblName, lblAge, lblCourse;

    JTextField txtId;
    JTextField txtName;
    JTextField txtAge;

    JComboBox<String> courseBox;

    JButton btnSave;
    JButton btnClear;
    JButton btnBack;

    public AddStudent() {

        setTitle("Add Student");
        setSize(500, 450);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        lblTitle = new JLabel("ADD STUDENT");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 20));
        lblTitle.setBounds(160, 20, 200, 30);
        add(lblTitle);

        lblId = new JLabel("Student ID");
        lblId.setBounds(50, 80, 100, 30);
        add(lblId);

        txtId = new JTextField();
        txtId.setBounds(180, 80, 220, 30);
        add(txtId);

        lblName = new JLabel("Student Name");
        lblName.setBounds(50, 130, 100, 30);
        add(lblName);

        txtName = new JTextField();
        txtName.setBounds(180, 130, 220, 30);
        add(txtName);

        lblAge = new JLabel("Age");
        lblAge.setBounds(50, 180, 100, 30);
        add(lblAge);

        txtAge = new JTextField();
        txtAge.setBounds(180, 180, 220, 30);
        add(txtAge);

        lblCourse = new JLabel("Course");
        lblCourse.setBounds(50, 230, 100, 30);
        add(lblCourse);

        String[] courses = {"BCA", "BSc", "BCom", "BBA", "MCA"};

        courseBox = new JComboBox<>(courses);
        courseBox.setBounds(180, 230, 220, 30);
        add(courseBox);

        btnSave = new JButton("Save");
        btnSave.setBounds(40, 320, 100, 40);
        btnSave.addActionListener(this);
        add(btnSave);

        btnClear = new JButton("Clear");
        btnClear.setBounds(180, 320, 100, 40);
        btnClear.addActionListener(this);
        add(btnClear);

        btnBack = new JButton("Back");
        btnBack.setBounds(320, 320, 100, 40);
        btnBack.addActionListener(this);
        add(btnBack);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnSave) {

            String id = txtId.getText();
            String name = txtName.getText();
            String age = txtAge.getText();
            String course = courseBox.getSelectedItem().toString();

            if (id.isEmpty() || name.isEmpty() || age.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Please fill all fields.");
                return;
            }

            Student student = new Student(id, name, age, course);

            StudentData.students.add(student);

            JOptionPane.showMessageDialog(this,
                    "Student Saved Successfully!");

            txtId.setText("");
            txtName.setText("");
            txtAge.setText("");
            courseBox.setSelectedIndex(0);

        }

        else if (e.getSource() == btnClear) {

            txtId.setText("");
            txtName.setText("");
            txtAge.setText("");
            courseBox.setSelectedIndex(0);

        }

        else if (e.getSource() == btnBack) {

            dispose();

        }

    }
}