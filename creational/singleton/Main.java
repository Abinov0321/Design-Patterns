package creational.singleton;


public class Main {
    public static void main(String[] args) {
        try {
            Universe universe = Universe.getInstance();
            universe.bigBang();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
