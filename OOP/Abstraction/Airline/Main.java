class Task5Main{
	
	public static void main(String args[]){
		
		Airline a=new PIA("Turab","InterNational");
		
		a.getTicket();
		a.canTravel();
		a.printDetails();
		
		Airline a2= new PIA("Naresh","National");
		a2.canTravel();
	}
}
