package io.pragra.learning.pragraplex.springiocdemo.repo;

import io.pragra.learning.pragraplex.springiocdemo.Employee;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmployeeRepo {

    //@Value("#{'${spring.datasource.url}'.substring(11)}")  --> SPEL - Spring Expression Language
    @Value("{spring.datasource.url}")
    String url;
    @Value("${spring.datasource.username}")
    String username;
    @Value("${spring.datasource.password}")
    String password;


    @PostConstruct
    public void init(){
        // establish connection with database
    }

    @PreDestroy
    public void destroy(){
        // disconnect from the database
    }

    public Employee fetchEmployeeFromDB(){
        Employee employee = new Employee("Jay");
        employee.setLastName("J");
        System.out.println("\nURL = "+url + "\nUsername = " + username + "\nPassword = " + password);
        return employee;
    }

    public Employee saveEmp(Employee employee) {
        // db code goes here to save the employee
        return employee;
    }

    public boolean deleteEmp(){
        return true;
    }
}
