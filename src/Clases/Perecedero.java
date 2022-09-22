package Clases;

import Interfaces.Enviable;

import java.util.Scanner;

public abstract class Perecedero extends Producto implements Enviable {

    private String fechacad;

    public Perecedero(int codigo, String nombre, double precio, int cantidad, double peso, String fechacad) {

        super(codigo, nombre, precio, cantidad, peso);
        this.fechacad = fechacad;
    }

    public Perecedero (Scanner in){
        super(in);

        System.out.println("Introduce una fecha de caducidad:");

        while (true){

            try{
                fechacad = in.nextLine();
                break;
            }catch (Exception e){
                System.out.println("fecha incorrecta, vuelva a introducirla");
                in.nextLine();
            }

        }

    }

    @Override

    public double tarifaEnvio(){

        return super.calcularPrecioIVA();
    }

    @Override

    public void imprimir(){
        super.imprimir();

        System.out.printf("fecha de caducidad: %d\n", fechacad);
    }

    @Override

    public String volcar(){

        String respuesta = super.volcar();

        respuesta = respuesta + "Fecha de caducidad del producto: " + fechacad + "\n";


        return respuesta;
    }

    @Override

    public void imprimirEnvio(){
        super.imprimirEnvio();
    }

    @Override

    public boolean envioFragil(){

        return false;
    }

    @Override

    public double getPeso(){

        return super.getPeso();
    }

}
