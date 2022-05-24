
package history_of_art_app.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public abstract class DAO {
    
    protected Connection con = null;
    protected ResultSet res = null;
    protected Statement stat = null;
    
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "history_of_art";
    private final String DRIVER = "com.mysql.jdbc.Driver";
      
    protected void connect2DB() throws ClassNotFoundException, SQLException {
        try {
            Class.forName(DRIVER);
            String urlBaseDeDatos = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false";
            con = DriverManager.getConnection(urlBaseDeDatos, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Bro, no pudiste solucionar el error");
            throw ex;
        }
    }
    
    protected void disconnectFromDB() throws Exception {
        try {
            if (res != null){
                res.close();
            }
            if (stat != null){
                stat.close();
            }
            if (con != null){
                con.close();
            }
        } catch (SQLException e) {
            throw e;
        }
    }
    
    protected void insertAlterDelete (String thisSQLStat) throws Exception {
        try {
            connect2DB();
            stat = con.createStatement();
            stat.executeUpdate(thisSQLStat);
        } catch (ClassNotFoundException | SQLException ex) {
            con.rollback();
            throw ex;
        } finally {
            disconnectFromDB();
        }
    }
    
    
  
    
    protected void queryDB(String anSQLquery) throws Exception {
        try {
            connect2DB();
            stat = con.createStatement();
            res = stat.executeQuery(anSQLquery);
        } catch (Exception e) {
            throw e;
        }
    }
    
}

