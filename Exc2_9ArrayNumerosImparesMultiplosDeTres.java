package exercicios;

public class Exc2_9ArrayNumerosImparesMultiplosDeTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*PARA (For)
		 * Desenvolver um sistema que efetue a soma de todos os n�meros �mpares que s�o m�ltiplos de tr�s
		 * e que se encontram no conjunto dos n�meros de 1 at� 500.
		 */
		int i,soma=0;
		
		for(i=0;i<=500;i++)
		{
			if(i%2!=0 && i%3==0)
			{
				soma += i;
			}
		}
		
		System.out.println("Resultado = "+soma);
	
	}

}
