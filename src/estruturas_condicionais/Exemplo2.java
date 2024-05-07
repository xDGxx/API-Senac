package estruturas_condicionais;

import java.util.Scanner;

//Fazer um algoritmo que lê dois números, a base e o expoente, e imprime a potência (base elevada ao
//expoente). Dica: use a função matemática Math.pow(). Exemplo: 5 elevado ao cubo ficaria
//Math.pow(5, 3). Você pode trocar esses números por variáveis.
public class Exemplo2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor da base: ");
        double num1 = input.nextDouble();
        System.out.println("Digite o valor do expoente: ");
        double num2 = input.nextDouble();
        System.out.println("O valor é: " + Math.pow(num1,num2));
    }
}