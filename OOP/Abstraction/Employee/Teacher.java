public class Teacher extends Employee {
    public Teacher(String name, double salary){
		
		super(name,salary);
    }
    
	public void work(){
		
        System.out.println("Teacher "+this.name+" is teaching.");
    }
    
    public void giveSalary(){
		
        System.out.println("Given salary of Rs: "+this.salary+" to Teacher "+this.name);
    }
}
