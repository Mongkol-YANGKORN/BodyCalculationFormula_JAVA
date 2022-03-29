package GUI;
import main.mainFrame;

import main.mainFrame;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;

public class PercenFat extends JFrame{


    public void run(){

        PercenFat f = new PercenFat();


        f.setVisible(true);



    }

    public PercenFat(){
        Dimension screenSize = Toolkit.getDefaultToolkit ( ).getScreenSize ( );

        int x = ( screenSize.width - this.getWidth ( ) ) / 3;

        int y = ( screenSize.height - this.getHeight ( ) ) / 4;

        this.setLocation ( x, y );
        this.setTitle("Percen Body Fat"); //ตั้ง title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//กากบาท = ปิดจอ
        this.setSize(500,550);
        this.getContentPane().setBackground(new Color(0xFFF0F5)); //เปลี่ยนสีbg
        
    

        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
 
        JLabel titLabel = new JLabel("Percent Body Fat");
        //titLabel.setBounds(150, 5, 109, 10);
        titLabel.setSize(500, 70);
        titLabel.setFont(new java.awt.Font("",1, 20));
        titLabel.setHorizontalAlignment ( SwingConstants.CENTER );
        titLabel.setBackground(new Color(0xFFB6C1));
        titLabel.setOpaque(true);
        panel.add(titLabel);
        getContentPane().add(titLabel);
        getContentPane().setLayout(null);

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setFont(new java.awt.Font("", 1, 13));
        genderLabel.setBounds(20,80,80,25);
        panel.add(genderLabel);
        getContentPane().add(genderLabel);
        getContentPane().setLayout(null);
        
 
        final JRadioButton radio1 = new JRadioButton("male");
        radio1.setFont(new java.awt.Font("", 1, 13));
        radio1.setBounds(90,80,80,25);
        radio1.setBackground(new Color(0xFFF0F5));
        panel.add(radio1);
        final JRadioButton radio2 = new JRadioButton("female");
        radio2.setFont(new java.awt.Font("", 1, 13));
        radio2.setBounds(180,80,80,25);
        radio2.setBackground(new Color(0xFFF0F5));
        panel.add(radio2);

        ButtonGroup  genderButton = new ButtonGroup();
            genderButton.add(radio1);
            genderButton.add(radio2);
            getContentPane().add(radio1);
            getContentPane().setLayout(null);
            getContentPane().add(radio2);
            getContentPane().setLayout(null);

        JLabel weightLabel = new JLabel("weight(kg):");
            weightLabel.setFont(new java.awt.Font("", 1, 13));
            weightLabel.setBounds(20,120,80,25);
            panel.add(weightLabel);
            getContentPane().add(weightLabel);
            getContentPane().setLayout(null);
        
        JTextField weighTextField = new JTextField();
            weighTextField.setBounds(100,120,80,25);
            weighTextField.setFont(new java.awt.Font("", 1, 13));
            weighTextField.setBorder ( BorderFactory.createLineBorder ( Color.WHITE, 1 ) );
            panel.add(weighTextField);
            getContentPane().add(weighTextField);
            getContentPane().setLayout(null);
        
        JLabel WaistLabel = new JLabel("Waist Circumference(Inches):"); //รอบเอว
            WaistLabel.setFont(new java.awt.Font("", 1, 13));
            WaistLabel.setBounds(20,160,80,25);
            WaistLabel.setSize(200, 14);;
            panel.add(WaistLabel);
            getContentPane().add(WaistLabel);
            getContentPane().setLayout(null);
        
        JTextField WaistTextField = new JTextField();
            WaistTextField.setBounds(230,160,80,25);
            WaistTextField.setFont(new java.awt.Font("", 1, 13));
            WaistTextField.setBorder ( BorderFactory.createLineBorder ( Color.WHITE, 1 ) );
            panel.add(WaistTextField);
            getContentPane().add(WaistTextField);
            getContentPane().setLayout(null);

        
        JLabel WristLabel = new JLabel("Wrist Circumference(Inches):"); //รอบเข้อมือ
            WristLabel.setFont(new java.awt.Font("", 1, 13));
            WristLabel.setBounds(20,200,80,25);
            WristLabel.setSize(200, 14);;
            panel.add(WristLabel);
            getContentPane().add(WristLabel);
            getContentPane().setLayout(null);
        
        JTextField WristTextField = new JTextField();
            WristTextField.setBounds(230,200,80,25);
            WristTextField.setFont(new java.awt.Font("", 1, 13));
            WristTextField.setBorder ( BorderFactory.createLineBorder ( Color.WHITE, 1 ) );
            panel.add(WristTextField);
            getContentPane().add(WristTextField);
            getContentPane().setLayout(null);



            
        JLabel HipLabel = new JLabel("Hip Circumference(Inches):"); //สะโพก
            HipLabel.setFont(new java.awt.Font("", 1, 13));
            HipLabel.setBounds(20,240,80,25);
            HipLabel.setSize(200, 14);;
            panel.add(HipLabel);
            getContentPane().add(HipLabel);
            getContentPane().setLayout(null);
    
        JTextField HipTextField = new JTextField();
            HipTextField.setBounds(230,240,80,25);
            HipTextField.setFont(new java.awt.Font("", 1, 13));
            HipTextField.setBorder ( BorderFactory.createLineBorder ( Color.WHITE, 1 ) );
            panel.add(HipTextField);
            getContentPane().add(HipTextField);
            getContentPane().setLayout(null);



                        
        JLabel ForearmLabel = new JLabel("Forearm Circumference(Inches):"); //ต้นแขน
            ForearmLabel.setFont(new java.awt.Font("", 1, 12));
            ForearmLabel.setBounds(20,280,80,25);
            ForearmLabel.setSize(200, 14);
            panel.add(ForearmLabel);
            getContentPane().add(ForearmLabel);
            getContentPane().setLayout(null);

        JTextField ForearmTextField = new JTextField();
            ForearmTextField.setBounds(230,280,80,25);
            ForearmTextField.setFont(new java.awt.Font("", 1, 13));
            ForearmTextField.setBorder ( BorderFactory.createLineBorder ( Color.WHITE, 1 ) );
            panel.add(ForearmTextField);
            getContentPane().add(ForearmTextField);
            getContentPane().setLayout(null);




        JLabel resultFatLabel = new JLabel("Percent Body Fat (%): ");
            resultFatLabel.setBounds(20, 420, 80,25);
            resultFatLabel.setFont(new java.awt.Font("", 1, 13));
            resultFatLabel.setSize(200, 20);
            panel.add(resultFatLabel);
            getContentPane().add(resultFatLabel);
           getContentPane().setLayout(null);

        JTextField resultFat = new JTextField();
            resultFat.setFont(new java.awt.Font("", 1, 13));
            resultFat.setBounds(170,420,80,25);
            resultFat.setSize(150, 30);
            resultFat.setBorder ( BorderFactory.createLineBorder ( new Color(0xFFFFFF), 2 ) );
            panel.add(resultFat);
            getContentPane().add(resultFat);
            getContentPane().setLayout(null);
            BMR cal = new BMR();
               

        JButton btn1 = new JButton("Calculate");
            btn1.setFont(new java.awt.Font("", 1, 13));
            btn1.setBounds(140, 320 , 99, 23);
            btn1.setBackground(new Color(0xD8BFD8));
            btn1.setBorder ( BorderFactory.createLineBorder ( new Color(0xD8BFD8), 2 ) );
            panel.add(btn1);
            getContentPane().add(btn1);
            getContentPane().setLayout(null);

        btn1.addActionListener(new ActionListener(){

            Fatcalculate cal = new Fatcalculate();
            public void actionPerformed(ActionEvent evt){
               if(weighTextField.getText().isEmpty() || WaistTextField.getText().isEmpty() || WristTextField.getText().isEmpty() || HipTextField.getText().isEmpty() || ForearmTextField.getText().isEmpty()){
                JFrame frame = new JFrame();
                JOptionPane.showMessageDialog(frame, "Please ensure compliance!",
                "Percent Body Fat", JOptionPane.WARNING_MESSAGE);
                getContentPane().add(frame);
                getContentPane().setLayout(null);
               } 
               //ส่งค่าไป set ให้ calculator
               cal.setWeight(Double.parseDouble(weighTextField.getText()));
               cal.setWaist(Double.parseDouble(WaistTextField.getText()));
               cal.setWrist(Double.parseDouble(WristTextField.getText()));
               cal.setHip(Double.parseDouble(HipTextField.getText()));
               cal.setForearm(Double.parseDouble(ForearmTextField.getText()));

                if(radio1.isSelected() ){  //ถ้าเลือก radio1 เข้าเงื่อนไขนี้ ถ้าเลือกใช้ isSelect
                    cal.PercentFatmale();
                    String result = String.valueOf(cal.toStringPercentFatmale());
                    resultFat.setText(result);

             }
                else if (radio2.isSelected()){
                    cal.PercentFatfemale();
                    String result = String.valueOf(cal.toStringPercentFatfemale());
                    resultFat.setText(result);
  
            
             }


             }


        });



        JLabel resultLabel = new JLabel("Result");
            resultLabel.setBounds(0, 360, 109, 10);
            resultLabel.setFont(new java.awt.Font("", 1, 16));
            resultLabel.setSize(500,40);
            resultLabel.setHorizontalAlignment ( SwingConstants.CENTER );
            resultLabel.setBackground(new Color(0xFFB6C1));
            resultLabel.setOpaque(true);
            panel.add(resultLabel);
            getContentPane().add(resultLabel);
            getContentPane().setLayout(null);


         //กดปุ่ม clear แล้วเป็นไง
         JButton btn2 = new JButton("Clear");
         btn2.setFont(new java.awt.Font("", 1, 14));
         btn2.setBounds(260, 320 , 99, 23);
         btn2.setBackground(new Color(0xADD8E6));
         btn2.setBorder ( BorderFactory.createLineBorder ( new Color(0xADD8E6), 2 ) );
         panel.add(btn2);
         getContentPane().add(btn2);
         getContentPane().setLayout(null);
         btn2.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                //set ให้เป็นค่าว่าง
                weighTextField.setText("");
                WaistTextField.setText("");
                WristTextField.setText("");
                HipTextField.setText("");
                ForearmTextField.setText("");
                resultFat.setText("");
             
               
             }
         });

         JButton btnpre = new JButton("Previous");
             btnpre.setFont(new java.awt.Font("", 1, 14));
             btnpre.setBorder ( BorderFactory.createLineBorder ( new Color(0xB4CDCD), 2 ) );
             btnpre.setBackground(new Color(0xB4CDCD));
             btnpre.setBounds(20, 480, 99, 23);
// Create Event for Button

             btnpre.addActionListener(new ActionListener() {

             public void actionPerformed(ActionEvent evt) {

// New Form

             mainFrame form5 = new mainFrame();

             form5.setVisible(true);
             setVisible(false);


}

});    
            getContentPane().add(btnpre); 



    }



}
