/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package departmentmanagement;

/**
 *
 * @author Turab Bajeer
 */
public class Department {
    
    private String departmentName;
    private String departmentCode;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    @Override
    public String toString() {
        return "Department{" + "departmentName=" + departmentName + ", departmentCode=" + departmentCode + '}';
    }
    
    
    
}
