package main;
import GUI.BMR;
import GUI.TDEE;
import GUI.MNW;
import GUI.PercenFat;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;


public class mainFrame extends JFrame {

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

        public void run() {

        mainFrame form = new mainFrame();

        form.getContentPane().setBackground(new Color(0xFFFFFF));
        form.setVisible(true);

                    }

                });

}

        public mainFrame() {

        // Create Form Frame
        setSize(450, 300);
        setLocation(500, 280);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);


        // Create Label

        JLabel label = new JLabel("Body Calculation Formula");
        label.setSize(450, 60);
        label.setBackground(new Color(0xFFB6C1));
        label.setOpaque(true);
        label.setFont(new java.awt.Font("",1, 20));
        label.setHorizontalAlignment ( SwingConstants.CENTER );



        getContentPane().add(label);   

        // Create Button

        JButton btnOpen1 = new JButton("BMR");
        btnOpen1.setBounds(171, 95, 100, 23);
        btnOpen1.setFont(new java.awt.Font("", 1, 13));      
        btnOpen1.setBackground(new Color(0xAB82FF));
        btnOpen1.setBorder ( BorderFactory.createLineBorder ( new Color(0xAB82FF), 2 ) );

        // Create Event for Button
        btnOpen1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {

        // New Form
        BMR form2 = new BMR();
        form2.setVisible(true);

        // Hide Current Form
        setVisible(false);
            }
            });    

        getContentPane().add(btnOpen1); 
        JButton btnOpen2 = new JButton("TDEE");
        btnOpen2.setFont(new java.awt.Font("", 1, 13));      
        btnOpen2.setBackground(new Color(0x87CEFF));
        btnOpen2.setBorder ( BorderFactory.createLineBorder ( new Color(0x87CEFF), 2 ) );
        btnOpen2.setBounds(171, 140, 100, 23);


        // Create Event for Button
        btnOpen2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {

            // New Form
            TDEE form3 = new TDEE();
            form3.setVisible(true);
            // Hide Current Form
            setVisible(false); //กดแล้วหน้าเดิมหายไป
                }
                    });    
            getContentPane().add(btnOpen2);   


            JButton btnOpen3 = new JButton("Ideal Calories");
            btnOpen3.setBounds(171, 185, 100, 23);
            btnOpen3.setFont(new java.awt.Font("", 1, 13));      
            btnOpen3.setBackground(new Color(0xEEDD82));
            btnOpen3.setBorder ( BorderFactory.createLineBorder ( new Color(0xEEDD82), 2 ) );
           
            // Create Event for Button
            btnOpen3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {

                // New Form
                MNW form4 = new MNW();
                form4.setVisible(true);
                // Hide Current Form
                setVisible(false);

                        }
                });    
                getContentPane().add(btnOpen3); 


                JButton btnOpen4 = new JButton("Percent Fat");
                btnOpen4.setBounds(171, 230, 100, 23);
                btnOpen4.setFont(new java.awt.Font("", 1, 13));      
                btnOpen4.setBackground(new Color(0xE9967A));
                btnOpen4.setBorder ( BorderFactory.createLineBorder ( new Color(0xE9967A), 2 ) );
               
                // Create Event for Button
                btnOpen4.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
    
                    // New Form
                    PercenFat form5 = new PercenFat();
                    form5.setVisible(true);
                    // Hide Current Form
                    setVisible(false);
    
                            }
                    });    
                    getContentPane().add(btnOpen4); 
        }   
}



   

