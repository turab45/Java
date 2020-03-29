class Bird implements Animal{
	
	String birdName;
	
	public Bird(String birdName){
		
		this.birdName=birdName;
	}
	
	public void eat(){
		
		System.out.println(this.birdName+" is eating");
	}
	
	public void breathe(){
		
		System.out.println("Breath in..., Breath out...");
	}
}