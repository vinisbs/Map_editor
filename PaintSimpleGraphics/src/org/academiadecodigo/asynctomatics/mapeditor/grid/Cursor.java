package org.academiadecodigo.asynctomatics.mapeditor.grid;

import org.academiadecodigo.simplegraphics.graphics.Color;

public class Cursor extends Cell {

    // constructor
    public Cursor() {
        super(1, 1);
        square.setColor(Color.RED);
        paint();
    }

    public void moveRight() {
        if (col < Grid.numberCols -1) {
            col++;
            square.translate(Grid.CELLSIZE, 0);
        }
    }

    public void moveLeft() {
        if (col > 0) {
            col--;
            square.translate(-Grid.CELLSIZE, 0);
        }
    }

    public void moveDown() {
        if (row < Grid.numberRows -1) {
            row++;
            square.translate(0, Grid.CELLSIZE);
        }
    }

    public void moveUp() {
        if (row > 0) {
            row--;
            square.translate(0, -Grid.CELLSIZE);
        }
    }
}
