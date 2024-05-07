package estruturas_condicionais;

import java.util.Scanner;

// Fazer um algoritmo que leia um valor L e calcula a área de um quadrado de lado L.
public class Exemplo5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do lado L do quadrado: ");
        double lado = input.nextDouble();
        double area = lado * lado;

        System.out.println("A área do lado é: " + area);

    }
}
