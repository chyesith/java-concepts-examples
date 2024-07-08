package org.yesh.learn.record;

import java.util.Objects;

public class StudentDetails {

    private final String name;
    private final int studentNumber;

    public StudentDetails(String name, int studentNo) {
        this.name = name;
        this.studentNumber = studentNo;
    }

    public String getName() {
        return name;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDetails that = (StudentDetails) o;
        return studentNumber == that.studentNumber && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentNumber);
    }


    @Override
    public String toString() {
        return "StudentDetails{" +
                "name='" + name + '\'' +
                ", studentNo=" + studentNumber +
                '}';
    }
}
