package behavioural.memonto;

public class Dinosaur {
    private String species;
    private int age;

    public Dinosaur(String species, int age) {
        this.species = species;
        this.age = age;
    }

    public Memento save() {
        return new Memento(species, age);
    }

    public void restore(Memento memento) {
        this.species = memento.getSpecies();
        this.age = memento.getAge();
    }

    @Override
    public String toString() {
        return "Dinosaur [species=" + species + ", age=" + age + "]";
    }
    public static class Memento {
        private final String species;
        private final int age;

        public Memento(String species, int age) {
            this.species = species;
            this.age = age;
        }

        public String getSpecies() {
            return species;
        }

        public int getAge() {
            return age;
        }
    }
}