package org.example;

public class Cuadrado extends FigurasGeometricas{
    Double lado;

    public Cuadrado(Double lado) {
        super("Cuadrado", 4);
        this.lado = lado;
    }


    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Número de lados: " + getNumero_lados());
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }


}
