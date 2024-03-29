package ReaderUtilities.ConnectToMySQLDB;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

public class MySQLDB {

    static Connection connection;
    static Properties prop;
    static ResultSet rs;
    static Statement statement;

    public static Properties loadProp() throws Exception, IOException {
        String relativePath = "\\Properties\\secret.properties";
        String path = System.getProperty("user.dir") + relativePath;
        prop = new Properties();

        try {
            InputStream input = new FileInputStream(path);
            prop.load(input);
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }

    public static Connection connectToMySQLDB() throws Exception {
        prop = loadProp();

        String driver = prop.getProperty("MYSQLJDBC.driver");
        String url = prop.getProperty("MYSQLJDBC.url");
        String username = prop.getProperty("MYSQLJDBC.username");
        String password = prop.getProperty("MYSQLJDBC.password");

        try {
            Class.forName(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (connection != null) {
            System.out.println("CONNECTED TO DATABASE!");
        } else {
            System.out.println("UNABLE TO CONNECT TO DATABASE :(");
        }

        return connection;
    }

    public static HashMap<String, String> readDB() {
        HashMap<String, String> students = new HashMap<>();

        String query = "select * from test_schema_1.test";

        try {
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            rs = statement.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            while (rs.next()) {
                String studentID = rs.getString(1);
                String firstName = rs.getString(2);
                String lastName = rs.getString(3);
                String fullName = firstName + " " + lastName;

                students.put(studentID, fullName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) throws Exception {
        connectToMySQLDB();
        HashMap<String, String> students = readDB();

        Set<String> keys = students.keySet();

        for (String key : keys){

            System.out.println(key + ":\n\t" + students.get(key));
        }
    }
}

