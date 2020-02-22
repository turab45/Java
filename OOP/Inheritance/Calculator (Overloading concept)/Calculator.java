// class in which main method is located.
class Calculator{
	public static void main(String args[]){
		Adder adder=new Adder();
		Subtractor subt=new Subtractor();
		Multiplier mult=new Multiplier();
		
		//performing addition
		System.out.println("Addition is :");
		System.out.println(adder.add(1,2));
		System.out.println(adder.add(1,2,3));
		System.out.println(adder.add(1,2,3,4));
		System.out.println(adder.add(1,2,3,4,5));
		//System.out.println(adder.add(1,2,3,4,5,6));
		
		//performing subtraction
		System.out.println("\nSubtraction is  :\n");
		System.out.println(subt.sub(1,2));
		System.out.println(subt.sub(1,2,3));
		System.out.println(subt.sub(1,2,3,4));
		System.out.println(subt.sub(1,2,3,4,5));
		//System.out.println(subtraction.sub(1,2,3,4,5,6));
		
		//performing multiplication
		System.out.println("\nMultiplication  :\n");
		System.out.println(mult.mul(1,2));
		System.out.println(mult.mul(1,2,3));
		System.out.println(mult.mul(1,2,3,4));
		System.out.println(mult.mul(1,2,3,4,5));
		//System.out.println(multiplier.mul(1,2,3,4,5,6));*/
	}
}
