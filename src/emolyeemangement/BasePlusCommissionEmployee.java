/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emolyeemangement;

/**
 *
 * @author 20111
 */
public class BasePlusCommissionEmployee extends CommissionEmployee {
    
        private double base;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    
     @Override
    public double earning() {
        
        return  base + super.earning();
    }
    
    @Override
    public void DisplayAllDetails() {
        super.DisplayAllDetails();
       
    }

    @Override
    public void DisplayAllearning() {
        
        
        System.out.println("Earning = " + earning());
    }

  
    
    
    
}
