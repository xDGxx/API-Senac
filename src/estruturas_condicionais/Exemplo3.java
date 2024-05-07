package estruturas_condicionais;

import java.util.Scanner;

//Fazer um algoritmo que lê dois números e imprime a soma dos quadrados dos dois números. O quadrado
//de um número A é representado por A2 = A * A.
public class Exemplo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int num1 = input.nextInt();
        System.out.println("Digite o segundo valor: ");
        int num2 = input.nextInt();
        int somaQuadrados = (num1*num1)+(num2*num2);
        System.out.println(somaQuadrados);
    }
}
