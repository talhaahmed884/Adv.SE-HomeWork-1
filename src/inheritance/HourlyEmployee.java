package inheritance;

/**
 * A HourlyEmployee class that extends the Employee and stores information for hourly wage of an Employee and number of
 * hours worked.
 */
public class HourlyEmployee extends Employee {
    private int hoursWorked;
    private int wage;

    /**
     * no-argument constructor of the HourlyEmployee class.
     */
    public HourlyEmployee() {
        super();
        this.wage = 0;
        this.hoursWorked = 0;
    }

    /**
     * constructor with all the arguments to initialize and assign values to the variables of the class.
     *
     * @param firstName, lastName, socialSecurityNumber, wage, and hoursWorked of an hourly paid employee.
     */
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, int wage, int hoursWorked) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    /**
     * getter method to return the wage value of an hourly paid employee.
     *
     * @return wage of an hourly paid employee.
     */
    public int getWage() {
        return this.wage;
    }

    /**
     * setter method to set the wage of an hourly paid employee.
     *
     * @param wage of an hourly paid employee.
     */
    public void setWage(int wage) {
        this.wage = wage;
    }

    /**
     * getter method to return the hoursWorked value of an hourly paid employee.
     *
     * @return hoursWorked of an hourly paid employee.
     */
    public int getHoursWorked() {
        return this.hoursWorked;
    }

    /**
     * setter method to set the hoursWorked of an hourly paid employee.
     *
     * @param hoursWorked of an hourly paid employee.
     */
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return this.getFirstName() + "\t" + this.getLastName() + "\t" + this.getSocialSecurityNumber() + "\t" + this.wage + "\t" + this.hoursWorked;
    }
}
