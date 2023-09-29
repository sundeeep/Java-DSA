import java.util.Scanner;

public class AreaOfCircle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        final float PIE = 3.14f;

        float radiusOfCircle, areaOfCircle;
        System.out.println("Radius of the Circle: ");
        radiusOfCircle = sc.nextFloat();

        areaOfCircle = PIE * radiusOfCircle * radiusOfCircle;

        System.out.println("Area of the Circle: " +areaOfCircle);


    }
}