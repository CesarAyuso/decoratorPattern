package ucdavis;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Getting Started!");
        Window eg1 = new Title(new Border(new BaseWindow("Simple First Window")));
        Window eg2 = new Scrollbar(new Title(new BaseWindow("Second Simple Window")));
        Window eg3 = new Title(new Title(new Border(new BaseWindow("silly window"))));
        eg1.draw();
        eg2.close();
        eg3.draw();
    }
}
