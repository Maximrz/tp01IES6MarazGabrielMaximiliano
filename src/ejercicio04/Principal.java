package ejercicio04;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 25;
		if (esPar(numero)) {
			System.out.println("El número es PAR.");
	        } else {
	            System.out.println("El número es IMPAR.");
	        }
	    }
	
	public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }	
}
