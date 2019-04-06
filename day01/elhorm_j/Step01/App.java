public class App {
    
    public void printArgs(String[] args) {
	for (int i = 0; i  < args.length; ++i)
	    System.out.println(args[i]);
    }

    public String[] toUpperCase(String[] args) {

	for (int i = 0; i < args.length; ++i)
	    args[i] = args[i].toUpperCase();
	return args;
    }

    public String[] removeChar(String[] args, char c) {
	String u = "" + c;
	
	for (int i = 0; i < args.length; ++i)
	    args[i] = args[i].replaceAll(u, "");
        return args;
    } 
}
