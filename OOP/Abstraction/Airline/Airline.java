abstract class Airline{
	
	String costumerName;
	String type;
	String ticket="";
	
	public Airline(String costumerName,String type){
		
		this.costumerName=costumerName;
		this.type=type;
		
	}
	
	
	
	
	abstract void canTravel();
	abstract void printDetails();
	
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
	
}
