/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAOImpl;

import com.DAO.DepartmentDAO;
import com.connection.DBConnection;
import com.pojos.Department;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Turab Bajeer
 */
public class DepartmentDAOImpl implements DepartmentDAO {

    Connection con = DBConnection.getConnection();

    @Override
    public Integer addDepartment(Department department) {

        Integer row = null;
        try {
            String addQuery = "insert into department(department_id,department_name) values (?,?)";
            PreparedStatement pstmt = con.prepareStatement(addQuery);
            pstmt.setInt(1, department.getDepartmentId());
            pstmt.setString(2, department.getDepartmentName());

            row = pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("ERROR " + e.getMessage());
            e.printStackTrace();
        }

        return row;
    }

    @Override
    public Integer updateDepartment(Department department) {
        Integer row = null;
        try {
            String updateQuery = "update department set department_name = ? where department_id =?";
            PreparedStatement pstmt = con.prepareStatement(updateQuery);
            pstmt.setString(1, department.getDepartmentName());
            pstmt.setInt(2, department.getDepartmentId());

            row = pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("ERROR " + e.getMessage());
            e.printStackTrace();
        }

        return row;

    }

    @Override
    public Integer deleteDepartmetnt(int departmentId) {
        Integer row = null;
        try {
            String deleteQuery = "delete from department where department_id = ?";
            PreparedStatement pstmt = con.prepareStatement(deleteQuery);
            pstmt.setInt(1, departmentId);

            row = pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("ERROR " + e.getMessage());
            e.printStackTrace();
        }

        return row;
    }

    @Override
    public Department getDepartment(int departmentId) {
        Department department = null;
        ResultSet rs = null;
        try {
            String getQuery = "Select department_id, department_name from department where department_id =?";
            PreparedStatement pstmt = con.prepareStatement(getQuery);
            pstmt.setInt(1, departmentId);

            rs = pstmt.executeQuery();
            if(rs.next()){
            department = new Department();

            department.setDepartmentId(rs.getInt("department_id"));
            department.setDepartmentName(rs.getString("department_name"));
            }

        } catch (Exception e) {
            System.out.println("ERROR " + e.getMessage());
            e.printStackTrace();
        }
        return department;
    }

    @Override
    public List<Department> getAllDepartment() {
        List<Department> departments = new ArrayList<>();
        ResultSet rs = null;
        try {
            String allQuery = "select * from department";
            PreparedStatement pstmt = con.prepareStatement(allQuery);

            rs = pstmt.executeQuery();

            while (rs.next()) {
                Department d = new Department();
                d.setDepartmentId(rs.getInt("department_id"));
                d.setDepartmentName(rs.getString("department_name"));

                departments.add(d);

            }

        } catch (Exception e) {
            System.out.println("ERROR " + e.getMessage());
            e.printStackTrace();
        }

        return departments;
    }

}
