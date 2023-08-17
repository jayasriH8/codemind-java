import java.util.Scanner;
public class Cm{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int sp=sc.nextInt();
        int cp=sc.nextInt();
        if(sp==cp)
        {
            System.out.print("No profit and No loss");
        }
        else if(sp<cp)
        {
            System.out.print("Profit");
        }
        else
        {
            System.out.print("Loss");
        }
    }
}