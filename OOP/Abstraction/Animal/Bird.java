class Bird extends Animal{
	
	public Bird(String birdName){
		
		super(birdName);
	}
	
	public void eat(){
		
		System.out.println(getName()+" is eating");
	}
	
	public void breathe(){
		
		System.out.println("Breath in..., Breath out...");
	}
}