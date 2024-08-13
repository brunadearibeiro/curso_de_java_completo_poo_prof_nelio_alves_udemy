package exercicios_por_aula.aula_30.exercicios;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("\nDigite o primeiro valor: ");
        double a = scn.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double b = scn.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        double c = scn.nextDouble();

        double pi = 3.14159;
        
        double calculoAreaTrianguloRetangulo = (a * c) / 2;
        double calculoAreaCirculo = pi * Math.pow(c, 2);
        double calculoAreaQuadrado = b * b;
        double calculoAreaRetangulo = a * b;

        System.out.printf("%nA área do triângulo retângulo é: %.2f%n", calculoAreaTrianguloRetangulo);
        System.out.printf("A área do cículo é: %.2f%n", calculoAreaCirculo);
        System.out.printf("A área do quadrado é: %.2f%n", calculoAreaQuadrado);
        System.out.printf("A área do retângulo é: %.2f%n", calculoAreaRetangulo);

        scn.close();

        System.out.println();
    }
}
