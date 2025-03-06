package io.pragra.learning.pragraplex.springiocdemo;

import org.springframework.stereotype.Component;

@Component
public class Employee {

    private String firstName;
    private String lastName;

    public Employee(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Employee{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void initialize(){
        System.out.println("Init method called for Employee");
    }
}
