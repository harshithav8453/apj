package studentmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UpdateStudent extends JFrame implements ActionListener {

    JTextField txtId, txtName, txtAge;
    JComboBox<String> courseBox;
    JButton btnUpdate;

    public UpdateStudent() {

        setTitle("Update Student");
        setSize(450,400);
        setLayout(null);
        setLocationRelativeTo(null);

        addLabel("Student ID",30,30);
        txtId = addTextField(150,30);

        addLabel("Name",30,80);
        txtName = addTextField(150,80);

        addLabel("Age",30,130);
        txtAge = addTextField(150,130);

        addLabel("Course",30,180);

        courseBox = new JComboBox<>(new String[]{"BCA","BSc","BCom","BBA","MCA"});
        courseBox.setBounds(150,180,180,30);
        add(courseBox);

        btnUpdate = new JButton("Update");
        btnUpdate.setBounds(140,260,120,40);
        btnUpdate.addActionListener(this);
        add(btnUpdate);

        setVisible(true);
    }

    private void addLabel(String text,int x,int y){
        JLabel lbl=new JLabel(text);
        lbl.setBounds(x,y,100,30);
        add(lbl);
    }

    private JTextField addTextField(int x,int y){
        JTextField t=new JTextField();
        t.setBounds(x,y,180,30);
        add(t);
        return t;
    }

    @Override
    public void actionPerformed(ActionEvent e){

        for(Student s: StudentData.students){

            if(s.getId().equals(txtId.getText())){

                s.setName(txtName.getText());
                s.setAge(txtAge.getText());
                s.setCourse(courseBox.getSelectedItem().toString());

                JOptionPane.showMessageDialog(this,"Student Updated Successfully");
                return;
            }

        }

        JOptionPane.showMessageDialog(this,"Student Not Found");

    }

}