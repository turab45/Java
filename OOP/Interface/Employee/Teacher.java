public class Teacher implements Employee {
	
	String name;
	double salary;
    public Teacher(String name, double salary){
		
		this.name=name;
		this.salary=salary;
    }
    
	public void work(){
		
        System.out.println("Teacher "+this.name+" is teaching.");
    }
    
    public void giveSalary(){
		
        System.out.println("Given salary of Rs: "+this.salary+" to Teacher "+this.name);
    }
}