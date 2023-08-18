import java.util.Scanner;
public class Cm
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int n;
        n=(z-y)/x;
        System.out.print(n);

        
    }
}