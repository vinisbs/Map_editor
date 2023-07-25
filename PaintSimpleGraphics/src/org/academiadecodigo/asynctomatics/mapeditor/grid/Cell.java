package org.academiadecodigo.asynctomatics.mapeditor.grid;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell {

    // fields
    int col;
    int row;
    Rectangle square;
    private boolean painted;

    // constructed
    public Cell(int col, int row) {
        this.col = col;
        this.row = row;
        square = new Rectangle(col * Grid.CELLSIZE + Grid.PADDING,
                row * Grid.CELLSIZE + Grid.PADDING,
                Grid.CELLSIZE,
                Grid.CELLSIZE);
        square.draw();
        painted = false;
    }

    public void paint() {
        painted = true;
        square.fill();
    }

    public void delete() {
        painted = false;
        square.draw();
    }

    // getters
    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public boolean isPainted() {
        return painted;
    }
}
