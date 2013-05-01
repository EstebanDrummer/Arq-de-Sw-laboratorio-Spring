/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.payroll;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author usuario
 */
public class PayrollMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List employees  = new ArrayList();
        
        ApplicationContext context = new
        ClassPathXmlApplicationContext("/org/payroll/Spring.xml");   
        
        SalariedEmployee se = context.getBean(SalariedEmployee.class);
        
        se.setFirstName("Thor");
        
        
        se.setLastName("odinson");
        
        se.setSsn("123-234-45");
        
        se.setSalary(2000.00);
        
        CommissionEmployee ce = context.getBean(CommissionEmployee.class);
        
        ce.setFirstName("Jacques");
        
        
        ce.setLastName("Duquesne");
        
        ce.setSsn("345-67-890");
        
        ce.setGrossSales(345);
        
        ce.setCommissionRate(0.56);
        
        HourlyEmployee he = context.getBean(HourlyEmployee.class);
        
        he.setFirstName("Bruce");
        
        
        he.setLastName("Banner");
        
        he.setSsn("567-78-678");
        
        he.setHours(30);
        
        he.setWage(500);
        
        employees.add(se);
        
        employees.add(ce);
        
        employees.add(he);
        
        for(Iterator it = employees.iterator(); it.hasNext();) {
            Employee e = (Employee) it.next();
            
            System.out.printf("\nName: %s %s Payment: %.2f",e.getFirstName(),e.getLastName(),e.payment());
        }
        
        
    }
}
