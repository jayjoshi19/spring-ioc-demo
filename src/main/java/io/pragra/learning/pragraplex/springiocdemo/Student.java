package io.pragra.learning.pragraplex.springiocdemo;

import java.util.List;
import java.util.Set;

public class Student {

    private int id;
    private List<String> name;
    private double marks;
    private Set<String> email;

    public Student(int id, List<String> name, double marks, Set<String> email) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public Set<String> getEmail() {
        return email;
    }

    public void setEmail(Set<String> email) {
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", marks=").append(marks);
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
