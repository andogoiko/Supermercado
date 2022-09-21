package Clases;

import java.util.Scanner;

public class Lacteo extends  Perecedero{

    private String lote;
    private double VALOR_IVA = 0.04;

    public Lacteo(int codigo, String nombre, double precio, int cantidad, double peso, String fechacad, String lote) {
        super(codigo, nombre, precio, cantidad, peso, fechacad);
        this.lote = lote;
    }

    public Lacteo(Scanner in) {
        super(in);
    }

    public String volcar(){
        return null;
    }

    public boolean envioFragil(){
        return false;
    }

    public void imprimir(){

    }
}
