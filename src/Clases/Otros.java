package Clases;

import java.util.Scanner;

public class Otros extends NoPerecedero{

    private String categoria;
    private double VALOR_IVA = 0.16;

    public Otros(int codigo, String nombre, double precio, int cantidad, double peso, String categoria) {

        super(codigo, nombre, precio, cantidad, peso);
        this.categoria = categoria;
    }

    public Otros(Scanner in){
        super(in);

        while (true){

            try{
                categoria = in.nextLine();
                break;
            }catch (Exception e){
                System.out.println("Categoria incorrecta, vuelva a introducirla");
            }

        }
    }

    @Override

    public String volcar(){
        return null;
    }

    public void imprimir(){

    }

}
