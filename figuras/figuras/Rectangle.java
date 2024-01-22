// Rectangle.java
package figuras;

import java.util.Scanner;

public class Rectangle {
    private static Scanner Scanner = new Scanner(System.in);

    public static void calculateArea() {
        
        System.out.print("Ingrese la base del rectángulo: ");
        double base = Scanner.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        double height = Scanner.nextDouble();
        double area = base * height;
        System.out.println("El área del rectángulo es: " + area);
         
    }
    public static void closeScaner(){
        Scanner.close();
    }
}