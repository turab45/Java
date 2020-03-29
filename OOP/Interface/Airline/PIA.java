class PIA implements Airline{
	
	String costumerName;
	String type;
	String ticket="";
	
	public PIA(String costumerName,String type){
		this.costumerName=costumerName;
		this.type=type;
	}
	
	public String getTicket(){
		
		if( this.type.charAt(0)=='I' ){
			
			ticket+="I-"+(int)(Math.random()*1000);
		return this.ticket;
		
		}
		else if(this.type.charAt(0)=='N'){
			
		ticket+="N-"+(int)(Math.random()*1000);
		return this.ticket;
		}
		else 
			return ""; 	
		
	}
	
	public String checkDestination(){
		
		if(this.type.charAt(0)=='I')
			return "International";
		else if(this.type.charAt(0)=='N')
			return "National";
		else 
			return "";
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
