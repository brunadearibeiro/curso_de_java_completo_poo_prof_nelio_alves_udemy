package exercicios_por_aula.aula_30.exercicios;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("\nDigite um número inteiro: ");
        int num1 = scn.nextInt();

        System.out.print("Digite outro número inteiro: ");
        int num2 = scn.nextInt();

        int soma = num1 + num2;

        System.out.println("\n" + num1 + " + " + num2 + " = " + soma); // Deixei a resposta "mais bonita" e intuitiva

        System.out.println();

        scn.close();
    }
}
