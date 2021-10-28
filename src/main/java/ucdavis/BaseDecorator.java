package ucdavis;

public class BaseDecorator implements Window {
    private Window decorating;

    BaseDecorator(Window it) {
        decorating = it;
    }

    public void draw() {
        System.out.println("Moving to next item");
        decorating.draw();
    }

    public void close() {
        System.out.println("Moving to next item");
        decorating.close();
    }
}
