package exercicios_por_aula.aula_30.exercicios;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /* Não utilizei o comando porque o mesmo não tem função útil no programa
        System.out.print("\nDigite o número do funcionário: ");
        int numeroDoFuncionario = scn.nextInt(); */ 

        System.out.print("\nDigite a quantidade de horas trabalhadas pelo funcionário: ");
        double horasTrabalhadas = scn.nextDouble();

        System.out.print("Digite o valor que o funcionário recebe por hora trabalhada: ");
        double valorHoraTrabalhada = scn.nextDouble();

        double calculoSalario = horasTrabalhadas * valorHoraTrabalhada;

        System.out.printf("%nO salário do funcionário é: R$%.2f%n", calculoSalario);

        scn.close();

        System.out.println();
    }
}
