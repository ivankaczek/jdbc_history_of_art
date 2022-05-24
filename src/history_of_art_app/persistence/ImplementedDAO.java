
package history_of_art_app.persistence;

public class ImplementedDAO extends DAO {
    
    
    
    
    
    
    /*
    public PaintingsByLeonardo queryLeonardoPainting(int id2search) throws Exception {
        try {
            String sqlQuery = "SELECT id, masterpiece FROM da_vinci_paintings WHERE id = " + id2search + ";";
            queryDB(sqlQuery);      
                                    // even if this queryDB() method is a void, 
                                    // it stores information in the ResultSet 
            PaintingsByLeonardo painting = null;
            while(res.next()){
                painting = new PaintingsByLeonardo();
                painting.setId(res.getInt(1));
                painting.setMasterpiece(res.getString(2));
            }
            //disconnectFromDB();
            return painting;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.toString());
            //disconnectFromDB();
            throw e;
        } finally {
            disconnectFromDB();
        }
    }
    */
}
