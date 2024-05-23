package org.example;

public class Dodecagono extends FigurasGeometricas {
    double valor_lados;
    double apotema;

    public Dodecagono(double valor_lados, double apotema) {
        super("Dodecagono", 12);
        this.valor_lados = valor_lados;
        this.apotema = apotema;
    }

    public double getValor_lados() {
        return valor_lados;
    }

    public void setValor_lados(double valor_lados) {
        this.valor_lados = valor_lados;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double calcular_perimetro(){
        double perimetro;
        perimetro=valor_lados*numero_lados;
        return perimetro;
    }

    public double calcular_area(){
        double perimetro =calcular_perimetro();
        double area;
        area= (perimetro*apotema)/2;
        return  area;
    }

    public void imprimi_datos_figura(){
        System.out.println("Nombre Figura: "+this.nombre);
        System.out.println("Numero de lados: "+this.numero_lados);
        System.out.println("Valor de su lado: "+this.valor_lados);
        System.out.println("Valor de su apotema: "+this.apotema);
        System.out.println("Su PERIMETRO es: "+calcular_perimetro());
        System.out.println("Su AREA es: "+ calcular_area());
    }
}
