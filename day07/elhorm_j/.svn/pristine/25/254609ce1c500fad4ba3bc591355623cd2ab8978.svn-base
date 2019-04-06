import java.util.*;

public class DeskImpl<T extends Shape, U extends Shape> {
    private List<T> liste;
    private List<U> colorlist;
    public List<T> getListe(){return liste;}
    public void setListe(List<T> liste){this.liste = liste;}
    public DeskImpl(){
	this.liste = new ArrayList<>();
	this.colorlist = new ArrayList<>();
    }
    public void addShape(T shape){
	this.liste.add(shape);
    }

    public void drawShapes() {
	for (T k : liste){
	    k.draw();
	}
    }

    public void addColoredShape(U shape) {
	this.colorlist.add(shape);
    }
    public void drawColoredShapes() {
	for (U c : colorlist){
	    c.draw();
	}
    }

}
