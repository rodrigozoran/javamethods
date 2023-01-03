package me.dio.metodosjava;

public class Quadrilateros {

    public static double area(double lado){
        double arQ = lado*lado;
        System.out.println("Área do quadrado: " + (arQ));
        return arQ;
    }

    public static double area(double lado1, double lado2){
        double arR = lado1*lado2;
        System.out.println("Área do retângulo: " + (arR));
        return arR;
    }

    public static double area(double baseMaior, double baseMenor, double altura){
        double arT = (((baseMaior+baseMenor)*altura)/2);
        System.out.println("Área do trapézio: " + (arT));
        return arT;
    }

}
