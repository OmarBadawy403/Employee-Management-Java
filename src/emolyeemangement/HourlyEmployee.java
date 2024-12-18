
package emolyeemangement;


public class HourlyEmployee extends Employee implements Displayable{
    
   private double hour_rate ;  
   private int no_of_hours;  

    public HourlyEmployee() {
    }

    public HourlyEmployee(double hour_rate, int no_of_hours, String Name, int SSN, String Address, Gender sex) {
        super(Name, SSN, Address, sex);
        this.hour_rate = hour_rate;
        this.no_of_hours = no_of_hours;
    }
   
   
   

    public double getHour_rate() {
        return hour_rate;
    }

    public void setHour_rate(double hour_rate) {
        this.hour_rate = hour_rate;
    }

    public int getNo_of_hours() {
        return no_of_hours;
    }

    public void setNo_of_hours(int no_of_hours) {
        this.no_of_hours = no_of_hours;
    }

    @Override
    public double earning() {
        
        return hour_rate * no_of_hours ;
    }

    @Override
    public void DisplayAllDetails() {
        
        System.out.println(super.toString());
        System.out.println(toString());
    }

    @Override
    public void DisplayAllearning() {
        System.out.println(earning());
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" + "hour_rate=" + hour_rate + ", no_of_hours=" + no_of_hours + '}';
    }
    
    
    
    
}
