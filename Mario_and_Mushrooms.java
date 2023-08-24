import java.util.Scanner;
public class Cm{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%3==1)
        {
            System.out.print("HUGE");
        }
         else if(n%3==0)
        {
            System.out.print("NORMAL");
        }
         else
        {
            System.out.print("SMALL");
        }
    }
}