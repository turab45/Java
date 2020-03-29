class Task2Main{
	
	public static void main(String args[]){
		
		System.out.println("\n***** RECTANGLE ******");
		GeometricObjects ob1=new Rectangle("Black & Red",25.76);
		ob1.isFilled(false);
		ob1.draw();
		ob1.isFilled(true);
		
		System.out.println("\n***** CIRCLE ******");
		
		GeometricObjects ob2=new Circle("Blue & Green ",29.12);
		ob2.isFilled(false);
		ob2.draw();
		ob2.isFilled(true);
	}
}
