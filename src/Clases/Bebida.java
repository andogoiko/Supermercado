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

        while (true){

            try{
                graduacion = in.nextLine();
                break;
            }catch (Exception e){
                System.out.println("Graduación incorrecta, vuelva a introducirla");
                in.nextLine();
            }

        }
    }

    @Override

    public String volcar(){
        String respuesta = super.volcar();

        respuesta = respuesta + "Graduación del producto: " + graduacion + "\n";


        return respuesta;
    }

    @Override

    public void imprimir(){

        super.imprimir();

        System.out.printf("Graduación: %d\n", graduacion);
    }

    @Override

    public boolean envioFragil(){
        return false;
    }
}
