package sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {
    
    public static Connection getConnection(){
        
        //on pointe vers la base de donn�e souhait�e avec son adresse, nom, etc...
        String url = "jdbc:mysql://localhost/";
        String dbName = "cda_21157";
        //cas pour windows
        String user="root";
        String pwd="";
        
        Connection connect = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            try {
                connect = DriverManager.getConnection(url+dbName,user,pwd);
                System.out.println("OK for connect");
            
            } catch (SQLException e) {
                // TODO: handle exception
                e.printStackTrace();
            }
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connect;
    }
}
