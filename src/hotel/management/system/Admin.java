package hotel.management.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;

public class Admin extends JFrame implements ActionListener {

    JButton add_Employee, add_Room,add_Drivers,logout,back;

    Admin()
    {




        add_Employee=new JButton("Add Employee");
        add_Employee.setBounds(465,500,150,30);
        add_Employee.setFont(new Font("Tahoma",Font.PLAIN,15));
        add_Employee.setBackground(new Color(184,182,170));
        add_Employee.setForeground(Color.WHITE);
        add_Employee.addActionListener(this);
        add(add_Employee);



        ImageIcon addEmployee =new ImageIcon("C:\\Users\\acer\\OneDrive\\Desktop\\making final app\\Trying\\src\\icon\\incorporation (1).png");
        Image i2 =addEmployee.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon2=new ImageIcon(i2);
        JLabel label2=new JLabel(imageIcon2);
        label2.setBounds(450,300,200,200);
        add(label2);


        //-----------------------------------------------------------------------------------------------------------------------------


        add_Room=new JButton("Add Room");
        add_Room.setBounds(700,500,120,30);
        add_Room.setFont(new Font("Tahoma",Font.PLAIN,15));
        add_Room.setBackground(new Color(184,182,170));
        add_Room.setForeground(Color.WHITE);
        add_Room.addActionListener(this);
        add(add_Room);



        ImageIcon addRoom =new ImageIcon("C:\\Users\\acer\\OneDrive\\Desktop\\making final app\\Trying\\src\\icon\\output-onlinegiftools (4).gif");
        Image i3 =addRoom.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon3=new ImageIcon(i3);
        JLabel label3=new JLabel(imageIcon3);
        label3.setBounds(670,300,200,200);
        add(label3);

        //-----------------------------------------------------------------------------------------------------------------------------

        add_Drivers=new JButton("Add Drivers");
        add_Drivers.setBounds(920,500,120,30);
        add_Drivers.setFont(new Font("Tahoma",Font.PLAIN,15));
        add_Drivers.setBackground(new Color(184,182,170));
        add_Drivers.setForeground(Color.WHITE);
        add_Drivers.addActionListener(this);
        add(add_Drivers);



        ImageIcon addDrivers =new ImageIcon("C:\\Users\\acer\\OneDrive\\Desktop\\making final app\\Trying\\src\\icon\\driver.png");
        Image i4 =addDrivers.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon4=new ImageIcon(i4);
        JLabel label4=new JLabel(imageIcon4);
        label4.setBounds(880,290,200,200);
        add(label4);





        //-----------------------------------------------------------------------------------------------------------------------------

        logout=new JButton("Logout");
        logout.setBounds(50,850,120,30);
        logout.setFont(new Font("Tahoma",Font.PLAIN,15));
        logout.setBackground(new Color(184,182,170));
        logout.setForeground(Color.WHITE);
        logout.addActionListener(this);
        add(logout);


        //-----------------------------------------------------------------------------------------------------------------------------


        back=new JButton("Back");
        back.setBounds(1370,850,120,30);
        back.setFont(new Font("Tahoma",Font.PLAIN,15));
        back.setBackground(new Color(184,182,170));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        //-----------------------------------------------------------------------------------------------------------------------------

        ImageIcon imageIcon =new ImageIcon("C:\\Users\\acer\\OneDrive\\Desktop\\making final app\\Trying\\src\\icon\\Designer (13).jpeg");
        Image i1 =imageIcon.getImage().getScaledInstance(1540,950,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(i1);
        JLabel label1=new JLabel(imageIcon1);
        label1.setBounds(0,0,1540,950);
        add(label1);


        setLayout(null);
        setSize(1950,1090);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==add_Employee)
        {
            new AddEMPLOYEE();
            setVisible(false);
        }
        else if(e.getSource()==add_Room)
        {
            new AddROOM();
            setVisible(false);
        }
        else if(e.getSource()==add_Drivers)
        {
            new AddDRIVER();
            setVisible(false);

        }
        else if(e.getSource()==logout)
        {
            System.exit(102);
        }
        else if(e.getSource()==back)
        {
            new Dashboard();
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new Admin();
    }

}
