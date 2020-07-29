/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_department_using_dao;

import com.DAOImpl.DepartmentDAOImpl;
import com.DAOImpl.StudentDAOImpl;
import com.pojos.Department;
import com.pojos.Student;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Turab Bajeer
 */
public class Student_Department_Using_DAO {

    InputStreamReader is = new InputStreamReader(System.in);
    BufferedReader input = new BufferedReader(is);
    Scanner scanner = new Scanner(System.in);

    DepartmentDAOImpl departmentDAOImpl = new DepartmentDAOImpl();
    StudentDAOImpl studentDAOImpl = new StudentDAOImpl();

    public void addStudent() throws IOException {
        Department d = null;
        System.out.println("********** ADD NEW STUDENT ********** ");
        System.out.print("    -Enter Student Roll No: ");
        Integer roll = scanner.nextInt();
        System.out.print("    -Enter Student Name: ");
        String name = input.readLine();
        System.out.print("    -Enter Student Department No: ");
        Integer deptNo = scanner.nextInt();

        d = departmentDAOImpl.getDepartment(deptNo);
        if (d == null) {
            System.out.println("Department doesn't exist!");
        }

        Student s = new Student();
        s.setStudentId(roll);
        s.setStudentName(name);
        s.setStudentDepartment(d);
        if (studentDAOImpl.addStudent(s) > 0) {
            System.out.println("Student added successfully!");

        } else {
            System.out.println("ERROR");
        }

    }

    public void updateStudent() throws IOException {
        String newName = null;

        System.out.println("********** UPDATE STUDENT ********** ");
        System.out.print("    -Enter Student Roll No: ");
        Integer roll = scanner.nextInt();

        if (studentDAOImpl.getStudent(roll) != null) {
            Student oldStudent = studentDAOImpl.getStudent(roll);
            System.out.print("    -Enter Student's New Name: ");
            newName = input.readLine();

            oldStudent.setStudentName(newName);
            if(studentDAOImpl.updateStudent(oldStudent) > 0){
                System.out.println("Student Updated Successfully!");
            }

        } else {
            System.out.println("Student Not Found!");
        }
    }

    public void deleteStudent() throws IOException {
        System.out.println("********** DELETE STUDENT ********** ");
        System.out.print("    -Enter Student Roll No: ");
        Integer roll = scanner.nextInt();

        if (studentDAOImpl.getStudent(roll) != null) {
           if( studentDAOImpl.deleteStudent(roll)>0){
               System.out.println("Deleted Successfully!");
           }

        } else {
            System.out.println("Student Not Found!");
        }

    }

    public void getStudent() throws IOException {
        System.out.println("********** SEARCH STUDENT ********** ");
        System.out.print("    -Enter Student Roll No: ");
        Integer roll = scanner.nextInt();

        Student searchedStudent = studentDAOImpl.getStudent(roll);

        if (searchedStudent != null) {
            System.out.println("Roll No    = " + searchedStudent.getStudentId());
            System.out.println("Name       = " + searchedStudent.getStudentName());
            System.out.println("Department = " + searchedStudent.getStudentDepartment().getDepartmentName());

        } else {
            System.out.println("Student Not Found!");
        }

    }

    public void getAllStudent() {
        System.out.println("********** SEARCH STUDENT ********** ");
        List<Student> students = studentDAOImpl.getAllStudent();
        if (students != null) {
            System.out.println("ROLL NO     NAME        DEPARTMENT");
            for (Student student : students) {
                System.out.println(student.getStudentId() + "       " + student.getStudentName() + "        " + student.getStudentDepartment().getDepartmentName());

            }
        }

    }

    public void menu() throws IOException {
        System.out.println("******* MENU *******");
        System.out.println("    1. Manage Students");
        System.out.println("    2. Manage Departments");
        System.out.println("    3. Exit");
        System.out.print("Enter: ");
        int choice = scanner.nextInt();

        if (choice == 1 || choice == 2 || choice == 3) {
            switch (choice) {
                case 1:
                    studentMenu();
                    break;
                case 2:
                    departmentMenu();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        } else {
            System.out.println("Please Enter b/w 1-3");

        }

    }

    public void studentMenu() throws IOException {
        System.out.println("*********** MANAGE STUDENT ***********");
        System.out.println("    1. Add");
        System.out.println("    2. Update");
        System.out.println("    3. Delete");
        System.out.println("    4. Search");
        System.out.println("    5. View All");
        System.out.println("    6. Back");

        System.out.println(" Enter: ");
        int choice = scanner.nextInt();

        if (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5 || choice == 6) {
            switch (choice) {
                case 1:
                    addStudent();
                    studentMenu();
                    break;
                case 2:
                    updateStudent();
                    studentMenu();
                    break;
                case 3:
                    deleteStudent();
                    studentMenu();
                    break;
                case 4:
                    getStudent();
                    studentMenu();
                    break;
                case 5:
                    getAllStudent();
                    studentMenu();
                    break;
                case 6:
                    menu();
                    break;
            }
        } else {
            System.out.println("Please Enter b/w 1-6");
        }

    }

    public void departmentMenu() throws IOException {
        System.out.println("*********** MANAGE Department ***********");
        System.out.println("    1. Add");
        System.out.println("    2. Update");
        System.out.println("    3. Delete");
        System.out.println("    4. Search");
        System.out.println("    5. View All");
        System.out.println("    6. Back");

        System.out.println(" Enter: ");
        int choice = scanner.nextInt();

        if (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5 || choice == 6) {
            switch (choice) {
                case 1:
                    addDepartment();
                    departmentMenu();
                    break;
                case 2:
                    updateDepartment();
                    departmentMenu();
                    break;
                case 3:
                    deleteDepartment();
                    departmentMenu();
                    break;
                case 4:
                    getDepartment();
                    departmentMenu();
                    break;
                case 5:
                    getAllDepartment();
                    departmentMenu();
                    break;
                case 6:
                    menu();
                    break;
            }
        } else {
            System.out.println("Please Enter b/w 1-6");
        }

    }

    public void addDepartment() throws IOException {
        Department d = null;
        System.out.println("********** ADD NEW DEPARTMENT ********** \n");
        System.out.print("    -Enter Department ID: ");
        Integer deptNo = scanner.nextInt();
        System.out.print("    -Enter Department Name: ");
        String deptName = input.readLine();

        d = departmentDAOImpl.getDepartment(deptNo);
        if (d != null) {
            System.out.println("Department already exist!");
        }

        Department department = new Department();
        department.setDepartmentId(deptNo);
        department.setDepartmentName(deptName);
        if (departmentDAOImpl.addDepartment(department) > 0) {
            System.out.println("Department added successfully!");

        } else {
            System.out.println("ERROR");
        }

    }

    public void updateDepartment() throws IOException {
        String newName = null;

        System.out.println("********** UPDATE Department ********** ");
        System.out.print("    -Enter Department No: ");
        Integer deptNo = scanner.nextInt();

        if (departmentDAOImpl.getDepartment(deptNo) != null) {
            Department oldDepartment = departmentDAOImpl.getDepartment(deptNo);
            System.out.print("    -Enter Department's New Name: ");
            newName = input.readLine();
            
            oldDepartment.setDepartmentName(newName);
            
            if(departmentDAOImpl.updateDepartment(oldDepartment) > 0){
                System.out.println("Department Updated successfully!");
            }

        } else {
            System.out.println("Department Not Found!");
        }
    }

    public void deleteDepartment() throws IOException {
        System.out.println("********** DELETE Department ********** ");
        System.out.print("    -Enter Department No: ");
        Integer deptNo = scanner.nextInt();

        if (departmentDAOImpl.getDepartment(deptNo) != null) {
            if(departmentDAOImpl.deleteDepartmetnt(deptNo) > 0){
                System.out.println("Department Deleted Successfully!");
            }

        } else {
            System.out.println("Department Not Found!");
        }

    }

    public void getDepartment() throws IOException {
        System.out.println("********** SEARCH DEPARTMENT ********** ");
        System.out.print("    -Enter Department No: ");
        Integer deptNo = scanner.nextInt();

        Department searchedDepartment = departmentDAOImpl.getDepartment(deptNo);

        if (searchedDepartment != null) {
            System.out.println("Roll No    = " + searchedDepartment.getDepartmentId());
            System.out.println("Name       = " + searchedDepartment.getDepartmentName());

        } else {
            System.out.println("Department Not Found!");
        }

    }

    public void getAllDepartment() {
        System.out.println("********** ALL DEPARTMENT ********** ");
        List<Department> departments = departmentDAOImpl.getAllDepartment();
        if (departments != null) {
            System.out.println("Department NO     Department NAME");
            for (Department department : departments) {
                System.out.println(department.getDepartmentId() + "       " + department.getDepartmentName());
            }
        }

    }

    public static void main(String[] args) throws IOException {
        Student_Department_Using_DAO s = new Student_Department_Using_DAO();

        s.menu();

    }

}
