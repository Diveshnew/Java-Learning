public class App {
    public static void main(String[] args){
        int a=20;
        int b=30;
        int c=40;

        int res=(a<b)?a:b;
        System.out.println(res);

        String result = (a<b)? "a is less":"b is less";
        System.out.println(result);

        // Deep nesting in ternary Operator
        int num = (a<b)?(a<c? a:b):(b<c? a:c);
        System.out.println(num);
    }
}
