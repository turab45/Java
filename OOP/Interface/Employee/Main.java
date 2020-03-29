class Task1Interface{
	
	public static void main(String args[]){
		Employee e1 = new Doctor("Ali",50000.0);
		e1.work();
		e1.giveSalary();
		
		Employee e2 = new Teacher("Ahmed",30000);
		e2.work();
		e2.giveSalary();
		
	}
}
