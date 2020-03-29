class Rectangle implements GeometricObjects{
	
	String color;
	double size;
	public Rectangle(String color, double size){
		
		this.color=color;
		this.size=size;
	}
	
	public void draw(){
		System.out.println("Drawing a rectangle of size "+this.size);
	}
	
	public void isFilled(boolean action){
		
		if(!action){
			System.out.println("Not filled");
		}
		else{
		System.out.println("YES!, Rectangle is filled with "+this.color+" color");
		}
	}
}