import java.util.Scanner;
public class cm
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        char V,I,B,G,Y,O,R;
        if(ch=='V')
        {
         System.out.print("Violet");   
        }
        else if(ch=='I')
        {
         System.out.print("Indigo");   
        }
        else if(ch=='B')
        {
         System.out.print("Blue");   
        }
        else if(ch=='G')
        {
         System.out.print("Green");   
        }
        else if(ch=='Y')
        {
         System.out.print("Yellow");   
        }
        else if(ch=='O')
        {
         System.out.print("Orange");   
        }
        else if(ch=='R')
        {
         System.out.print("Red");   
        }
        else
        {
          System.out.print(-1);  
        }
    }
}