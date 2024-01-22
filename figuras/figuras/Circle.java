// Circle.java
package figuras;

import java.util.Scanner;

public class Circle {

    private static Scanner Scanner = new Scanner(System.in);

    public static void calculateArea() {       
        System.out.print("Ingrese el radio del círculo: ");
        double radius = Scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("El área del círculo es: " + area); 
    }

    public static void closeScaner(){
        Scanner.close(); 
    }
}