package ejercicio05;

import java.util.Scanner;

import ejercicio02.Calculadora;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        
        int numero;
        do {
            System.out.print("Ingresa un número entero en el rango [0, 10]: ");
            numero = scanner.nextInt();
        } while (numero < 0 || numero > 10);
        
        long factorial = Calculadora.calcularFactorial(numero);
        
        System.out.println("El factorial de " + numero + " es " + factorial);
        
        scanner.close();
    }

}
