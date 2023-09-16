public class App {
    public static void main(String[] args){
        int a=5;
        // int b = ++a;
        // int b = a++;
        // int b = a++ + ++a + --a;

        int b = a++ + ++a + ++a + a++ + --a + a--;

        System.out.println(a);
        System.out.println(b);

    }
}
