package ejercicio03;

public class CalculadoraDeCadenas {
	public String determinarExistenciaDeUnCaracterEnLaCadena(String cadena, char caracter) {
	    String resultado = "";
	    //int i = 0;
	    for (int i = 0; i < cadena.length(); i++){
	    	if (caracter == cadena.charAt(i)) {
	    		resultado = "El caracter SI esta en la cadena.";	    	
	    	} else 
	    		resultado = "El caracter NO esta en la cadena.";
	    }
	    return resultado;
	}

	//Contador Ej03
	public int contarVocales(String palabra) {
		int contador = 0;
		palabra = palabra.toLowerCase();

        for (int i = 0; i < palabra.length(); i++) {
            char caracter = palabra.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contador++;
            }
        }
        return contador;
	}
}