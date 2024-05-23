package org.example;

public class Hexagono extends FigurasGeometricas {
    double longitudLado;
    double apotema;
    int nlados = 6;
    double perimetro;
    double area;

    public Hexagono() {
        super("Hexagono", 6);
    }

    public Hexagono(String nombre, int nlados, double longitudLado, double area, double perimetro, int nlados1, double apotema) {
        super(nombre, nlados);
        this.longitudLado = longitudLado;
        this.area = area;
        this.perimetro = perimetro;
        this.nlados = nlados1;
        this.apotema = apotema;
    }

    public int getNlados() {
        return this.nlados;
    }

    public void setNlados(int nlados) {
        super.setNlados(nlados);
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
        this.perimetro = (double)this.nlados * this.longitudLado;
        return this.perimetro;
    }

    public double calcularArea() {
        this.area = this.perimetro * this.apotema;
        return this.area;
    }
}{
}
