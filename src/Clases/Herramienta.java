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

        return super.calcularPrecioIVA();
    }

    @Override

    public String volcar(){

        return super.volcar();
    }

    @Override

    public void imprimir(){
        super.imprimir();
    }

    @Override

    public void imprimirEnvio(){
        super.imprimirEnvio();
    }

    @Override

    public double getPeso(){

        return super.getPeso();
    }

}
