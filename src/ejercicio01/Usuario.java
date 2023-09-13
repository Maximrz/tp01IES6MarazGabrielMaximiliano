package ejercicio01;

public class Usuario {
	private String apellido;
	private String nombres;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
	public String getApellido() {
		return apellido;
	}	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}	
	public String getNombres() {
		return nombres;
	}	
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	
	
	//Ej09
	public String apellidos;
    public String nombres1;
    public String mail;
    public int edad;
    public double ingresosMensuales;
    public double gastosMensuales;
    
    public Usuario (String apellidos, String nombres1, String mail, int edad, double ingresosMensuales, double gastosMensuales) {
    	this.apellidos = apellidos;
        this.nombres1 = nombres1;
        this.mail = mail;
        this.edad = edad;
        this.ingresosMensuales = ingresosMensuales;
        this.gastosMensuales = gastosMensuales;
	}
    
    public String esMayorDeEdad() {
    	String resultado = "";
    	if (edad >= 18) {
    		System.out.println("El usuario es Mayor de edad.");
    	} else 
    		System.out.println("El usuario es Menor de edad.");
        return resultado;
    }
    
    public String puedeAhorrar() {
    	String resultado2 = "";
    	if (ingresosMensuales > gastosMensuales) {
    		System.out.println("El usuario SI puede ahorrar.");
    	} else
    		System.out.println("El usuario NO puede ahorrar.");
        return resultado2;
    }
    
    public void mostrarDatos() {
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Nombres: " + nombres1);
        System.out.println("Mail: " + mail);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Los Ingresos Mensuales del usuario son: $" + ingresosMensuales);
        System.out.println("Los Gastos Mensuales del usuario son: $" + gastosMensuales);
        System.out.println(esMayorDeEdad());
        System.out.println(puedeAhorrar());
    }
    
}
