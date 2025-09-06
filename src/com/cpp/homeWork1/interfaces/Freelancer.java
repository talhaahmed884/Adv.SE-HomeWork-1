package com.cpp.homeWork1.interfaces;

/**
 * A Freelancer class to represent the First name, Last name, Hourly rate, and Hours worked of a person. It implements
 * Payable interface to calculate the payment and return the name of the Payee.
 */
public class Freelancer implements Payable {
    private String firstName;
    private String lastName;
    private double hourlyRate;
    private double hoursWorked;

    /**
     * no-argument constructor of the Freelancer class.
     */
    public Freelancer() {
        this.firstName = "";
        this.lastName = "";
        this.hourlyRate = 0.0;
        this.hoursWorked = 0.0;
    }

    /**
     * constructor with all the arguments to initialize and assign values to the variables of the class.
     *
     * @param firstName, lastName, hourlyRate, and hoursWorked of a freelancer.
     * @throws IllegalArgumentException if the hours worked or hourly rate value is negative
     */
    public Freelancer(String firstName, String lastName, double hourlyRate, double hoursWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        /*
          throws an IllegalArgumentException if the hourly rate value is negative
         */
        this.setHourlyRate(hourlyRate);
        /*
          throws an IllegalArgumentException if the hours worked value is negative
         */
        this.setHoursWorked(hoursWorked);
    }

    /**
     * getter method to return the first name of a freelancer.
     *
     * @return firstName of a freelancer.
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * setter method to set the first name of a freelancer.
     *
     * @param firstName of a freelancer.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * getter method to return the last name of a freelancer.
     *
     * @return lastName of a freelancer.
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * setter method to set the last name of a freelancer.
     *
     * @param lastName of a freelancer.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * getter method to return the hourly rate of a freelancer.
     *
     * @return hourlyRate of a freelancer.
     */
    public double getHourlyRate() {
        return this.hourlyRate;
    }

    /**
     * setter method to set the hourly rate of a freelancer.
     *
     * @param hourlyRate of a freelancer.
     * @throws IllegalArgumentException if the hourly rate value is negative.
     */
    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 0.0) {
            throw new IllegalArgumentException("Hourly rate value cannot be negative");
        }
        this.hourlyRate = hourlyRate;
    }

    /**
     * getter method to return the hours worked of a freelancer.
     *
     * @return hoursWorked of a freelancer.
     */
    public double getHoursWorked() {
        return this.hoursWorked;
    }

    /**
     * setter method to set the hours worked of a freelancer.
     *
     * @param hoursWorked of a freelancer.
     * @throws IllegalArgumentException if the hours worked value is negative.
     */
    public void setHoursWorked(double hoursWorked) {
        if (hoursWorked < 0.0) {
            throw new IllegalArgumentException("Hours worked value cannot be negative");
        }
        this.hoursWorked = hoursWorked;
    }

    /**
     * performs payment calculation operation through product of hours worked and hourly rate.
     * adds 1.5x overtime if hours worked are greater than 40 hours.
     *
     * @return calculated payment in double format.
     */
    @Override
    public double calculatePayment() {
        double overtimeLimit = 40.0;
        return this.hoursWorked > overtimeLimit ? (overtimeLimit * this.hourlyRate) + ((this.hoursWorked -
                overtimeLimit) * this.hourlyRate * 1.5) : this.hoursWorked * this.hourlyRate;
    }

    /**
     * returns the payee name information i.e., first name and last name.
     *
     * @return payee name in String format.
     */
    @Override
    public String getPayeeName() {
        return this.firstName + " " + this.lastName;
    }

    /**
     * display freelancer's full name and calculated payment on separate lines respectively.
     */
    public void print() {
        System.out.println("Freelancer's full name: " + this.getPayeeName());
        System.out.println("Calculated payment: " + this.calculatePayment());
    }
}
