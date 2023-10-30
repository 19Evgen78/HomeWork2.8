package pro.sky.java.course2.streamapiandoptional.service;

import pro.sky.java.course2.streamapiandoptional.model.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
    Employee addEmployee(String lastName, String firstName, int department, int salary);
    Employee removeEmployee(String lastName, String firstName,int department, int salary);
    Employee findEmployee(String lastName, String firstName,int department, int salary);
    Map<String, Employee> all();
    List<Employee> list();
}