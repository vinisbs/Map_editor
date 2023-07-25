package org.academiadecodigo.asynctomatics.mapeditor.utils;

import org.academiadecodigo.asynctomatics.mapeditor.MapEditor;
import org.academiadecodigo.asynctomatics.mapeditor.grid.Cursor;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class KeyboardListener implements KeyboardHandler {

    // fields
    private Cursor cursor;
    private MapEditor map;

    // constructor
    public KeyboardListener(Cursor cursor, MapEditor map) {
        this.cursor = cursor;
        this.map = map;
        setup();
    }

    public void setup() {

        Keyboard keyboard = new Keyboard(this);

        KeyboardEvent right = new KeyboardEvent();
        right.setKey(KeyboardEvent.KEY_RIGHT);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(right);

        KeyboardEvent left = new KeyboardEvent();
        left.setKey(KeyboardEvent.KEY_LEFT);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(left);

        KeyboardEvent up = new KeyboardEvent();
        up.setKey(KeyboardEvent.KEY_UP);
        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(up);

        KeyboardEvent down = new KeyboardEvent();
        down.setKey(KeyboardEvent.KEY_DOWN);
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(down);

        KeyboardEvent space = new KeyboardEvent();
        space.setKey(KeyboardEvent.KEY_SPACE);
        space.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(space);

        KeyboardEvent cKey = new KeyboardEvent();
        cKey.setKey(KeyboardEvent.KEY_C);
        cKey.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(cKey);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {

            case KeyboardEvent.KEY_RIGHT:
                cursor.moveRight();
                break;
            case KeyboardEvent.KEY_LEFT:
                cursor.moveLeft();
                break;
            case KeyboardEvent.KEY_DOWN:
                cursor.moveDown();
                break;
            case KeyboardEvent.KEY_UP:
                cursor.moveUp();
                break;
            case KeyboardEvent.KEY_SPACE:
                map.paint();
                break;
            case KeyboardEvent.KEY_C:
                map.clearGrid();
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
    }
}
