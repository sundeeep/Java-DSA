import java.util.Scanner;
import java.lang.Math;

public class AreaOfTriangle{
    public static void main(String[] args){
        double sideOne, sideTwo, sideThree;
        double semiPerimeter;
        double areaOfTriangle;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the Side One of the Triangle: ");
        sideOne = sc.nextFloat();
        System.out.println("Enter the length of the Side Two of the Triangle: ");
        sideTwo = sc.nextFloat();
        System.out.println("Enter the length of the Side Three of the Triangle: ");
        sideThree = sc.nextFloat();

        semiPerimeter = (sideOne + sideTwo +sideThree)/2;

        areaOfTriangle = Math.sqrt(semiPerimeter*(semiPerimeter-sideOne)*(semiPerimeter-sideTwo)*(semiPerimeter-sideThree));

        System.out.println("The Area of Triangle: "+areaOfTriangle);
    }
}