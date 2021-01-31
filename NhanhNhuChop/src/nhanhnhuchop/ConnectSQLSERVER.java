package nhanhnhuchop;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectSQLSERVER {
    public static Connection conn;
    public static String nameConnect = "jdbc:sqlserver://localhost:1433;databaseName=NhanhNhuChop;user=sa;password=sa";
    public static boolean connectSQL(){
        boolean res = true;
        try {
            conn = DriverManager.getConnection(nameConnect);
            
            if (conn != null) {
                return res = true;
            }
            else {
                return res = false;
            }
        } catch (SQLException ex) {
            System.out.println("not ok");
        }
        return res;
    }
    public static void main(String args[]) {
        if (connectSQL() == true) {
            System.out.println("ok");
        }
    }
}
