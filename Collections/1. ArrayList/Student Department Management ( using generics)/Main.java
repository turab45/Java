import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   static Scanner scanner=new Scanner(System.in);
    ArrayList<Student> students;
    ArrayList<Department> departments;

    public Main() {
        this.students = new ArrayList<>();
        this.departments = new ArrayList<>();
    }

    public void printInstructions(){
        System.out.println("Press");
        System.out.println("    1- Student Manage ");
        System.out.println("    2- Department Management");
        System.out.println("    3- Exit");
        System.out.print(" Enter choice: ");
        int choice = scanner.nextInt();
        switch(choice){
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
    }
    public void studentMenu(){
        System.out.println("Press");
        System.out.println("    1- Add Student");
        System.out.println("    2- Update Student");
        System.out.println("    3- Delete Student");
        System.out.println("    4- Get Student");
        System.out.println("    5- Get All");
        System.out.println("    6- Back");
        System.out.println("    7- Exit");
        System.out.print("\nEnter Choice: ");
        int choice = scanner.nextInt();
        if(choice==1 || choice==2 ||choice==3||choice==4||choice==5||choice==6||choice==7) {
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
                    removeStudent();
                    studentMenu();
                    break;
                case 4:
                    System.out.println("-----------------------------------------------------");
                    getStudent();
                    System.out.println("-----------------------------------------------------");
                    studentMenu();
                    break;
                case 5:
                    System.out.println("-----------------------------------------------------");
                    getAll();
                    System.out.println("-----------------------------------------------------");
                    studentMenu();
                    break;
                case 6:
                    printInstructions();
                    break;
                case 7:
                    System.exit(0);
                    break;

            }
        }
        else{
            System.out.println("Please choose b/w 1-7");
        }
    }

    public void addStudent(){
        System.out.println("\n****** ADD STUDENT ******\n");
        System.out.print("Enter Student Name: ");
        String name=scanner.next();
        System.out.print("Enter Student Roll No: ");
        String rollNo=scanner.next();
        addDepartment();

        students.add(new Student(name,rollNo));
        System.out.println(name+":"+rollNo+" added Successfully.");
    }

    public void updateStudent(){
        System.out.println("\n****** UPDATE STUDENT ******\n");
        System.out.print("Enter Student Roll No : ");
        String oldRollNo=scanner.next();
        if(findStudent(oldRollNo) >= 0){
            System.out.print("Enter New Name: ");
            String newName = scanner.next();
            System.out.print("Enter New Roll No: ");
            String newRollNo = scanner.next();
            students.set(findStudent(oldRollNo),new Student(newName,newRollNo));
        }else{
            System.out.println(oldRollNo+" not found.");
        }

    }
    public int findStudent(String rollNo){

       for(Student student:students){
           if(student.getRollNumber().equals(rollNo)){
               return students.indexOf(student);
           }
       }

        return -1;

    }

    public void removeStudent(){
        System.out.println("\n****** DELETE STUDENT ******\n");
        System.out.print("Enter Student Roll No : ");
        String oldRollNo=scanner.next();
        if(findStudent(oldRollNo) >= 0){
            int index = findStudent(oldRollNo);
            students.remove(index);
            departments.remove(index);
        }else{
            System.out.println(oldRollNo+" not found.");
        }

    }

    public void getStudent(){
        System.out.println("\n****** GET STUDENT ******\n");
        System.out.print("Enter Student Roll No : ");
        String oldRollNo=scanner.next();
        int index = findStudent(oldRollNo);
        if(index >= 0){

            System.out.println("Name       : "+students.get(index).getName());
            System.out.println("Roll No    : "+students.get(index).getRollNumber());
            System.out.println("Department : "+departments.get(index).getDepartmentName());
            System.out.println("Dept: Code : "+departments.get(index).getDepartmentCode());
        }else{
            System.out.println(oldRollNo+" not found.");
        }
    }
    public void getAll(){
        if(students.isEmpty()){
            System.out.println("No records available.");
    }else{

            System.out.println("Student Name -- Roll No -- Department -- Code");
            for(int i=0; i<students.size(); i++){
                Student student = students.get(i);
                Department department = departments.get(i);
                System.out.println((i+1)+". "+student.getName()+"      "+student.getRollNumber()+"      "+department.getDepartmentName()+"      "+department.getDepartmentCode());

            }
        }
    }

    public void departmentMenu(){
        System.out.println("Press");
        System.out.println("    1- Add Department");
        System.out.println("    2- Update Department");
        System.out.println("    3- Delete Department");
        System.out.println("    4- Get Department");
        System.out.println("    5- Get All");
        System.out.println("    6- Back");
        System.out.println("    7- Exit");
        System.out.print("\nEnter Choice: ");
        int choice = scanner.nextInt();
        if(choice==1 || choice==2 ||choice==3||choice==4||choice==5||choice==6||choice==7) {
            switch (choice) {
                case 1:
                    System.out.println("\n****** ADD DEPARTMENT ******\n");
                    addDepartment();
                    departmentMenu();
                    break;
                case 2:
                    updateDepartment();
                    departmentMenu();
                    break;
                case 3:
                    removeDepartment();
                    departmentMenu();
                    break;
                case 4:
                    System.out.println("-----------------------------------------------------");
                    getDepartment();
                    System.out.println("-----------------------------------------------------");
                    departmentMenu();
                    break;
                case 5:
                    System.out.println("-----------------------------------------------------");
                    getAllDepartments();
                    System.out.println("-----------------------------------------------------");
                    departmentMenu();
                    break;
                case 6:
                    printInstructions();
                    break;
                case 7:
                    System.exit(0);
                    break;

            }
        }
        else{
            System.out.println("Please choose b/w 1-7");
        }
    }


    public void addDepartment(){

        System.out.print("Enter Department Name: ");
        String name=scanner.next();
        System.out.print("Enter Department Code: ");
        String code=scanner.next();
        departments.add(new Department(name,code));
        System.out.println(name+":"+code+" added Successfully.");
    }

    public void updateDepartment(){
        System.out.println("\n****** UPDATE Department ******\n");
        System.out.print("Enter Department Code : ");
        String oldCode=scanner.next();
        if(findDepartment(oldCode) >= 0){
            System.out.print("Enter New Name: ");
            String newName = scanner.next();
            System.out.print("Enter New Code: ");
            String newCode = scanner.next();
            departments.set(findDepartment(oldCode),new Department(newName,newCode));
        }else{
            System.out.println(oldCode+" not found.");
        }

    }
    public int findDepartment(String code){

        for(Department department:departments){
            if(department.getDepartmentCode().equals(code)){
                return departments.indexOf(department);
            }
        }

        return -1;

    }

    public void removeDepartment(){
        System.out.println("\n****** DELETE DEPARTMENT ******\n");
        System.out.print("Enter Department Code: ");
        String oldCode=scanner.next();
        if(findDepartment(oldCode) >= 0){

            departments.remove(findDepartment(oldCode));
        }else{
            System.out.println(oldCode+" not found.");
        }

    }

    public void getDepartment(){
        System.out.println("\n****** GET STUDENT ******\n");
        System.out.print("Enter Department Code: ");
        String oldCode=scanner.next();
        int index = findDepartment(oldCode);
        if(index >= 0){

            System.out.println("Name    : "+departments.get(index).getDepartmentName());
            System.out.println("Roll No : "+departments.get(index).getDepartmentCode());
        }else{
            System.out.println(oldCode+" not found.");
        }
    }
    public void getAllDepartments(){
        if(departments.isEmpty()){
            System.out.println("No records available.");
        }else{
            int i=1;
            System.out.println("Department Name -- Department Code");
            for(Department department:departments){
                System.out.println(i+". "+department.getDepartmentName()+"      "+department.getDepartmentCode());
                i++;
            }
        }
    }

    public static void main(String args[]){
        Main main = new Main();
        System.out.println("        WELCOME TO STUDENT MANAGEMENT SYSTEM");
        main.printInstructions();


            }

        }




