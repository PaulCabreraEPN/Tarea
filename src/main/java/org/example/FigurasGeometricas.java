package org.example;

public class FigurasGeometricas {
    String nombre;
    int numero_lados;

    public FigurasGeometricas(String nombre, int numero_lados) {
        this.nombre = nombre;
        this.numero_lados = numero_lados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero_lados() {
        return numero_lados;
    }

    public void setNumero_lados(int numero_lados) {
        this.numero_lados = numero_lados;
    }
}
