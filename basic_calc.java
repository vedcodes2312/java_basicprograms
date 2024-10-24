import java.util.Scanner;
public class basic_calc
{
public static void main(String args[])
{
Scanner num =  new Scanner(System.in);

System.out.println("enter first number: ");
float n1=num.nextFloat();
System.out.println("enter second number: "); 
float n2=num.nextFloat();

float add=n1+n2;
float subtract=n1-n2;
float  multiply=n1*n2;
float divide=n1/n2;
float remainder=n1%n2;

System.out.println("addition of n1="+n1+"and n2="+n2+"is ="+add);
System.out.println(n1+"+"+n2+"="+add);
System.out.println("subtraction of n1="+n1+"and n2="+n2+"is ="+subtract);
System.out.println(n1+"-"+n2+"="+subtract);
System.out.println("multiplication product of n1="+n1+"and n2="+n2+"is ="+multiply);
System.out.println(n1+"*"+n2+"="+multiply);
System.out.println("division(quotient) of n1="+n1+"and n2="+n2+"is ="+divide);
System.out.println(n1+"/"+n2+"="+divide);
System.out.println("remainder of n1="+n1+"and n2="+n2+"is ="+remainder);
System.out.println(n1+"%"+n2+"="+remainder);

num.close();//closrue of scanner to prevent resource leak

}

}

