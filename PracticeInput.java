import java.util.Scanner;
public class PracticeInput 
    {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Greetings, What's your name? ");
        String s = in.nextLine();
        System.out.println("How you doing ? " + s);
    }
}