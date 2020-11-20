package library.management.system;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.border.*;

public class aboutUs extends JFrame{

	private JPanel contentPane;

        public static void main(String[] args) {
            new aboutUs().setVisible(true);			
	}
    
        public aboutUs() {
            
            super("About Us - OOSD Group ");
            
            setBackground(new Color(173, 216, 230));
            setBounds(500, 250, 700, 500);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel l1 = new JLabel("New label");
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/library.jpg"));
            Image i2 = i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l1 = new JLabel(i3);
            l1.setBounds(500, 40, 100, 100);
            contentPane.add(l1);


            JLabel l3 = new JLabel("Library");
            l3.setForeground(new Color(0, 250, 154));
            l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l3.setBounds(160, 40, 150, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Mangement System");
            l4.setForeground(new Color(127, 255, 0));
            l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l4.setBounds(70, 90, 405, 40);
            contentPane.add(l4);

           

            JLabel l6 = new JLabel("Team Members");
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l6.setBounds(70, 198, 600, 35);
            contentPane.add(l6);
            
            JLabel l7 = new JLabel("Anirudha Kulkarni : anirudha.21810568@viit.ac.in");
            l7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l7.setBounds(70, 240, 600, 34);
            contentPane.add(l7);

            JLabel l8 = new JLabel("Yash Mathapati : yash.21810545@viit.ac.in");
            l8.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l8.setBounds(70, 270, 600, 34);
            contentPane.add(l8);
            
            JLabel l9 = new JLabel("Shubham Shinde : shubham.21810417@viit.ac.in");
            l9.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l9.setBounds(70, 300, 600, 34);
            contentPane.add(l9);

            JLabel l10 = new JLabel("Sourabh Shedbale : sourabh.21810727@viit.ac.in");
            l10.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l10.setBounds(70, 330, 600, 34);
            contentPane.add(l10);
            
            JLabel l11 = new JLabel("Go Back");
        	l11.addMouseListener(new MouseAdapter() {
        			@Override
        			public void mouseClicked(MouseEvent e) {
        				setVisible(false);
        				Introduction_Home home = new Introduction_Home();
        				home.setVisible(true);
        			}
        		});
        	l11.setForeground(Color.BLACK);
        	l11.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
        	/*ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/tenth.png"));
                Image i11 = i10.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
                ImageIcon i12 = new ImageIcon(i11);
                l7.setIcon(i12);*/
        	l11.setBounds(40, 30, 72, 33);
        	 contentPane.add(l11);
           
            
            contentPane.setBackground(Color.WHITE);
	}
        

}

