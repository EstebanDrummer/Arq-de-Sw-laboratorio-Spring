/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.payroll;

/**
 *
 * @author usuario
 */
public class SalariedEmployee extends Employee {
    
    public SalariedEmployee(){}
    
    @Override
    public double payment() {
        
        return getSalary();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    private double salary;
}
