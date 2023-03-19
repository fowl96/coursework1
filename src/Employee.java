public class Employee {
    private String name;
    private int salary;
    private  int department;
    private static long idCounter = 0;
    private long id;

    public Employee(String name, int salary, int department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.id = idCounter++;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public long getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary = " + salary +
                ", department = " + department +
                ", id = " + id +
                '}';
    }
}
