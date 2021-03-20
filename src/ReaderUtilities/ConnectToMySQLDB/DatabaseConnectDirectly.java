package ReaderUtilities.ConnectToMySQLDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DatabaseConnectDirectly {

    public static void main(String[] args) throws SQLException {

        // Direct Approach to Connect with Database/DB

        // protocol//[hosts:][port][/database][?properties]
        String url = "jdbc:mysql://localhost:3306/test_schema_1?serverTimezone=UTC";
        String user = "root";
        String password = "Pizzabuns123";

        Connection connection = null;
        Statement statement = null;

        Movie titanic = new Movie(5, "Titanic", 1997, "Romance", "PG-14");
        Movie catchMeIfYouCan = new Movie(7, "catchMeIfYouCan", 2018, "Action", "PG-10");
        Movie fastAndFurious = new Movie(8, "fastAndFurious", 2015, "Action", "PG-12");
        Movie kabhiKhusiKabiGum = new Movie(6, "kabhiKhusiKabiGum", 2003, "Family", "PG-5");
        Movie fugitive = new Movie(4, "fugitive", 2000, "Action", "PG-8");

        ArrayList<Movie> movie = new ArrayList<>();
        movie.add(titanic);
        movie.add(catchMeIfYouCan);
        movie.add(fastAndFurious);
        movie.add(kabhiKhusiKabiGum);
        movie.add(fugitive);

        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            for (Movie mv : movie) {
                String query = "insert into movie(id,title,releaseYear,genre,mpaRating)"
                        + "values("+mv.getId()+",'"+mv.getTitle()+"',"+mv.getReleaseYear()+" ,'"+mv.getGenre()+"','"+mv.getMpaRating()+"')";
                statement.execute(query);
            }
        } catch (
                SQLException e) {
            e.printStackTrace();
            System.out.println("Connection Not Found");
        } finally {
            statement.close();
            connection.close();
        }
    }
}

