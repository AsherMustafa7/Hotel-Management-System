package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame {

    public About() {
        // Set the window title
        setTitle("About Us");

        // Set the window size and location
        setSize(800, 900);  // Adjust the height as needed for the content
        setLocationRelativeTo(null); // Center the window
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close the About window but keep the HomePage active
        setLayout(null);

        // Add "About Us" title
        JLabel titleLabel = new JLabel("About Us");
        titleLabel.setBounds(300, 20, 400, 50);
        titleLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
        titleLabel.setForeground(Color.DARK_GRAY);
        add(titleLabel);

        // Add the description of "About Us" information
        JLabel aboutText = new JLabel("<html>" +
                "<p><b>The Garden of Maples</b> is a unique hotel blending Japanese tradition " +
                "with modern elegance, offering guests a tranquil escape surrounded by nature. " +
                "Our mission is to create an experience of harmony, comfort, and cultural richness " +
                "where every detail is thoughtfully curated.</p>" +
                "<br><br>" +
                "<p>Established to celebrate the beauty of Japanese heritage, <b>The Garden of Maples</b> " +
                "features architecture inspired by classic Japanese inns, along with vibrant maple gardens " +
                "that create a stunning seasonal backdrop. Guests can enjoy the peaceful ambiance " +
                "and immerse themselves in authentic Japanese experiences.</p>" +
                "<br><br>" +
                "<p>We invite you to join us at <b>The Garden of Maples</b> for a memorable journey, " +
                "where tradition meets tranquility.</p>" +
                "</html>");

        aboutText.setBounds(50, 100, 700, 400);
        aboutText.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(aboutText);

        // Add Contact Us label
        JLabel label8 = new JLabel("Contact Us");
        label8.setBounds(30, 660, 800, 100);
        label8.setFont(new Font("Tahoma", Font.BOLD, 40));
        label8.setForeground(Color.WHITE);
        add(label8);

        // Add social media icons
        addSocialMediaIcon("Thirtysix/src/icon/instagram.png", 258, 698, "https://www.instagram.com/mediflux_official?igsh=MzRlODBiNWFlZA==");
        addSocialMediaIcon("C:\\Users\\acer\\OneDrive\\Desktop\\thirtysix hour hackathon\\Thirtysix\\src\\icon\\twitter.png", 295, 698, "https://x.com/mediflux_off?t=GGFElWh1W3mc-tZkBJnCJQ&s=08");
        addSocialMediaIcon("C:\\Users\\acer\\OneDrive\\Desktop\\thirtysix hour hackathon\\Thirtysix\\src\\icon\\facebook-app-symbol.png", 325, 698, "https://www.facebook.com/share/LAfc3pTHy23eJYRn/");
        addSocialMediaIcon("C:\\Users\\acer\\OneDrive\\Desktop\\thirtysix hour hackathon\\Thirtysix\\src\\icon\\whatsapp.png", 355, 698, "https://web.whatsapp.com/");

        // Add a "Back" button to close the About window and return to the HomePage
        JButton backButton = new JButton("Back");
        backButton.setBounds(350, 800, 100, 40);
        backButton.setFont(new Font("Serif", Font.PLAIN, 16));
        backButton.setBackground(new Color(165, 190, 153));
        backButton.setForeground(Color.WHITE);
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==backButton)
                {
                    new HomePage();
                }
                else{
                    dispose();
                }
            }
        });
        add(backButton);

        // Set the window to be visible
        setVisible(true);
    }

    // Method to add social media icons
    private void addSocialMediaIcon(String iconPath, int x, int y, String url) {
        ImageIcon originalIcon = new ImageIcon(iconPath);
        ImageIcon hoverIcon = new ImageIcon(iconPath); // Same icon; adjust if necessary
        JLabel iconLabel = new JLabel(originalIcon);
        iconLabel.setBounds(x, y, originalIcon.getIconWidth(), originalIcon.getIconHeight());
        add(iconLabel);

        addHoverEffectToIcon(iconLabel, originalIcon, hoverIcon);

        iconLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                openWebpage(url);
            }
        });
    }

    // Hover effect for the icons
    private void addHoverEffectToIcon(JLabel label, ImageIcon originalIcon, ImageIcon hoverIcon) {
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                label.setIcon(hoverIcon); // Change icon on hover
                label.setSize(label.getWidth() + 10, label.getHeight() + 5); // Increase size on hover
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label.setIcon(originalIcon); // Reset to original icon
                label.setSize(label.getWidth() - 10, label.getHeight() - 5); // Reset to original size
            }
        });
    }

    // Method to open webpage
    private void openWebpage(String url) {
        try {
            Desktop.getDesktop().browse(new java.net.URI(url));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new About(); // Run the About page as a standalone window for testing
    }
}
