package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Hola vamos a crear un Endacagono");
        System.out.println("Valor de un lado: ");
        double ladoE= sc.nextDouble();
        System.out.println("Valor de su apotema: ");
        double apotemaE= sc.nextDouble();
        System.out.println("Resultado:");

        Endecagono figura1= new Endecagono(ladoE,apotemaE);
        figura1.imprimi_datos_figura();

        System.out.println("\nGenial, ahora vamos a crear un Dodecagono");
        System.out.println("Valor de un lado: ");
        double ladoD= sc.nextDouble();
        System.out.println("Valor de su apotema: ");
        double apotemaD= sc.nextDouble();
        System.out.println("Resultado:");

        Dodecagono figura2= new Dodecagono(ladoD,apotemaD);
        figura2.imprimi_datos_figura();


        //ENEAGONO Y DECAGONO
        Eneagono figura9=new Eneagono();
        Decagono figura10=new Decagono();

        System.out.println("Vamos a crear un Eneagono");
        System.out.println("Ingrese el valor de sus lados: ");
        double num1 = sc.nextDouble();
        figura9.setMed_lado(num1);
        System.out.println("Ingrese el valor de su apotema: ");
        double num2 = sc.nextDouble();
        figura9.setApotema(num2);
        System.out.println("Resultado:");
        System.out.println("El nombre de su figura es: "+figura9.getNombre());
        System.out.println("El numero de sus lados es: "+figura9.getNumero_lados());
        System.out.println("El valor de sus lados es: "+figura9.getMed_lado());
        System.out.println("El apotema es: "+figura9.getApotema());
        System.out.println("El PERIMETRO es."+ figura9.calcular_perimetro());
        System.out.println("El AREA es : "+figura9.calcular_area());

        System.out.println("Vamos a crear un Decagono");
        System.out.println("Ingrese el valor de sus lados: ");
        double num3 = sc.nextDouble();
        figura10.setMed_lado(num3);
        System.out.println("Ingrese el valor de su apotema: ");
        double num4 = sc.nextDouble();
        figura10.setApotema(num4);
        System.out.println("Resultado:");
        System.out.println("El nombre de su figura es: "+figura10.getNombre());
        System.out.println("El numero de sus lados: "+figura10.getNumero_lados());
        System.out.println("El valor de sus lados: "+figura10.getMed_lado());
        System.out.println("El apotema es: "+figura10.getApotema());
        System.out.println("El PERIMETRO es."+ figura10.calcular_perimetro());
        System.out.println("El AREA es : "+figura10.calcular_area());

    }

}