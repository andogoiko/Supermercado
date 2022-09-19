package Clases;

import java.util.Scanner;

public abstract class Producto {

    private double iva;
    private int codigo;
    private String nombre;
    private double precio;
    private int cantidad;
    private double peso;

    public Producto(int codigo, String nombre, double precio, int cantidad, double peso) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.peso = peso;
    }

    public Producto(Scanner in){

        while (true){

            try{
                codigo = in.nextInt();
                break;
            }catch (Exception e){
                System.out.println("Código incorrecto, vuelva a introducirlo");
            }

        }

        while (true){

            try{
                nombre = in.nextLine();
                break;
            }catch (Exception e){
                System.out.println("nombre incorrecto, vuelva a introducirlo");
            }

        }

        while (true){

            try{
                precio = in.nextDouble();
                break;
            }catch (Exception e){
                System.out.println("Precio incorrecto, vuelva a introducirlo");
            }

        }

        while (true){

            try{
                cantidad = in.nextInt();
                break;
            }catch (Exception e){
                System.out.println("Cantidad incorrecta, vuelva a introducirlo");
            }

        }

        while (true){

            try{
                peso = in.nextDouble();
                break;
            }catch (Exception e){
                System.out.println("Peso incorrecto, vuelva a introducirlo");
            }

        }
    }

    public Producto(){

    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double calcularPrecioIVA(){
        return 0;
    }

    public void imprimir(){

    }

    public void imprimirEnvio(){

    }

    public String volcar(){
        return "";
    }
}
