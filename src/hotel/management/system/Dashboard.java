package hotel.management.system;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Dashboard extends JFrame implements ActionListener
{
    JButton rec,add;
    JButton b2;
    Dashboard(){
        super("Hotel Management System");//super has to be used at the very top of the consturctor



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


        rec= new JButton("Reception");
        rec.setBounds(425,510,140,30);
        rec.setFont(new Font("Tahoma",Font.BOLD,15));
        rec.setBackground(new Color(223, 79, 14));
        rec.setForeground(Color.white);
        rec.addActionListener(this);
        panel.add(rec);
        
        add= new JButton("Admin");
        add.setBounds(880,510,140,30);
        add.setFont(new Font("Tahoma",Font.BOLD,15));
        add.setBackground(new Color(223, 79, 14));
        add.setForeground(Color.white);
        add.addActionListener(this);
        panel.add(add);



        


        //-----------------------------------------------------------------------------------------------------------------------------


        b2=new JButton("Back");
        b2.setBounds(1370,850,120,30);
        b2.setFont(new Font("Tahoma",Font.PLAIN,15));
        b2.setBackground(new Color(93,46,29));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        panel.add(b2);
        //-----------------------------------------------------------------------------------------------------------------------------




 
        


        ImageIcon receptIcon = new ImageIcon("C:\\Users\\acer\\OneDrive\\Desktop\\making final app\\Trying\\src\\icon\\output-onlinegiftools (24).gif");
        Image i3 = receptIcon.getImage().getScaledInstance(200,195,Image.SCALE_DEFAULT);
        ImageIcon receptIcon2=new ImageIcon(i3);
        JLabel lable3 = new JLabel(receptIcon2);
        lable3.setBounds(400,300,200,195);
        panel.add(lable3);



        ImageIcon adminImage = new ImageIcon("C:\\Users\\acer\\OneDrive\\Desktop\\making final app\\Trying\\src\\icon\\output-onlinegiftools (25).gif");
        Image i2 = adminImage.getImage().getScaledInstance(200,195,Image.SCALE_DEFAULT);
        ImageIcon adminIcon1=new ImageIcon(i2);
        JLabel lable2 = new JLabel(adminIcon1);
        lable2.setBounds(850,300,200,195);
       panel. add(lable2);

        ImageIcon imageIcon =new ImageIcon("C:\\Users\\acer\\OneDrive\\Desktop\\making final app\\Trying\\src\\icon\\hotel-art-4k-mp-1366x768.jpg");
        Image i1 =imageIcon.getImage().getScaledInstance(1540,950,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(i1);
        JLabel label=new JLabel(imageIcon1);
        label.setBounds(0,0,1540,950);
        add(label);


        



        setLayout(null);
        setLocation(-10,0 );
        setSize(1950,1090);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==rec)
        {   
            new Reception();
            setVisible(false);
        }
        else if(e.getSource()==add)
        {
            new Login();
            setVisible(false);
        }
        else if(e.getSource()==b2)
        {
            new HomePage();
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new Dashboard();
    }

}
