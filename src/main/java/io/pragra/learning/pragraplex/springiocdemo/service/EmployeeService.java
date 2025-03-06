package io.pragra.learning.pragraplex.springiocdemo.service;

import io.pragra.learning.pragraplex.springiocdemo.Employee;
import io.pragra.learning.pragraplex.springiocdemo.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

    String a;
    String b;

//    @Autowired
    EmployeeRepo employeeRepo;

    public EmployeeService(@Qualifier("abc") String msg1, @Qualifier("xyz") String msg2, EmployeeRepo employeeRepo) {
        a = msg1;
        b = msg2;
        this.employeeRepo = employeeRepo;
    }

    public Employee getEmployeeFromDB() {
        Employee employee = employeeRepo.fetchEmployeeFromDB();
        return employee;
    }
}
