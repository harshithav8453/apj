package studentmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DeleteStudent extends JFrame implements ActionListener {

    JTextField txtId;
    JButton btnDelete;

    public DeleteStudent() {

        setTitle("Delete Student");
        setSize(400,220);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lbl=new JLabel("Student ID");
        lbl.setBounds(30,40,100,30);
        add(lbl);

        txtId=new JTextField();
        txtId.setBounds(140,40,180,30);
        add(txtId);

        btnDelete=new JButton("Delete");
        btnDelete.setBounds(120,100,120,35);
        btnDelete.addActionListener(this);
        add(btnDelete);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){

        for(int i=0;i<StudentData.students.size();i++){

            if(StudentData.students.get(i).getId().equals(txtId.getText())){

                StudentData.students.remove(i);

                JOptionPane.showMessageDialog(this,
                        "Student Deleted Successfully");

                return;

            }

        }

        JOptionPane.showMessageDialog(this,
                "Student Not Found");

    }

}