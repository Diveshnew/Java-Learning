public class App {
    public static void main(String[] args){

        /* 
        int age = 14;
        
        if(age >= 18){
            System.out.println("Legal Adult");
        }
        else{
            System.out.println("You're a kid");
        }
        */


        /*
        int age = 61;
        if(age >= 18 && age < 60){
            System.out.println("You are an Adult");
        }
        else if(age >= 60){
            System.out.println("You are an old man");
        }
        else{
            System.out.println("You are still a kid!");
        }
         */


         int age=18;
         if(age >= 18 && age <= 60){
            if(age >= 20 &&  age < 30){
                System.out.println("You are in Your 20s");
            }
            else if(age >= 30 && age < 40){
                System.out.println("You are in your 30s");
            }
            else if(age >= 40 && age <= 50){
                System.out.println("You are in your 40s");
            }
            else {
                System.out.println("You are still a teen");
            }
         }
         else if(age > 60){
            System.out.println("You are a Old man");
         }
         else if(age >= 16 && age < 18){
            System.out.println("You are a Teen");
         }
         else{
            System.out.println("You are not Born Yet");
         }


    }
}
