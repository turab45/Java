class Circle implements GeometricObjects{
	
	String color;
	double size;
	public Circle(String color,double size){
		
		this.color=color;
		this.size=size;
	}
	
	public void draw(){
		System.out.println("Drawing Circle of size "+this.size);
	}
	
	public void isFilled(boolean action){
		if(!action){
			System.out.println("Not filled.");
		}
		else{
			System.out.println("Yes!, Circle is filled with "+this.color+" color");
		}
	}
}