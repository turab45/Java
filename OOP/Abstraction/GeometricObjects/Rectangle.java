class Rectangle extends GeometricObjects{
	
	public Rectangle(String color, double size){
		
		super(color,size);
	}
	
	void draw(){
		System.out.println("Drawing a rectangle of size "+this.size);
	}
	
	void isFilled(boolean action){
		
		if(!action){
			System.out.println("Not filled");
		}
		else{
		System.out.println("YES!, Rectangle is filled with "+this.color+" color");
		}
	}
}