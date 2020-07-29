/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.pojos.Department;
import java.util.List;

/**
 *
 * @author Turab Bajeer
 */
public interface DepartmentDAO {
    
    public Integer addDepartment(Department departmetnt);
    public Integer updateDepartment(Department department);
    public Integer deleteDepartmetnt(int departmentId);
    public Department getDepartment(int departmentId);
    public List<Department> getAllDepartment();
    
}
