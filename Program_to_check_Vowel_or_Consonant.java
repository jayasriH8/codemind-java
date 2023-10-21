import java.util.Scanner;

public class cm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char n = sc.next().charAt(0);
        char l = Character.toLowerCase(n);

        if ((l >= 'a' && l <= 'z')) {
            if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid alphabetic character.");
        }

   
    }
}
