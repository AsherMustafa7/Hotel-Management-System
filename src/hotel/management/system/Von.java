package hotel.management.system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Von{

    Connection connection;
    Statement statement;
    public Von(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");//3.0

            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelMs", "root", "asher");
            statement= connection.createStatement();

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
