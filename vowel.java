import java.util.Scanner;

public class vowel 
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);

        // ask user to enter a character,ie alphabet
        System.out.print("Enter an alphabet character: ");
        char ch = scanner.next().charAt(0);

        // check if the character is a vowel or consonant

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
        {
            System.out.println(ch + " is a vowel.");
        } 
        else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) 
        {
            System.out.println(ch + " is a consonant.");
        } 
        else 
        {
            System.out.println("error not an alphabet");

        }

        scanner.close();  // close the scanner,avoid resource leak
    }
}
