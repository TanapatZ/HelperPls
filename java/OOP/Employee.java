package OOP;

import Function.utils.Utils104;
import java.util.Objects;

public class Employee {
    private final int id = 1;
    private String fname;
    private String lname;
    private int age;
    private int salary;
    private int bonus;

    public Employee(String fname, String lname, int age) {
        this.fname = fname;
        this.lname = lname;
        if (Utils104.checkInterger(age)) {
            this.age = age;
        }
        else {
            throw new IllegalArgumentException("age must be positive");
        }
    }

    public double getSalary() {
        return salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setSalary(int salary) {
        if (Utils104.checkInterger(salary)) this.salary = salary;
        throw new RuntimeException();
    }

    public void setBonus(int bonus) {
        if (Utils104.checkInterger(bonus)) this.bonus = bonus;
        throw new RuntimeException();
    }

    public void addBonus(int bonus) {
        this.bonus += bonus;
    }

    public int getFinalSalary() {
        return salary += bonus;
    }

    public int addAge() {
        return age += 1;
    }

    public String getFullName() {
        return fname + " " + lname;
    }

    public int salaryPerDay() {
        return salary /= 30;
    }

    public int salaryPerWeek() {
        return salary /= 4;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("id=").append(id);
        sb.append(", fname='").append(fname).append('\'');
        sb.append(", lname='").append(lname).append('\'');
        sb.append(", age=").append(age);
        sb.append(", salary=").append(salary);
        sb.append(", bonus=").append(bonus);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && age == employee.age && salary == employee.salary && bonus == employee.bonus && Objects.equals(fname, employee.fname) && Objects.equals(lname, employee.lname);
    }
}
