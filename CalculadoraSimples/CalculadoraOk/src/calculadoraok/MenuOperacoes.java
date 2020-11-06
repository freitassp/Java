/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraok;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class MenuOperacoes {

    double resultado, n1, n2;
    char continuar;

    Scanner sc = new Scanner(System.in);

    public void menu() {
        do {
            System.out.println("*** CALCULADORA PROGRAMAÇÃO 1 ***");
            System.out.println("");
            System.out.println("Qual operação deseja realizar?\n"
                    + "1 Soma \n"
                    + "2 Subtração \n"
                    + "3 Multiplicação \n"
                    + "4 Divisão \n"
                    + "5 Quadrado \n"
                    + "0 Encerrar o programa \n");

            System.out.print("Digite o número referente a operação: ");//usuario digita a opcao
            int opcao = sc.nextInt();//usuario entrou com a opcao desejada

            if (opcao == 0) {
                System.out.println("SAINDO DO PROGRAMA....");
                System.exit(0);
            }  // finalizando o programa

            switch (opcao) {

                case 1:
                    System.out.println("");
                    System.out.println("***** SOMA *****");
                    System.out.print("Digite o primeiro operando: ");
                    n1 = sc.nextDouble();

                    System.out.print("Digite o segundo operando: ");
                    n2 = sc.nextDouble();
                    soma(n1, n2);
                    break;

                case 2:
                    System.out.println("");
                    System.out.println("***** SUBTRAÇÃO *****");
                    System.out.print("Digite o primeiro operando: ");
                    n1 = sc.nextDouble();

                    System.out.print("Digite o segundo operando: ");
                    n2 = sc.nextDouble();
                    subtracao(n1, n2);
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("***** MULTIPLICAÇÃO *****");
                    System.out.print("Digite o primeiro operando: ");
                    n1 = sc.nextDouble();

                    System.out.print("Digite o segundo operando: ");
                    n2 = sc.nextDouble();
                    multiplicacao(n1, n2);
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("***** DIVISÃO *****");
                    System.out.print("Digite o primeiro operando: ");
                    n1 = sc.nextDouble();

                    System.out.print("Digite o segundo operando: ");
                    n2 = sc.nextDouble();
                    divisao(n1, n2);
                    break;
                case 5:
                    System.out.println("");
                    System.out.println("***** QUADRADO *****");
                    System.out.print("Digite o operando: ");
                    n1 = sc.nextDouble();
                    quadrado(n1);
                    break;
                default:
                    System.out.println("*** OPÇÃO INVÁLIDA ***");
                    break;
            }

            System.out.print("\nDeseja fazer uma nova operação? (S/N):");
            continuar = sc.next().charAt(0);

        } while (continuar != 'n' && continuar != 'N');
    }

    public void soma(double n1, double n2) {
        resultado = n1 + n2;
        System.out.println("O resultado da soma é: " + resultado);
    }

    public void subtracao(double n1, double n2) {
        resultado = n1 - n2;
        System.out.println("O resultado da subtração é: " + resultado);
    }

    public void multiplicacao(double n1, double n2) {
        resultado = n1 * n2;
        System.out.println("O resultado da multiplicação é: " + resultado);
    }

    public void divisao(double n1, double n2) {
        if (n2 == 0) {
            System.out.println("A Divisão por Zero não será permitida");
        } else {
            resultado = n1 / n2;
            System.out.println("O resultado da divisão é: " + resultado);
        }
    }

    public void quadrado(double n1) {

        resultado = n1 * n1;
        System.out.println("O resultado de " + n1 + " ao quadrado é: " + resultado);

    }

}
