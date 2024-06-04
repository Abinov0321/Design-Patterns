package structure.proxy;

public class RealDatabase implements Database {
    public void query(String sql) throws Exception {
        if (sql == null || sql.isEmpty()) {
            throw new Exception("SQL query cannot be null or empty");
        }
        System.out.println("Executing query: " + sql);
    }
}
