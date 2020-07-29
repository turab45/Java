/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pojos;

/**
 *
 * @author Turab Bajeer
 */
public class Student {

    private int StudentId;
    private String studentName;
    private Department studentDepartment;

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int StudentId) {
        this.StudentId = StudentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Department getStudentDepartment() {
        return studentDepartment;
    }

    public void setStudentDepartment(Department studentDepartment) {
        this.studentDepartment = studentDepartment;
    }

}
