// Square.java
package figuras;

import java.util.Scanner;

public class Square {
    private static Scanner Scanner = new Scanner(System.in);
    
    public static void calculateArea() {        
        System.out.print("Ingrese el lado del cuadrado: ");
        double side = Scanner.nextDouble();
        double area = side * side;
        System.out.println("El área del cuadrado es: " + area);
    }
    public static void closeScaner(){
        Scanner.close();
    }
}