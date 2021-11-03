
import java.util.Scanner;  // Import the Scanner class


public class Test1 {

    public static void main( String[] args ) {
        Scanner scanner = new Scanner( System.in );  // Create a Scanner object
        System.out.println( "Introduce un numero" );
        int LEERNUMERO = scanner.nextInt();  // Read user input
        int cont = LEERNUMERO;
        if ( LEERNUMERO % 2 == 0 ) {
        	do {

                System.out.println( "Number actual is: " + cont );  // Output user input
				cont--;
				cont--;
			} while (cont >= 0);

		}else {
			cont = 1;
			do {

                System.out.println( "Number actual is: " + cont );  // Output user input
				cont++;
				cont++;
			} while ( cont <= LEERNUMERO );
			
		}
        
    }
}