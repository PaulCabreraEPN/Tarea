public class Cuadrado extends FiguraGeometricas {
    Double lado;

    public Cuadrado(Double lado) {
        super(4, "Cuadradro");
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
        System.out.println("Número de lados: " + getNlados());
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }

}



