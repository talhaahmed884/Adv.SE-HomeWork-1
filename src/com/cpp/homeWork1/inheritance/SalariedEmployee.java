package com.cpp.homeWork1.inheritance;

/**
 * A SalariedEmployee class that extends the Employee and stores weekly salary of an employee.
 */
public class SalariedEmployee extends Employee {
    private int weeklySalary;

    /**
     * no-argument constructor of the SalariedEmployee class.
     */
    public SalariedEmployee() {
        super();
        this.weeklySalary = 0;
    }

    /**
     * constructor with all the arguments to initialize and assign values to the variables of the class.
     *
     * @param firstName, lastName, socialSecurityNumber, and weeklySalary of a salaried employee.
     */
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, int weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    /**
     * getter method to return the weeklySalary value of a salaried employee.
     *
     * @return weeklySalary of a salaried employee.
     */
    public int getWeeklySalary() {
        return this.weeklySalary;
    }

    /**
     * setter method to set the weekly salary value of a salaried employee.
     *
     * @param weeklySalary of a salaried employee.
     */
    public void setWeeklySalary(int weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public String toString() {
        return String.format(outputFormatter, this.getFirstName(), this.getLastName(), this.getSocialSecurityNumber(), this.weeklySalary, "", "", "", "", "");
    }

}
