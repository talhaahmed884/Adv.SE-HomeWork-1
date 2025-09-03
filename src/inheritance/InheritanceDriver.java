package inheritance;

public class InheritanceDriver {
    //    TODO: Implement a table like output to display the results
    public static void main(String[] args) {
        SalariedEmployee salariedEmployeeOne = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        System.out.println(salariedEmployeeOne);

        HourlyEmployee hourlyEmployeeOne = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        System.out.println(hourlyEmployeeOne);

        HourlyEmployee hourlyEmployeeTwo = new HourlyEmployee();
        hourlyEmployeeTwo.setFirstName("Mary");
        hourlyEmployeeTwo.setLastName("Quinn");
        hourlyEmployeeTwo.setSocialSecurityNumber("333-33-3333");
        hourlyEmployeeTwo.setWage(19);
        hourlyEmployeeTwo.setHoursWorked(47);
        System.out.println(hourlyEmployeeTwo);

        CommissionEmployee commissionEmployeeOne = new CommissionEmployee();
        commissionEmployeeOne.setFirstName("Nicole");
        commissionEmployeeOne.setLastName("Dior");
        commissionEmployeeOne.setSocialSecurityNumber("444-44-4444");
        commissionEmployeeOne.setCommissionRate(15);
        commissionEmployeeOne.setGrossSales(50000);
        System.out.println(commissionEmployeeOne);

        SalariedEmployee salariedEmployeeTwo = new SalariedEmployee();
        salariedEmployeeTwo.setFirstName("Renwa");
        salariedEmployeeTwo.setLastName("Chanel");
        salariedEmployeeTwo.setSocialSecurityNumber("555-55-5555");
        salariedEmployeeTwo.setWeeklySalary(1700);
        System.out.println(salariedEmployeeTwo);

        BaseEmployee baseEmployee = new BaseEmployee();
        baseEmployee.setFirstName("Mike");
        baseEmployee.setLastName("Davenport");
        baseEmployee.setSocialSecurityNumber("666-66-6666");
        baseEmployee.setBaseSalary(95000);
        System.out.println(baseEmployee);

        CommissionEmployee commissionEmployeeTwo = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 22, 40000);
        System.out.println(commissionEmployeeTwo);
    }
}
