package ejercicio09;

import ejercicio01.Usuario;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String apellidos = "Maraz";
        String nombres1 = "Gabriel Maximiliano";
        String mail = "maximrz93@gmail.com";
        int edad = 30;
        double ingresosMensuales = 15500.0;
        double gastosMensuales = 9200.0;
        
        Usuario usuario = new Usuario(apellidos, nombres1, mail, edad, ingresosMensuales, gastosMensuales);
        usuario.mostrarDatos();
	}

}
