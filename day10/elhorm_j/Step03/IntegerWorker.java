import java.util.*;

public class IntegerWorker extends Thread {

    Thread thread;
    List list;
    int from;
    int to;
    long timeToSleep;
    
    public IntegerWorker(ArrayList list, int from, int to, long timeToSleep) {
	this.list = list;
	this.from = from;
	this.to = to;
	this.timeToSleep = timeToSleep;
	this.thread = new Thread(this, "New thread");
    }

    @Override
    public void run() {
	try {
	    while (this.from < this.to) {
		System.out.println(this.list.get(this.from));
		++this.from;
		Thread.sleep(this.timeToSleep);
	    }
	} catch (InterruptedException e) {
	}
    }
}

