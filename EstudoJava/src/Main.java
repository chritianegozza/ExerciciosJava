
public class Main {
	public static void main(String [] args) {
		/* Para imprimir a frase 
		System.out.print("Ol� turma, sejam bem-vindos");
		*/
		
		/*Variavel 
		 
		String meuNome = "Christiane";
		
		int anoFabricacao = 2022;
		
		boolean verdadeira = false;*/
		
		String primeiroNome = "christiane";
		String segundoNome = "Gozza";
		
		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
		System.out.println(nomeCompleto);
	}
	
	//Estrututa m�todo pode ou n�o ter parametro 
	
	//primeira forma de fazer
   /*public static String nomeCompleto (String primeiroNome, String segundoNome) {
		return primeiroNome.concat(" ").concat(segundoNome);
	}
 * */
	
	//Segunda forma concratenado e somando 
	public static String nomeCompleto (String primeiroNome, String segundoNome) {
		return "Resultado do m�todo " + primeiroNome.concat(" ").concat(segundoNome);
	}

}
