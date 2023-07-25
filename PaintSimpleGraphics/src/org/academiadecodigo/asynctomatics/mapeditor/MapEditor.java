package org.academiadecodigo.asynctomatics.mapeditor;

import org.academiadecodigo.asynctomatics.mapeditor.grid.Cell;
import org.academiadecodigo.asynctomatics.mapeditor.grid.Cursor;
import org.academiadecodigo.asynctomatics.mapeditor.grid.Grid;
import org.academiadecodigo.asynctomatics.mapeditor.utils.KeyboardListener;

public class MapEditor {

    // fields
    private Grid grid;
    private Cursor cursor;

    // constructor
    public MapEditor(int numberCols, int numberRows) {

        grid = new Grid(numberCols, numberRows);
        cursor = new Cursor();
        new KeyboardListener(cursor, this);
    }

    public void paint() {

        // get cell to check if it is painted or not and give implementation
        Cell cell = grid.getCell(cursor.getCol(), cursor.getRow());

        if (cell.isPainted()) {
            cell.delete();
        } else {
            cell.paint();
        }
    }

    // clear grid
    public void clearGrid() {
        grid.clear();
    }
}
