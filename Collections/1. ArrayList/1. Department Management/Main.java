/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package departmentmanagement;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Turab Bajeer
 */
public class Main {

    static Scanner scanner = new Scanner(System.in);
    DepartmentManagement departments = new DepartmentManagement();

    public void addDepartment() {
        System.out.print("Enter Department Name: ");
        String name = scanner.next();
        System.out.print("Enter Department Code: ");
        String code = scanner.next();
        departments.addDepartment(name, code);
        System.out.println("Department: " + name + ", Code: " + code + " Added.");
    }

    public void removeDepartment() {
        System.out.print("Enter Department Code: ");
        String code = scanner.next();
        if (departments.removeDepartment(code)) {
            System.out.println("Deleted Successfully.");
        }else{
        System.out.println("Department Not Found.");
        }
    }

    public void updateDepartment() {
        System.out.print("Enter Department Code: ");
        String oldCode = scanner.next();
            if(departments.containsDepartment(oldCode)){
            System.out.print("Ente New Department Name: ");
            String newName = scanner.next();
            System.out.print("Enter New Department Code: ");
            String newCode = scanner.next();
            departments.updateDepartment(oldCode,newName, newCode);
            System.out.println("Updated Successfully.");
        }else{
        System.out.println("Department Not Found.");
        }
    }

    public void getDepartment() {
        System.out.print("Enter Department Code: ");
        String code = scanner.next();

        departments.getDepartment(code);
    }

    public void getAllDepartments() {
        System.out.println("Department Name\tDepartment Code");
        departments.getAllDepartments();
    }

    public void menu() {
        System.out.println("Press");
        System.out.println("    1- Add Department");
        System.out.println("    2- Update Department");
        System.out.println("    3- Delete Department");
        System.out.println("    4- Search Department");
        System.out.println("    5- Show All");
        System.out.println("    6- Print Menu");
        System.out.println("    7- Exit");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Main main = new Main();
        
        main.menu();

        int choice;
        do {
            System.out.print("Enter your choice: ");
            choice=scanner.nextInt();
            
            switch(choice){
                case 1:
                    main.addDepartment();
                    break;
                case 2:
                    main.updateDepartment();
                    break;
                case 3:
                    main.removeDepartment();
                    break;
                case 4:
                    main.getDepartment();
                    break;
                case 5:
                    main.getAllDepartments();
                    break;
                case 6:
                    main.menu();
                    break;
                case 7:
                    
                    break;
            }
            
        } while (choice != 7);

    }

}
