/*Marcos Mateus
 *11/30/20
 *JDK Version 1.8
 *This program will calculate the pythagorean theorem for two given sides of Triangle
*/
import java.util.Scanner;
public class CalculateHypotenuse {

    public static void main(String[] args) 
    {
        System.out.println("Enter the length of the first side of the triangle: ");
        Scanner first = new Scanner(System.in);
        double second = first.nextDouble();
        System.out.println("Enter the length of the 2nd side of the triangle: ");
        double third = first.nextDouble();
        double answer = (Math.pow(second,2)) + (Math.pow(third,2));
        System.out.println("1st number entered: " + second);
        System.out.println("2nd number entered: " + third);
        System.out.println("Pythagorean Theorem (a^2 + b^2 = c^2) result: " + answer);
}
}