import java.net.*;
import java.util.*;

public class Server {

    ServerSocket serverSocket;

    public Server() {
	try {
	    this.serverSocket = new ServerSocket(1027);
	    Socket s = serverSocket.accept();
	} catch (IOExexeption e) {
	    e.printStackTrace();
	}
    }

    
}
