package estruturas_condicionais;

import java.util.Scanner;

//Fazer um algoritmo que lê dois números inteiros e imprime os números consecutivos desses números. (Por
//exemplo: se o usuário digitar 2 e -9, a saída deverá ser 3 e -8, porque 3 é consecutivo de 2. –8 é consecutivo
//de –9)
public class Exemplo4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = input.nextInt();
        System.out.println("Digite o segundo número");
        int num2 = input.nextInt();

        System.out.println("O número consecutivo de: "+  num1 + " é: " + (num1+1));
        System.out.println("O número consecutivo de: "+  num2 + " é: " + (num2+1));

        }
    }

