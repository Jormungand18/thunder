package Producto;

import java.util.Scanner;

public class Producto {

    private int Tipo;
    private int Precio;
    private int Stock;
    private String UniMed;

    public Producto(int Tipo, int Precio, int Stock, String UniMed) {
        this.Tipo = Tipo;
        this.Precio = Precio;
        this.Stock = Stock;
        this.UniMed = UniMed;
    }

    /**
     * @return the Tipo
     */
    public int getTipo() {

        //Scanner sc = new Scanner(System.in);
        //System.out.println("Ingrese numero de entrada que prefiera \n 1=Quesos \n 2=Leche \n 3=Mantequilla");
        //Tipo = sc.nextInt();
        switch (Tipo) {
            case 1:
                Tipo = Integer.parseInt("Quesos");
                break;
            case 2:
                Tipo = Integer.parseInt("Leche");
                break;
            case 3:
                Tipo = Integer.parseInt("Mantequilla");
                break;
            default:
                System.out.println("El numero ingresado no corresponde a ningun codigo de entrada");
        }
        return Tipo;

    }

    /**
     * @param Tipo the Tipo to set
     */
    public void setTipo(int Tipo) {
        this.Tipo = Tipo;
    }

    /**
     * @return the Precio
     */
    public int getPrecio() {
        return Precio;
    }

    /**
     * @param Precio the Precio to set
     */
    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    /**
     * @return the Stock
     */
    public int getStock() {
        switch(Stock){
            case 1: Stock=8000;
                break;
            case 2: 
                Stock=10200;
                break;
            case 3:
                Stock=12000;
                break;
            default:
                System.out.println("numero de stock no disponible   ");
        }
        return Stock;
    }

    /**
     * @param Stock the Stock to set
     */
    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    /**
     * @return the UniMed
     */
    public String getUniMed() {
        return UniMed;
    }

    /**
     * @param UniMed the UniMed to set
     */
    public void setUniMed(String UniMed) {
        this.UniMed = UniMed;
    }

    /**
     * @return the precio
     */
}
