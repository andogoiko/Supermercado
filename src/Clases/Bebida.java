package Clases;

import java.util.Scanner;

public class Bebida extends Perecedero{

    private String graduacion;
    private double VALOR_IVA = 0.16;

    public Bebida(int codigo, String nombre, double precio, int cantidad, double peso, String fechacad, String graduacion) {
        super(codigo, nombre, precio, cantidad, peso, fechacad);
        this.graduacion = graduacion;
    }

    public Bebida(Scanner in) {
        super(in);
    }

    public String volcar(){
        return null;
    }

    public void imprimir(){

    }

    public boolean envioFragil(){
        return false;
    }
}
