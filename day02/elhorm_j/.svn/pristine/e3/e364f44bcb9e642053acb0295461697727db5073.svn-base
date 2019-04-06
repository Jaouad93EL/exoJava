public class Team {

    private String name;
    private Manager manager;
    private Developer[] developers;
    
    public Team(String name, Manager manager, int numberOfDevelopers) {
	this.name = name;
	this.manager = manager;
	this.developers = new Developer[numberOfDevelopers];
    }

    public void setName(String name) {this.name = name;}
    public void setManager(Manager manager) {this.manager = manager;}
    public void setDevelopers(Developer[] developers) {this.developers = developers;}

    public String getName() {return this.name;}
    public Manager getManager() {return this.manager;}
    public Developer[] getDevelopers() {return this.developers;}

    public boolean addDeveloper(Developer d) {
	int i = 0;
	
	while (i < this.developers.length) {
	    if (this.developers[i] == null)
		break;
	    ++i;
	}
	if (i == developers.length)
	    return false;
	this.developers[i] = d;
	return true;
    }

    public boolean deleteDeveloper(Developer d) {
	Developer[] dev = new Developer[this.developers.length];
	boolean retour = false;
	
	for (int i = 0; i < this.developers.length; ++i) {
	    if (d.getId() != this.developers[i].getId()) {
		dev[i] = developers[i];
	    }
	    else
		retour = true;
	}
	    this.developers = dev;
	    return retour;
    }
	
    public int countDevelopers() {
	return this.developers.length;
    }

    public boolean isTeamFull() {
	for (int i = 0; i < this.developers.length; ++i)
	    if (this.developers[i] == null)
		return false;
	return true;	       
    }

    public boolean superVisorOf(Team[] t, Developer d) {
	
       	for (int i = 0; i < t.length; ++i) {
	    if (this.manager.equals(t[i].manager))
		for (int j = 0; j < t[i].developers.length; ++j) {
		    if (d.equals(t[i].developers[j]))
			return true;
		}
	}
	return false;
    }

    

     
    
}
