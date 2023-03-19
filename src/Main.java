import java.util.Random;

public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        Random random = new Random(17);
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee("Ivanov Ivan " + (10 + random.nextInt(80)),
                    10000 + random.nextInt(90000), random.nextInt(6));

        }
        printeAll();

        System.out.println("Сумма зарплат = " + getSumSalary());

        Employee employeeWithMinSalary = getEmployeeWithMinSalary();
        System.out.println(employeeWithMinSalary);

        Employee employeeWithMaxSalary = getEmployeeWithMaxSalary();
        System.out.println(employeeWithMaxSalary);

        double averageSalary = getSumSalary();
        averageSalary = averageSalary/employees.length;
        System.out.println("Среднее значение зарплат = " + averageSalary);

        printeAllName();

    }




    private static void printeAll() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    private static int getSumSalary() {
        int sumSalary = 0;
        for (Employee employee : employees) {
            sumSalary +=employee.getSalary();
        }
        return sumSalary;
    }

    private static Employee getEmployeeWithMinSalary() {
        int minSalary = employees[0].getSalary() ;
        Employee minEmployee = employees[0];
        for (int i = 1; i < employees.length; i++) {
            Employee employee = employees[i];
            if (minSalary > employees[i].getSalary()) {
                minSalary = employees[i].getSalary();
                minEmployee = employees[i];
            }
        }
        return minEmployee;
    }

    private static Employee getEmployeeWithMaxSalary() {
        int maxSalary = employees[0].getSalary() ;
        Employee maxEmployee = employees[0];
        for (int i = 1; i < employees.length; i++) {
            Employee employee = employees[i];
            if (maxSalary < employees[i].getSalary()) {
                maxSalary = employees[i].getSalary();
                maxEmployee = employees[i];
            }
        }
        return maxEmployee;
    }

    private static void printeAllName() {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }
}