package ejercicio02;

	//Calculadora Ej02
public class Calculadora {
	public int calcularPotencia(int base, int exponente) {
        return (int) Math.pow(base, exponente);
    }

    public int calcularRaizCuadrada(int numero1) {
        
        return (int) Math.sqrt(numero1);
    }
    
    public int calcularRaizCubica(int numero2) {
       
        return (int) Math.cbrt(numero2);
    }
    
        
    //Calculadora Ej05
    public static long calcularFactorial(int numero) {
               
        long factorial = 1;
        
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }
    
    
    //Calculadora Ej06
    public static void cuentaAtrasFor() {
        for (int i = 320; i >= 160; i -= 20) {
            System.out.println(i);
        }
    }
    
    
    //Calculadora Ej07
    public static void cuentaAtrasWhile() {
        int numero = 320;
        while (numero >= 160) {
            System.out.println(numero);
            numero -= 20;
        }
    }
    
    
    //Calculadora Ej08
    public static void cuentaAtrasDoWhile() {
        int numero = 320;
        do {
            System.out.println(numero);
            numero -= 20;
        } while (numero >= 160);
    }
 }
