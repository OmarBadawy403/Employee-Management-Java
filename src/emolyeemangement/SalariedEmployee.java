
package emolyeemangement;

public class SalariedEmployee extends Employee implements Displayable{

    double salary, bouns , deduction;

    public SalariedEmployee() {
    }

    public SalariedEmployee(double salary, double bouns, double deduction, String Name, int SSN, String Address, Gender sex) {
        super(Name, SSN, Address, sex);
        this.salary = salary;
        this.bouns = bouns;
        this.deduction = deduction;
    }
    
    

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    public double getDeduction() {
        return deduction;
    }

    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }
    
    
    @Override
    public double earning() {
        return (salary + bouns )- deduction;
        
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
        return "SalariedEmployee{" + "salary=" + salary + ", bouns=" + bouns + ", deduction=" + deduction + '}';
    }
    
    
    
    
    
}
