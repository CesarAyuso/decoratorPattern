package ucdavis;

public class Scrollbar extends BaseDecorator {
    Scrollbar(Window it) {
        super(it);
    }

    public void draw() {
        System.out.println("Drawing Scrollbar");
        super.draw();
    }

    public void close() {
        System.out.println("Closing Scrollbar");
        super.close();
    }
}