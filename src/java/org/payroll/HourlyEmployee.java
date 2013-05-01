/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.payroll;

/**
 *
 * @author usuario
 */
public class HourlyEmployee extends Employee {
   
    public HourlyEmployee(){}
    
    @Override
    public double payment() {
        
        if(this.getHours() <= 40) {
           return this.getWage() * this.getHours(); 
        }
        else {
            return 40*this.getWage() + (this.getHours() - 40) * this.getWage() *
            1.5;
        }    
    }
    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
    
    private double wage; //pago por hora
    private double hours;
}
