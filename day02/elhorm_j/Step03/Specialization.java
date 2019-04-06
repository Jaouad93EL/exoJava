public class Specialization {
    private int id;
    private String code;
    private String label;

    public Specialization(int id, String code, String label) {
	this.id = id;
	this.code = code;
	this.label = label;
    }

    public void setId(int id) {this.id = id;}
    public void setCode(String code) {this.code = code;}
    public void setLabel(String label) {this.label = label;}
    
    public int getId() {return this.id;}
    public String getCode() {return this.code;}
    public String getLabel() {return this.label;}
}
