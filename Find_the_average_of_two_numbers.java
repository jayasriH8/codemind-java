import java.util.Scanner;
public class average
{
    public static void main(String args[])
    {
        float a,b;
        float avg;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        avg=(a+b)/2;
        System.out.printf("%.4f",avg);
    }
}