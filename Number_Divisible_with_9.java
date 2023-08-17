import java.util.Scanner;
public class Cm{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%9==0)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}