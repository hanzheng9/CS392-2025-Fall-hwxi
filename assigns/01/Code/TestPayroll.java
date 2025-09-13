public class TestPayroll {
    /* your code */
    {
        try {
            Employee e1 = new Employee();
            Employee e2 = new Employee();
            Employee e3 = new Employee();

            e1.name = "Adam";
            e1.salary = 100;
            e2.name = "Bob";
            e2.salary = 100;
            e3.name = "Charlie";
            e3.salary = 100;

            Payroll p1 = new Payroll();

            p1.add_employee(e1);
            p1.add_employee(e2);
            p1.add_employee(e3);
            
            p1.remove_employee(1);  

        } catch(EmployeeIndexException e) {
            System.out.println("Error handling employees: " + e.getMessage());
        }
    }
}