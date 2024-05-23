package org.example;

public class Decagono extends FigurasGeometricas{
    double med_lado;
    double apotema;
    public Decagono(){}
    public Decagono(String nombre, int num_lados,double lado, double apotema){
        super(nombre,num_lados);
        this.med_lado = lado;
        this.apotema = apotema;
    }

    @Override
    public String getNombre() {
        return "Decagono";
    }
    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public int getNum_lados() {
        return 10;
    }

    @Override
    public void setNum_lados(int num_lados) {
        super.setNum_lados(num_lados);
    }

    public double getMed_lado() {
        return med_lado;
    }

    public void setMed_lado(double med_lado) {
        this.med_lado = med_lado;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double calcular_perimetro(){
        return getNum_lados() * med_lado;
    }
    public double calcular_area(){
        return (getNum_lados() * apotema * med_lado)/2 ;
    }


}
