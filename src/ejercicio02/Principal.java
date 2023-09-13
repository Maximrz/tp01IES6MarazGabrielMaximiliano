package ejercicio02;

public class Principal {

		public static void main(String[] args) {
	        Calculadora calculadora = new Calculadora();

	        int base = 10;
	        int exponente = 2;
	        int numero1 = 36;
	        int numero2 = 27;

	        int resultadoPotencia = (int) calculadora.calcularPotencia(base, exponente);
	        int resultadoRaizCuadrada = (int) calculadora.calcularRaizCuadrada(numero1);
	        int resultadoRaizCubica = (int) calculadora.calcularRaizCubica(numero2);

	        System.out.println("Resultado de la potencia: " + resultadoPotencia);
	        System.out.println("Resultado de la raíz cuadrada: " + resultadoRaizCuadrada);
	        System.out.println("Resultado de la raíz cúbica: " + resultadoRaizCubica);

	    }
}
