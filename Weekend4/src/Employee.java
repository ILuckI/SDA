public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void getSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary(){
        return salary * 12;
    }
    public int raiseSalary(int percent){
        salary = (int)(salary*(percent/100.0)+salary);
        return salary;
    }

    public String toString() {
        return "Employee[id=" + id + " ,name=" + getName() + ", salary=" + salary + "]";
    }
}
