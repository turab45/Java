class Album implements Playlist{
	
	String songName;
	double duration;
	public void addSong(String songName,double duration){
		
		this.songName=songName;
		this.duration=duration;
		
		System.out.println(this.songName+" added to the albem.");
		
	}
	
	public void playSong(){
		
		System.out.println("Playing: "+this.songName+" : "+this.duration);
	}
}