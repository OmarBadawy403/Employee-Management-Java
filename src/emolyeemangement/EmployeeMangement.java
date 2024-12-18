
package emolyeemangement;


public class EmployeeMangement {

   
    public static void main(String[] args) {
        
        
        
        Department d1 = new Department(1,"information System");
        
        
        SalariedEmployee se = new SalariedEmployee(5000, 300, 100, "ahmed", 1200, "Riyadh", Gender.male);
        
        d1.add_employee(se);
        
        HourlyEmployee he = new HourlyEmployee(100, 8, "omar", 1300, "newyork", Gender.male);
        
        d1.add_employee(he);
        
        CommissionEmployee ce = new CommissionEmployee(15000, 0.25, "fatema", 1200, "cairo", Gender.famele);
        
        d1.add_employee(ce);
        
        
        System.out.println(d1.getEmployeeCount());
        
//         d1.print_bisic_data();
         d1.print_all_details();
        
    }
    
}
