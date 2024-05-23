package org.example;

public class Heptagono extends FigurasGeometricas {
        double longitudLado;
        double apotema;
        int nlados = 7;
        double perimetro;
        double area;

        public Heptagono() {
            super("Heptagono", 7);
        }

        public Heptagono(String nombre, int nlados, double apotema, double longitudLado, int nlados1, double perimetro, double area) {
            super(nombre, nlados);
            this.apotema = apotema;
            this.longitudLado = longitudLado;
            this.nlados = nlados1;
            this.perimetro = perimetro;
            this.area = area;
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

        public double getLongitudLado() {
            return this.longitudLado;
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
    }
}
