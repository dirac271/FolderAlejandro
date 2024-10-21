package whatever.proyectocajero;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class SQLConection {
    public Connection StartSQLConnection(){
    String url = "jdbc:sqlserver://localhost:1433;databaseName=CAJEROCUNOR;encrypt=true;trustServerCertificate=true;user=sa;password=12345678;";
    Connection connect = null;
    
     try{
         connect = DriverManager.getConnection(url);
             System.out.println("Connection established");
            
            
         }catch(SQLException e){
         System.out.println("Error connecting to the database");
         e.printStackTrace();
     }
     return connect;
}
    public static void main(String[] args) {
    SQLConection sqlConnection = new SQLConection();
    Connection conn = sqlConnection.StartSQLConnection();
    if(conn != null){
        System.out.println("Connection exitosa!");
    }
   }
}