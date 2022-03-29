package GUI;

public class Fatcalculate {
    private double weight; //น้ำหนัก
    private double waist; // เอว
    private double wrist; // ข้อมือ
    private double hip; // สะโพก
    private double forearm; //ต้นแขน
   
    



    public  Fatcalculate() {
    
    }

    public  Fatcalculate(double newWeight, double newWaist , double newWrist , double newHip , double newForearm) {
        this.weight = newWeight;
        this.waist = newWaist;
        this.wrist= newWrist;
        this.hip= newHip;
        this.forearm = newForearm;    
    }
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public double getWaist() {
        return waist;
    }



    public void setWaist(double waist) {
        this.waist = waist;
    }

    public double getWrist() {
        return wrist;
    }


    public void setWrist(double wrist) {
        this.wrist = wrist;
    }

    public double getForearm() {
        return forearm;
    }



    public void setForearm(double forearm) {
        this.forearm = forearm;
    }



    public double getHip() {
        return hip;
    }



    public void setHip(double hip) {
        this.hip = hip;
    }

 




    public double Pound(){
        double pound = this.weight * 2.204622;
        return pound;

    }
    public double LBMmale(){
        double factor1 = (Pound()* 1.082)+ 94.42;
        double factor2 = this.waist * 4.15;
        double LBMmale = factor1 - factor2;
        return LBMmale;
    }

    public double BFMmale(){
        double BFMmale = Pound() - LBMmale();
        return BFMmale;

    }
    public double PercentFatmale(){
        double PercentFatmale = (BFMmale() * 100 )/Pound();
        return PercentFatmale;  
    }

    public String toStringPercentFatmale(){
        String text = String.format("%.2f",PercentFatmale()," % ") ;
        return text;
    }



    public double LBMfemale(){
        double factor1 = (Pound()* 0.732)+ 8.987;
        double factor2 = this.wrist / 3.14;
        double factor3 = this.waist * 0.157;
        double factor4 = this.hip * 0.249;
        double factor5 = this.forearm * 0.434;

        double LBMfemale = factor1 + factor2 - factor3 - factor4 + factor5;
        return LBMfemale;
    }

    public double BFMfemale(){
        double BFMfemale = Pound() - LBMfemale();
        return BFMfemale;

    }

    public double PercentFatfemale(){
        double PercentFatfemale = (BFMfemale() * 100 )/Pound();
        return PercentFatfemale;  
    }
    public String toStringPercentFatfemale(){
        String text = String.format("%.2f",PercentFatfemale()," % ") ;
        return text;
    }

    
}

