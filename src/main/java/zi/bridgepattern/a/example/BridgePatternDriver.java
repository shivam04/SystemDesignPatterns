package zi.bridgepattern.a.example;

public class BridgePatternDriver {
    public static void main(String[] args) {
        Shape redCircle= new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle= new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
