
package history_of_art_app;

import history_of_art_app.entities.CollectionOfPaintings;
import history_of_art_app.persistence.PaintingsByLeonardoDAO;
import history_of_art_app.services.Services;

public class HistoryOfArt_main {

    public static void main(String[] args) throws Exception {
        
        try {
            Services serv = new Services();
            CollectionOfPaintings paintingsByLeonardo = serv.hardcodeACollectionOfPaintings("Paintings by Leonardo");
            System.out.println(paintingsByLeonardo.toString());
            
        } catch (Exception e) {
        }
        CollectionOfPaintings paintingsByLeonardo = new CollectionOfPaintings();
        //System.out.println(paintingsByLeonardo);
        
       
        try {
            PaintingsByLeonardoDAO aPaint = new PaintingsByLeonardoDAO();   
            Services serv = new Services(aPaint);
            serv.queryLeonardoPaintingUsingId();
            
            
            
            
        } catch (Exception e) {
            throw e;
        }
        
        
    }
    
}
