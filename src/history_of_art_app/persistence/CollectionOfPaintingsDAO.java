
package history_of_art_app.persistence;

import Enums.ArtistsEnum;
import history_of_art_app.entities.Artwork;
import history_of_art_app.entities.CollectionOfPaintings;
import history_of_art_app.entities.PaintingsByLeonardo;
import java.util.ArrayList;

public class CollectionOfPaintingsDAO extends DAO {
    
  public CollectionOfPaintings absorbCollectionFromDB(String nameOfTheCollection,
                                                        String nameOfTableInMySQL,
                                                        ArtistsEnum artistName) throws Exception{
      
      
      try {
            ArrayList<Artwork> arrayOfMasterpieces = new ArrayList();
            
            int id2search = 1;
            do {
                String sqlQuery = "SELECT id, masterpiece FROM " + nameOfTableInMySQL + " WHERE id = " + id2search + ";";
                queryDB(sqlQuery);
                                    // even if this previous queryDB() method is a void, 
                                    // it stores information in the ResultSet 
                while(res.next()){
                                    // the previous line means 'while the ResultSet from the Query stores some info do this...
                    Artwork singleArtwork2add2ArrayList = new Artwork();
                    
                    /*
                        public class Artwork {
                            protected ArtistsEnum artistName;
                            protected int catalogueId;
                            protected String artworkName;
                    */
                    
                    
                    singleArtwork2add2ArrayList.setArtistName(artistName);
                    singleArtwork2add2ArrayList.setCatalogueId(res.getInt(1));
                    singleArtwork2add2ArrayList.setArtworkName(res.getString(2));
                    arrayOfMasterpieces.add(singleArtwork2add2ArrayList);
                    id2search++;
                    
                    
                }
                
                // I need to get out of the loop.
                id2search = 0;
                
                
                
            } while (id2search != 0);
          
          
            
                  
                                   
         return new CollectionOfPaintings(nameOfTheCollection, arrayOfMasterpieces);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.toString());
            //disconnectFromDB();
            throw e;
        } finally {
          
            disconnectFromDB();
        }
      
      
   
  }  
    
    
    
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
