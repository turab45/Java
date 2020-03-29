abstract class Playlist{
	
	public String songName;
	public double duration;
	
	abstract void addSong(String songName, double duration);
	abstract void playSong();
}
