/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emolyeemangement;

import java.util.ArrayList;


public class Department {
    
    int dno ;  
    String dname;
    ArrayList <Employee> emplist ;

    public Department() {
    }

    public Department(int dno, String dname) {
        this.dno = dno;
        this.dname = dname;
       emplist = new ArrayList <Employee> ();
    }

    
    
    public int getDno() {
        return dno;
    }

    public void setDno(int dno) {
        this.dno = dno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public ArrayList<Employee> getEmplist() {
        return emplist;
    }

    public void setEmplist(ArrayList<Employee> emplist) {
        this.emplist = emplist;
    }
    
    public void add_employee(Employee e){
     emplist.add(e);
    
    }
    public void remove_employee(int idx){
     emplist.remove(idx);
    }
     
     public int getEmployeeCount(){
    
    return emplist.size();
    
}
     
     
     
     public void print_bisic_data(){
         for (int i = 0; i < emplist.size(); i++) {
             System.out.println(emplist.get(i).getSSN() +  " " + emplist.get(i).getName() + " "+ emplist.get(i).getSex() +" " ) ;
         }
     
     }
    
     
     


    public void print_all_details(){
            for (int i = 0; i < emplist.size(); i++) {
            if(emplist.get(i) instanceof SalariedEmployee)
              ((SalariedEmployee)  emplist.get(i)).DisplayAllDetails();
            if(emplist.get(i) instanceof HourlyEmployee)
              ((HourlyEmployee)  emplist.get(i)).DisplayAllDetails();
            if(emplist.get(i) instanceof CommissionEmployee)
              ((CommissionEmployee)  emplist.get(i)).DisplayAllDetails();
        }


    }



















}

