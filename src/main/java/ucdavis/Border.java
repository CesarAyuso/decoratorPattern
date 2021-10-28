package ucdavis;

import javax.swing.border.BevelBorder;

public class Border extends BaseDecorator {
    Border(Window it) {
        super(it);
    }

    public void draw() {
        System.out.println("Drawing Border");
        super.draw();
    }

    public void close() {
        System.out.println("Closing Border");
        super.close();
    }
}