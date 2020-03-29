class Cat implements Animal{
	
	String catName;
	public Cat(String catName){
		
		this.catName=catName;
	}
	
	public void eat(){
		System.out.println( this.catName+" is eating.");
	}
	
	public void breathe(){
		
		System.out.println("Breath in..., Breath out....");
	}
}