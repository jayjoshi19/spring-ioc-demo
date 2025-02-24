package io.pragra.learning.pragraplex.springiocdemo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

    private int id;
    //private List<String> namesOfStudents;
    private double marks;
    private Set<String> email;
    private Map<String, Integer> studMap;

    /*public Student(int id, List<String> namesOfStudents, double marks, Set<String> email, Map<String, Integer> studMap) {
        this.id = id;
        this.namesOfStudents = namesOfStudents;
        this.marks = marks;
        this.email = email;
        this.studMap = studMap;
    }*/

    public Student(int id, double marks, Set<String> email, Map<String, Integer> studMap) {
        this.id = id;
        this.marks = marks;
        this.email = email;
        this.studMap = studMap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Map<String, Integer> getStudMap() {
        return studMap;
    }

    public void setStudMap(Map<String, Integer> studMap) {
        this.studMap = studMap;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("id=").append(id);
        sb.append(", marks=").append(marks);
        sb.append(", email=").append(email);
        sb.append(", studMap=").append(studMap);
        sb.append('}');
        return sb.toString();
    }
}
