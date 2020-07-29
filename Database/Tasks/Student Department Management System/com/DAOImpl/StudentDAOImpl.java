/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAOImpl;

import com.DAO.StudentDAO;
import com.connection.DBConnection;
import com.pojos.Department;
import com.pojos.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Turab Bajeer
 */
public class StudentDAOImpl implements StudentDAO {
    
    Connection con = DBConnection.getConnection();
    
    @Override
    public Integer addStudent(Student student) {
        Integer row = null;
        try {
            String addQuery = "insert into student(student_id,student_name,student_department) values (?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(addQuery);
            pstmt.setInt(1, student.getStudentId());
            pstmt.setString(2, student.getStudentName());
            pstmt.setInt(3, student.getStudentDepartment().getDepartmentId());
            
            row = pstmt.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("ERROR " + e.getMessage());
            e.printStackTrace();
        }
        
        return row;
    }
    
    @Override
    public Integer updateStudent(Student student) {
        Integer row = null;
        try {
            String updateQuery = "update student set student_name = ? where student_id =?";
            PreparedStatement pstmt = con.prepareStatement(updateQuery);
            pstmt.setString(1, student.getStudentName());
            pstmt.setInt(2, student.getStudentId());
            
            row = pstmt.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("ERROR " + e.getMessage());
            e.printStackTrace();
        }
        
        return row;
    }
    
    @Override
    public Integer deleteStudent(int studentId) {
        Integer row = null;
        try {
            String deleteQuery = "delete from student where student_id = ?";
            PreparedStatement pstmt = con.prepareStatement(deleteQuery);
            pstmt.setInt(1, studentId);
            
            row = pstmt.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("ERROR " + e.getMessage());
            e.printStackTrace();
        }
        
        return row;
    }
    
    @Override
    public Student getStudent(int studentId) {
        Student student = null;
        Department department = null;
        ResultSet rs = null;
        try {
            String searchQuery = "select s.student_id,s.student_name,s.student_department,d.department_id,d.department_name from student s "
                    + "inner join department d on d.department_id = s.student_department "
                    + "where s.student_id = ?";
            PreparedStatement pstmt = con.prepareStatement(searchQuery);
            pstmt.setInt(1, studentId);
            
            rs = pstmt.executeQuery();
            
            if(rs.next()){
            department = new Department();
            
            department.setDepartmentId(rs.getInt("d.department_id"));
            department.setDepartmentName(rs.getString("d.department_name"));
            
            student = new Student();
            student.setStudentId(rs.getInt("s.student_id"));
            student.setStudentName(rs.getNString("s.student_name"));
            student.setStudentDepartment(department);
            }
            
        } catch (Exception e) {
            System.out.println("ERROR " + e.getMessage());
            e.printStackTrace();
        }
        return student;
    }
    
    @Override
    public List<Student> getAllStudent() {
        List<Student> students = new ArrayList<>();
        ResultSet rs = null;
        
        try {
            String allQuery = "select s.student_id, s.student_name, s.student_department, d.department_id,"
                    + " d.department_name from student s inner join department d"
                    + " on d.department_id = s.student_department";
            PreparedStatement pstmt = con.prepareStatement(allQuery);
            
            rs = pstmt.executeQuery();
            
            while (rs.next()) {
                Department d = new Department();
                Student s = new Student();
                
                d.setDepartmentId(rs.getInt("department_id"));
                d.setDepartmentName(rs.getString("department_name"));
                
                s.setStudentId(rs.getInt("student_id"));
                s.setStudentName(rs.getString("student_name"));
                s.setStudentDepartment(d);
                
                students.add(s);
            }
            
        } catch (Exception e) {
            System.out.println("ERROR " + e.getMessage());
            e.printStackTrace();
        }
        
        return students;
    }
    
}
