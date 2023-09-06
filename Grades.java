import java.util.Scanner;
public class cm
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int per;
        int p=sc.nextInt();
        int c=sc.nextInt();
        int b=sc.nextInt();
        int m=sc.nextInt();
        int s=sc.nextInt();
        per=(p+c+b+m+s)/5;
        if(per>=90)
        {
           System.out.print("Grade A"); 
        }
        else if(per>=80)
        {
           System.out.print("Grade B"); 
        }
        else if(per>=70)
        {
           System.out.print("Grade C"); 
        }
        else if(per>=60)
        {
           System.out.print("Grade D"); 
        }
        else if(per>=40)
        {
           System.out.print("Grade E"); 
        }
        else 
        {
           System.out.print("Grade F"); 
        }
    }
}