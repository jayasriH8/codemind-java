import java.util.Scanner;
public class Cm{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b)
        {
            System.out.print(a);
        }
        else
        {
            System.out.print(b);
        }
    }
}