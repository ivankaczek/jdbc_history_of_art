
package history_of_art_app;

import history_of_art_app.persistence.PaintingsByLeonardoDAO;
import history_of_art_app.services.Services;

public class HistoryOfArt_main {

    public static void main(String[] args) throws Exception {
        
       
        try {
          PaintingsByLeonardoDAO aPaint = new PaintingsByLeonardoDAO();   
            Services serv = new Services(aPaint);
            serv.queryLeonardoPaintingUsingId();
        } catch (Exception e) {
            throw e;
        }
        
        
    }
    
}
