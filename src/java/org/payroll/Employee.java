/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.payroll;

/**
 *
 * @author usuario
 */
public abstract class Employee {
    
    public Employee() {}
    
    public abstract double payment();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    private String firstName;
    private String lastName;
    //numero seguro social
    private String ssn;
}
