import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CriandoBD {
    public static void main(String[] args){
        String driver = "jdbc:postgresql://127.0.0.1:5432/DadosGerais";
        try(Connection conn = DriverManager.getConnection(driver, "postgres", "08072003")){
            if(conn != null){
                System.out.println("Connected to the database");
            }
            else{
                System.out.println("Failed to make connection");
            }
        }catch(SQLException e){
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        }
    }
}
