/*16 –Maria quer saber quantos litros de gasolina precisa colocar em seu carro e 
 * quanto vai gastar para fazer uma viagem até a casa de sua irmã. Dados extras: 
 * Distância da casa de Maria até sua irmã :520 km Seu carro consome um litro a cada 12 Km rodado.
 *  Ela abastece sempre no mesmo posto, onde o preço da gasolina é R$ 1,50 o litro.
 * 
 * */

import java.text.DecimalFormat;

public class CalculeQualDistancia {

	    public static void main(String[] args) {
	        // define a distância da casa de Maria até sua irmã em km
	        int distancia = 520;
	        
	        // define o consumo do carro em km/litro
	        int consumo = 12;
	        
	        // calcula a quantidade de litros de gasolina necessária
	        double litros = (double) distancia / consumo;
	        
	        // define o preço da gasolina por litro
	        double preco_gasolina = 1.5;
	        
	        // calcula o total a ser gasto com gasolina
	        double total_gasto = litros * preco_gasolina;
	        
	        // formata o resultado para exibir 2 casas decimais
	        DecimalFormat df = new DecimalFormat("#.00");
	        
	        // mostra os resultados na tela
	        System.out.println("Para percorrer " + distancia + " km, Maria precisa abastecer " + df.format(litros) + " litros de gasolina.");
	        System.out.println("O valor total a ser gasto com gasolina é R$ " + df.format(total_gasto) + ".");
	    }

	}
