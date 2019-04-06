public abstract class Music {
    protected String title;
    protected String artist;
    public Music(String artist, String title) {
	this.artist = artist;
	this.title = title;
    }
    public String getTitle() {return this.title;}
    public String getArtist() {return this.artist;}
    public void setTitle(String title) {this.title = title;}
    public void setArtist(String artist) {this.artist = artist;}
}
