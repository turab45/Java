class Task5Interface{
	
	public static void main(String args[]){
		
		Airline a=new PIA("Turab","InterNational");
		
		a.getTicket();
		a.canTravel();
		a.printDetails();
		
		Airline a2= new PIA("Naresh","National");
		
		//before booking a ticket ( without ticket )
		a2.canTravel();
		
		// after booking a ticket
		a2.getTicket();
		a2.canTravel();
		a2.printDetails();
	}
}
