package hotel.management.system;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import java.awt.*;
public class SignUp extends JFrame implements ActionListener{
        JTextField textField1;
        JPasswordField textField2;
        JButton b1,b2;
    SignUp(){
        
        
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

        JLabel lable4= new JLabel("Welcome to the Sign up page");
        lable4.setBounds(430, 298, 800,59);
        lable4.setFont(new Font("Tahoma",Font.BOLD,48));
        lable4.setForeground(Color.white);
        getContentPane().setBackground(Color.black);
        add(lable4);

        JLabel lable1= new JLabel("Username");
        lable1.setBounds(600, 390, 100,30);
        lable1.setFont(new Font("Tahoma",Font.BOLD,16));
        lable1.setForeground(Color.WHITE);
        getContentPane().setBackground(Color.black);
        add(lable1);

        

        JLabel lable2= new JLabel("Password");
        lable2.setBounds(600, 440, 100,30);
        lable2.setFont(new Font("Tahoma",Font.BOLD,16));

        lable2.setForeground(Color.WHITE);
        add(lable2);
        textField1= new JTextField();
        textField2= new JPasswordField();
        textField1.setBounds(730,390,150,30);
        textField2.setBounds(730,440,150,30);
        textField1.setForeground(Color.white);
        textField2.setForeground(Color.WHITE);
        textField1.setFont(new Font("Tahoma",Font.PLAIN,15));
        
        add(textField1);
        add(textField2);
        textField1.setBackground(new Color(165,190,153));
        textField2.setBackground(new Color(165,190,153));

        // ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("Icon/nzxt-gif.gif"));
        // Image i1= imageIcon.getImage().getScaledInstance(255,255,Image.SCALE_DEFAULT);
        // ImageIcon scaledImageIcon = new ImageIcon(i1);
        // JLabel lable = new JLabel(scaledImageIcon);
        // lable.setBounds(315,-30,255,300);
        // add(lable);

        b1=new JButton("Sign Up");
        b1.setBounds(620,500,120,30);
        b1.setFont(new Font("Serif",Font.PLAIN,15));
        b1.setBackground(new Color(165,190,133));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2=new JButton("Cancel");
        b2.setBounds(750,500,120,30);
        b2.setFont(new Font("Serif",Font.PLAIN,15));
        b2.setBackground(new Color(165,190,133));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        JPanel transparentImagePane2 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                // Load the image
                ImageIcon imageIcon5 = new ImageIcon("C:\\Users\\acer\\OneDrive\\Desktop\\making final app\\Trying\\src\\icon\\Designer (18).jpeg");
                Image image = imageIcon5.getImage();

                // Create a 50% opaque (transparent) Graphics2D object
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.9f)); // 50% opacity

                // Draw the image with opacity 
                g2d.drawImage(image, 0, 0, this);
                g2d.dispose();
            }
        };
        transparentImagePane2.setBounds(-20, -20, 1920,1280); // Set the size and position of the panel
        transparentImagePane2.setOpaque(false); // Ensure the background is transparent
        add(transparentImagePane2);
        


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String user =textField1.getText();
                String pass = new String(textField2.getPassword());

            try {
                Von c = new Von();
                String query = "INSERT INTO login (username, password) VALUES ('" + user + "', '" + pass + "')";
                c.statement.executeUpdate(query); 
                JOptionPane.showMessageDialog(null, "Sign Up Successful");
                new Login();
                setVisible(false); 
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else if (e.getSource() == b2) {
            new HomePage();
            setVisible(false); 
        }
    }
    public static void main(String[] args) {
        new SignUp();
    }

}
