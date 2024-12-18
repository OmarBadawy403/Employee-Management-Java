
package emolyeemangement;

public class CommissionEmployee extends Employee implements Displayable{
 
    private double gross_sales , commission_rate ; 

    public CommissionEmployee() {
    }

    public CommissionEmployee(double gross_sales, double commission_rate, String Name, int SSN, String Address, Gender sex) {
        super(Name, SSN, Address, sex);
        this.gross_sales = gross_sales;
        this.commission_rate = commission_rate;
    }
    
    
    

    public double getGross_sales() {
        return gross_sales;
    }

    public void setGross_sales(double gross_sales) {
        this.gross_sales = gross_sales;
    }

    public double getCommission_rate() {
        return commission_rate;
    }

    public void setCommission_rate(double commission_rate) {
        this.commission_rate = commission_rate;
    }

    @Override
    public double earning() {
        
        return gross_sales * commission_rate ; 
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
        return "CommissionEmployee{" + "gross_sales=" + gross_sales + ", commission_rate=" + commission_rate + '}';
    }
    
    
    
}
