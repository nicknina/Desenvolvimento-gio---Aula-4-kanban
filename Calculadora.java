package Desenvolvimento_Agio.Aula_4;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à calculadora simples!");
        System.out.print("Digite o primeiro número: ");
        double num1 = Scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = Scanner.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.print("Opção: ");
        int opcao = Scanner.nextInt();

        double resultado = 0;

        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    return;
                }
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        System.out.println("O resultado é: " + resultado);
    }
}