package studentmanagementsystem;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ViewStudent extends JFrame {

    JTable table;
    DefaultTableModel model;

    public ViewStudent() {

        setTitle("View Students");
        setSize(600,400);
        setLocationRelativeTo(null);

        model = new DefaultTableModel();

        model.addColumn("Student ID");
        model.addColumn("Name");
        model.addColumn("Age");
        model.addColumn("Course");

        table = new JTable(model);

        for(Student s : StudentData.students){

            model.addRow(new Object[]{

                    s.getId(),
                    s.getName(),
                    s.getAge(),
                    s.getCourse()

            });

        }

        JScrollPane scroll = new JScrollPane(table);

        add(scroll);

        setVisible(true);

    }

}