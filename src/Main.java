import me.dio.metodosjava.Calculadora;
import me.dio.metodosjava.Emprestimo;
import me.dio.metodosjava.Mensagem;
import me.dio.metodosjava.Quadrilateros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Exercício Calculadora \n");
        Calculadora.soma(2,3);
        Calculadora.subtracao(3,2);
        Calculadora.multiplicacao(2,4);
        Calculadora.divisao(6,3);

        System.out.println("Exercício Hora/Mensagem \n");
        Mensagem.obterMensagem(8);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(21);

        System.out.println("Exercício Empréstimo \n");
        Emprestimo.calculoValor(1500, 12);
        Emprestimo.calculoValor(1500, 24);
        Emprestimo.calculoValor(1500, 36);
        Emprestimo.calculoValor(1500, 48);

        System.out.println("Exercício Quadriláteros Notáveis (Sobrecarga de Métódos) \n"); //quadrado, triângulo, trapézio

        Quadrilateros.area(3);
        Quadrilateros.area(3, 4);
        Quadrilateros.area(4,3,2);


    }
}