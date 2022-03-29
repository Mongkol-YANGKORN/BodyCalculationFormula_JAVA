package GUI;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import main.mainFrame;

import javax.swing.JComboBox;
import javax.swing.BorderFactory;



public class MNW extends JFrame{
    public void run(){
        MNW mnw = new MNW();
        mnw.setVisible(true);
    }
    public MNW(){
        Dimension screenSize = Toolkit.getDefaultToolkit ( ).getScreenSize ( );
            int x = ( screenSize.width - this.getWidth ( ) ) / 3;
            int y = ( screenSize.height - this.getHeight ( ) ) / 4;
            this.setLocation ( x, y );
            this.setTitle("Ideal Calories Calculate"); //ตั้ง title
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//กากบาท = ปิดจอ
            this.setSize(500,650);
            this.getContentPane().setBackground(new Color(0xFFF0F5));

            
            JPanel panel = new JPanel();
            panel.setLayout(null);
            this.add(panel);
     
     
            JLabel titLabel = new JLabel("Ideal Calories Calculate");
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
     
         
     
            JLabel heightLabel = new JLabel("Height(cm):");
            heightLabel.setSize(400, 20);
            heightLabel.setFont(new java.awt.Font("", 1, 13));
            heightLabel.setBounds(20,115,80,25);
            panel.add(heightLabel);
            getContentPane().add(heightLabel);
            getContentPane().setLayout(null);

            
            JTextField heighTextField = new JTextField();
            heighTextField.setBounds(100,115,80,25);
            heighTextField.setFont(new java.awt.Font("", 1, 13));
            heighTextField.setBorder ( BorderFactory.createLineBorder ( Color.WHITE, 1 ) );
            panel.add(heighTextField);
            getContentPane().add(heighTextField);
            getContentPane().setLayout(null);
     
     
            JLabel weightLabel = new JLabel("weight(kg):");
            weightLabel.setFont(new java.awt.Font("", 1, 13));
            weightLabel.setBounds(185,115,80,25);
            panel.add(weightLabel);
            getContentPane().add(weightLabel);
            getContentPane().setLayout(null);


     
            JTextField weightTextField = new JTextField();
            weightTextField.setBounds(265,115,80,25);
            weightTextField.setFont(new java.awt.Font("", 1, 13));
            weightTextField.setBorder ( BorderFactory.createLineBorder ( Color.WHITE, 1 ) );
            weightTextField.getText();
            panel.add(weightTextField);
            getContentPane().add(weightTextField);
            getContentPane().setLayout(null);


     
            JLabel ageLabel = new JLabel("Age:");
            ageLabel.setFont(new java.awt.Font("", 1, 13));
            ageLabel.setBounds(350,115,80,25);
            panel.add(ageLabel);
            getContentPane().add(ageLabel);
            getContentPane().setLayout(null);


     
            JTextField ageTextField = new JTextField();
            ageTextField.setFont(new java.awt.Font("", 1, 13));
            ageTextField.setBounds(385,115,80,25);
            ageTextField.setBorder ( BorderFactory.createLineBorder ( Color.WHITE, 1 ) );
            panel.add(ageTextField);
            getContentPane().add(ageTextField);
            getContentPane().setLayout(null);
     
     
     
            JLabel activityLabel = new JLabel("Activities: ");
            activityLabel.setFont(new java.awt.Font("", 1, 13));
            activityLabel.setBounds(20,155,80,25);
            panel.add(activityLabel);
            getContentPane().add(activityLabel);
            getContentPane().setLayout(null);

     
            String[] acStrings = { "Sedentary: little or no exercise", 
                                   "Exercise 1-3 times/week", 
                                   "Exercise 4-5 times/week", 
                                   "Intense exercise 6-7 times/week", 
                                   "Very intense exercise daily, or physical job" };
            JComboBox comboBox = new JComboBox(acStrings);
            comboBox.setBorder ( BorderFactory.createLineBorder ( new Color(0xFFFFFF), 2 ) );
            comboBox.setSelectedIndex(4);
            comboBox.setBackground(new Color(0xFFFFFF));
            comboBox.setBounds(100, 155, 80, 25);
            comboBox.setSize ( 380, 30 );
            panel.add(comboBox);
            getContentPane().add(comboBox);
            getContentPane().setLayout(null);

      
     
            JButton btn1 = new JButton("Calculate");
            btn1.setFont(new java.awt.Font("", 1, 14));
            btn1.setBounds(140, 195, 99, 23);
            btn1.setBackground(new Color(0xD8BFD8));
            btn1.setBorder ( BorderFactory.createLineBorder ( new Color(0xD8BFD8), 2 ) );
            panel.add(btn1);
            getContentPane().add(btn1);
            getContentPane().setLayout(null);


        //แสดงผล calories
            JTextField resultTDEE = new JTextField();
            resultTDEE.setFont(new java.awt.Font("", 1, 13));
            resultTDEE.setBounds(85,230,80,25);
            resultTDEE.setBorder ( BorderFactory.createLineBorder ( new Color(0xFFFFFF), 2 ) );
            panel.add(resultTDEE);
            getContentPane().add(resultTDEE);
            getContentPane().setLayout(null);



        //แสดงผล calories เพิ่มน้ำหนัก
            JTextField resultGain = new JTextField();
            resultGain.setFont(new java.awt.Font("", 1, 13));
            resultGain.setBounds(85,315,80,25);
            resultGain.setBorder ( BorderFactory.createLineBorder ( new Color(0xFFFFFF), 2 ) );
            panel.add(resultGain);
            getContentPane().add(resultGain);
            getContentPane().setLayout(null);
            

        //แสดงผล carb เพิ่มน้ำหนัก
            JTextField resultCarb = new JTextField();
            resultCarb.setFont(new java.awt.Font("", 1, 13));
            resultCarb.setBounds(90,350,80,25);
            resultCarb.setBorder ( BorderFactory.createLineBorder ( new Color(0xFFFFFF), 2 ) );
            panel.add(resultCarb);
            getContentPane().add(resultCarb);
            getContentPane().setLayout(null);


        //แสดงผล Protein เพิ่มน้ำหนัก    
            JTextField resultPro = new JTextField();
            resultPro.setFont(new java.awt.Font("", 1, 13));
            resultPro.setBounds(260,350,80,25);
            resultPro.setBorder ( BorderFactory.createLineBorder ( new Color(0xFFFFFF), 2 ) );
            panel.add(resultPro);
            getContentPane().add(resultPro);
            getContentPane().setLayout(null);


        //แสดงผล Fat เพิ่มน้ำหนัก
            JTextField resultFat = new JTextField();
            resultFat.setFont(new java.awt.Font("", 1, 13));
            resultFat.setBounds(405,350,80,25);
            resultFat.setBorder ( BorderFactory.createLineBorder ( new Color(0xFFFFFF), 2 ) );
            panel.add(resultFat);
            getContentPane().add(resultFat);
            getContentPane().setLayout(null);


        //แสดงผล calories ลดน้ำหนัก    
            JTextField resultLose = new JTextField();
            resultLose.setFont(new java.awt.Font("", 1, 13));
            resultLose.setBounds(85,440,80,25);
            resultLose.setBorder ( BorderFactory.createLineBorder ( new Color(0xFFFFFF), 2 ) );
            panel.add(resultLose);
            getContentPane().add(resultLose);
            getContentPane().setLayout(null);


        //แสดงผล carb ลดน้ำหนัก
            JTextField resultCarb2 = new JTextField();
            resultCarb2.setFont(new java.awt.Font("", 1, 13));
            resultCarb2.setBounds(90,480,80,25);
            resultCarb2.setBorder ( BorderFactory.createLineBorder ( new Color(0xFFFFFF), 2 ) );
            panel.add(resultCarb2);
            getContentPane().add(resultCarb2);
            getContentPane().setLayout(null);

        
        //แสดงผล Protein ลดน้ำหนัก    
            JTextField resultPro2 = new JTextField();
            resultPro2.setFont(new java.awt.Font("", 1, 13));
            resultPro2.setBounds(260,480,80,25);
            resultPro2.setBorder ( BorderFactory.createLineBorder ( new Color(0xFFFFFF), 2 ) );
            panel.add(resultPro2);
            getContentPane().add(resultPro2);
            getContentPane().setLayout(null);

        
        //แสดงผล Fat ลดน้ำหนัก
            JTextField resultFat2 = new JTextField();
            resultFat2.setFont(new java.awt.Font("", 1, 13));
            resultFat2.setBounds(405,480,80,25);
            resultFat2.setBorder ( BorderFactory.createLineBorder ( new Color(0xFFFFFF), 2 ) );
            panel.add(resultFat2);
            getContentPane().add(resultFat2);
            getContentPane().setLayout(null);

     
            
        //กดปุ่มแล้วเป็นไง ทดสอบเฉยๆ
           btn1.addActionListener(new ActionListener() {
     
             public void actionPerformed(ActionEvent evt) {
                 //warning
                if(heighTextField.getText().isEmpty() || weightTextField.getText().isEmpty() || ageTextField.getText().isEmpty() ){
                    JFrame frame = new JFrame();
                    JOptionPane.showMessageDialog(frame, "Please ensure compliance!",
                    "BMR", JOptionPane.WARNING_MESSAGE);
                    getContentPane().add(frame);
                    getContentPane().setLayout(null);
                  }
             //create ob
             calculate cal = new calculate();
             cal.setWeight(Double.parseDouble(weightTextField.getText())); //ส่งค่าไปset ใน calculate
             cal.setHeight(Double.parseDouble(heighTextField.getText()));
             cal.setAge(Integer.parseInt(ageTextField.getText()));


             
        // intA = Index ของ combobox
             double intA =  Double.valueOf(comboBox.getSelectedIndex());
             double numac;
             if(radio1.isSelected() ){  //ถ้าเลือก radio1 เข้าเงื่อนไขนี้ ถ้าเลือกใช้ isSelect
                //เรียกmethod
                cal.BMRmale();
                cal.TDEEmale();
                cal.GainWeightmale();
                cal.GainWeightmale();
                cal.LoseWeightmale();
                if(intA == 0){
                    numac = 1.2;
                    cal.setNumac(numac); //ส่งค่า numac ไป set
                   }
                    else if (intA == 1){
                    numac = 1.375; 
                    cal.setNumac(numac);
                   }
                   else if (intA == 2){
                       numac = 1.55; 
                       cal.setNumac(numac);
                   }
                   else if (intA == 3){
                       numac = 1.725; 
                       cal.setNumac(numac);
                   }
                   else if (intA == 4){
                       numac = 1.9; 
                       cal.setNumac(numac);
                   }


            //แสดงผลใน JTextfeild
                   String result = String.valueOf(cal.toStringmaleTDEE());
                   resultTDEE.setText(result);
                   String result2 = String.valueOf(cal.toStringGainWeightmale());
                   resultGain.setText(result2);
                   String result3 = String.valueOf(cal.toStringLoseWeightmale());
                   resultLose.setText(result3);
                   String result4 = String.valueOf(cal.toStringCarbmale());
                   resultCarb.setText(result4);
                   String result5 = String.valueOf(cal.toStringLoseCarbmale());
                   resultCarb2.setText(result5);
                   String result6 = String.valueOf(cal.toStringPromale());
                   resultPro.setText(result6);
                   String result7 = String.valueOf(cal.toStringLosePromale());
                   resultPro2.setText(result7);
                   String result8 = String.valueOf(cal.toStringFatmale());
                   resultFat.setText(result8);
                   String result9 = String.valueOf(cal.toStringLoseFatmale());
                   resultFat2.setText(result9);

             }
            else if (radio2.isSelected()){
                cal.BMRfemale();
                cal.TDEEfemale();
                cal.GainWeightfemale();
                cal.GainWeightfemale();
                cal.LoseWeightfemale();
                if(intA == 0){
                    numac = 1.2;
                    cal.setNumac(numac);
                   }
                    else if (intA == 1){
                    numac = 1.375; 
                    cal.setNumac(numac);
                   }
                   else if (intA == 2){
                       numac = 1.55; 
                       cal.setNumac(numac);
                   }
                   else if (intA == 3){
                       numac = 1.725; 
                       cal.setNumac(numac);
                   }
                   else if (intA == 4){
                       numac = 1.9; 
                       cal.setNumac(numac);
                   }
            //แสดงผลใน JTextfeild
                   String result = String.valueOf(cal.toStringfemaleTDEE());
                   resultTDEE.setText(result);
                   String result2 = String.valueOf(cal.toStringGainWeightfemale());
                   resultGain.setText(result2);
                   String result3 = String.valueOf(cal.toStringLoseWeightfemale());
                   resultLose.setText(result3);
                   String result4 = String.valueOf(cal.toStringCarbfemale());
                   resultCarb.setText(result4);
                   String result5 = String.valueOf(cal.toStringLoseCarbfemale());
                   resultCarb2.setText(result5);
                   String result6 = String.valueOf(cal.toStringProfemale());
                   resultPro.setText(result6);
                   String result7 = String.valueOf(cal.toStringLoseProfemale());
                   resultPro2.setText(result7);
                   String result8 = String.valueOf(cal.toStringFatfemale());
                   resultFat.setText(result8);
                   String result9 = String.valueOf(cal.toStringLoseFatfemale());
                   resultFat2.setText(result9);
                
            
             }

                 
             }
     
         });


     
         //กดปุ่ม clear แล้วเป็นไง
            JButton btn2 = new JButton("Clear");
            btn2.setFont(new java.awt.Font("", 1, 13));
            btn2.setBounds(260, 195, 99, 23);
            btn2.setBackground(new Color(0xADD8E6));
            btn2.setBorder ( BorderFactory.createLineBorder ( new Color(0xADD8E6), 2 ) );
            panel.add(btn2);
            getContentPane().add(btn2);
            getContentPane().setLayout(null);
            btn2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                   //set ให้เป็นค่าว่าง
                   heighTextField.setText("");
                   weightTextField.setText("");
                   ageTextField.setText("");
                   resultTDEE.setText("");
                   resultGain.setText("");
                   resultLose.setText("");
                   resultCarb.setText("");
                   resultCarb2.setText("");
                   resultPro.setText("");
                   resultPro2.setText("");
                   resultFat.setText("");
                   resultFat2.setText("");
                  
                }
            });
                 

            
            JLabel CalLabel = new JLabel("Calories: ");
            CalLabel.setFont(new java.awt.Font("", 1, 13));
            CalLabel.setBounds(20, 230, 80, 25);
            panel.add(CalLabel);
            getContentPane().add(CalLabel);
            getContentPane().setLayout(null);


            JLabel GainLabel = new JLabel("Gain Weight");
            GainLabel.setBounds(0, 270, 109, 10);
            GainLabel.setFont(new java.awt.Font("", 1, 16));
            GainLabel.setSize(500,30);
            GainLabel.setHorizontalAlignment ( SwingConstants.CENTER );
            GainLabel.setBackground(new Color(0xFFA07A));
            GainLabel.setOpaque(true);
            panel.add(GainLabel);
            getContentPane().add(GainLabel);
            getContentPane().setLayout(null);


            JLabel CalLabel2 = new JLabel("Calories:");
            CalLabel2.setFont(new java.awt.Font("", 1, 13));
            CalLabel2.setBounds(20, 315, 80, 25);
            panel.add(CalLabel2);
            getContentPane().add(CalLabel2);
            getContentPane().setLayout(null);


            JLabel CarbLabel = new JLabel("Carb(55%):");
            CarbLabel.setFont(new java.awt.Font("", 1, 13));
            CarbLabel.setBounds(20, 350, 80, 25);
            panel.add(CarbLabel);
            getContentPane().add(CarbLabel);
            getContentPane().setLayout(null);



            JLabel ProLabel = new JLabel("Protein(15%):");
            ProLabel.setFont(new java.awt.Font("", 1, 12));
            ProLabel.setBounds(175, 350, 80, 25);
            ProLabel.setSize(300,20);
            panel.add(ProLabel);
            getContentPane().add(ProLabel);
            getContentPane().setLayout(null);



            JLabel FatLabel = new JLabel("Fat(30%):");
            FatLabel.setFont(new java.awt.Font("", 1, 13));
            FatLabel.setBounds(345, 350, 80, 25);
            panel.add(FatLabel);
            getContentPane().add(FatLabel);
            getContentPane().setLayout(null);



            JLabel LoseLabel = new JLabel("Lose Weight");
            LoseLabel.setBounds(0, 395, 109, 10);
            LoseLabel.setFont(new java.awt.Font("", 1, 16));
            LoseLabel.setSize(500,30);
            LoseLabel.setHorizontalAlignment ( SwingConstants.CENTER );
            LoseLabel.setBackground(new Color(0xFFA07A));
            LoseLabel.setOpaque(true);
            panel.add(LoseLabel);
            getContentPane().add(LoseLabel);
            getContentPane().setLayout(null);



            JLabel CalLabel3 = new JLabel("Calories:");
            CalLabel3.setFont(new java.awt.Font("", 1, 13));
            CalLabel3.setBounds(20, 440, 80, 25);
            panel.add(CalLabel3);
            getContentPane().add(CalLabel3);
            getContentPane().setLayout(null);




            JLabel CarbLabel2 = new JLabel("Carb(55%):");
            CarbLabel2.setFont(new java.awt.Font("", 1, 13));
            CarbLabel2.setBounds(20, 480, 80, 25);
            panel.add(CarbLabel2);
            getContentPane().add(CarbLabel2);
            getContentPane().setLayout(null);




            JLabel ProLabel2 = new JLabel("Protein(15%):");
            ProLabel2.setFont(new java.awt.Font("", 1, 13));
            ProLabel2.setBounds(175, 480, 80, 25);
            ProLabel2.setSize(300,20);
            panel.add(ProLabel2);
            getContentPane().add(ProLabel2);
            getContentPane().setLayout(null);



            JLabel FatLabel2 = new JLabel("Fat(30%):");
            FatLabel2.setFont(new java.awt.Font("", 1, 13));
            FatLabel2.setBounds(345, 480, 80, 25);
            panel.add(FatLabel2);
            getContentPane().add(FatLabel2);
            getContentPane().setLayout(null);

            
            //ปุ่ม Previous
             JButton btnpre = new JButton("Previous");
             btnpre.setFont(new java.awt.Font("", 1, 16));
             btnpre.setBorder ( BorderFactory.createLineBorder ( new Color(0xB4CDCD), 2 ) );
             btnpre.setBackground(new Color(0xB4CDCD));
             btnpre.setBounds(20, 550, 99, 23);
            // Create Event for Button

             btnpre.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent evt) {
            // New Form

             mainFrame form4 = new mainFrame();

             form4.setVisible(true);
             setVisible(false);

}

});    
            getContentPane().add(btnpre); 

    }


}
