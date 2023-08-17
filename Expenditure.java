import java.util.Scanner;
public class Char{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=30*b;
        if(a<c)
        {
            System.out.print("NO");
        }
        else
        {
            System.out.print("YES");
        }
       
    }
}