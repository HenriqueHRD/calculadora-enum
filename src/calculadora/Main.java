package calculadora;

public class Main {

	public static void main(String[] args) {
		
		/* FORMA 1 
		Operacao op =  Operacao.MULTIPLICAR;
		
		double resultado = op.executarOperacao(2, 7);
		
		System.out.println("Resultado: " + resultado);
		*/
		
		/* FORMA 2 */
		
		double x = 3;
		double y = 2;
		
		for (Operacao op : Operacao.values()) {
			System.out.print(x + " ");
			System.out.print(op.toString() + " ");
			System.out.print(y + " = ");
			System.out.println(op.executarOperacao(x, y));
		}
		
		/* A saída vai ficar assim:
		 3.0 + 2.0 = 5.0
		 3.0 - 2.0 = 1.0
		 3.0 * 2.0 = 6.0
		 3.0 / 2.0 = 1.5
		 */
	}

}
