package JavaAdvancedHomework;

import java.util.Arrays;
import java.util.Comparator;

public class Employee implements Measurable{
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public static double average(Measurable[] employees) {
        return Arrays.stream(employees)
                .mapToDouble(e -> e.getMeasure()).sum() / employees.length;
    }

    public static String largestSalary(Measurable[] employees) {
        return Arrays.stream(employees)
                .max(Comparator.comparingDouble(e -> e.getMeasure())).get().toString();
    }

    @Override
    public double getMeasure() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee " +
                "name:'" + name + '\'' +
                ", Salary:" + salary ;
    }
}

