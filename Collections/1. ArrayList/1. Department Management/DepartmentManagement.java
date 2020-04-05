/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package departmentmanagement;

import java.util.ArrayList;

/**
 *
 * @author Turab Bajeer
 */
public class DepartmentManagement {

    ArrayList<Department> departments = new ArrayList<>();

    public void addDepartment(String name, String code) {

        Department d = new Department();
        d.setDepartmentCode(code);
        d.setDepartmentName(name);

        departments.add(d);

    }

    public void updateDepartment(String oldCode,String newName, String newCode) {
        Department department;
        if(containsDepartment(oldCode)){
            
        int find = findCodeIndex(oldCode);
        
        department = departments.get(find);
        department.setDepartmentName(newName);
        department.setDepartmentCode(newCode);
        
          
        }
        
          
    }

    public boolean removeDepartment(String code) {
        if (findCodeIndex(code) >= 0) {
            Department delete = departments.get(findCodeIndex(code));
            departments.remove(delete);
            return true;
        }
        return false;
    }

    public void getDepartment(String code) {
        if (findCodeIndex(code) >= 0) {
            Department d = departments.get(findCodeIndex(code));
            System.out.println("Department Name\tDepartment Code");
            System.out.println(d.getDepartmentName() + "\t" + d.getDepartmentCode());
        } else {
            System.out.println("Department Not Found.");
        }
    }

    public void getAllDepartments() {
        Department d;
        for (int i = 0; i < departments.size(); i++) {
            d = departments.get(i);

            System.out.println((i + 1) + ". " + d.getDepartmentName() + "\t" + d.getDepartmentCode());

        }
    }

    private int findCodeIndex(String code) {
        for (int i = 0; i < departments.size(); i++) {
            Department d = departments.get(i);
            if (d.getDepartmentCode().equals(code)) {
                return i;
            }

        }
        return -1;
    }
    
    public boolean containsDepartment(String code){
        boolean result=false;
    for (int i = 0; i < departments.size(); i++) {
            Department d = departments.get(i);
            if (d.getDepartmentCode().equals(code)) {
                result=true;
            }
    }
    return result;
    }
}
