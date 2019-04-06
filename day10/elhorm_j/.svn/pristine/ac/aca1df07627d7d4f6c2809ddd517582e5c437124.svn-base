public class MyRunnable implements Runnable {

    Thread thread;
    String word;

    MyRunnable(String word) {
	this.thread = new Thread(this, "New thread");
	this.word = word;
	this.thread.start();
    }

    @Override
    public void run() {
	try {
	    for (int i = 0; i < 5; ++i) {
		System.out.println(this.word);
		Thread.sleep(500);
	    }
	} catch (InterruptedException e) {
	  
	}
	    
    }
}
