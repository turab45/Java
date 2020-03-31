

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Turab Bajeer
 */
public class Department {
    String departmentName,departmentCode;

   
    

    List departments = new ArrayList();
    List codes = new ArrayList();

    public boolean addDepartment(String departmentName, String departmentCode) {

        
            departments.add(departmentName);
            codes.add(departmentCode);
            return true;
        
    }

    public boolean deleteDepartment(String departmentCode) {
        
        int find = codes.indexOf(departmentCode);
        if (codes.contains(departmentCode)) {
            departments.remove(find);
            codes.remove(find);
            return true;
        } else {
            return false;
        }
    }
    
    public boolean updateDepartment(String departmentCode, String newName, String newCode){
        
    int find = codes.indexOf(departmentCode);
    if(find >= 0){
    codes.set(find, newCode);
    departments.set(find, newName);
    return true;
    }
    
    return false;
    }
    
    public String getDepartment(String departmentCode){
    int find = codes.indexOf(departmentCode);
    if(find >= 0){
    return String.format(" %s  %s",departments.get(find),codes.get(find));
    }
    
    return null;
    }
    
    public void printDepartments(){
    Iterator i1 = departments.iterator();
    Iterator i2 = codes.iterator();
    
    while(i1.hasNext() && i2.hasNext()){
		
            System.out.println(String.format("%s  %s",i1.next(),i2.next()));
			
    }
    
    }
    
    public List getAllDepartments(){
       
    return departments;
    }
    public List getAllDepartmentCodes(){
    return codes;
    }
   
}
