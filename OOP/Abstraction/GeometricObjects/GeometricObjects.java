abstract class GeometricObjects {
	
	String color;
	double size;
	
	public GeometricObjects(String color,double size){
		
		this.color=color;
		this.size=size;
	}
	
	abstract void draw();
	abstract void isFilled(boolean action);
}
