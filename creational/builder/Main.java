package creational.builder;

public class Main {
    public static void main(String[] args) {
        try {
            Pizza pizza = new Pizza.PizzaBuilder()
                .dough("Thick Crust")
                .sauce("Tomato")
                .topping("Cheese")
                .build();

            System.out.println(pizza);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
