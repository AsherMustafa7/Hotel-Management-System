package hotel.management.system;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;


import java.awt.*;
import java.awt.event.*;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
public class Reception extends JFrame implements ActionListener{

    JButton b1,b2;
    JButton btnRoom,btnSR;
    Reception(){

        // JPanel panel=new JPanel();
        // panel.setLayout(null);
        // panel.setBounds(280,5,1238,920);
        // panel.setBackground(new Color(3,45,48));
        // add(panel);


       


        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                // Load the image
                ImageIcon imageIcon4 = new ImageIcon("C:\\Users\\acer\\OneDrive\\Desktop\\making final app\\Trying\\src\\icon\\blank-white-7sn5o1woonmklx1h.jpg");
                Image image = imageIcon4.getImage();

                // Create a 50% opaque (transparent) Graphics2D object
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.4f)); // 50% opacity

                // Draw the image with opacity 
                g2d.drawImage(image, 0, 0, this);
                g2d.dispose();
            }
        };
        panel.setLayout(null);
        panel.setBounds(280,5,1238,920); // Set the size and position of the panel
        panel.setOpaque(false); // Ensure the background is transparent
        add(panel);


        // ImageIcon imageIcon2=new ImageIcon("C:\\Users\\acer\\OneDrive\\Desktop\\making final app\\Trying\\src\\icon\\output-onlinegiftools (3).gif");
        // Image i2=imageIcon2.getImage().getScaledInstance(500,500,Image.SCALE_DEFAULT);
        // ImageIcon imageIcon22 = new ImageIcon(i2);
        // JLabel lable = new JLabel(imageIcon22);
        // lable.setBounds(300,20,500,500);
        // panel.add(lable);


       

        JPanel panel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                // Load the image
                ImageIcon imageIcon4 = new ImageIcon("C:\\Users\\acer\\OneDrive\\Desktop\\making final app\\Trying\\src\\icon\\blank-white-7sn5o1woonmklx1h.jpg");
                Image image = imageIcon4.getImage();

                // Create a 50% opaque (transparent) Graphics2D object
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.4f)); // 50% opacity

                // Draw the image with opacity 
                g2d.drawImage(image, 0, 0, this);
                g2d.dispose();
            }
        };
        panel1.setLayout(null);
        panel1.setBounds(5,5,270,920); // Set the size and position of the panel
        panel1.setOpaque(false); // Ensure the background is transparent
        add(panel1);


        //-----------------------------------------------------------------------------------------------------------------------------

        b1=new JButton("ADD");
        b1.setBounds(50,850,120,30);
        b1.setFont(new Font("Tahoma",Font.PLAIN,15));
        b1.setBackground(new Color(93,46,29));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        panel.add(b1);


        //-----------------------------------------------------------------------------------------------------------------------------


        b2=new JButton("Back");
        b2.setBounds(1000,850,120,30);
        b2.setFont(new Font("Tahoma",Font.PLAIN,15));
        b2.setBackground(new Color(93,46,29));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        panel.add(b2);
        //-----------------------------------------------------------------------------------------------------------------------------

        

        JButton btnNCF = new JButton("       new Costumer Form      ");
        btnNCF.setBounds(30,30,200,30);
        btnNCF.setBackground(new Color(245,206,114));
        btnNCF.setForeground(Color.WHITE);
        panel1.add(btnNCF);

        btnNCF.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e){

                try
                {
                    new NewCustomerForm();
                }catch(Exception E)
                {
                    E.printStackTrace();

                }
            }
        });



        btnRoom = new JButton("                 Room                    ");
        btnRoom.setBounds(30,70,200,30);
        btnRoom.setBackground(new Color(245,206,114));
        btnRoom.setForeground(Color.WHITE);
        panel1.add(btnRoom);
        

        btnRoom.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e){

                try
                {

                }catch(Exception E)
                {
                    E.printStackTrace();

                }
            }
        });


        JButton btnDepartment = new JButton("               Department             ");
        btnDepartment.setBounds(30,110,200,30);
        btnDepartment.setBackground(new Color(245,206,114));
        btnDepartment.setForeground(Color.WHITE);
        panel1.add(btnDepartment);
        

        btnDepartment.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e){

                try
                {

                }catch(Exception E)
                {
                    E.printStackTrace();

                }
            }
        });
       


        JButton btnAEI = new JButton("           All Employee Info        ");
        btnAEI.setBounds(30,150,200,30);
        btnAEI.setBackground(new Color(245,206,114));
        btnAEI.setForeground(Color.WHITE);
        panel1.add(btnAEI);
        

        btnAEI.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e){

                try
                {
                    new EmployeeInfo();
                }catch(Exception E)
                {
                    E.printStackTrace();

                }
            }
        });
        


        JButton btnCI = new JButton("           Customer Info             ");
        btnCI.setBounds(30,190,200,30);
        btnCI.setBackground(new Color(245,206,114));
        btnCI.setForeground(Color.WHITE);
        panel1.add(btnCI);
        

        btnCI.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e){

                try
                {
                    new CustomerInfo();
                }catch(Exception E)
                {
                    E.printStackTrace();

                }
            }
        });


        JButton btnMI = new JButton("            Manager Info             ");
        btnMI.setBounds(30,230,200,30);
        btnMI.setBackground(new Color(245,206,114));
        btnMI.setForeground(Color.WHITE);
        panel1.add(btnMI);
        

        btnMI.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e){

                try
                {

                }catch(Exception E)
                {
                    E.printStackTrace();

                }
            }
        });

 
        JButton btnCO = new JButton("              Cheak Out               ");
        btnCO.setBounds(30,270,200,30);
        btnCO.setBackground(new Color(245,206,114));
        btnCO.setForeground(Color.WHITE);
        panel1.add(btnCO);
        

        btnCO.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e){

                try
                {

                }catch(Exception E)
                {
                    E.printStackTrace();

                }
            }
        });
        


        JButton btnUC = new JButton("  Update Cheak-In Details  ");
        btnUC.setBounds(30,310,200,30);
        btnUC.setBackground(new Color(245,206,114));
        btnUC.setForeground(Color.WHITE);
        panel1.add(btnUC);
        

        btnUC.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e){

                try
                {

                }catch(Exception E)
                {
                    E.printStackTrace();

                }
            }
        });



        JButton btnURS = new JButton("     Update Room Status     ");
        btnURS.setBounds(30,350,200,30);
        btnURS.setBackground(new Color(245,206,114));
        btnURS.setForeground(Color.WHITE);
        panel1.add(btnURS);
        

        btnURS.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e){

                try
                {

                }catch(Exception E)
                {
                    E.printStackTrace();

                }
            }
        });


        JButton btnPUS = new JButton("         Pick Up Service         ");
        btnPUS.setBounds(30,390,200,30);
        btnPUS.setBackground(new Color(245,206,114));
        btnPUS.setForeground(Color.WHITE);
        panel1.add(btnPUS);
        

        btnPUS.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e){

                try
                {
                    new DriverInfo();

                }catch(Exception E)
                {
                    E.printStackTrace();

                }
            }
        });

        btnSR  = new JButton("            Search Room            ");
        btnSR.setBounds(30,430,200,30);
        btnSR.setBackground(new Color(245,206,114));
        btnSR.setForeground(Color.WHITE);
        btnSR.addActionListener(this);
        panel1.add(btnSR);
        

        btnSR.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e){

                try
                {

                }catch(Exception E)
                {
                    E.printStackTrace();

                }
            }
        });


        ImageIcon imageIcon =new ImageIcon("Trying/src/icon/Designer (10).jpeg");
        Image i1 =imageIcon.getImage().getScaledInstance(1540,950,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(i1);
        JLabel label=new JLabel(imageIcon1);
        label.setBounds(0,0,1540,950);
        add(label);




        getContentPane().setBackground(Color.white);
        setLayout(null);
        setSize(1950,1090);
        setVisible(true); 
       
    }



    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            // try
            // {
            //     Von c= new Von();
            //     String room = t3.getText();
            //     String ava =(String)t4.getSelectedItem();//as it was a combo box
            //     String Status =(String)t6.getSelectedItem();
            //     String price = t5.getText();
            //     String type= (String)t7.getSelectedItem();

            //     String q= "insert into room values('"+room+"','"+ava+"','"+Status+"','"+price+"','"+type+"')";

            //     c.statement.executeUpdate(q);//we use update when we need to insert something
            //     //we use executeQuery(q) when we need to take out a value from the query

            //     // to tell the user that the data got stored successfully we use JOption 
            //      JOptionPane.showMessageDialog(null,"Room successfully edited");
            //      setVisible(false);
            // }catch(Exception E)
            // {
            //     E.printStackTrace();
            // }
        }
        else if(e.getSource()==btnSR)
        {
            new SearchRoom();
        }
        else
        { 
            new Dashboard();
            setVisible(false);
        }

    }
    public static void main(String[] args) {
        new Reception();
    }
}
