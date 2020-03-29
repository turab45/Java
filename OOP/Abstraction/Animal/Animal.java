abstract class Animal{
	
	String name;
	public Animal(String name){
	
		this.name=name;
	}
	
	abstract void eat();
	abstract void breathe();
	
	public String getName(){
		return this.name;
	}
	
}
