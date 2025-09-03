package inheritance;

/**
 * A CommissionEmployee class that extends the Employee and stores information for commission rate of an Employee and
 * gross sales.
 */
public class CommissionEmployee extends Employee {
    private int commissionRate;
    private int grossSales;

    /**
     * no-argument constructor of the CommissionEmployee class.
     */
    CommissionEmployee() {
        super();
        this.commissionRate = 0;
        this.grossSales = 0;
    }

    /**
     * constructor with all the arguments to initialize and assign values to the variables of the class.
     *
     * @param firstName, lastName, socialSecurityNumber, commissionRate, and grossSales of an employee.
     */
    CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, int commissionRate, int grossSales) {
        super(firstName, lastName, socialSecurityNumber);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    /**
     * getter method to return the commission rate of an employee.
     *
     * @return commissionRate of an employee.
     */
    public int getCommissionRate() {
        return this.commissionRate;
    }

    /**
     * setter method to set the commission rate of an employee.
     *
     * @param commissionRate of an employee.
     */
    public void setCommissionRate(int commissionRate) {
        this.commissionRate = commissionRate;
    }

    /**
     * getter method to return the gross sales of an employee.
     *
     * @return grossSales of an employee.
     */
    public int getGrossSales() {
        return this.grossSales;
    }

    /**
     * setter method to set the gross sales of an employee.
     *
     * @param grossSales of an employee.
     */
    public void setGrossSales(int grossSales) {
        this.grossSales = grossSales;
    }

    @Override
    public String toString() {
        return this.getFirstName() + "\t" + this.getLastName() + "\t" + this.getSocialSecurityNumber() + "\t" + this.commissionRate + "\t" + this.grossSales;
    }
}
