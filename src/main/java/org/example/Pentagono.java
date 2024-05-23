public class Pentagono extends FiguraGeometricas {
    private double lado;

    public Pentagono(double lado) {
        super(5, "Pentágono");
        this.lado = lado;
    }

    public double calcularArea() {

        double apotema = lado / (2 * Math.tan(Math.PI / 5));
        return (5 * lado * apotema) / 2;
    }

    public double calcularPerimetro() {
        return 5 * lado;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Número de lados: " + getNlados());
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}