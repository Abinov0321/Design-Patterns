package behavioural.memonto;

public class Main {
    public static void main(String[] args) {
        try {
            Dinosaur dinosaur = new Dinosaur("T-Rex", 100);
            System.out.println(dinosaur);

            Dinosaur.Memento memento = dinosaur.save();

            dinosaur = new Dinosaur("Velociraptor", 80);
            System.out.println(dinosaur);

            dinosaur.restore(memento);
            System.out.println(dinosaur);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}