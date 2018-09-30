package jachess.pieces;

import javafx.scene.control.Cell;

import java.util.ArrayList;

public class Queen extends Piece {

    public Queen() {

    }


    /*    Code for getPiece and getColor are yet to be initiated     */

    public ArrayList<Cell> move(Cell state[][], int x, int y) {

        possiblemoves.clear();

        //        NorthEast
        Parent.northeast(state, x, y);

//        NorthWest
        Parent.northwest(state, x, y);

//        SouthWest
        Parent.southwest(state, x, y);

//        SouthEast
        Parent.southeast(state, x, y);


//        Above
        Parent.above(state, x, y);

//        Below
        Parent.below(state, x, y);

//        Left
        Parent.left(state, x, y);

//        Right
        Parent.right(state, x, y);

        return possiblemoves;
    }

}
