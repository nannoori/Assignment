package DesignEmployee.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.Matchers.anyObject;

public class AddEmployeeTest {

    @Mock
    private AddEmployee ademployee;

    @BeforeEach
    public void init() {
        ademployee = Mockito.mock(AddEmployee.class);
    }

    @Test
    void addEmployee_test() {
        Employee e1 = new Employee();
        e1.setEmp_Id(101);
        e1.setEmp_Name("Vijay");
        e1.setCity("HYD");
        AddEmployee aemp = new AddEmployee();
        aemp.addEmploye(e1);
        Mockito.doNothing().when(ademployee).addEmploye(anyObject());
        ademployee.addEmploye(e1);
        Mockito.verify(ademployee, Mockito.times(1)).addEmploye(e1);
    }

    @Test
    void getEmployee_Test() {
        Employee e1 = new Employee(1, "Vijay", "HYD");
        AddEmployee ademp = new AddEmployee();
        ademp.addEmploye(e1);
        Employee emp = ademp.getEmployee(1);
        Assertions.assertEquals(e1, emp);
    }


}
