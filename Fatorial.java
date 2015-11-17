public class Fatorial{
	//Versao iterativa do calculo do Fatorial incluindo o teste n =0		
	public static int calcularFatorial(int n){
		int resultado = 1;
		if (n != 0){
			for(int i=2; i <=n; i++){
				resultado *= i;
			}	
			return resultado;
		}
			
	}
}