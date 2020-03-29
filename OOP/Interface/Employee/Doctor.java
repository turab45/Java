public class Doctor implements Employee {
	
	String name;
	double salary;
	
   public Doctor(String name,double salary){
	   
		this.name=name;
		this.salary=salary;
   }
    
	public void work(){
		
        System.out.println("Dr: "+this.name+" is giving treatment to the patients.");
    }
    
    public void giveSalary(){
    
        System.out.println("Given salary of Rs: "+this.salary+" to Dr: "+this.name);
    }
}