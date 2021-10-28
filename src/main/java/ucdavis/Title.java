package ucdavis;

public class Title extends BaseDecorator {
    Title(Window it) {
        super(it);
    }

    public void draw() {
        System.out.println("Drawing Title");
        super.draw();
    }

    public void close() {
        System.out.println("Closing Title");
        super.close();
    }
}
