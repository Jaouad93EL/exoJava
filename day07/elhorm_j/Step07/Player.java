public class Player<T> implements Playable<T> {
    T t;
    public Player() {}
    public Player(T t) {this.t = t;}
    public T getT() {return this.t;}
    public void setT(T t) {this.t = t;}
    public void addSong(T t) {this.t = t;}
    public T playSong() {return this.t;}
}
