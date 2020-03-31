

import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Turab Bajeer
 */
public class StudentManagementSystem {
	
    Student students = new Student();
	Department departments = new Department();
    public Scanner scanner = new Scanner(System.in);
    
	
	static String deptCode = "";
    

    public void addStudent() {
        System.out.print("Enter Student Name : ");
        scanner.nextLine();
        String studentName = scanner.next();
        System.out.print("Enter Student Roll No : ");
        scanner.nextLine();
        String rollNumber = scanner.next();
        addDepartment();

        if (students.addStudent(studentName, rollNumber)) {
            System.out.println(studentName + " added Scuccessfully.");
        } else {
            System.out.println("Student with Roll No : " + rollNumber + " already exists.");
        }
    }

    public void updateStudent() {
        System.out.print("Enter Roll No to update : ");
        scanner.nextLine();
        String rollNumber = scanner.next();

        if (students.findStudent(rollNumber)) {

            System.out.print("Enter New Name : ");
            String newName = scanner.next();
            System.out.println("Ente New Roll Number : ");
            String newRollNo = scanner.next();

            students.updateStudent(rollNumber, newName, rollNumber);

        } else {
            System.out.println("Roll No : " + rollNumber + " Not found.");
        }

    }

    public void deleteStudent() {
        System.out.print("Enter Student Roll No to Delete : ");
        String rollNumber = scanner.next();
		String deleted = rollNumber;
        if (students.deleteStudent(rollNumber)) {
            System.out.println(deleted+ " Deleted Successfully.");
        } else {
            System.out.println("Roll No : " + rollNumber + " Not found.");
        }
    }

    public void getStudent() {

        System.out.print("Enter Roll No  to get Student : ");
        String rollNumber = scanner.next();

        if (students.getStudent(rollNumber).equalsIgnoreCase(null)) {
            System.out.println("Roll No : " + rollNumber + " Not found.");
        } else {
            System.out.println("========================================");
            System.out.println(String.format("%s %s %s %s", "Name ", "Roll No ", "Department", "Code"));
            System.out.println();
            System.out.println(String.format("%s %s", students.getStudent(rollNumber), departments.getDepartment(deptCode)));
            System.out.println("========================================");
        }
    }

    public void getAllStudents() {
        Iterator i1,i2,i3,i4;
         i1 = students.printStudents().iterator();
         i2 = students.printRollNumbers().iterator();
         i3 = departments.getAllDepartments().iterator();
         i4 = departments.getAllDepartmentCodes().iterator();
         
		 System.out.println("========================================");
         System.out.println(String.format("%s %s %s %s", "Name ", "Roll No ", "Department", "Code"));
         while(i1.hasNext() && i2.hasNext() || (i3.hasNext() && i4.hasNext())){
         System.out.println(String.format("%s  %s  %s  %s",i1.next(),i2.next(),i3.next(),i4.next()));
         }System.out.println("========================================");
		 

        
    }

    public void menu() {
        int choice;
		System.out.println("\n *** WELCOME TO STUDENT DEPARTMENT MANAGEMENT SYSTEM *** \n");
        System.out.println("1. Manage Departments");
        System.out.println("2. Manage Students");
        System.out.println("3. Exit");
        System.out.print("Enter your choice : ");

        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                departmentMenu();
                break;
            case 2:
                studentMenu();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Please choose b/w 1-3");
        }

    }

    public void departmentMenu() {
        int choice;
        do {
            System.out.println("\n****** DEPARTMENT MANAGMENT *********\n");
            System.out.println("1. Add Department");
            System.out.println("2. Delete Department");
            System.out.println("3. Update Department");
            System.out.println("4. Get Department");
            System.out.println("5. Get All Departments");
            System.out.println("6. Back");
            System.out.print("Enter your choice : ");
            choice = scanner.nextInt();

            if (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5 || choice == 6) {
                switch (choice) {
                    case 1:
                        addDepartment();
                        break;
                    case 2:
                        deleteDepartment();
                        break;
                    case 3:
                        updateDepartment();
                        break;
                    case 4:
                        getDepartment();
                        break;
                    case 5:
                        getAllDepartments();
                        break;
                    case 6:
                        menu();
                        break;

                }
            } else {
                System.out.println("Please choose b/w 1-6");
            }
        } while (choice != 6);
    }

    public void addDepartment() {
        System.out.println("\n***** ADD DEPARTMENT *****\n");
        System.out.println("Enter Department Name  ");
        String departmentName = scanner.next();
        System.out.println("Enter Department Code ");
        String departmentCode = scanner.next();
        deptCode = departmentCode;

        if (departments.addDepartment(departmentName, departmentCode)) {
            System.out.println(departmentName + " Added Successfully.");
        }

    }

    public void deleteDepartment() {
        System.out.println("\n******* DELETE DEPARTMENT ******\n");
        System.out.println("Enter Department Code to Delete");
        String departmentCode = scanner.next();

        String deletedDepartment = departments.getDepartment(departmentCode);

        if (departments.deleteDepartment(departmentCode)) {
            System.out.println(deletedDepartment + " Deleted Successfully.");
        } else {
            System.out.println(departmentCode + " Not found.");
        }
    }

    public void updateDepartment() {
        System.out.println("******* UPDATE DEPARTMENT ********");
        System.out.println("Enter Department Code to Update");

        String departmentCode = scanner.next();

        if (departments.getDepartment(departmentCode).equalsIgnoreCase(null)) {
            System.out.println("Department Code " + departmentCode + " Not found.");
        } else {
            System.out.println("Enter New Name of Department ");
            String newName = scanner.next();
            System.out.println("Enter New Code of Department ");
            String newCode = scanner.next();

            departments.updateDepartment(departmentCode, newName, newCode);
            System.out.println("Department Updated Successfully.");
        }
    }

    public void getDepartment() {
        System.out.println("******* GET DEPARTMENT *******");
        System.out.println("Enter Department Code ");
        String departmentCode = scanner.next();

        if (departments.getDepartment(departmentCode).equals(null)) {
            System.out.println("Department Not Found.");
        } else {
            System.out.println("========================================");
            System.out.println(String.format("%s  %s", "Name ", "Code"));
            System.out.println();
            System.out.println(departments.getDepartment(departmentCode));
            System.out.println("========================================");

        }
    }

    public void getAllDepartments() {
        System.out.println("========================================");
        System.out.println(String.format("%s %s", "Department", " Code"));
        System.out.println();
        departments.printDepartments();
        System.out.println("========================================");
    }

    public void studentMenu() {
        int choice;

        do {
            System.out.println("\n****** STUDENT MANAGMENT *********\n");
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Update Student");
            System.out.println("4. Get Student");
            System.out.println("5. Get All Student");
            System.out.println("6. Back");

            System.out.println("Enter your choice ");
            choice = scanner.nextInt();

            if (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5 || choice == 6) {
                switch (choice) {
                    case 1:
                        addStudent();

                        break;
                    case 2:
                        deleteStudent();

                        break;
                    case 3:
                        updateStudent();

                        break;
                    case 4:
                        getStudent();

                        break;
                    case 5:
                        getAllStudents();

                        break;
                    case 6:
                        menu();

                        break;

                }
            } else {
                System.out.println("Please choose b/w 1-6");

            }
        } while (choice != 6);
    }

    public static void main(String[] args) {

        StudentManagementSystem sms = new StudentManagementSystem();
        sms.menu();

    }

}
