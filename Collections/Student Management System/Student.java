

import java.util.*;

/**
 *
 * @author Turab Bajeer
 */
public class Student {
	public Student(){
		Department department = new Department();
	}

    List students = new ArrayList();
    List rollNumbers = new ArrayList();

    public boolean addStudent(String studentName, String rollNo) {
        if (rollNumbers.contains(rollNo)) {
            return false;
        } else {
            students.add(studentName);
            rollNumbers.add(rollNo);
            return true;
        }

    }

    public boolean deleteStudent(String rolNumber) {

        int find = rollNumbers.indexOf(rolNumber);

        if (find >= 0) {
            rollNumbers.remove(find);
            students.remove(find);
            return true;
        }

        return false;
    }

    public boolean updateStudent(String rollNumber,String newName, String NewRollNumber) {
		
        int find = rollNumbers.indexOf(rollNumber);

        if (find >= 0) {
            students.set(find, newName);
            rollNumbers.set(find, NewRollNumber);
            return true;
        }

        return false;
    }

    String getStudent(String rollNumber) {
		
        int find = rollNumbers.indexOf(rollNumber);

        if (find >= 0) {
            return String.format("%s %s",students.get(find),rollNumbers.get(find));
        } else {
            return null;
        }

    }

    public boolean findStudent(String rollNo) {
        
        if (rollNumbers.contains(rollNo)) {
            return true;
        } else {
            return false;
        }

    }

    public List printStudents() {
       
        return students;
    }
    
    public List printRollNumbers(){
    return rollNumbers;
    }
	
}
