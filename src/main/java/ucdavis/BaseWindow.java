package ucdavis;

public class BaseWindow implements Window {
    private String myname;

    BaseWindow(String name) {
        myname = name;
    }

    public void draw() {
        System.out.println("Drawing Base Window named " + myname);
    }

    public void close() {
        System.out.println("Closing Base Window named " + myname);
    }
}
