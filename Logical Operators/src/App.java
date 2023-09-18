public class App {
    public static void main(String[] args){

        // Logical AND -- &&  {All the expressions should be true to be it - TRUE}
        // Logical OR -- ||   {Any One Can make it - TRUE}
        // Logical NOT -- !   {!True = false , !false = true}

        int a=10;
        int b=20;
        int c=30;

        System.out.println(a==b && a<=b && a>=c);
        System.out.println(a<=b && a<=c && c>=b);
        System.out.println(a<=b || a<=c || c>=b);
        System.out.println(a<=c || c<=b || a>=b);
        System.out.println(!true);

    }
}
