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



public class TDEE extends JFrame{
    public void run() {
        
        TDEE t = new TDEE();
        
        t.setVisible(true);
        
        }

    public TDEE(){
            Dimension screenSize = Toolkit.getDefaultToolkit ( ).getScreenSize ( );

            int x = ( screenSize.width - this.getWidth ( ) ) / 3;

            int y = ( screenSize.height - this.getHeight ( ) ) / 4;

            this.setLocation ( x, y );
            this.setTitle("Total Daily Energy Expenditure"); //ตั้ง title
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//กากบาท = ปิดจอ
            this.setSize(420,420);
            this.setSize(500,550);
            this.getContentPane().setBackground(new Color(0xFFF0F5));

    
            JPanel panel = new JPanel();
            panel.setLayout(null);
            this.add(panel);
     
     
            JLabel titLabel = new JLabel("Total Daily Energy Expenditure");
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
            heightLabel.setBounds(20,130,80,25);
            panel.add(heightLabel);
            getContentPane().add(heightLabel);
            getContentPane().setLayout(null);
            
            JTextField heighTextField = new JTextField();
            heighTextField.setBounds(100,130,80,25);
            heighTextField.setFont(new java.awt.Font("", 1, 13));
            heighTextField.setBorder ( BorderFactory.createLineBorder ( Color.WHITE, 1 ) );
            panel.add(heighTextField);
            getContentPane().add(heighTextField);
            getContentPane().setLayout(null);
     
     
            JLabel weightLabel = new JLabel("weight(kg):");
            weightLabel.setFont(new java.awt.Font("", 1, 13));
            weightLabel.setBounds(20,180,80,25);
            panel.add(weightLabel);
            getContentPane().add(weightLabel);
            getContentPane().setLayout(null);


     
            JTextField weightTextField = new JTextField();
            weightTextField.setBounds(100,180,80,25);
            weightTextField.setFont(new java.awt.Font("", 1, 13));
            weightTextField.setBorder ( BorderFactory.createLineBorder ( Color.WHITE, 1 ) );
            weightTextField.getText();
            panel.add(weightTextField);
            getContentPane().add(weightTextField);
            getContentPane().setLayout(null);
     
            JLabel ageLabel = new JLabel("Age:");
            ageLabel.setFont(new java.awt.Font("", 1, 13));
            ageLabel.setBounds(20,230,80,25);
            panel.add(ageLabel);
            getContentPane().add(ageLabel);
            getContentPane().setLayout(null);
     
            JTextField ageTextField = new JTextField();
            ageTextField.setFont(new java.awt.Font("", 1, 13));
            ageTextField.setBounds(100,230,80,25);
            ageTextField.setBorder ( BorderFactory.createLineBorder ( Color.WHITE, 1 ) );
            panel.add(ageTextField);
            getContentPane().add(ageTextField);
            getContentPane().setLayout(null);
     
     
     
            JLabel activityLabel = new JLabel("Activities: ");
            activityLabel.setFont(new java.awt.Font("", 1, 13));
            activityLabel.setBounds(20,280,80,25);
            panel.add(activityLabel);
            getContentPane().add(activityLabel);
            getContentPane().setLayout(null);
     
            String[] acStrings = { "Sedentary: little or no exercise", 
                                   "Exercise 1-3 times/week", 
                                   "Exercise 4-5 times/week", 
                                   "Intense exercise 6-7 times/week", 
                                   "Very intense exercise daily, or physical job" };
            JComboBox comboBox = new JComboBox(acStrings);
            comboBox.setBackground(new Color(0xFFFFFF));
            comboBox.setBorder ( BorderFactory.createLineBorder ( Color.WHITE, 1 ) );
            comboBox.setSelectedIndex(4);
            comboBox.setBounds(100, 280, 80, 25);
            comboBox.setSize ( 380, 30 );
            panel.add(comboBox);
            getContentPane().add(comboBox);
            getContentPane().setLayout(null);
      
     
            JButton btn1 = new JButton("Calculate");
            btn1.setFont(new java.awt.Font("", 1, 13));
            btn1.setBounds(140, 330, 99, 23);
            btn1.setBackground(new Color(0xD8BFD8));
            btn1.setBorder ( BorderFactory.createLineBorder ( new Color(0xD8BFD8), 2 ) );
            panel.add(btn1);
            getContentPane().add(btn1);
            getContentPane().setLayout(null);

            JTextField resultTDEE = new JTextField();
            resultTDEE.setFont(new java.awt.Font("", 1, 13));
            resultTDEE.setBounds(80,410,80,25);
            resultTDEE.setBorder ( BorderFactory.createLineBorder ( new Color(0xFFFFFF), 2 ) );
            panel.add(resultTDEE);
            getContentPane().add(resultTDEE);
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

             
             double intA =  Double.valueOf(comboBox.getSelectedIndex());
             double numac;
             if(radio1.isSelected() ){  //ถ้าเลือก radio1 เข้าเงื่อนไขนี้ ถ้าเลือกใช้ isSelect
                cal.BMRmale();
                cal.TDEEmale();
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
                   String result = String.valueOf(cal.toStringmaleTDEE());
                   resultTDEE.setText(result);

             }
            else if (radio2.isSelected()){
                cal.BMRfemale();
                cal.TDEEfemale();
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
                   String result = String.valueOf(cal.toStringfemaleTDEE());
                   resultTDEE.setText(result);
                
            
             }

          
                 
             }
     
     
         });
     
       
            JButton btn2 = new JButton("Clear");
            btn2.setFont(new java.awt.Font("", 1, 13));
            btn2.setBounds(260, 330, 99, 23);
            btn2.setBackground(new Color(0xADD8E6));
            btn2.setBorder ( BorderFactory.createLineBorder ( new Color(0xADD8E6), 2 ) );
            panel.add(btn2);
            getContentPane().add(btn2);
            getContentPane().setLayout(null);
            btn2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                   heighTextField.setText("");
                   weightTextField.setText("");
                   ageTextField.setText("");
                   resultTDEE.setText("");
                  
                }
            });
     
         
     
            JLabel resultLabel = new JLabel("Result");
            resultLabel.setBounds(0, 360, 109, 10);
            resultLabel.setFont(new java.awt.Font("", 1, 13));
            resultLabel.setSize(500,40);
            resultLabel.setHorizontalAlignment ( SwingConstants.CENTER );
            resultLabel.setBackground(new Color(0xFFB6C1));
            resultLabel.setOpaque(true);
            panel.add(resultLabel);
            getContentPane().add(resultLabel);
           getContentPane().setLayout(null);
     
     
            JLabel TDEELabel = new JLabel("TDEE:");
            TDEELabel.setFont(new java.awt.Font("", 1, 13));
            TDEELabel.setBounds(20, 410, 80, 25);
            panel.add(TDEELabel);
            getContentPane().add(TDEELabel);
            getContentPane().setLayout(null);


             JButton btnpre = new JButton("Previous");
             btnpre.setFont(new java.awt.Font("", 1, 13));
             btnpre.setBorder ( BorderFactory.createLineBorder ( new Color(0xB4CDCD), 2 ) );
             btnpre.setBackground(new Color(0xB4CDCD));
             btnpre.setBounds(20, 480, 99, 23);
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