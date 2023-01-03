package me.dio.metodosjava;

import java.util.Scanner;

public class Emprestimo {

    public static int prazo1(){
        return 12;
    }

    public static int prazo2(){
        return 24;
    }

    public static int prazo3(){
        return 36;
    }

    public static int prazo4(){
        return 48;
    }



    public static double taxa1(){
        return 0.99;
    }
    public static double taxa2(){
        return 1.59;
    }
    public static double taxa3(){
        return 1.99;
    }
    public static double taxa4(){
        return 2.99;
    }

    public static void calculoValor(double valor, int parcelas){

        if(parcelas == prazo1()){
            double valorFinal = valor + (valor*taxa1());
            System.out.println("Valor do empréstimo com 12 meses de prazo: R$ " + valorFinal);
        }else if(parcelas == prazo2()){
            double valorFinal = valor + (valor*taxa2());
            System.out.println("Valor do empréstimo com 24 meses de prazo: R$ " + valorFinal);
        }else if(parcelas == prazo3()){
            double valorFinal = valor + (valor*taxa3());
            System.out.println("Valor do empréstimo com 36 meses de prazo: R$ " + valorFinal);
        }else if(parcelas == prazo4()){
            double valorFinal = valor + (valor*taxa4());
            System.out.println("Valor do empréstimo com 48 meses de prazo: R$ " + valorFinal);
        }

    }

}
