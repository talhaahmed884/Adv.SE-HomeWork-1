package inheritance;

/**
 * An Employee class to represent the First name, Last name, and Social Security number of an employee.
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    /**
     * no-argument constructor of the Employee class.
     */
    public Employee() {
        this.firstName = "";
        this.lastName = "";
        this.socialSecurityNumber = "";
    }

    /**
     * constructor with all the arguments to initialize and assign values to the variables of the class.
     *
     * @param firstName, lastName, and socialSecurityNumber of an Employee.
     */
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    /**
     * getter method to return the firstName value of an Employee.
     *
     * @return firstName of an Employee.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * setter method to set the firstName value of an Employee.
     *
     * @param firstName of an Employee.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * getter method to set the lastName value of an Employee.
     *
     * @return lastName of an Employee.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * setter method to set the lastName value of an Employee.
     *
     * @param lastName of an Employee.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * getter method to set the socialSecurityNumber value of an Employee.
     *
     * @return socialSecurityNumber of an Employee.
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * setter method to set the socialSecurityNumber value of an Employee.
     *
     * @param socialSecurityNumber of an Employee.
     */
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString() {
        return this.firstName + "\t" + this.lastName + "\t" + this.socialSecurityNumber;
    }
}
