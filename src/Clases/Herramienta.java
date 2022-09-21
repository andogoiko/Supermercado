package Clases;

import Interfaces.Enviable;

import java.util.Scanner;

public class Herramienta extends NoPerecedero implements Enviable {

    private double VALOR_IVA = 0.4;

    public Herramienta(int codigo, String nombre, double precio, int cantidad, double peso) {
        super(codigo, nombre, precio, cantidad, peso);
    }

    public Herramienta(Scanner in){
        super(in);
    }

    @Override

    public boolean envioFragil(){
        return false;
    }

    @Override

    public double tarifaEnvio(){
        return 0;
    }

    @Override

    public String volcar(){
        return null;
    }

    public void imprimir(){

    }

    public void imprimirEnvio(){

    }

    @Override

    public double getPeso(){
        return 0;
    }

}
