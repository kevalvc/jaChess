package jachess.pieces;

import javafx.scene.control.Cell;

import java.util.ArrayList;

public abstract class Piece implements Cloneable {

    //Member Variables
    private int color;
    private String id = null;
    private String path;
    protected ArrayList<Cell> possiblemoves = new ArrayList<Cell>();  //Protected (access from child classes)

    public abstract ArrayList<Cell> move(Cell pos[][], int x, int y);  //Abstract Function. Must be overridden

    //Id Setter
    public void setId(String id) {
        this.id = id;
    }

    //Path Setter
    public void setPath(String path) {
        this.path = path;
    }

    //Color Setter
    public void setColor(int c) {
        this.color = c;
    }

    //Path getter
    public String getPath() {
        return path;
    }

    //Id getter
    public String getId() {
        return id;
    }

    //Color Getter
    public int getcolor() {
        return this.color;
    }

    //Function to return the a "shallow" copy of the object. The copy has exact same variable value but different reference
    public Piece getcopy() throws CloneNotSupportedException {
        return (Piece) this.clone();
    }
}
