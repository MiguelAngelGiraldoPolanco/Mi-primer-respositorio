// Triangle.java
package figuras;

import java.util.Scanner;

public class Triangle {
    private static Scanner Scanner = new Scanner(System.in);
    public static void calculateArea() {
        System.out.print("Ingrese la base del triángulo: ");
        double base = Scanner.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        double height = Scanner.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("El área del triángulo es: " + area);
         
    }
    public static void closeScaner(){
        Scanner.close();
    }
}