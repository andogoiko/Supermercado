package Clases;

import java.util.Scanner;

public class FrutaHortaliza extends Perecedero{

    private String origen;
    private double VALOR_IVA = 0.16;

    public FrutaHortaliza(int codigo, String nombre, double precio, int cantidad, double peso, String fechacad, String origen) {
        super(codigo, nombre, precio, cantidad, peso, fechacad);
        this.origen = origen;
    }

    public FrutaHortaliza(Scanner in) {
        super(in);

        while (true){

            try{
                origen = in.nextLine();
                break;
            }catch (Exception e){
                System.out.println("Origen incorrecto, vuelva a introducirlo");
                in.nextLine();
            }

        }
    }

    @Override

    public String volcar(){

        String respuesta = super.volcar();

        respuesta = respuesta + "Origen del producto: " + origen + "\n";


        return respuesta;
    }

    @Override

    public void imprimir(){
        super.imprimir();

        System.out.printf("origen: %d\n", origen);
    }

    @Override

    public boolean envioFragil(){
        return false;
    }

    public void calcularPrecioEnvio(){
        Double precioEnvio = super.tarifaEnvio();
    }
}
