
package history_of_art_app.entities;

public class PaintingsByLeonardo {
    
    private int id;
    private String masterpiece;

    public PaintingsByLeonardo() {
    }

    public PaintingsByLeonardo(int id, String masterpiece) {
        this.id = id;
        this.masterpiece = masterpiece;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMasterpiece() {
        return masterpiece;
    }

    public void setMasterpiece(String masterpiece) {
        this.masterpiece = masterpiece;
    }
    
    
    
    
    
}
