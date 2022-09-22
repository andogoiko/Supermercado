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

        System.out.println("Introduce un lote:");

        while (true){

            try{
                lote = in.nextLine();
                break;
            }catch (Exception e){
                System.out.println("Lote incorrecto, vuelva a introducirlo");
                in.nextLine();
            }

        }
    }

    @Override

    public String volcar(){
        String respuesta = super.volcar();

        respuesta = respuesta + "Lote del producto: " + lote + "\n";


        return respuesta;
    }

    @Override

    public boolean envioFragil(){

        return false;
    }

    @Override

    public void imprimir(){
        super.imprimir();

        System.out.printf("Lote: %d\n", lote);
    }
}
