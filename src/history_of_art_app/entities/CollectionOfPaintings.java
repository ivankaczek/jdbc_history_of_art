
package history_of_art_app.entities;

import java.util.ArrayList;

public class CollectionOfPaintings {
    
    protected String nameOfTheArtCollection;
    protected ArrayList<Artwork> artworksInTheCollection;

    public CollectionOfPaintings() {
    }

    public CollectionOfPaintings(String nameOfTheArtCollection, ArrayList<Artwork> artworksInTheCollection) {
        this.nameOfTheArtCollection = nameOfTheArtCollection;
        this.artworksInTheCollection = artworksInTheCollection;
    }

    public String getNameOfTheArtCollection() {
        return nameOfTheArtCollection;
    }

    public void setNameOfTheArtCollection(String nameOfTheArtCollection) {
        this.nameOfTheArtCollection = nameOfTheArtCollection;
    }

    public ArrayList<Artwork> getArtworksInTheCollection() {
        return artworksInTheCollection;
    }

    public void setArtworksInTheCollection(ArrayList<Artwork> artworksInTheCollection) {
        this.artworksInTheCollection = artworksInTheCollection;
    }
    
    
    
    
}
