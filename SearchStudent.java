package studentmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SearchStudent extends JFrame implements ActionListener {

    JTextField txtId;
    JTextArea result;
    JButton btnSearch;

    public SearchStudent() {

        setTitle("Search Student");
        setSize(450,350);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lbl = new JLabel("Enter Student ID");
        lbl.setBounds(30,30,120,30);
        add(lbl);

        txtId = new JTextField();
        txtId.setBounds(160,30,180,30);
        add(txtId);

        btnSearch = new JButton("Search");
        btnSearch.setBounds(150,80,120,35);
        btnSearch.addActionListener(this);
        add(btnSearch);

        result = new JTextArea();
        result.setEditable(false);

        JScrollPane sp = new JScrollPane(result);
        sp.setBounds(30,140,370,130);
        add(sp);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String id = txtId.getText();

        result.setText("");

        for(Student s : StudentData.students){

            if(s.getId().equals(id)){

                result.setText(
                        "Student ID : " + s.getId() +
                        "\nName : " + s.getName() +
                        "\nAge : " + s.getAge() +
                        "\nCourse : " + s.getCourse());

                return;
            }

        }

        JOptionPane.showMessageDialog(this,"Student Not Found");

    }
}