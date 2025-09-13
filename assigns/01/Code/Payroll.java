
public class Payroll {
    public static final int INITIAL_MAXIMUM_SIZE = 1024;

    public Payroll() {
	/* your code */
        people = new Employee[INITIAL_MAXIMUM_SIZE];
        maximum_size = INITIAL_MAXIMUM_SIZE;
        current_size = 0;
    }
    
    public void add_employee(Employee newbie) {
	/* your code */
        if(current_size<maximum_size)
        {
            Employee[] temp = new Employee[maximum_size*2];
            for(int i = 0;i<maximum_size;i++)
            {
                temp[i] = people[i];
            }
            people = temp;
        }
        current_size++;
        people[current_size] = newbie;
    }

    public void remove_employee(int i) throws EmployeeIndexException {
	/* your code */
        if((i<0) || (i>=current_size))
        {
            throw new EmployeeIndexException();
        }
        for(int index=i;index<current_size-1;i++)
        {
            people[index] = people[index+1];
        }
        current_size--;
    }
    
    public int find_employee(String name) throws EmployeeNotFoundException {
	/* your code */
        for(int i = 0; i<current_size-1;i++)
        {
            if(people[i].name==name)
            {
                return i;
            }
        }
        throw new EmployeeNotFoundException();
    }

    public void add_payroll(Payroll source) {
	/* your code */
        for(int i = 0;i<source.current_size;i++)
        {
            add_employee(source.people[i]);
        }
    }

    public void copy_payroll(Payroll source) {
	/* your code */
        current_size = 0;
        for(int i = 0;i<source.current_size;i++)
        {
            add_employee(source.people[i]);
        }
    }

    private Employee people[];
    private int maximum_size;
    private int current_size;
}
