package GUI;
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



public class BMR extends JFrame{ 
    
    public void run() {
        
        BMR b = new BMR();
        
        b.setVisible(true);
        
        }
    

    public BMR(){
        Dimension screenSize = Toolkit.getDefaultToolkit ( ).getScreenSize ( );

        // set layout window page on screen
        int x = ( screenSize.width - this.getWidth ( ) ) / 3; 

        int y = ( screenSize.height - this.getHeight ( ) ) / 4;

        this.setLocation ( x, y );
        this.setTitle("Basal Metabolic Rate"); //ตั้ง title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//กากบาท = ปิดจอ
        this.setSize(500,550);
        this.getContentPane().setBackground(new Color(0xFFF0F5)); //เปลี่ยนสีbg
        
    

        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
 
        JLabel titLabel = new JLabel("BASAL METABOLIC RATE");
        //titLabel.setBounds(150, 5, 109, 10);
        titLabel.setSize(500, 70);
        titLabel.setFont(new java.awt.Font("",1, 20));
        titLabel.setHorizontalAlignment ( SwingConstants.CENTER );
        titLabel.setBackground(new Color(0xFFB6C1));
        titLabel.setOpaque(true);
        panel.add(titLabel);
        getContentPane().add(titLabel);
        getContentPane().setLayout(null);


        // sex label
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setFont(new java.awt.Font("", 1, 13));
        genderLabel.setBounds(20,80,80,25);
        panel.add(genderLabel);


        //radiobox sex
        final JRadioButton radio1 = new JRadioButton("male");
        radio1.setFont(new java.awt.Font("", 1, 13));
        radio1.setBounds(90,80,80,25);
        radio1.setBackground(new Color(0xFFF0F5));
        panel.add(radio1);

        final JRadioButton radio2 = new JRadioButton("female");
        //radio2.setSize(500, 100);
        radio2.setFont(new java.awt.Font("", 1, 13));
        radio2.setBounds(180,80,80,25);
        radio2.setBackground(new Color(0xFFF0F5));
        panel.add(radio2);
        
        //กดเลือกได้ 1
        ButtonGroup  genderButton = new ButtonGroup();
        genderButton.add(radio1);
        genderButton.add(radio2);
        getContentPane().add(radio1);
        getContentPane().setLayout(null);
        getContentPane().add(radio2);
        getContentPane().setLayout(null);
        getContentPane().add(genderLabel);
        getContentPane().setLayout(null);

       
        //รับค่าส่วนสูง
        JLabel heightLabel = new JLabel("Height(cm):");
        
        heightLabel.setSize(400, 20);
        heightLabel.setFont(new java.awt.Font("", 1, 13));
        heightLabel.setBounds(20,130,80,25);
        panel.add(heightLabel);
 
        JTextField heighTextField = new JTextField();
          
        heighTextField.setBounds(100,130,80,25);
         
        getContentPane().add(heighTextField);
        heighTextField.setFont(new java.awt.Font("", 1, 13));
        heighTextField.setBorder ( BorderFactory.createLineBorder ( Color.WHITE, 1 ) );
        heighTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });
       
        panel.add(heighTextField);
        getContentPane().add(heightLabel);
        getContentPane().setLayout(null);
        getContentPane().add(heighTextField);
        getContentPane().setLayout(null);
 



        //น้ำหนัก
        JLabel weightLabel = new JLabel("Weight(kg):");
        weightLabel.setFont(new java.awt.Font("", 1, 13));
        weightLabel.setBounds(20,180,80,25);
        panel.add(weightLabel);



       JTextField weightTextField = new JTextField();
       weightTextField.setBounds(100,180,80,25);
       weightTextField.setFont(new java.awt.Font("", 1, 13));
       weightTextField.setBorder ( BorderFactory.createLineBorder ( Color.WHITE, 1 ) );
       weightTextField.getText();
       weightTextField.addActionListener(new java.awt.event.ActionListener() {
       public void actionPerformed(java.awt.event.ActionEvent evt) {
            actionPerformed(evt);
        }
        });
       panel.add(weightTextField);
       getContentPane().add(weightLabel);
       getContentPane().setLayout(null);
       getContentPane().add(weightTextField);
       getContentPane().setLayout(null);



       //อายุ
       JLabel ageLabel = new JLabel("Age:");
       ageLabel.setFont(new java.awt.Font("", 1, 13));
       ageLabel.setBounds(20,230,80,25);
       panel.add(ageLabel);

       JTextField ageTextField = new JTextField();
       ageTextField.setFont(new java.awt.Font("", 1, 13));
       ageTextField.setBounds(100,230,80,25);
       ageTextField.setBorder ( BorderFactory.createLineBorder ( Color.WHITE, 1 ) );
       ageTextField.addActionListener(new java.awt.event.ActionListener() {
       public void actionPerformed(java.awt.event.ActionEvent evt) {
            actionPerformed(evt);
        }
       
        });
       panel.add(ageTextField);
       getContentPane().add(ageLabel);
       getContentPane().setLayout(null);
       getContentPane().add(ageTextField);
       getContentPane().setLayout(null);


        // calculate button
       JButton btn1 = new JButton("Calculate");
       btn1.setFont(new java.awt.Font("", 1, 13));
       btn1.setBounds(140, 280, 99, 23);
       btn1.setBackground(new Color(0xD8BFD8));
       btn1.setBorder ( BorderFactory.createLineBorder ( new Color(0xD8BFD8), 2 ) );
       panel.add(btn1);
      
       getContentPane().add(btn1);
       getContentPane().setLayout(null);



//กดปุ่มแล้วเป็นไง ทดสอบเฉยๆ
            JTextField resultBMR = new JTextField();
            resultBMR.setFont(new java.awt.Font("", 1, 13));
            resultBMR.setBounds(80,360,80,25);
            panel.add(resultBMR);
            resultBMR.setBorder ( BorderFactory.createLineBorder ( new Color(0xFFFFFF), 2 ) );
    
            getContentPane().add(resultBMR);
            getContentPane().setLayout(null);
            
            btn1.addActionListener(new ActionListener() {
                
                
            calculate cal = new calculate(); //สร้างob

            public void actionPerformed(ActionEvent e) {
                //warning
                if(heighTextField.getText().isEmpty() || weightTextField.getText().isEmpty() || ageTextField.getText().isEmpty() ){
                    JFrame frame = new JFrame();
                    JOptionPane.showMessageDialog(frame, "Please ensure compliance!",
                    "BMR", JOptionPane.WARNING_MESSAGE);
                    getContentPane().add(frame);
                    getContentPane().setLayout(null);
                  }
            //ส่งค่าไป set ให้ calculator
            cal.setWeight(Double.parseDouble(weightTextField.getText())); //ส่งค่าไปset ใน calculate
            cal.setHeight(Double.parseDouble(heighTextField.getText()));
            cal.setAge(Integer.parseInt(ageTextField.getText()));
            

            if(radio1.isSelected() ){  //ถ้าเลือก radio1 เข้าเงื่อนไขนี้ ถ้าเลือกใช้ isSelect
                cal.BMRmale();
                String result = String.valueOf(cal.toStringmale());
                resultBMR.setText(result);

             }
            else if (radio2.isSelected()){
                cal.BMRfemale();
                String result = String.valueOf(cal.toStringfemale());

                resultBMR.setText(result);
            
             }
             
         
                
            }
    
    
        });
        
    
  
       JButton btn2 = new JButton("Clear");
       btn2.setFont(new java.awt.Font("", 1, 13));
       btn2.setBounds(260, 280, 99, 23);
       btn2.setBackground(new Color(0xADD8E6));
       btn2.setBorder ( BorderFactory.createLineBorder ( new Color(0xADD8E6), 2 ) );
       panel.add(btn2);
       getContentPane().add(btn2);
       getContentPane().setLayout(null);
       
        btn2.addActionListener(new java.awt.event.ActionListener() {  //กดปุ่มเคลีย
        public void actionPerformed(java.awt.event.ActionEvent evt) {
           heighTextField.setText("");
           weightTextField.setText("");
           ageTextField.setText("");
           resultBMR.setText("");
          
        }
    });
       

    

       JLabel resultLabel = new JLabel("RESULT");
       resultLabel.setBounds(0, 310, 109, 10);
       resultLabel.setFont(new java.awt.Font("", 1, 16));
       resultLabel.setSize(500,40);
       resultLabel.setHorizontalAlignment ( SwingConstants.CENTER );
       resultLabel.setBackground(new Color(0xFFB6C1));
       resultLabel.setOpaque(true);
       panel.add(resultLabel);
       getContentPane().add(resultLabel);
       getContentPane().setLayout(null);


       JLabel BMRLabel = new JLabel("BMR:");
       BMRLabel.setFont(new java.awt.Font("", 1, 13));
       BMRLabel.setBounds(20, 360, 80, 25);
       panel.add(BMRLabel);
       getContentPane().add(BMRLabel);
       getContentPane().setLayout(null);

       


       JButton btnpre = new JButton("Previous");
       btnpre.setFont(new java.awt.Font("", 1, 16));
       btnpre.setBorder ( BorderFactory.createLineBorder ( new Color(0xB4CDCD), 2 ) );
       btnpre.setBackground(new Color(0xB4CDCD));
       btnpre.setBounds(20, 430, 99, 23);
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