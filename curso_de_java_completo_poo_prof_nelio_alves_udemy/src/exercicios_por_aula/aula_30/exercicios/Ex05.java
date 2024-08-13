package exercicios_por_aula.aula_30.exercicios;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /* Não utilizei o comando porque o mesmo não tem função útil no programa
        System.out.print("Digite o código da primeira peça: ");
        int codigoPrimeiraPeca = scn.nextInt(); */

        System.out.print("\nDigite o número de peças da primeira peça: ");
        int numeroDePecasPrimeiraPeca = scn.nextInt();
        
        System.out.print("Digite o valor unitário das peças da primeira peça: ");
        double valorUnitarioPrimeiraPeca = scn.nextDouble();

        /* Não utilizei o comando porque o mesmo não tem função útil no programa
        System.out.print("Digite o código da segunda peça: ");
        int codigoSegundaPeca = scn.nextInt(); */

        System.out.print("\nDigite o número de peças da segunda peça: ");
        int numeroDePecasSegundaPeca = scn.nextInt();
        
        System.out.print("Digite o valor unitário das peças da segunda peça: ");
        double valorUnitarioSegundaPeca = scn.nextDouble();

        double calculoPrimeiraPeca = numeroDePecasPrimeiraPeca * valorUnitarioPrimeiraPeca;

        double calculoSegundaPeca = numeroDePecasSegundaPeca * valorUnitarioSegundaPeca;

        double valorTotal = calculoPrimeiraPeca + calculoSegundaPeca;

        System.out.printf("%nO valor a ser pago por todas as peças é: R$%.2f%n", valorTotal);

        scn.close();
        
        System.out.println();
    }
}
