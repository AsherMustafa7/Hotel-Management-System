package hotel.management.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;


import java.awt.*;
import java.awt.event.*;

import net.proteanit.sql.DbUtils;


public class SearchRoom extends JFrame implements ActionListener{
    JCheckBox checkBox;
    Choice choice;
    JTable table;
    JButton add ,back;
    SearchRoom()
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


        JLabel rbd = new JLabel("Room bed Type");
        rbd.setBounds(150,70,150,20);
        rbd.setForeground(Color.black);
        rbd.setFont(new Font ("Tahoma", Font.BOLD,14));
        panel.add(rbd);


        JLabel c1 = new JLabel("Room Number");
        c1.setBounds(90,160,150,20);
        c1.setForeground(Color.black);
        c1.setFont(new Font ("Tahoma", Font.BOLD,14));
        panel.add(c1);

        JLabel c2 = new JLabel("Avalibility");
        c2.setBounds(300,160,150,20);
        c2.setForeground(Color.black);
        c2.setFont(new Font ("Tahoma", Font.BOLD,14));
        panel.add(c2);

        JLabel c3 = new JLabel("Status");
        c3.setBounds(500,160,150,20);
        c3.setForeground(Color.black);
        c3.setFont(new Font ("Tahoma", Font.BOLD,14));
        panel.add(c3);

        JLabel c4 = new JLabel("price");
        c4.setBounds(750,160,150,20);
        c4.setForeground(Color.black);
        c4.setFont(new Font ("Tahoma", Font.BOLD,14));
        panel.add(c4);

        JLabel c5 = new JLabel("Type");
        c5.setBounds(980,160,150,20);
        c5.setForeground(Color.black);
        c5.setFont(new Font ("Tahoma", Font.BOLD,14));
        panel.add(c5);




        

        checkBox = new JCheckBox("only Display avaliable");
        checkBox.setBounds(800,70,250,23);
        checkBox.setForeground(Color.black);
        checkBox.setBackground(Color.white);
        panel.add(checkBox);

        choice = new Choice();
        choice.add("Single Bed");
        choice.add("Double bed");
        choice.add("Suite");
        choice.add("Condominium");
        choice.add("Delux");
        choice.add("Jacuzzi");
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
            String q= "select * from room";
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
        String Q = "select * from room where bed_type='" + choice.getSelectedItem() + "'";
        String Q1 = "select * from room where availability = 'Avaliable' and bed_type='" + choice.getSelectedItem() + "'";
        try {
            Von c = new Von();  
            ResultSet resultSet = c.statement.executeQuery(Q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
            if (checkBox.isSelected()) {
                ResultSet resultSet1 = c.statement.executeQuery(Q1);
                table.setModel(DbUtils.resultSetToTableModel(resultSet1));
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    } else {
        setVisible(false);
    }
}
    public static void main(String[] args) {
        new SearchRoom();
    }

}
