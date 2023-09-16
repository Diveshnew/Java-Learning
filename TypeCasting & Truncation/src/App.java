public class App {
    public static void main(String[] args){

        // Implicit type Casting is showing here
        int a = 45;
        double b;
        b=a;
        System.out.println(b);


        // Explicit Type casting is showing here
        double num1=45.5;
        int num2;
        num2 = (int)num1;
        System.out.println(num2);


        // The 0.2 got truncked because of the int type of both the data, that's why it does not matter where you are storing your value.
        int n1=12;
        int n2=5;
        float res=n1/n2;
        System.out.println(res);

    }
}
