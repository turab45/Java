class Cat extends Animal{
	
	public Cat(String catName){
		
		super(catName);
	}
	
	public void eat(){
		System.out.println( getName()+" is eating.");
	}
	
	public void breathe(){
		
		System.out.println("Breath in..., Breath out....");
	}
}