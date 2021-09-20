package DesignEmployee.model;

public class Employee {

    private int emp_Id;
    private String emp_Name;
    private String city;

    public Employee() {
    }

    public Employee(int emp_Id, String emp_Name, String city) {
        this.emp_Id = emp_Id;
        this.emp_Name = emp_Name;
        this.city = city;
    }

    public int getEmp_Id() {
        return emp_Id;
    }

    public void setEmp_Id(int emp_Id) {
        this.emp_Id = emp_Id;
    }

    public String getEmp_Name() {
        return emp_Name;
    }

    public void setEmp_Name(String emp_Name) {
        this.emp_Name = emp_Name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_Id=" + emp_Id +
                ", emp_Name='" + emp_Name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
