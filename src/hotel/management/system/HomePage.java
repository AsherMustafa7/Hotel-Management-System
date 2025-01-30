package hotel.management.system;
//import java.sql.ResultSet;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;



public class HomePage extends JFrame implements ActionListener{
        JTextField textField1;
        JPasswordField textField2;
        JButton b1,b2,b3;
    HomePage(){
        
        
        setLocation(-10,-0);
        setSize(1930,1280);
        setVisible(true);
        setLayout(null);

        // JLabel lable3= new JLabel("Login");
        // lable3.setBounds(650, 600, 300,60);
        // lable3.setFont(new Font("Tahoma",Font.BOLD,48));
        // lable3.setForeground(Color.WHITE);
        // getContentPane().setBackground(Color.black);
        // add(lable3);

        ImageIcon iii= new ImageIcon("C:\\Users\\acer\\OneDrive\\Desktop\\making final app\\Trying\\src\\icon\\Designer__1_-removebg-preview.png");
        Image ii =iii.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon imageIcon4=new ImageIcon(ii);
        JLabel lable55= new JLabel(imageIcon4);
        lable55.setBounds(10,10, 100,100);
        add(lable55);
        


        // ImageIcon addDrivers =new ImageIcon("C:\\Users\\acer\\OneDrive\\Desktop\\making final app\\Trying\\src\\icon\\driver.png");
        // Image i4 =addDrivers.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        // ImageIcon imageIcon4=new ImageIcon(i4);
        // JLabel label4=new JLabel(imageIcon4);
        // label4.setBounds(880,290,200,200);
        // add(label4);

        ImageIcon i4= new ImageIcon("C:\\Users\\acer\\OneDrive\\Desktop\\thirtysix hour hackathon\\Thirtysix\\src\\icon\\home.png");
        JLabel lable9= new JLabel(i4);
        lable9.setBounds(600,28, i4.getIconWidth(), i4.getIconHeight());
        add(lable9);

        ImageIcon i5= new ImageIcon("C:\\Users\\acer\\OneDrive\\Desktop\\thirtysix hour hackathon\\Thirtysix\\src\\icon\\helo2.gif");
        JLabel lable10= new JLabel(i5);
        lable10.setBounds(630,400, i5.getIconWidth(), i5.getIconHeight());
        add(lable10);

        ImageIcon i6= new ImageIcon("C:\\Users\\acer\\OneDrive\\Desktop\\thirtysix hour hackathon\\Thirtysix\\src\\icon\\helo1.gif");
        JLabel lable11= new JLabel(i6);
        lable11.setBounds(932,400, i6.getIconWidth(), i6.getIconHeight());
        add(lable11);

        ImageIcon i7= new ImageIcon("C:\\Users\\acer\\OneDrive\\Desktop\\thirtysix hour hackathon\\Thirtysix\\src\\icon\\helo3.gif");
        JLabel lable12= new JLabel(i7);
        lable12.setBounds(1250,400, i7.getIconWidth(), i7.getIconHeight());
        add(lable12);






















        JLabel lable4= new JLabel("The Maple Garden");
        lable4.setBounds(100, 10, 700,59);
        lable4.setFont(new Font("Tahoma",Font.BOLD,48));
        lable4.setForeground(Color.white);
        add(lable4);

        JLabel lable1= new JLabel("About Us");
        lable1.setBounds(970, 300, 100,45);
        lable1.setFont(new Font("Tahoma",Font.BOLD,16));
        lable1.setForeground(new Color(52,23,17));
        getContentPane().setBackground(Color.black);
        add(lable1);

        JLabel lable6= new JLabel("Login");
        lable6.setBounds(670, 300, 100,45);
        lable6.setFont(new Font("Tahoma",Font.BOLD,16));
        lable6.setForeground(new Color(52,23,17));
        getContentPane().setBackground(Color.black);
        add(lable6);

        JLabel lable7= new JLabel("Sign Up");
        lable7.setBounds(1280, 300, 100,45);
        lable7.setFont(new Font("Tahoma",Font.BOLD,16));
        lable7.setForeground(new Color(52,23,17));
        getContentPane().setBackground(Color.black);
        add(lable7);

        

        JLabel lable2= new JLabel("Home page");
        lable2.setBounds(650, 10, 400,60);
        lable2.setFont(new Font("Tahoma",Font.BOLD,48));

        lable2.setForeground(Color.WHITE);
        add(lable2);
        // textField1= new JTextField();
        // textField2= new JPasswordField();
        // textField1.setBounds(730,390,150,30);
        // textField2.setBounds(730,440,150,30);
        // textField1.setForeground(Color.white);
        // textField2.setForeground(Color.WHITE);
        // textField1.setFont(new Font("Tahoma",Font.PLAIN,15));
        
        // add(textField1);
        // add(textField2);
        // textField1.setBackground(new Color(165,190,153));
        // textField2.setBackground(new Color(165,190,153));

        // ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("Icon/nzxt-gif.gif"));
        // Image i1= imageIcon.getImage().getScaledInstance(255,255,Image.SCALE_DEFAULT);
        // ImageIcon scaledImageIcon = new ImageIcon(i1);
        // JLabel lable = new JLabel(scaledImageIcon);
        // lable.setBounds(315,-30,255,300);
        // add(lable);

        

        b1=new JButton("More Options");
        b1.setBounds(630,650,120,30);
        b1.setFont(new Font("Serif",Font.PLAIN,15));
        b1.setBackground(new Color(165,190,153));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2=new JButton("About Us");
        b2.setBounds(950,650,120,30);
        b2.setFont(new Font("Serif",Font.PLAIN,15));
        b2.setBackground(new Color(165,190,153));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        b3=new JButton("Sign up");
        b3.setBounds(1250,650,120,30);
        b3.setFont(new Font("Serif",Font.PLAIN,15));
        b3.setBackground(new Color(165,190,153));
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        add(b3);


        JLabel lable8 = new JLabel("<html><i>\"Travel brings power and love back into your life.\" - Rumi<br><br>" + //
                        "\"A journey of a thousand miles begins with a single step.\" - Lao Tzu<br><br>" + //
                        "\"The world is a book, and those who do not travel read only one page.\" - Saint Augustine<br><br>" + //
                        "\"Take only memories, leave only footprints.\" - Chief Seattle<br><br>" + //
                        "\"Live with no excuses and travel with no regrets.\" - Oscar Wilde<br><br>" + //
                        "\"To travel is to live.\" - Hans Christian Andersen<br><br>" + //
                        "\"The gladdest moment in human life is a departure into unknown lands.\" - Sir Richard Burton<br><br>" + //
                        "\"Not all those who wander are lost.\" - J.R.R. Tolkien<br><br>" + //
                        "\"Adventure is worthwhile in itself.\" - Amelia Earhart<br><br>" + //
                        "\"Wherever you go, go with all your heart.\" - Confucius</i></html>");
        lable8.setBounds(10, -200, 450,1280);
        lable8.setFont(new Font("Tahoma",Font.BOLD,15));

        lable8.setForeground(new Color(52,23,17));
        getContentPane().setBackground(Color.black);
        add(lable8);


        JPanel transparentImagePane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                // Load the image
                ImageIcon imageIcon = new ImageIcon("C:\\Users\\acer\\OneDrive\\Desktop\\thirtysix hour hackathon\\Thirtysix\\src\\icon\\05b4fbc3f169175e6deb97b3977175b6.jpg");
                Image image = imageIcon.getImage();

                // Create a 50% opaque (transparent) Graphics2D object
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f)); // 50% opacity

                // Draw the image with opacity 
                g2d.drawImage(image, 0, 0, this);
                g2d.dispose();
            }
        };
        transparentImagePane.setBounds(-200, -200, 2000,1280); // Set the size and position of the panel
        transparentImagePane.setOpaque(false); // Ensure the background is transparent
        add(transparentImagePane);

        
        JPanel transparentImagePane2 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                // Load the image
                ImageIcon imageIcon2 = new ImageIcon("C:\\Users\\acer\\OneDrive\\Desktop\\thirtysix hour hackathon\\Thirtysix\\src\\icon\\05b4fbc3f169175e6deb97b3977175b6.jpg");
                Image image = imageIcon2.getImage();

                // Create a 50% opaque (transparent) Graphics2D object
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f)); // 50% opacity

                // Draw the image with opacity 
                g2d.drawImage(image, 0, 0, this);
                g2d.dispose();
            }
        };
        transparentImagePane2.setBounds(550,300,300,400); // Set the size and position of the panel
        transparentImagePane2.setOpaque(false); // Ensure the background is transparent
        add(transparentImagePane2);

       

        JPanel transparentImagePane3 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                // Load the image
                ImageIcon imageIcon3 = new ImageIcon("C:\\Users\\acer\\OneDrive\\Desktop\\thirtysix hour hackathon\\Thirtysix\\src\\icon\\05b4fbc3f169175e6deb97b3977175b6.jpg");
                Image image = imageIcon3.getImage();

                // Create a 50% opaque (transparent) Graphics2D object
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f)); // 50% opacity

                // Draw the image with opacity 
                g2d.drawImage(image, 0, 0, this);
                g2d.dispose();
            }
        };
        transparentImagePane3.setBounds(860,300,300,400); // Set the size and position of the panel
        transparentImagePane3.setOpaque(false); // Ensure the background is transparent
        add(transparentImagePane3);

        JPanel transparentImagePane4 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                // Load the image
                ImageIcon imageIcon4 = new ImageIcon("C:\\Users\\acer\\OneDrive\\Desktop\\thirtysix hour hackathon\\Thirtysix\\src\\icon\\05b4fbc3f169175e6deb97b3977175b6.jpg");
                Image image = imageIcon4.getImage();

                // Create a 50% opaque (transparent) Graphics2D object
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f)); // 50% opacity

                // Draw the image with opacity 
                g2d.drawImage(image, 0, 0, this);
                g2d.dispose();
            }
        };
        transparentImagePane4.setBounds(1170,300,300,400); // Set the size and position of the panel
        transparentImagePane4.setOpaque(false); // Ensure the background is transparent
        add(transparentImagePane4);

        

        ImageIcon i3= new ImageIcon("C:\\Users\\acer\\OneDrive\\Desktop\\making final app\\Trying\\src\\icon\\Designer (24).jpeg");
        JLabel lable3= new JLabel(i3);
        lable3.setBounds(0,0, 1920,1280);
        add(lable3);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== b1)
        {
            
            try{
                new Dashboard();
                setVisible(false);

            }catch(Exception E)
            {
                E.printStackTrace();
            }

        }
        else if(e.getSource()== b3){
            try{
                new SignUp();
                setVisible(false);

            }catch(Exception E)
            {
                E.printStackTrace();
            }
        } else if (e.getSource() == b2) { // When About Us button is clicked
            new About(); // Open the About Us page
            setVisible(false);
        }
            
        else{
            System.exit(102);
        }
        
    }



    public static void main(String[] args) {
        new HomePage();
    }

}

