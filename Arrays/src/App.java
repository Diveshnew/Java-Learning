public class App {
    public static void main(String[] args) {

        // ************** 1D ARRAY ***************

        // int nums[] = {5,4,3,2};

        // System.out.println(nums[0]);
        // System.out.println(nums[1]);
        // System.out.println(nums[2]);
        // System.out.println(nums[3]);

        // for(int i=0;i<=3;i++){
        // System.out.println(nums[i]);
        // }

        // -------> When the values are unknown <-----------
        // int nums[] = new int[4];
        // nums[0] = 6;
        // nums[1] = 9;
        // nums[2] = 7;
        // nums[3] = 4;

        // for(int i=0;i<=3;i++){
        // System.out.println(nums[i]);
        // }

        // ------> For Strings <----------
        // String name[] = {"Naveen","Harsh","kiran"};
        // for(int i = 0; i<=2 ; i++){
        // System.out.println(name[i]);
        // }

        // ************************ 2D Array *************************

        // int nums[][] = new int[3][];
        // nums[0] = new int[4];
        // nums[1] = new int[2];
        // nums[2] = new int[3];


        // nums[0][0] = 5;
        // nums[0][1] = 4;
        // nums[1][0] = 3;
        // nums[1][1] = 6;
        // nums[2][0] = 9;
        // nums[2][1] = 8;

        // Jagged Arrays
        // int nums[][] = {
            //         { 3, 5, 7, 8 }, { 8, 9 }, { 1, 2 }
            // };

        // for (int i = 0; i <= 2; i++) {
        //     for (int j = 0; j < nums[i].length; j++) {
        //         System.out.print(nums[i][j] + " ");
        //     }
        //     System.out.println();
        // }


        // ******************** Enhanced for Loops **********************
        // int nums[] = {3,4,5,6};
        // for(int n: nums){
        //     System.out.println(n);
        // }

        int nums[][] = {
                { 3, 5, 7, 8 }, { 8, 9 }, { 1, 2 }
        };

        for (int a[] :nums) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }

        // Anonymous Array
        // Array Index out of Bounds Exception
    }
}
