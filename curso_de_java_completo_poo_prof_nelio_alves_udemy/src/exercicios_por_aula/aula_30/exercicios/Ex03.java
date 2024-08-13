package exercicios_por_aula.aula_30.exercicios;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("\nDigite o primeiro número inteiro: ");
        int a = scn.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int b = scn.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        int c = scn.nextInt();

        System.out.print("Digite o quarto número inteiro: ");
        int d = scn.nextInt();

        int produtoDeAEB = a * b;
        int produtoDeCED = c * d;
        int diferencaEntreOsProdutos = produtoDeAEB - produtoDeCED;

        System.out.printf("%nA diferença entre o produto de %d e %d pelo produto de %d e %d é: %d%n", a, b, c, d, diferencaEntreOsProdutos);

        scn.close();

        System.out.println();
    }
}
