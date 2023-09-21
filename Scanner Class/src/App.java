import java.util.Scanner;

public class App {
    public static void main(String[] args){

        // This is how we can take live input from the user
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Age:");
        int age = scan.nextInt();
        System.out.println("The Age is :" + age);


        System.out.println("Enter the Avg:");
        double avg = scan.nextDouble();
        System.out.println("The Avg is : " + avg);


        System.out.println("Enter the Name:");
        String name = scan.next();
        System.out.println("Name is : " + name);

        // Difference between system.out.PRINTLN() & PRINT()

        // --> This is a Println() code : This means next line
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");

        // This is a Print() code : Cursor in the same line
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
    }
}
