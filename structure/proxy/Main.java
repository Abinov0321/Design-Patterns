package structure.proxy;

public class Main {
    public static void main(String[] args) {
        try {
            Database database = new DatabaseProxy();

            // This query will be executed
            database.query("SELECT * FROM users");

            // This query will throw an error
            database.query("");
        } catch (Exception e) {
            e.printStackTrace(); // This will print the stack trace of the exception
        }
    }
}
