/*Fa�a um algoritmo que receba a idade e o peso de 7 pessoas,
 * calcule e mostre:� A quantidade de pessoas com mais de 90 quilos;
 * � A m�dia das idades das 7 pessoas.
 * */

import java.util.Scanner;

public class QualPesoDelas {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //seria para o usu�rio digitar os dados 
        
        // inicializa as vari�veis de contagem e soma
        int qtd_pessoas_mais90kg = 0;
        int soma_idades = 0;
        
        // loop para ler as informa��es de 7 pessoas
        for (int i = 1; i <= 7; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = sc.nextInt();
            
            System.out.print("Digite o peso da pessoa " + i + ": ");
            double peso = sc.nextDouble();
            
            // verifica se a pessoa tem mais de 90kg
            if (peso > 90) {
                qtd_pessoas_mais90kg++;
            }
            
            // adiciona a idade � soma das idades
            soma_idades += idade;
        }
        
        // calcula a m�dia das idades
        double media_idades = soma_idades / 7.0;
        
        // mostra os resultados
        System.out.println("Quantidade de pessoas com mais de 90kg: " + qtd_pessoas_mais90kg);
        System.out.println("M�dia das idades das 7 pessoas: " + media_idades);
        
        sc.close();
    }

}
