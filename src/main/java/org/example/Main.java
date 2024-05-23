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

    }

}