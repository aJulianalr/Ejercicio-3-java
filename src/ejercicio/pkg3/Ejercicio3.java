/*
Define variables donde puedas alojar los resultados y prueba usar dos operadores de cada tipo.
 */
package ejercicio.pkg3;

/**
 *
 * @author aural
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = 5;
        int num2 = 2;
        
        //ARITMETICOS
        int suma = num1 + num2;
        System.out.println("Suma = " + suma);
        double division = num1 / num2;
        System.out.println("division = " + division);
        
        //UNARIOS
        num1++;
        System.out.println(num1++);
        
        //IGUALDAD Y RELACIÓN
        boolean bandera = num2 < num1;
        System.out.println("band = " + bandera);
        boolean bandera2 = num2 > num1;
        System.out.println("band2 = " + bandera2);
    }
    
}
