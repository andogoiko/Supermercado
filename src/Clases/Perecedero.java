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

        while (true){

            try{
                fechacad = in.nextLine();
                break;
            }catch (Exception e){
                System.out.println("fecha incorrecta, vuelva a introducirla");
            }

        }

    }

    @Override

    public double tarifaEnvio(){
        return 0;
    }

    public void imprimir(){

    }

    @Override

    public String volcar(){
        return null;
    }

    public void imprimirEnvio(){

    }

    @Override

    public boolean envioFragil(){
        return false;
    }

    @Override

    public double getPeso(){
        return 0;
    }

}
