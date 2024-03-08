import java.sql.*;

@Deprecated
public class DatabaseBasicDemo {
    public static void main(String[] args) {
        String databaseUrl="jdbc:mysql://127.0.0.1:3306/mydatabase";
        String username="root";
        String password="Vtn16052002";

        String getAllPersonSQL= """
                SELECT * FROM person_tb;
                """;
        try(

                Connection con = DriverManager.getConnection(databaseUrl,username,password);
                Statement statement = con.createStatement();
        ){
          var resultSet = statement.executeQuery(getAllPersonSQL);
          while(resultSet.next()){
              System.out.println("Person ID:"+resultSet.getInt("ID"));
              System.out.println("Person Name:"+resultSet.getString("FullName"));
              System.out.println("Person Gender :"+resultSet.getInt("Age"));
              System.out.println("Person Email :"+resultSet.getString("Email"));
              System.out.println("Person Address :"+resultSet.getString("Address"));
              System.out.println("-----------------------------------------");
          }

            System.out.println("We are able to connect to it now !");
        }catch (SQLException ex ){
            ex.printStackTrace();
        }



    }
}
