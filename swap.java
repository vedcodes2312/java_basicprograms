public class swap
{
    public static void main(String args[])
    {
     int a=5,b=6;
     System.out.println("before swap a="  +a+  "b="+b);
     a=a+b;
     b=a-b;
     a=a-b;
     System.out.println("after swap a=" +a+" b="+b);

    }
}