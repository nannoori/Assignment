package DesignEmployee.model;

import java.util.ArrayList;
import java.util.List;

public class AddEmployee {
    private static Employee employee;

    List<Employee> list = new ArrayList<>();

    void addEmploye(Employee emp) {
        list.add(emp);
    }

    Employee getEmployee(int id) {
        for (Employee em : list) {
            if (em.getEmp_Id() == id) {
                return em;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        AddEmployee ademp = new AddEmployee();
        ademp.addEmploye(new Employee(1, "ganesh", "Hyd"));
        ademp.addEmploye(new Employee(2, "vinayak", "Khairtabad"));
        ademp.addEmploye(new Employee(3, "Vighnesha", "Balapur"));
        System.out.println(ademp.getEmployee(2));

    }
}
