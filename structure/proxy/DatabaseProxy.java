package structure.proxy;

public class DatabaseProxy implements Database {
    private RealDatabase realDatabase;

    public DatabaseProxy() {
        this.realDatabase = new RealDatabase();
    }

    public void query(String sql) {
        try {
            realDatabase.query(sql);
        } catch (Exception e) {
            System.out.println("Error executing query: " + e.getMessage());
        }
    }
}
