// Trapecio.java
package figuras;
import java.util.Scanner;

public class Trapecio {
    private static Scanner Scanner = new Scanner(System.in);
    public static void calculateArea() {
        System.out.print("Ingrese la altura del trapecio: ");
        double altura = Scanner.nextDouble();
        System.out.print("Ingrese la base mas amplia del trapecio: ");
        double base1 = Scanner.nextDouble();
        System.out.print("Ingrese la base mas estrecha del trapecio: ");
        double base2 = Scanner.nextDouble();
        double area = ((base1*base2)+altura)/2;
        System.out.println("El área del trapecio: " + area);
        
    }
    public static void closeScaner(){
        Scanner.close();
    }
}   