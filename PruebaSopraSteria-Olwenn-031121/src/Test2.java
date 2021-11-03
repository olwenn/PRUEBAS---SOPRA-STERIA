import java.util.ArrayList;
import java.util.Scanner;  // Import the Scanner class


public class Test2 {

    public static void main( String[] args ) {
        Scanner scanner = new Scanner( System.in );  

    	ArrayList<Persona> listaPersona = new ArrayList<Persona>();
    	
    	for ( int i = 0; i < 50; i++ ) {
    		Persona p = new Persona();
    		int numeroEdad  = (int) ( ( Math.random() * 99 ) + 1 );
    		
    		if ( numeroEdad % 2 == 0 ) {

    			p = new Persona( 'M' , numeroEdad );
			}else {

	    		p = new Persona( 'F' , numeroEdad );
			}
			listaPersona.add( p );
		}
    	int option;
		do {
			
			menu();
			
            option = scanner.nextInt(); 
            switch ( option ) {
			case 1: {
				
				mayorDeEdad( listaPersona );
				break;
			}
			case 2: {

				menorDeEdad( listaPersona );
				break;
			}
			case 3: {

				hombresMayorDeEdad( listaPersona );
				break;
			}
			case 4: {

				mujeresMenorDeEdad( listaPersona );
				break;
			}
			case 5: {

				porcentajeMayorDeEdad( listaPersona );
				break;
			}
			case 6: {

				porcentajeMujeres( listaPersona );
				break;
			}
			
			default:
				throw new IllegalArgumentException( "Unexpected value: " + option );
			}
		} while ( option != 7 );
		scanner.close();
    }
    
    public static void menu() {
    	System.out.println( "1. Cantidad de personas mayores de edad (18 años o más).\r\n"
				+ "2. Cantidad de personas menores de edad.\r\n"
				+ "3. Cantidad de personas masculinas mayores de edad.\r\n"
				+ "4. Cantidad de personas femeninas menores de edad.\r\n"
				+ "5. Porcentaje que representan las personas mayores de edad respecto al total de\r\n"
				+ "personas.\r\n"
				+ "6. Porcentaje que representan las mujeres respecto al total de personas.\n"
				+ "7. Salir" );
	}    
    
    public static void mayorDeEdad( ArrayList<Persona> listaPersonas ) {
    	int cont = 0;
    	for ( int i = 0; i < listaPersonas.size(); i++ ) {
    		if ( listaPersonas.get(i).getEdad() >= 18 ) {
				cont++;
			}
		}
    	System.out.println( "Existen "+ cont + " personas mayores de edad\n" );
		
	}

    public static void menorDeEdad( ArrayList<Persona> listaPersonas ) {
    	int cont = 0;
    	for ( int i = 0; i < listaPersonas.size(); i++ ) {
    		if ( listaPersonas.get(i).getEdad() <= 17 ) {
				cont++;
			}
		}
    	System.out.println( "Existen "+ cont + " personas menores de edad\n" );
		
	}
    
    public static void hombresMayorDeEdad( ArrayList<Persona> listaPersonas ) {
    	int cont = 0;
    	for ( int i = 0; i < listaPersonas.size(); i++ ) {
    		if ( listaPersonas.get(i).getEdad() >= 18 && listaPersonas.get(i).getSexo() == 'M' ) {
				cont++;
			}
		}
    	System.out.println( "Existen "+ cont + " hombres mayores de edad\n" );
		
	}
    
    public static void mujeresMenorDeEdad( ArrayList<Persona> listaPersonas ) {
    	int cont = 0;
    	for ( int i = 0; i < listaPersonas.size(); i++ ) {
    		if ( listaPersonas.get(i).getEdad() <= 17 && listaPersonas.get(i).getSexo() == 'F' ) {
				cont++;
			}
		}
    	System.out.println( "Existen "+ cont + " mujeres menores de edad\n" );
		
	}
    
    public static void porcentajeMayorDeEdad( ArrayList<Persona> listaPersonas ) {
    	int contMenores = 0;
    	for ( int i = 0; i < listaPersonas.size(); i++ ) {
    		if ( listaPersonas.get(i).getEdad() <= 17 ) {
    			contMenores++;
			}
		}
    	double porcentajeRespectoAlTotal = ( double ) ( ( listaPersonas.size() - contMenores ) * 100 ) / 50;
    	
    	System.out.println( "El porcentaje de personas mayores de edad respecto del total es = " + porcentajeRespectoAlTotal + "%\n" );
		
	}
    
    public static void porcentajeMujeres( ArrayList<Persona> listaPersonas ) {
    	int contMujeres = 0;
    	for ( int i = 0; i < listaPersonas.size(); i++ ) {
    		if ( listaPersonas.get(i).getSexo() == 'M' ) {
    			contMujeres++;
			}
		}
    	float porcentajeRespectoAlTotal = ( ( listaPersonas.size() - contMujeres ) * 100 ) / 50;
    	
    	System.out.println( "El porcentaje de mujeres respecto del total es = " + porcentajeRespectoAlTotal + "%\n" );
		
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}