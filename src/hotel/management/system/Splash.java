package hotel.management.system;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Splash extends JFrame{
    Splash()//constructor
    {
        getContentPane().setBackground(Color.black); 
        setSize(858,680);
        setVisible(true);
        setLocation(300,80);
        setLayout(null);
        ImageIcon imageIcon= new ImageIcon("C:\\Users\\acer\\OneDrive\\Desktop\\making final app\\Trying\\src\\icon\\output-onlinegiftools.gif");
        JLabel label = new JLabel(imageIcon);
        label.setBounds(0,0,858,680);
        add(label);
        try
        {
            
            Thread.sleep(10000);
            new HomePage();
            setVisible(false);
          

        }catch(Exception e)
        {
            e.printStackTrace();
        }


    }
    public static void main(String[] args) {
        new Splash();
    }

}
