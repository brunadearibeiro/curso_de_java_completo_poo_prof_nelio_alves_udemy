package exercicios_por_aula.aula_30.exercicios;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        // Não estarei utilizando o Locale para formatar os meus valores com "." ao invés de ",". No Brasil o padrão é "," - isso se manterá para o restante dos exercícios
        Scanner scn = new Scanner(System.in);

        System.out.print("\nDigite o valor do raio do círculo: ");
        double raioDoCirculo = scn.nextDouble(); 

        double pi = 3.12159;

        double calculoDaAreaDoCirculo = pi * Math.pow(raioDoCirculo, 2);

        System.out.printf("%nDado o raio %.2f, a área do cículo é: %.2f%n", raioDoCirculo, calculoDaAreaDoCirculo); // Formatei os valores para duas casas decimais pois o resultado fica mais "limpo"

        scn.close();
        
        System.out.println();
    }
}
