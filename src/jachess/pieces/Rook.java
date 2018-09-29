package jachess.pieces;

import javafx.scene.control.Cell;

import java.util.ArrayList;

public class Rook extends Piece {

    public Rook () {

    }

                                                /*    Code for getPiece and getColor are yet to be initiated     */

    public ArrayList<Cell> move(Cell state[][], int x, int y) {

        possiblemoves.clear();

//        Above
        int movx = x-1;
        while(movx >= 0) {
            if (state[movx][y].getPiece() == null) {
                possiblemoves.add(state[movx][y]);
            } else if (state[movx][y].getPiece().getColor() == this.getColor()) {
                break;
            } else {
                possiblemoves.add(state[movx][y]);
                break;
            }
            movx--;
        }

//        Below
        movx = x+1;
        while(movx < 8) {
            if (state[movx][y].getPiece() == null) {
                possiblemoves.add(state[movx][y]);
            } else if (state[movx][y].getPiece().getColor() == this.getColor()) {
                break;
            } else {
                possiblemoves.add(state[movx][y]);
                break;
            }
            movx++;
        }

//        Left
        int movy = y-1;
        while(movy >= 0) {
            if (state[x][movy].getPiece() == null) {
                possiblemoves.add(state[x][movy]);
            } else if (state[x][movy].getPiece().getColor() == this.getColor()) {
                break;
            } else {
                possiblemoves.add(state[x][movy]);
                break;
            }
            movy--;
        }

//        Right
        movy = y+1;
        while(movy < 8) {
            if (state[x][movy].getPiece() == null) {
                possiblemoves.add(state[x][movy]);
            } else if (state[x][movy].getPiece().getColor() == this.getColor()) {
                break;
            } else {
                possiblemoves.add(state[x][movy]);
                break;
            }
            movy++;
        }


        return possiblemoves;
    }

}
