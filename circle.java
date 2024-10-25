import java.util.Scanner;
public class circle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        float r = sc.nextFloat();
        float PI=3.14f,ar,circum;
        ar = PI * r * r;
        System.out.println("Area of the circle is: "+ar);
        circum = 2 *  PI * r;
        System.out.println("circumference of cirlce is: "+circum);
        sc.close();
    }
}