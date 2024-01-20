package connect;
import java.sql.*;
public class connectDb {
   
    public static Connection getConnect (){ 
        Connection con = null;
        String user = "root";
        String pass = "";
        String url = "jdbc:mysql://localhost:3306/qlthucpham";
        try {
        DriverManager.deregisterDriver(new com.mysql.jdbc.Driver());
        con = DriverManager.getConnection(url,user, pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }  
    public static void closeConnect (Connection con){
        try {
            if (con != null) {
               con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
