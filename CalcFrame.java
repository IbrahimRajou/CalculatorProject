
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;


public class CalcFrame extends JFrame{
    // Components
    private JPanel upperPanel, lowerPanel;
    private JLabel wLabel,rLabel;
    private JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bPlus,bMinus,bTimes,bDivision,bEqual,bErase;
    private Operations o = new Operations();
    private String op = "";
    private double result, n1;
    
    // Constructor
    public CalcFrame(){
        // Frame
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println(e);
        }
        this.setBounds(900,100, 358,420);
        this.setLayout(null);
        
        // Panels
        upperPanel = new JPanel();
        upperPanel.setLayout(null);
        upperPanel.setBackground(Color.GRAY);
        upperPanel.setBounds(0,0,345,150);
        
        lowerPanel = new JPanel();
        lowerPanel.setLayout(null);
        // lowerPanel.setBackground(Color.black);
        lowerPanel.setBounds(0,150,350,235);
        
        // Labels
        rLabel = new JLabel("");
        rLabel.setBounds(0,0,345,50);
        rLabel.setFont(new Font("abc", Font.BOLD, 15));
        
        wLabel = new JLabel("");
        wLabel.setBounds(0,50,345,100);
        wLabel.setFont(new Font("abc", Font.BOLD, 40));
        
        // Buttons
        b7 =  new JButton("7");
        b7.setBounds(5,10,80,50);
        b7.setBackground(Color.white);
        b7.setBorder(BorderFactory.createLineBorder(Color.black,3));
        b7.setFocusPainted(false);
        b7.setContentAreaFilled(false);

        b4 =  new JButton("4");
        b4.setBounds(5,65,80,50);
        b4.setBackground(Color.white);
        b4.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
        b4.setFocusPainted(false);
        b4.setContentAreaFilled(false);

        b1 =  new JButton("1");
        b1.setBounds(5,120,80,50);
        b1.setBackground(Color.white);
        b1.setBorder(BorderFactory.createLineBorder(Color.black, 3));
        b1.setFocusPainted(false);
        b1.setContentAreaFilled(false);

        bPlus =  new JButton("+");
        bPlus.setBounds(5,175,80,50);
        bPlus.setBackground(Color.white);
        bPlus.setBorder(BorderFactory.createLineBorder(Color.black,3));
        bPlus.setFocusPainted(false);
        bPlus.setContentAreaFilled(false);

        b8 =  new JButton("8");
        b8.setBounds(90,10,80,50);
        b8.setBackground(Color.white);
        b8.setBorder(BorderFactory.createLineBorder(Color.black, 3));
        b8.setFocusPainted(false);
        b8.setContentAreaFilled(false);

        b5 =  new JButton("5");
        b5.setBounds(90,65,80,50);
        b5.setBackground(Color.white);
        b5.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
        b5.setFocusPainted(false);
        b5.setContentAreaFilled(false);

        b2 =  new JButton("2");
        b2.setBounds(90,120,80,50);
        b2.setBackground(Color.white);
        b2.setBorder(BorderFactory.createLineBorder(Color.black,3));
        b2.setFocusPainted(false);
        b2.setContentAreaFilled(false);

        b0 =  new JButton("0");
        b0.setBounds(90,175,80,50);
        b0.setBackground(Color.white);
        b0.setBorder(BorderFactory.createLineBorder(Color.black,3));
        b0.setFocusPainted(false);
        b0.setContentAreaFilled(false);
        
        b9 =  new JButton("9");
        b9.setBounds(175,10,80,50);
        b9.setBackground(Color.white);
        b9.setBorder(BorderFactory.createLineBorder(Color.black,3));
        b9.setFocusPainted(false);
        b9.setContentAreaFilled(false);

        b6 =  new JButton("6");
        b6.setBounds(175,65,80,50);
        b6.setBackground(Color.white);
        b6.setBorder(BorderFactory.createLineBorder(Color.black, 3));
        b6.setFocusPainted(false);
        b6.setContentAreaFilled(false);

        b3 =  new JButton("3");
        b3.setBounds(175,120,80,50);
        b3.setBackground(Color.white);
        b3.setBorder(BorderFactory.createLineBorder(Color.black,3));
        b3.setFocusPainted(false);
        b3.setContentAreaFilled(false);

        bMinus =  new JButton("-");
        bMinus.setBounds(175,175,80,50);
        bMinus.setBackground(Color.white);
        bMinus.setBorder(BorderFactory.createLineBorder(Color.black,3));
        bMinus.setFocusPainted(false);
        bMinus.setContentAreaFilled(false);

        bErase =  new JButton("C");
        bErase.setBounds(260,10,80,50);
        bErase.setBackground(Color.white);
        bErase.setBorder(BorderFactory.createLineBorder(Color.black,3));
        bErase.setFocusPainted(false);
        bErase.setContentAreaFilled(false);

        bTimes =  new JButton("x");
        bTimes.setBounds(260,65,80,50);
        bTimes.setBackground(Color.white);
        bTimes.setBorder(BorderFactory.createLineBorder(Color.black,3));
        bTimes.setFocusPainted(false);
        bTimes.setContentAreaFilled(false);

        bDivision =  new JButton("/");
        bDivision.setBounds(260,120,80,50);
        bDivision.setBackground(Color.white);
        bDivision.setBorder(BorderFactory.createLineBorder(Color.black,3));
        bDivision.setFocusPainted(false);
        bDivision.setContentAreaFilled(false);

        bEqual =  new JButton("=");
        bEqual.setBounds(260,175,80,50);
        bEqual.setBackground(Color.BLUE);
        bEqual.setBorder(BorderFactory.createLineBorder(Color.black,3));
        bEqual.setFocusPainted(false);
        bEqual.setContentAreaFilled(false);

        // Adding to the frame
        this.add(upperPanel);
        this.add(lowerPanel);
        upperPanel.add(wLabel); upperPanel.add(rLabel);
        lowerPanel.add(b7); lowerPanel.add(b8); lowerPanel.add(b9); lowerPanel.add(bErase);
        lowerPanel.add(b4); lowerPanel.add(b5); lowerPanel.add(b6); lowerPanel.add(bTimes);
        lowerPanel.add(b1); lowerPanel.add(b2); lowerPanel.add(b3); lowerPanel.add(bDivision);
        lowerPanel.add(bPlus); lowerPanel.add(b0); lowerPanel.add(bMinus); lowerPanel.add(bEqual);
        b0.addActionListener(o); b1.addActionListener(o);
        b2.addActionListener(o); b3.addActionListener(o);
        b4.addActionListener(o); b5.addActionListener(o);
        b6.addActionListener(o); b7.addActionListener(o);
        b8.addActionListener(o); b9.addActionListener(o); 
        bPlus.addActionListener(o); bMinus.addActionListener(o); 
        bTimes.addActionListener(o); bDivision.addActionListener(o); 
        bEqual.addActionListener(o); bErase.addActionListener(o); 
        
        // Frame config
       this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private class Operations implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == b0){
                wLabel.setText(wLabel.getText()+0);
            }
            else if (e.getSource() == b1){
                wLabel.setText(wLabel.getText()+1);
            }
            else if (e.getSource() == b2){
                wLabel.setText(wLabel.getText()+2);
            }
            else if (e.getSource() == b3){
                wLabel.setText(wLabel.getText()+3);
            }
            else if (e.getSource() == b4){
                wLabel.setText(wLabel.getText()+4);
            }
            else if (e.getSource() == b5){
                wLabel.setText(wLabel.getText()+5);
            }
            else if (e.getSource() == b6){
                wLabel.setText(wLabel.getText()+6);
            }
            else if (e.getSource() == b7){
                wLabel.setText(wLabel.getText()+7);
            }
            else if (e.getSource() == b8){
                wLabel.setText(wLabel.getText()+8);
            }
            else if (e.getSource() == b9){
                wLabel.setText(wLabel.getText()+9);
            }
            else if (e.getSource() == bErase){
                n1 = 0;
                result = 0;
                op = "";
                wLabel.setText("");
                rLabel.setText("");
            }
            
            
            
            if(e.getSource() == bPlus){
                try{
                bPlus.setBackground(Color.lightGray);
                n1 = Double.parseDouble(wLabel.getText());
                numbers();
                op = " +";
                wLabel.setText("");
                }
                catch(NumberFormatException a){
                    
                }
            }
            else if (e.getSource() != bPlus){
                bPlus.setBackground(Color.white);
            }
            if(e.getSource() == bTimes){
                try{
                bTimes.setBackground(Color.lightGray);
                n1 = Double.parseDouble(wLabel.getText());
                numbers();
                op = " x";
                wLabel.setText("");
                }
                catch(NumberFormatException a){
                    
                }
            }
            else if (e.getSource() != bTimes){
                bTimes.setBackground(Color.white);
            }
            if(e.getSource() == bDivision){
                try{
                bDivision.setBackground(Color.lightGray);
                n1 = Double.parseDouble(wLabel.getText());
                numbers();
                op = " /";
                wLabel.setText("");
                }
                catch(NumberFormatException a){
                    
                }
            }
            else if (e.getSource() != bDivision){
                bDivision.setBackground(Color.white);
            }
            if(e.getSource() == bMinus){
                bMinus.setBackground(Color.lightGray);
                try{
                n1 = Double.parseDouble(wLabel.getText());
                numbers();
                op = " -";
                wLabel.setText("");
                }
                catch(NumberFormatException a){
                    
                }
            }
            else if (e.getSource() != bMinus){
                bMinus.setBackground(Color.white);
            }
            
            rLabel.setText(result + "" + op);
            
            if (e.getSource() == bEqual){
                try{
                n1 = Double.parseDouble(wLabel.getText());
                numbers();
                wLabel.setText(result + "");
                rLabel.setText("");
                result = 0;
                n1 = 0;
                }
                catch(NumberFormatException a){
                    
                }
            }
            
            
        }
        
    }
    
    public void numbers(){
        try{
        if(op == " +"){
            result = result + Double.parseDouble(wLabel.getText());
        }
        else if (op == " -")
            result = result - Double.parseDouble(wLabel.getText());
        else if (op == " x")
            result = result * Double.parseDouble(wLabel.getText());
        else if (op == " /")
            result = result / Double.parseDouble(wLabel.getText());
        else{
            result = n1;
        }
        }
        catch(NumberFormatException e){
            System.out.println("iii");
        }
    }
}
