class PIA extends Airline{
	
	public PIA(String costumerName,String type){
		super(costumerName,type);
	}
	
	
	public void canTravel(){
	
		if(this.ticket.equals("")){
			System.out.println("\nSORRY!,"+this.costumerName+" you don't have any ticket.\n Please book a ticket.");
		}
		else{
			System.out.println("\nWELCOME, "+this.costumerName+"  You can travel "+checkDestination());
		}
	}
	
	public void printDetails(){
		
		System.out.println("======== DETAILS =======");
		System.out.println("\nName      : "+this.costumerName);
		System.out.println("Ticket No : "+this.ticket);
		
		System.out.println("Type      : "+checkDestination());
		System.out.println("\n=========================");
	}
}
