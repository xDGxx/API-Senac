package estruturas_condicionais;

import java.util.Scanner;

//Fazer um algoritmo que leia dois números e imprima na tela o produto (multiplicação) dos dois números.
public class Exemplo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        int num1 = input.nextInt();
        System.out.println("Insira o segundo número: ");
        int num2 = input.nextInt();
        double multi = num1 * num2;
        System.out.println("A multiplicação de "  + num1 + " com " + num2 + " é igual a: " + multi);

    }
}