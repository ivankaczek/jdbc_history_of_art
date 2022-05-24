
package history_of_art_app.entities;

import Enums.ArtistsEnum;

public class Artwork {
  
   protected ArtistsEnum artistName;
   protected int catalogueId;
   protected String artworkName;

    public Artwork() {
    }

    public Artwork(ArtistsEnum artistName, int catalogueId, String artworkName) {
        this.artistName = artistName;
        this.catalogueId = catalogueId;
        this.artworkName = artworkName;
    }

    public ArtistsEnum getArtistName() {
        return artistName;
    }

    public void setArtistName(ArtistsEnum artistName) {
        this.artistName = artistName;
    }

    public int getCatalogueId() {
        return catalogueId;
    }

    public void setCatalogueId(int catalogueId) {
        this.catalogueId = catalogueId;
    }

    public String getArtworkName() {
        return artworkName;
    }

    public void setArtworkName(String artworkName) {
        this.artworkName = artworkName;
    }

    @Override
    public String toString() {
        return "Artwork{" + "artistName=" + artistName + ", catalogueId=" + catalogueId + ", artworkName=" + artworkName + '}';
    }
   
   
    
    
}
