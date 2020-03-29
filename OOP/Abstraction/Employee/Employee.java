abstract public class Employee {
    String name;
    double salary;
	
	public Employee(String name,double salary){
		this.name=name;
		this.salary=salary;
	}
    
   abstract public void work();
   abstract public void giveSalary();
}