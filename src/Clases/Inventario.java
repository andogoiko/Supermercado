package Clases;

import Interfaces.Enviable;

import java.io.*;
import java.nio.charset.StandardCharsets;
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

        System.out.println("========================================================================");
        System.out.println("=                        CARGANDO PRODUCTOS ...                        =");
        System.out.println("========================================================================");

        try{

            //el fichero al que nos referimos

            File dataFile = new File("src/data/productos.txt");

            // al estar en java no nos hace falta processbuilder ni nada directamente buffered reader

            // la encapsulamos en un buffered reader para que se formatee

            BufferedReader bfr = new BufferedReader(new FileReader(dataFile));

            String productos;

            while ((productos = bfr.readLine()) != null){
                String[] producto = productos.split(" ");
                try{
                    switch (producto[producto.length - 1].toLowerCase()){

                        case "frutahortaliza":

                            Producto frutahortaliza = new FrutaHortaliza(  Integer.parseInt(producto[0]),  producto[1],  Double.parseDouble(producto[2]),  Integer.parseInt(producto[3]),  Double.parseDouble(producto[4]), producto[5], producto[6]);
                            addNuevoProducto(frutahortaliza);

                            break;

                        case "lacteo":

                            Producto lacteo = new Lacteo(  Integer.parseInt(producto[0]),  producto[1],  Double.parseDouble(producto[2]),  Integer.parseInt(producto[3]),  Double.parseDouble(producto[4]) , producto[5] , producto[6]);
                            addNuevoProducto(lacteo);

                            break;

                        case "bebida":

                            Producto bebida = new Bebida(  Integer.parseInt(producto[0]),  producto[1],  Double.parseDouble(producto[2]),  Integer.parseInt(producto[3]),  Double.parseDouble(producto[4]) , producto[5], producto[6]);
                            addNuevoProducto(bebida);

                            break;

                        case "herramienta":

                            Producto herramienta = new Herramienta(  Integer.parseInt(producto[0]),  producto[1],  Double.parseDouble(producto[2]),  Integer.parseInt(producto[3]),  Double.parseDouble(producto[4]));
                            addNuevoProducto(herramienta);

                            break;

                        case "otros":

                            Producto otros = new Otros(  Integer.parseInt(producto[0]),  producto[1],  Double.parseDouble(producto[2]),  Integer.parseInt(producto[3]),  Double.parseDouble(producto[4]), producto[5]);
                            addNuevoProducto(otros);

                            break;
                    }

                }catch (Exception e){
                    e.printStackTrace();
                }
            }

            bfr.close();

        }catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("========================================================================");
        System.out.println("=                     CARGA DE PRODUCTOS COMPLETA                      =");
        System.out.println("========================================================================");

    }

    public static void guardarProductos(){

        String productos = "";

        for(int i = 0; i < listaProductos.size(); i++){
            productos = productos + listaProductos.get(i).volcar();
        }

        try  {

            FileOutputStream  archivo = new FileOutputStream ("src/data/productosSave.txt");

            OutputStreamWriter archivoEncodeado= new OutputStreamWriter((archivo), StandardCharsets.ISO_8859_1);

            BufferedWriter out = new BufferedWriter(archivoEncodeado);

            out.write(productos);

            out.close();
            archivoEncodeado.close();
            archivo.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void addNuevoProducto(Producto producto){

        listaProductos.add(producto);
    }

    public static void mostrarProductos(){
        listaProductos.forEach(producto -> {
            if(producto != null){
                producto.imprimir();
            }
        });

    }

    public static Producto getProducto(int id){

        return listaProductos.get(id - 1);
    }

    public static void actualizarCantidad(int codigo, int cantidad){

        listaProductos.get(codigo).setCantidad(cantidad);
    }

    public static int tamanyo(){

        return listaProductos.size();
    }

    public static void mostrarProductosEnviables(){
        listaProductos.forEach(producto -> {
            if(producto != null &&  producto instanceof Enviable){
                if(!((Enviable) producto).envioFragil()){
                    System.out.printf("Id: %d, Nombre: %s, peso: %.1f, IVA (%.2f%s), tarifa de envío: %.2f, PRECIO-TOTAL: %.2f\n", producto.getCodigo(), producto.getNombre(), producto.getPeso(), producto.getIva(), new String(new char[] { 37 }), ((Enviable) producto).tarifaEnvio(), (producto.calcularPrecioIVA() + ((Enviable) producto).tarifaEnvio()));
                }else{
                    System.out.printf("Id: %d, Nombre: %s, peso: %.1f, IVA (%.2f%s), tarifa de envío: %.2f, Producto frágil, PRECIO-TOTAL: %.2f\n", producto.getCodigo(), producto.getNombre(), producto.getPeso(), producto.getIva(), new String(new char[] { 37 }), ((Enviable) producto).tarifaEnvio(), (producto.calcularPrecioIVA() + ((Enviable) producto).tarifaEnvio()));
                }

            }
        });
    }

    public static void eliminarProducto(int id){
        listaProductos.set(id, null);
    }

    @Override
    public Iterator iterator() {
        return listaProductos.iterator();
    }
}
