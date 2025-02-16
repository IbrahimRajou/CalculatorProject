
import java.awt.*;
import java.awt.event.MouseListener;
import javax.swing.*;

public class HomeFrame extends javax.swing.JFrame {
    
    Color barColor = new Color(33,28,28);
    Color lightWhite = new Color(255, 255, 255, 50);
    Hover ho = new Hover();
    JButton homeButton, voacherButton,settingsButton,helpSupportButton,notificationButton,cartButton,profileButton,heartButton;
    JPanel jPanel1,jPanel2,jPanel3;
    JLabel searchLabel;
    public HomeFrame() {
        // frame
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            System.out.println("ii");
        }
        this.setLayout(null);
        this.setBounds(250,50,800,600);
        
        // Panels
        jPanel1 = new JPanel();
        jPanel1.setBackground(barColor);
        jPanel1.setBounds(0,0,60,600);
        jPanel1.setLayout(null);
        jPanel2 = new JPanel();
        jPanel2.setBackground(barColor);
        jPanel2.setBounds(60, 0, 750, 50);
        jPanel2.setLayout(null);
        jPanel3 = new JPanel();
        jPanel3.setBackground(new Color(56,64,109));
        jPanel3.setBounds(60,50,760,550);
        
        // Icons
        ImageIcon homeIcon = new ImageIcon("C:\\Users\\Ibrah\\OneDrive\\Desktop\\ProjectDesigns\\home.png"); 
        ImageIcon voacherIcon = new ImageIcon("C:\\Users\\Ibrah\\OneDrive\\Desktop\\ProjectDesigns\\voacher.png"); 
        ImageIcon settingsIcon = new ImageIcon("C:\\Users\\Ibrah\\OneDrive\\Desktop\\ProjectDesigns\\settings.png"); 
        ImageIcon helpSupportIcon = new ImageIcon("C:\\Users\\Ibrah\\OneDrive\\Desktop\\ProjectDesigns\\helpSupport.png"); 
        ImageIcon notificationIcon = new ImageIcon("C:\\Users\\Ibrah\\OneDrive\\Desktop\\ProjectDesigns\\notification.png"); 
        ImageIcon profileIcon = new ImageIcon("C:\\Users\\Ibrah\\OneDrive\\Desktop\\ProjectDesigns\\profile.png"); 
        ImageIcon cartIcon = new ImageIcon("C:\\Users\\Ibrah\\OneDrive\\Desktop\\ProjectDesigns\\cart.png"); 
        ImageIcon heartIcon = new ImageIcon("C:\\Users\\Ibrah\\OneDrive\\Desktop\\ProjectDesigns\\heart.png"); 
        
        // buttons 
            // home button
        Image homeImg = homeIcon.getImage().getScaledInstance(20, 25, Image.SCALE_SMOOTH);
        ImageIcon homeIcon2 = new ImageIcon(homeImg);
        homeButton = new JButton(homeIcon2);
        homeButton.setBounds(15,130,25,25);
        homeButton.setBorderPainted(false);
        homeButton.setFocusPainted(false);
        // homeButton.setContentAreaFilled(true);
        homeButton.setBackground(barColor);
        
            // voacher button
        Image voacherImg = voacherIcon.getImage().getScaledInstance(20, 25, Image.SCALE_SMOOTH);
        ImageIcon voacherIcon2 = new ImageIcon(voacherImg);
        voacherButton = new JButton(voacherIcon2);
        voacherButton.setBounds(15,195,25,25);
        voacherButton.setBorderPainted(false);
        voacherButton.setFocusPainted(false);
        // voacherButton.setContentAreaFilled(true);
        voacherButton.setBackground(barColor);
        
            // settings button
        Image settingsImg = settingsIcon.getImage().getScaledInstance(20, 25, Image.SCALE_SMOOTH);
        ImageIcon settingsIcon2 = new ImageIcon(settingsImg);
        settingsButton = new JButton(settingsIcon2);
        settingsButton.setBounds(15,250,25,25);
        settingsButton.setBorderPainted(false);
        settingsButton.setFocusPainted(false);
        // settingsButton.setContentAreaFilled(false);
        settingsButton.setBackground(barColor);
        
            // helpSupport button
        Image helpSupportImg = helpSupportIcon.getImage().getScaledInstance(20, 25, Image.SCALE_SMOOTH);
        ImageIcon helpSupportIcon2 = new ImageIcon(helpSupportImg);
        helpSupportButton =  new JButton(helpSupportIcon2);
        helpSupportButton.setBounds(15,315,25,25);
        helpSupportButton.setBorderPainted(false);
        helpSupportButton.setFocusPainted(false);
        // helpSupportButton.setContentAreaFilled(false);
        helpSupportButton.setBackground(barColor);
        
            // notification button
        Image notificationImg = notificationIcon.getImage().getScaledInstance(20, 25, Image.SCALE_SMOOTH);
        ImageIcon notificationIcon2 = new ImageIcon(notificationImg);
        notificationButton=  new JButton(notificationIcon2);
        notificationButton.setBounds(15,450,25,25);
        notificationButton.setBorderPainted(false);
        notificationButton.setFocusPainted(false);
        // notificationButton.setContentAreaFilled(false);
        notificationButton.setBackground(barColor);
        
            // profile button
        Image profileImg = profileIcon.getImage().getScaledInstance(20, 25, Image.SCALE_SMOOTH);
        ImageIcon profileIcon2 = new ImageIcon(profileImg);
        profileButton =  new JButton(profileIcon2);
        profileButton.setBounds(15,505,25,25);
        profileButton.setBorderPainted(false);
        profileButton.setFocusPainted(false);
        // profileButton.setContentAreaFilled(false);
        profileButton.setBackground(barColor);
        
            // profile button
        Image cartImg = cartIcon.getImage().getScaledInstance(20, 25, Image.SCALE_SMOOTH);
        ImageIcon cartIcon2 = new ImageIcon(cartImg);
        cartButton =  new JButton(cartIcon2);
        cartButton.setBounds(675,10,25,25);
        cartButton.setBorderPainted(false);
        cartButton.setFocusPainted(false);
        // cartButton.setContentAreaFilled(false);
        cartButton.setBackground(barColor);
        
            // heart button
        Image heartImg = heartIcon.getImage().getScaledInstance(17, 17, Image.SCALE_SMOOTH);
        ImageIcon heartIcon2 = new ImageIcon(heartImg);
        heartButton =  new JButton(heartIcon2);
        heartButton.setBounds(630,10,25,25);
        heartButton.setBorderPainted(false);
        heartButton.setFocusPainted(false);
        // heartButton.setContentAreaFilled(false);
        heartButton.setBackground(barColor);
        
        // Label
        searchLabel = new JLabel();
        searchLabel.setBounds(100,10,150,25);

        // Adding to the frame
        this.add(jPanel1);
        this.add(jPanel2);
        this.add(jPanel3);
        jPanel1.add(homeButton);
        jPanel1.add(voacherButton); 
        jPanel1.add(settingsButton); 
        jPanel1.add(helpSupportButton); 
        jPanel1.add(notificationButton); 
        jPanel1.add(profileButton); 
        jPanel2.add(cartButton); 
        jPanel2.add(heartButton);
        homeButton.addMouseListener(ho);
        voacherButton.addMouseListener(ho);
        settingsButton.addMouseListener(ho);
        helpSupportButton.addMouseListener(ho);
        notificationButton.addMouseListener(ho);
        profileButton.addMouseListener(ho);
        cartButton.addMouseListener(ho);
        heartButton.addMouseListener(ho);
        jPanel2.add(searchLabel);

        // frame config 
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        
    }


    private class Hover implements MouseListener{
        @Override
        public void mouseClicked(java.awt.event.MouseEvent e) {
        }

        @Override
        public void mousePressed(java.awt.event.MouseEvent  e) {
        }

        @Override
        public void mouseReleased(java.awt.event.MouseEvent  e) {
        }

        @Override
        public void mouseEntered(java.awt.event.MouseEvent  e) {
            if(e.getSource() == homeButton){
                homeButton.repaint();
                homeButton.setBackground(lightWhite);
                homeButton.repaint();
            }
            else if(e.getSource() == voacherButton){
                voacherButton.repaint();
                voacherButton.setBackground(lightWhite);
                voacherButton.repaint();
            }
            else if(e.getSource() == settingsButton){
                settingsButton.repaint();
                settingsButton.setBackground(lightWhite);
                settingsButton.repaint();
            }
            else if(e.getSource() == profileButton){
                profileButton.repaint();
                profileButton.setBackground(lightWhite);
                profileButton.repaint();
            }
            else if(e.getSource() == notificationButton){
                notificationButton.repaint();
                notificationButton.setBackground(lightWhite);
                notificationButton.repaint();
            }
            else if(e.getSource() == cartButton){
                cartButton.repaint();
                cartButton.setBackground(lightWhite);
                cartButton.repaint();
            }
            else if(e.getSource() == heartButton){
                heartButton.repaint();
                heartButton.setBackground(lightWhite);
                heartButton.repaint();
            }
            else if(e.getSource() == helpSupportButton){
                helpSupportButton.repaint();
                helpSupportButton.setBackground(lightWhite);
                helpSupportButton.repaint();
            }
            jPanel1.repaint();
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent  e) {
            if(e.getSource() == homeButton){
                homeButton.repaint();
                homeButton.setBackground(barColor);
                homeButton.repaint();
            }
            else if(e.getSource() == voacherButton){
                voacherButton.repaint();
                voacherButton.setBackground(barColor);
                voacherButton.repaint();
            }
            else if(e.getSource() == settingsButton){
                settingsButton.repaint();
                settingsButton.setBackground(barColor);
                settingsButton.repaint();
            }
            else if(e.getSource() == profileButton){
                profileButton.repaint();
                profileButton.setBackground(barColor);
                profileButton.repaint();
            }
            else if(e.getSource() == notificationButton){
                notificationButton.repaint();
                notificationButton.setBackground(barColor);
                notificationButton.repaint();
            }
            else if(e.getSource() == cartButton){
                cartButton.repaint();
                cartButton.setBackground(barColor);
                cartButton.repaint();
            }
            else if(e.getSource() == heartButton){
                heartButton.repaint();
                heartButton.setBackground(barColor);
                heartButton.repaint();
            }
            else if(e.getSource() == helpSupportButton){
                helpSupportButton.repaint();
                helpSupportButton.setBackground(barColor);
                helpSupportButton.repaint();
            }
            jPanel1.repaint();
        }
    }
}
