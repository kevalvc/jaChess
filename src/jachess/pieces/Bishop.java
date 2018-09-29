package jachess.pieces;

import javafx.scene.control.Cell;

import java.util.ArrayList;

public class Bishop extends Piece {

    // Constructor
    public Bishop() {

    }

                                    /*    Code for getPiece and getColor are yet to be initiated     */

    public ArrayList<Cell> move(Cell state[][], int x, int y) {

        possiblemoves.clear();

//        NorthEast
        int movx = x-1, movy = y+1;
        while(movx >= 0 && movy < 8) {
            if (state[movx][movy].getPiece() == null) {
                possiblemoves.add(state[movx][movy]);
            } else if (state[movx][movy].getPiece().getColor() == this.getColor()) {
                break;
            } else {
                possiblemoves.add(state[movx][movy]);
                break;
            }
            movx--;
            movy++;
        }

//        NorthWest
        movx = x-1; movy = y-1;
        while(movx >= 0 && movy >=0) {
            if (state[movx][movy].getPiece() == null) {
                possiblemoves.add(state[movx][movy]);
            } else if (state[movx][movy].getPiece().getColor() == this.getColor()) {
                break;
            } else {
                possiblemoves.add(state[movx][movy]);
                break;
            }
            movx--;
            movy--;
        }

//        SouthWest
        movx = x+1; movy = y-1;
        while(movx < 8 && movy >= 0) {
            if (state[movx][movy].getPiece() == null) {
                possiblemoves.add(state[movx][movy]);
            } else if (state[movx][movy].getPiece().getColor() == this.getColor()) {
                break;
            } else {
                possiblemoves.add(state[movx][movy]);
                break;
            }
            movx++;
            movy--;
        }

//        SouthEast
        movx = x+1; movy = y+1;
        while(movx < 8 && movy < 8) {
            if (state[movx][movy].getPiece() == null) {
                possiblemoves.add(state[movx][movy]);
            } else if (state[movx][movy].getPiece().getColor() == this.getColor()) {
                break;
            } else {
                possiblemoves.add(state[movx][movy]);
                break;
            }
            movx++;
            movy++;
        }


        return possiblemoves;
    }

}
