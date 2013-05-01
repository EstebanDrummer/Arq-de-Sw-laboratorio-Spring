/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.payroll;

/**
 *
 * @author usuario
 */
public class CommissionEmployee extends Employee {
    
    
    public CommissionEmployee() {}
    
   

    @Override
    public double payment() {
        return this.getCommissionRate() * this.getGrossSales();
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
    
     private double grossSales;
    private double commissionRate;
}
