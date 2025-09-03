package inheritance;

/**
 * A BaseEmployee class that extends the Employee and stores information for base salary of an employee.
 */
public class BaseEmployee extends Employee {
    private int baseSalary;

    /**
     * no-argument constructor of the BaseEmployee class.
     */
    public BaseEmployee() {
        super();
        this.baseSalary = 0;
    }

    /**
     * constructor with all the arguments to initialize and assign values to the variables of the class.
     *
     * @param firstName, lastName, socialSecurityNumber, and baseSalary of an employee.
     */
    public BaseEmployee(String firstName, String lastName, String socialSecurityNumber, int baseSalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.baseSalary = baseSalary;
    }

    /**
     * getter method to return the base salary of an employee.
     *
     * @return baseSalary of an employee.
     */
    public int getBaseSalary() {
        return baseSalary;
    }

    /**
     * setter method to set the base salary of an employee.
     *
     * @param baseSalary of an employee.
     */
    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return this.getFirstName() + "\t" + this.getLastName() + "\t" + this.getSocialSecurityNumber() + "\t" + this.baseSalary;
    }
}
