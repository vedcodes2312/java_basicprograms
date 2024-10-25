import java.util.Scanner;
public class leapyr
{
    public static void main(String args[])
    {
        Scanner yr = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = yr.nextInt();
        if(year % 4 == 0 && year % 100 != 0 || year  % 400 == 0)
        {
            System.out.println(year+" is a leap year");
        }
        else
        {
            System.out.println(year+" is not a leap year");
        }
        yr.close();//to avoid resource leak

    }
}
