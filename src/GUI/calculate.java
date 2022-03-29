package GUI;


public class calculate {
 
    private double height;
    private double weight;
    private int age;
    private double numac;
    private double calmale;
    private double calfemale;
  
    
    public calculate(){

    }

    // consturcter method
    public calculate(double newHeight,double newWeight,int newAge,double newNumac){
        this.height = newHeight;
        this.weight = newWeight;
        this.age = newAge;
        this.numac = newNumac;

    }

    // getter method
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }

    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public double getNumac() {
        return numac;
    }

    public void setNumac(double numac) {
        this.numac = numac;
    }
   
    
    // setter method   
  
  
    //คำนวณBMRชาย
    public double BMRmale(){
        this.calmale = 66+(13.7*this.weight)+(5*this.height)-(6.8*this.age);
        return calmale;
    }
    //คำนวณBMRหญิง
    public double BMRfemale(){
        this.calfemale = 665+(9.6*this.weight)+(1.8*this.height)-(4.7*this.age);
        
        return calfemale;
    }

    //คำนวณTDEE ชาย
    public double TDEEmale(){
        double TDEEmale = this.calmale * numac  ;
        return TDEEmale;
    }

    //คำนวณ TDEE หญิง
    public double TDEEfemale(){
        double TDEEfemale = this.calfemale * numac;
        return TDEEfemale;
    }


    //Gain weight
    //คำนวณเพิ่มน้ำหนักชาย
    public double GainWeightmale(){
        double GainWeightmale = this.TDEEmale()+500 ; 
        return GainWeightmale;

    }
    //คำนวณเพิ่มน้ำหนักหญิง
    public double GainWeightfemale(){
        double GainWeightfemale = this.TDEEfemale()+500 ; 
        return GainWeightfemale;

    }
    
    //Lose weight
    //คำนวณลดน้ำหนักชาย
    public double LoseWeightmale(){
        double LoseWeightmale = this.TDEEmale()-500 ; 
        return LoseWeightmale;

    }
    //คำนวณลดน้ำหนักหญิง
    public double LoseWeightfemale(){
        double LoseWeightfemale = this.TDEEfemale()-500 ; 
        return LoseWeightfemale;

    }
//คำนวณcalories ของ Carb

    //เพิ่มcarb ชาย
    public double GainWeightmaleCarb(){
        double Carbmale = this.GainWeightmale()*0.55 ; 
        return Carbmale;

    }
    //เพิ่ม carb หญิง
    public double GainWeightfemaleCarb(){
        double Carbfemale = this.GainWeightfemale()*0.55 ; 
        return Carbfemale;

    }

    //ลด Carb ชาย
    public double LoseWeightmaleCarb(){
        double LoseCarbmale = this.LoseWeightmale()*0.55 ; 
        return LoseCarbmale;

    }
    //ลด carb หญิง
    public double LoseWeightfemaleCarb(){
        double LoseCarbfemale = this.LoseWeightfemale()*0.55 ; 
        return LoseCarbfemale;

    }



//Protein
    //เพิ่ม protein ชาย
    public double GainWeightmalePro(){
        double Promale = this.GainWeightmale()*0.15 ; 
        return Promale;

    }
    //เพิ่ม protein หญิง
    public double GainWeightfemalePro(){
        double Profemale = this.GainWeightfemale()*0.15 ; 
        return Profemale;

    }

    //ลด protein ชาย
    public double LoseWeightmalePro(){
        double LosePromale = this.LoseWeightmale()*0.55 ; 
        return LosePromale;

    }
    //ลด protein หญิง
    public double LoseWeightfemalePro(){
        double LoseProfemale = this.LoseWeightfemale()*0.55 ; 
        return LoseProfemale;

    }
//Fat
    //เพิ่ม fat ชาย
    public double GainWeightmaleFat(){
        double Fatmale = this.GainWeightmale()*0.30 ; 
        return Fatmale;

    }
    //เพิ่ม fat หญิง
    public double GainWeightfemaleFat(){
        double Fatfemale = this.GainWeightfemale()*0.30 ; 
        return Fatfemale;

    }

    //ลด fat ชาย
    public double LoseWeightmaleFat(){
        double LoseFatmale = this.LoseWeightmale()*0.30 ; 
        return LoseFatmale;

    }
    //ลด fat หญิง
    public double LoseWeightfemaleFat(){
        double LoseFatfemale = this.LoseWeightfemale()*0.30 ; 
        return LoseFatfemale;

    }


    


//แสดงผล
    //BMR
    public String toStringmale(){
        String text = String.format("%.2f",calmale) ;

        return text;
    }
    public String toStringfemale(){
        String text = String.format("%.2f",calfemale) ;
        return text;
    }
    //TDEE
    public String toStringmaleTDEE(){
        String text = String.format("%.2f",TDEEmale()) ;

        return text;
    }
    public String toStringfemaleTDEE(){
        String text = String.format("%.2f",TDEEfemale()) ;
        return text;
    }
    //Gain weith
    public String toStringGainWeightmale(){
        String text = String.format("%.2f",GainWeightmale()) ;
        return text;
    }
    public String toStringGainWeightfemale(){
        String text = String.format("%.2f",GainWeightfemale()) ;
        return text;
    }
    //Loseweight
    public String toStringLoseWeightmale(){
        String text = String.format("%.2f",LoseWeightmale()) ;
        return text;
    }
    public String toStringLoseWeightfemale(){
        String text = String.format("%.2f",LoseWeightfemale()) ;
        return text;
    }
    //carb
    public String toStringCarbmale(){
        String text = String.format("%.2f",GainWeightmaleCarb()) ;
        return text;
    }
    public String toStringCarbfemale(){
        String text = String.format("%.2f",GainWeightfemaleCarb()) ;
        return text;
    }

    public String toStringLoseCarbmale(){
        String text = String.format("%.2f",LoseWeightmaleCarb()) ;
        return text;
    }
    public String toStringLoseCarbfemale(){
        String text = String.format("%.2f",LoseWeightfemaleCarb()) ;
        return text;
    }
    //Protein
    public String toStringPromale(){
        String text = String.format("%.2f",GainWeightmalePro()) ;
        return text;
    }
    public String toStringProfemale(){
        String text = String.format("%.2f",GainWeightfemalePro()) ;
        return text;
    }

    public String toStringLosePromale(){
        String text = String.format("%.2f",LoseWeightmalePro()) ;
        return text;
    }
    public String toStringLoseProfemale(){
        String text = String.format("%.2f",LoseWeightfemalePro()) ;
        return text;
    }
    //Fat
    public String toStringFatmale(){
        String text = String.format("%.2f",GainWeightmaleFat()) ;
        return text;
    }
    public String toStringFatfemale(){
        String text = String.format("%.2f",GainWeightfemaleFat()) ;
        return text;
    }

    public String toStringLoseFatmale(){
        String text = String.format("%.2f",LoseWeightmaleFat()) ;
        return text;
    }
    public String toStringLoseFatfemale(){
        String text = String.format("%.2f",LoseWeightfemaleFat()) ;
        return text;
    }





}
