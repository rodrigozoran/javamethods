package me.dio.metodosjava;

public class Calculadora {

    public static void soma(double soma1, double soma2){
        double resultadoSoma = soma1 + soma2;

        System.out.println("SOMA");
        System.out.println("Primeiro número: " + soma1);
        System.out.println("Segundo número: " + soma2);

        System.out.println("O resultado da soma é: " + resultadoSoma + "\n");
    }

    public static void subtracao(double sub1, double sub2){
        double resultadoSub = sub1 - sub2;

        System.out.println("SUBTRAÇÃO");
        System.out.println("Primeiro número: " + sub1);
        System.out.println("Segundo número: " + sub2);

        System.out.println("O resultado da subtração é: " + resultadoSub + "\n");

    }

    public static void multiplicacao(double mult1, double mult2){
        double resultadoMult = mult1*mult2;

        System.out.println("MULTIPLICAÇÃO");
        System.out.println("Primeiro número: " + mult1);
        System.out.println("Segundo número: " + mult2);

        System.out.println("O resultado da multiplicação é: " + resultadoMult + "\n");

    }

    public static void divisao(double div1, double div2){
        double resultadoDiv = div1/div2;

        System.out.println("DIVISÃO");
        System.out.println("Primeiro número: " + div1);
        System.out.println("Segundo número: " + div2);

        System.out.println("O resultado da divisão é: " + resultadoDiv + "\n");
    }

}
