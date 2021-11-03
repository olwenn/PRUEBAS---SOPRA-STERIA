import java.util.Scanner;

public class Test3 {

    public static void main( String[] args ) {

        Scanner scanner = new Scanner( System.in );  
        
        double sueldo;
        

        double extraTarifa=0;
        
        System.out.println( "Indique la tarifa del trabajador" );
        double TARIFA = scanner.nextInt(); 
        
        System.out.println( "Introduca el numero de horas totales trabajadas" );
        int HORASTOTALESTRABAJADAS = scanner.nextInt();
        
        System.out.println( "Introduca el numero de horas extra trabajadas ");
        int HORASEXTRATRABAJADAS = scanner.nextInt();
        
        if ( HORASTOTALESTRABAJADAS > 40 ) {
        	
			extraTarifa = (TARIFA*0.5)+TARIFA;
	        double sueldoHExtra = HORASEXTRATRABAJADAS*extraTarifa;
	        double sueldoHNormales = (HORASTOTALESTRABAJADAS-HORASEXTRATRABAJADAS)*TARIFA;
	        sueldo = sueldoHExtra+sueldoHNormales;
	        
		}else {

	        sueldo = ( HORASTOTALESTRABAJADAS - HORASEXTRATRABAJADAS ) * TARIFA;
		}
        
        
        
        System.out.println( "El trabajador debera cobrar " + sueldo  + "€" );
        
        scanner.close();
        /*
         * En esta prueba el enunciado habla sobre calcular el salario en base a las horas trabajadas
         * deplicando la tarifa en el caso de que las horas totales superasen las 40. Pero este extra lo he entendido como que
         * unicamente son aplicables a las horas extra, cosa de la cual el ejercicio no comenta nada, por ende lo que he realizado es que me diga las horas 
         * extra que el trabajador ha realizado, se descuentan del total de horas y se le aplica la nueva tarifa incrementada.
         * 
         * */
    }
		
}
