package hotel.management.system;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;


import java.awt.*;
import java.awt.event.*;



public class AddEMPLOYEE extends JFrame implements ActionListener{

    JTextField t4,t3,t5,t7,t9,t10;
    JComboBox t6;
    JRadioButton m,f;

    JButton b1,b2;
    AddEMPLOYEE()
    {


        //-------------------------------------------------------------------------------------------------------------------------------

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
        panel.setBounds(10,5,1510,920); // Set the size and position of the panel
        panel.setOpaque(false); // Ensure the background is transparent
        add(panel);


        //--------------------------------------------------------------------------------------------------------------------------------------

            JLabel lable2= new JLabel("Add Employee");
            lable2.setBounds(650,10,250,35);
            lable2.setFont(new Font("Tahoma",Font.BOLD,30));
            lable2.setForeground(new Color(93,46,29));
            panel.add(lable2);

            
           
            

        //---------------------------------------------------------------------------------------------------------------------------------


            JLabel lable3= new JLabel("Name");
            lable3.setBounds(95,200,200,32);
            lable3.setFont(new Font("Tahoma",Font.BOLD,22));
            lable3.setForeground(new Color(93,46,29));
            panel.add(lable3);

            t3= new JTextField();
            t3.setBounds(190,240,200,32);
            t3.setFont(new Font("Tahoma",Font.BOLD,22));
            t3.setForeground(Color.white);
            t3.setBackground(new Color(93,46,29));
            panel.add(t3);





             //------------------------------------------------------------------------------------------------------------------------------
      
             JLabel lable5= new JLabel("Age");
             lable5.setBounds(690,380,200,32);
             lable5.setFont(new Font("Tahoma",Font.BOLD,22));
             lable5.setForeground(new Color(93,46,29));
             panel.add(lable5);
 
             t5= new JTextField();
             t5.setBounds(710,420,200,32);
             t5.setFont(new Font("Tahoma",Font.BOLD,22));
             t5.setForeground(Color.white);
             t5.setBackground(new Color(93,46,29));
             panel.add(t5);


             //------------------------------------------------------------------------------------------------------------------------------
      
             JLabel lable4= new JLabel("Salary");
             lable4.setBounds(95,450,200,32);
             lable4.setFont(new Font("Tahoma",Font.BOLD,22));
             lable4.setForeground(new Color(93,46,29));
             panel.add(lable4);
 
             t4= new JTextField();
             t4.setBounds(190,500,200,32);
             t4.setFont(new Font("Tahoma",Font.BOLD,22));
             t4.setForeground(Color.white);
             t4.setBackground(new Color(93,46,29));
             panel.add(t4);
 
        //---------------------------------------------------------------------------------------------------------------------------


            JLabel lable8= new JLabel("gender");
            lable8.setBounds(360,290,200,32);
            lable8.setFont(new Font("Tahoma",Font.BOLD,22));
            lable8.setForeground(new Color(93,46,29));
            panel.add(lable8);

            
            m = new JRadioButton("Male");
            m.setBounds(405,330,100,32);
            m.setBackground(new Color(93,46,29));
            m.setFont(new Font("Tahoma",Font.BOLD,14));
            m.setForeground(Color.white);
            panel.add(m);

            f = new JRadioButton("Female");
            f.setBounds(550,330,100,32);
            f.setBackground(new Color(93,46,29));
            f.setFont(new Font("Tahoma",Font.BOLD,14));
            f.setForeground(Color.white);
            panel.add(f);




       

        //-----------------------------------------------------------------------------------------------------------------------------
       

            JLabel lable6= new JLabel("Job");
            lable6.setBounds(900,290,200,32);
            lable6.setFont(new Font("Tahoma",Font.BOLD,22));
            lable6.setForeground(new Color(93,46,29));
            panel.add(lable6);

            t6= new JComboBox(new String[] {"Front Desk","House Keeping","Kitchen Staff","Room Service","Manager","Accountant","chef"});
            t6.setBounds(955,330,200,32);
            t6.setFont(new Font("Tahoma",Font.BOLD,14));
            t6.setForeground(Color.white);
            t6.setBackground(new Color(93,46,29));
            panel.add(t6);
        //-----------------------------------------------------------------------------------------------------------------------------
        
            JLabel lable7= new JLabel("Phone");
            lable7.setBounds(1170,200,200,32);
            lable7.setFont(new Font("Tahoma",Font.BOLD,22));
            lable7.setForeground(new Color(93,46,29));
            panel.add(lable7);

            t7= new JTextField();
            t7.setBounds(1235,240,200,32);
            t7.setFont(new Font("Tahoma",Font.BOLD,14));
            t7.setForeground(Color.white);
            t7.setBackground(new Color(93,46,29));
            panel.add(t7);

        //-----------------------------------------------------------------------------------------------------------------------------


            JLabel lable9= new JLabel("Aadhar");
            lable9.setBounds(360,600,200,32);
            lable9.setFont(new Font("Tahoma",Font.BOLD,22));
            lable9.setForeground(new Color(93,46,29));
            panel.add(lable9);

            t9= new JTextField();
            t9.setBounds(405,650,200,32);
            t9.setFont(new Font("Tahoma",Font.BOLD,14));
            t9.setForeground(Color.white);
            t9.setBackground(new Color(93,46,29));
            panel.add(t9);
 

        //-----------------------------------------------------------------------------------------------------------------------------

            JLabel lable10= new JLabel("Email");
            lable10.setBounds(690,700,200,32);
            lable10.setFont(new Font("Tahoma",Font.BOLD,22));
            lable10.setForeground(new Color(93,46,29));
            panel.add(lable10);

            t10= new JTextField();
            t10.setBounds(710,750,200,32);
            t10.setFont(new Font("Tahoma",Font.BOLD,14));
            t10.setForeground(Color.white);
            t10.setBackground(new Color(93,46,29));
            panel.add(t10);
 

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
        b2.setBounds(1370,850,120,30);
        b2.setFont(new Font("Tahoma",Font.PLAIN,15));
        b2.setBackground(new Color(93,46,29));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        panel.add(b2);
        //-----------------------------------------------------------------------------------------------------------------------------

        ImageIcon imageIcon4 =new ImageIcon("C:\\Users\\acer\\OneDrive\\Desktop\\making final app\\Trying\\src\\icon\\output-onlinegiftools (11).gif");
        Image i4 =imageIcon4.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon44=new ImageIcon(i4);
        JLabel label44=new JLabel(imageIcon44);
        label44.setBounds(460,100,200,200);
        panel.add(label44);

        //----------------------------------------------------------------------------------------------------------------------------

        ImageIcon imageIcon3 =new ImageIcon("C:\\Users\\acer\\OneDrive\\Desktop\\making final app\\Trying\\src\\icon\\output-onlinegiftools (10).gif");
        Image i3 =imageIcon3.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon33=new ImageIcon(i3);
        JLabel label33=new JLabel(imageIcon33);
        label33.setBounds(160,40,200,200);
        panel.add(label33);

        //----------------------------------------------------------------------------------------------------------------------------
        ImageIcon imageIcon5 =new ImageIcon("C:\\Users\\acer\\OneDrive\\Desktop\\making final app\\Trying\\src\\icon\\output-onlinegiftools (13).gif");
        Image i5 =imageIcon5.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon55=new ImageIcon(i5);
        JLabel label55=new JLabel(imageIcon55);
        label55.setBounds(920,400,200,200);
        panel.add(label55);

        //----------------------------------------------------------------------------------------------------------------------------

        ImageIcon imageIcon6 =new ImageIcon("C:\\Users\\acer\\OneDrive\\Desktop\\making final app\\Trying\\src\\icon\\output-onlinegiftools (12).gif");
        Image i6 =imageIcon6.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon66=new ImageIcon(i6);
        JLabel label66=new JLabel(imageIcon66);
        label66.setBounds(960,100,200,200);
        panel.add(label66);

        //----------------------------------------------------------------------------------------------------------------------------

        ImageIcon imageIcon7 =new ImageIcon("C:\\Users\\acer\\OneDrive\\Desktop\\making final app\\Trying\\src\\icon\\output-onlinegiftools (18).gif");
        Image i7 =imageIcon7.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon77=new ImageIcon(i7);
        JLabel label77=new JLabel(imageIcon77);
        label77.setBounds(1260,300,200,200);
        panel.add(label77);


        //----------------------------------------------------------------------------------------------------------------------------
        ImageIcon imageIcon8 =new ImageIcon("C:\\Users\\acer\\OneDrive\\Desktop\\making final app\\Trying\\src\\icon\\output-onlinegiftools (14).gif");
        Image i8 =imageIcon8.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon88=new ImageIcon(i8);
        JLabel label88=new JLabel(imageIcon88);
        label88.setBounds(100,540,200,200);
        panel.add(label88);

         //----------------------------------------------------------------------------------------------------------------------------
         ImageIcon imageIcon9 =new ImageIcon("C:\\Users\\acer\\OneDrive\\Desktop\\making final app\\Trying\\src\\icon\\output-onlinegiftools (15).gif");
         Image i9 =imageIcon9.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
         ImageIcon imageIcon99=new ImageIcon(i9);
         JLabel label99=new JLabel(imageIcon99);
         label99.setBounds(400,650,200,200);
         panel.add(label99);

         //----------------------------------------------------------------------------------------------------------------------------
        ImageIcon imageIcon10 =new ImageIcon("C:\\Users\\acer\\OneDrive\\Desktop\\making final app\\Trying\\src\\icon\\output-onlinegiftools (16).gif");
        Image i10 =imageIcon10.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1010=new ImageIcon(i10);
        JLabel label1010=new JLabel(imageIcon1010);
        label1010.setBounds(920,690,200,200);
        panel.add(label1010);

        //----------------------------------------------------------------------------------------------------------------------------
        ImageIcon imageIcon =new ImageIcon("C:\\Users\\acer\\OneDrive\\Desktop\\making final app\\Trying\\src\\icon\\Designer (16).jpeg");
        Image i1 =imageIcon.getImage().getScaledInstance(1540,950,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(i1);
        JLabel label1=new JLabel(imageIcon1);
        label1.setBounds(0,0,1540,950);
        add(label1);


        //---------------------------------------------------------------------------------------------------------------------------
            
        //----------------------------------------------------------------------------------------------------------------------------------

        setLayout(null);
        setSize(1950,1090);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            
                String name =t3.getText();
                String age= t5.getText();
                String salary = t4.getText();
                String phone = t7.getText();
                String email = t10.getText();
                String aadhar = t9.getText();
                String job = (String) t6.getSelectedItem();
                String gender =null;
                if(m.isSelected())
                {
                    gender="Male";
                }
                else if(f.isSelected())
                {
                    gender ="Female";
                }
            
                try
                {
                    Von c = new Von();
                    
                    String q ="insert into employee values('"+name+"','"+age+"','"+gender+"','"+job+"','"+salary+"','"+phone+"','"+email+"','"+aadhar+"')";
                    c.statement.executeUpdate(q);
                    JOptionPane.showMessageDialog(null,"Employee Added");
                    setVisible(false);
                }
                catch(Exception E)
                {
                    E.printStackTrace();
                }
            }
        else
        { 
            new Admin();
            setVisible(false);
        }

    }
    public static void main(String[] args) {
        new AddEMPLOYEE();
    }
}
