import java.util.Scanner;
public class cm{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
            
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a+b>c)
            {
                System.out.print("Valid triangle");
            }
            else
            {
                System.out.print("Invalid triangle");
            }
    }
}