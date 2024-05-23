package org.example;

public class Hexagono extends FigurasGeometricas {
    double longitudLado;
    double apotema;
    int numero_lados = 6;
    double perimetro;
    double area;

    public Hexagono() {
        super("Hexagono", 6);
    }

    public Hexagono(String nombre, int numero_lados, double longitudLado, double area, double perimetro, int nlados1, double apotema) {
        super(nombre, numero_lados);
        this.longitudLado = longitudLado;
        this.area = area;
        this.perimetro = perimetro;
        this.numero_lados = nlados1;
        this.apotema = apotema;
    }

    public int getNumero_lados() {
        return this.numero_lados;
    }

    public void setNumero_lados(int numero_lados) {
        super.setNumero_lados(numero_lados);
    }

    public void setLongitudLado(double longitudLado) {
        this.longitudLado = longitudLado;
    }

    public double getlongitudLado() {
        return this.longitudLado;
    }

    public void setBaseTriangulo(double baseTriangulo) {
        this.longitudLado = this.longitudLado;
    }

    public double getApotema() {
        return this.apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double getPerimetro() {
        return this.perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return this.area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double calcularPerimetro() {
        this.perimetro = (double)this.numero_lados * this.longitudLado;
        return this.perimetro;
    }

    public double calcularArea() {
        this.area = this.perimetro * this.apotema;
        return this.area;
    }
}

