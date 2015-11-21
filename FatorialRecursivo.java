public class FatorialRecursivo{
  public static int calcularFatorialRecursivo(int n) throws IlegalArgumentException{
    if(n==0)
	return 1;
    return n * calcularFatorialRecursivo(n-1);		
   }

public static void main(String[] args){
	System.out.println(calcularFatorialRecursivo(5));
  }

}