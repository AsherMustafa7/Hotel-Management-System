package hotel.management.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;


import java.awt.*;
import java.awt.event.*;

import net.proteanit.sql.DbUtils;


public class CustomerInfo extends JFrame implements ActionListener{
    // JCheckBox checkBox;
    Choice choice;
    JTable table;
    JButton add ,back;
    CustomerInfo()
    {

        

        JPanel panel= new JPanel();
        panel.setBackground(Color.white);
        panel.setBounds(0,0,1238,920);
        panel.setLayout(null);
        add(panel);


        JLabel searchforRoom = new JLabel("Search For Room");
        searchforRoom.setBounds(500,11,186,31);
        searchforRoom.setForeground(Color.black);
        searchforRoom.setFont(new Font ("Tahoma", Font.BOLD,20));
        panel.add(searchforRoom);


        JLabel rbd = new JLabel("Stay days");
        rbd.setBounds(150,70,150,15);
        rbd.setForeground(Color.black);
        rbd.setFont(new Font ("Tahoma", Font.BOLD,14));
        panel.add(rbd);


        JLabel c1 = new JLabel("Name");
        c1.setBounds(0,160,150,15);
        c1.setForeground(Color.black);
        c1.setFont(new Font ("Tahoma", Font.BOLD,14));
        panel.add(c1);

        JLabel c2 = new JLabel("Age");
        c2.setBounds(180,160,150,15);
        c2.setForeground(Color.black);
        c2.setFont(new Font ("Tahoma", Font.BOLD,14));
        panel.add(c2);

        JLabel c3 = new JLabel("Gender");
        c3.setBounds(330,160,150,15);
        c3.setForeground(Color.black);
        c3.setFont(new Font ("Tahoma", Font.BOLD,14));
        panel.add(c3);

        JLabel c4 = new JLabel("Stay days");
        c4.setBounds(470,160,150,15);
        c4.setForeground(Color.black);
        c4.setFont(new Font ("Tahoma", Font.BOLD,14));
        panel.add(c4);

        JLabel c5 = new JLabel("Cheak-In TIme");
        c5.setBounds(600,160,150,15);
        c5.setForeground(Color.black);
        c5.setFont(new Font ("Tahoma", Font.BOLD,14));
        panel.add(c5);

        JLabel c6 = new JLabel("Phone Number");
        c6.setBounds(730,160,150,15);
        c6.setForeground(Color.black);
        c6.setFont(new Font ("Tahoma", Font.BOLD,14));
        panel.add(c6);

        JLabel c7 = new JLabel("Email");
        c7.setBounds(950,160,150,15);
        c7.setForeground(Color.black);
        c7.setFont(new Font ("Tahoma", Font.BOLD,14));
        panel.add(c7);  

        JLabel c8 = new JLabel("Aadhar Number");
        c8.setBounds(1020,160,150,15);
        c8.setForeground(Color.black);
        c8.setFont(new Font ("Tahoma", Font.BOLD,14));
        panel.add(c8);




        

        // checkBox = new JCheckBox("only Display avaliable");
        // checkBox.setBounds(800,70,250,23);
        // checkBox.setForeground(Color.black);
        // checkBox.setBackground(Color.white);
        // panel.add(checkBox);

        choice = new Choice();
        choice.add("1-5 days");
        choice.add("5-10 days");
        choice.add("10-15 days");
        choice.add("15-20 days");
        choice.add("20-30 days");
        choice.add("More than a Months");
        
        choice.setBounds(353,70,120,20);
        panel.add(choice);


        table = new JTable();
        table.setBounds(10,187,1200,400);
        table.setBackground(Color.WHITE);
        table.setForeground(Color.black);
        panel.add(table);


        try
        {   
            Von c= new Von();
            String q= "select * from customer";
            ResultSet resultset =c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultset));
             

        }catch(Exception E)
        {
            E.printStackTrace();
        }

        add = new JButton("Search");
        add.setBounds(200,700,120,30);
        add.setBackground(Color.black);
        add.setForeground(Color.white);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("back");
        back.setBounds(780,700,120,30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.addActionListener(this);
        panel.add(back);

        setUndecorated(true);

        setLayout(null);
        setSize(1238,920);
        setLocation(287,31);
        setVisible(true);
       


        
    }

    @Override  
    public void actionPerformed(ActionEvent e) {
    if (e.getSource() == add) {
        String Q = "select * from customer where job='" + choice.getSelectedItem() + "'";
        
        try {
            Von c = new Von();  
            ResultSet resultSet = c.statement.executeQuery(Q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
            
        } catch (Exception E) {
            E.printStackTrace();
        }
    } else {
        setVisible(false);
    }
}
    public static void main(String[] args) {
        new CustomerInfo ();
    }

}

