package ejercicio03;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "Profesorado de informatica";
		//System.out.println(cadena.charAt(0));
		//System.out.println(cadena.concat("Maxi"));
		//System.out.println(cadena.length());
		//System.out.println(cadena.replace("o", "x"));
		
		//char caracter = 'n';

		//CalculadoraDeCadenas calcu = new CalculadoraDeCadenas();
		//System.out.println(calcu.determinarExistenciaDeUnCaracterEnLaCadena(cadena, caracter));
		
		CalculadoraDeCadenas cont = new CalculadoraDeCadenas();
		System.out.println(cont.contarVocales(cadena));
	}
	
}