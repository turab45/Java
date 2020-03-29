public class Task1Main {

    public static void main(String[] args) {
		System.out.println();
		
        Employee e1 = new Doctor("Shan", 150000.0);
        e1.work();
        e1.giveSalary();

		System.out.println();
		
        Employee e2 = new Teacher("Ahmed", 45000.0);
        e2.work();
        e2.giveSalary();
    }

}