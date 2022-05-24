
package history_of_art_app.services;

import Enums.ArtistsEnum;
import history_of_art_app.entities.Artwork;
import history_of_art_app.entities.CollectionOfPaintings;
import history_of_art_app.entities.PaintingsByLeonardo;
import history_of_art_app.persistence.DAO;
import history_of_art_app.persistence.PaintingsByLeonardoDAO;
import java.util.ArrayList;
import java.util.Scanner;


public class Services {
    
    
    private PaintingsByLeonardoDAO leonardoDAO;
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    // ------------------------------------------------------- //
    
    
    
    
    public Services() {
    }

    public Services(PaintingsByLeonardoDAO leonardoDAO) {
        this.leonardoDAO = leonardoDAO;
    }

    public PaintingsByLeonardoDAO getLeonardoDAO() {
        return leonardoDAO;
    }

    public void setLeonardoDAO(PaintingsByLeonardoDAO leonardoDAO) {
        this.leonardoDAO = leonardoDAO;
    }
    
    
    
    
    /*
            +-----------------------------------+
            |                                   |
            |         OBJECT CREATION           |
            |                                   |
            +-----------------------------------+
    */
    
    public CollectionOfPaintings hardcodeACollectionOfPaintings(String nameOfTheCollection){
        ArrayList<Artwork> collectionOfArtworks = new ArrayList();
        CollectionOfPaintings collection2return = new CollectionOfPaintings();
        collection2return.setArtworksInTheCollection(collectionOfArtworks);
        collection2return.setNameOfTheArtCollection(nameOfTheCollection);
        return collection2return;
    };
    
    
     /*
            +---------------------------------------------------+
            |                                                   |
            |        BRING INFORMATION FROM DATABASE            |
            |                                                   |
            +---------------------------------------------------+
    */
    
    public void queryLeonardoPaintingUsingId() throws Exception {
        try {
            System.out.println("Please write DB id");
            
            int id2search = sc.nextInt();
            PaintingsByLeonardo leonardoPaint = leonardoDAO.queryLeonardoPainting(id2search);
            System.out.println(leonardoPaint.getMasterpiece());
        } catch (Exception e) {
            throw e;
        }
    }
    
}

/*
public void mostrarTodosLosProductos() {
        try {
            System.out.println("Lista de productos");
            dao.listaProductos(); //uso un metodo de productoDao
            Collection<Producto> productos = dao.listaProductos(); // instancio un arraylist de producto y le asigno el resultado del metodo ListaProductos de ProductoDao

            for (Producto aux : productos) {

                System.out.println("Codigo: " + aux.getCodigo() + "  Nombre: " + aux.getNombre());

            }

        } catch (Exception e) {
        }

    }
*/


/*
package tienda.servicios;

import java.util.Scanner;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDao;

public class Servicios {
    private ProductoDao dao;

    public Servicios(ProductoDao dao) {
        this.dao = dao;
    }

    public void BuscarProductoPorCodigo() throws Exception {

        try {
            System.out.println("ingrese el codigo del producto");
            Scanner leer = new Scanner(System.in);
            int codigo = leer.nextInt();
            Producto p1 = dao.buscarProducto(codigo);
            dao.buscarProducto(codigo);
            
            System.out.println(p1.getNombre());

        } catch (Exception e) {
            throw e;
        }

    }

}

*/