
public class Persona {
	private char sexo;
	private int edad;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(char sexo, int edad) {
		super();
		this.sexo = sexo;
		this.edad = edad;
	}
	
	
	
	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [sexo=" + sexo + ", edad=" + edad + "]";
	}

	
	
}
