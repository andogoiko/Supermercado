package Clases;

import java.util.ArrayList;
import java.util.Iterator;

public class Inventario implements Iterable<Producto>{

    private static ArrayList<Producto> listaProductos;

    private static String ficheroInventario;
    private static int ultimoCodigo;

    private static  Inventario instance;

    private Inventario(){
        listaProductos = new ArrayList<Producto>();
    }

    public static Inventario getInstance(){

        if(instance == null){
            instance = new Inventario();
        }

        return instance;
    }

    public static void cargarProductos(){

    }

    public static void guardarProductos(){

    }

    public static void addNuevoProducto(Producto producto){

    }

    public static void mostrarProductos(){

    }

    public static Producto getProducto(int id){
        return null;
    }

    public static void actualizarCantidad(int codigo, int cantidad){

    }

    public static int tamanyo(){
        return 0;
    }

    public static void mostrarProductosEnviables(){

    }

    public static void eliminarProducto(int id){

    }

    @Override
    public Iterator iterator() {
        return listaProductos.iterator();
    }
}
