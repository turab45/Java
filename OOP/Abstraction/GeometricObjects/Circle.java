class Circle extends GeometricObjects{
	
	public Circle(String color,double size){
		
		super(color,size);
	}
	
	void draw(){
		System.out.println("Drawing Circle of size "+this.size);
	}
	
	void isFilled(boolean action){
		if(!action){
			System.out.println("Not filled.");
		}
		else{
			System.out.println("Yes!, Circle is filled with "+this.color+" color");
		}
	}
}