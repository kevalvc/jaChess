package jachess.pieces;

import javafx.scene.control.Cell;

import java.util.ArrayList;

public abstract class Piece implements Cloneable {

    protected ArrayList<Cell> possiblemoves = new ArrayList<Cell>();


}
