package creational.singleton;

public class Universe {

    private static Universe instance;

    private Universe() {
    }

    public static Universe getInstance() {
        if (instance == null) {
            synchronized (Universe.class) {
                if (instance == null) {
                    instance = new Universe();
                }
            }
        }
        return instance;
    }

    public void bigBang() throws Exception {
        if (Math.random() > 0.8) {
            throw new Exception("Big Bang Exception: Universe creation failed!");
        }
        System.out.println("The Universe has been created successfully!");
    }
}
