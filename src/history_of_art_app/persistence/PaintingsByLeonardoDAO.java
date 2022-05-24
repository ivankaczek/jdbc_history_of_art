
package history_of_art_app.persistence;

import history_of_art_app.entities.PaintingsByLeonardo;

public class PaintingsByLeonardoDAO extends DAO {
    
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
    
}

/*
public Collection<Producto> listaProductos() throws Exception {
        Collection<Producto> productos = new ArrayList();
        try {
            String sql = "SELECT codigo, nombre, precio FROM producto;";
            consultarBase(sql);

            Producto pro = null;

            while (resultado.next()) {
                pro = new Producto();
                pro.setCodigo(resultado.getInt(1));
                pro.setNombre(resultado.getString(2));
                pro.setPrecio(resultado.getDouble(3));
                productos.add(pro);
            }

            desconectarBase();

        } catch (Exception e) {
            desconectarBase();
            e.printStackTrace();
        }
        return productos;

    }public Collection<Producto> listaProductos() throws Exception {
        Collection<Producto> productos = new ArrayList();
        try {
            String sql = "SELECT codigo, nombre, precio FROM producto;";
            consultarBase(sql);

            Producto pro = null;

            while (resultado.next()) {
                pro = new Producto();
                pro.setCodigo(resultado.getInt(1));
                pro.setNombre(resultado.getString(2));
                pro.setPrecio(resultado.getDouble(3));
                productos.add(pro);
            }

            desconectarBase();

        } catch (Exception e) {
            desconectarBase();
            e.printStackTrace();
        }
        return productos;

    }
*/

/*

*/


/*
import tienda.entidades.Producto;

public final class ProductoDao extends Dao {

    //Lista el nombre de 1 producto que hay en la tabla producto por codigo de producto
    public Producto buscarProducto(int codigo) throws Exception {
        
        try {
            String sql = "SELECT codigo , nombre FROM producto WHERE codigo = " + codigo + "";
            consultarBase(sql);
            
            Producto pro1 = null;
            
            while (resultado.next()) {
                
                pro1 = new Producto();                
                
                pro1.setCodigo(resultado.getInt(1));
                
                pro1.setNombre(resultado.getString(2));
                
            }
            desconectarBase();
            
            return pro1;
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.toString());
            
            desconectarBase();
            throw e;
            
        }
        
    }
}

*/