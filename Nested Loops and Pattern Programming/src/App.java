public class App {
    public static void main(String[] args){

        // Nested Loops
        int c=3;
        for(int g=0 ; g<c ; g++){
            for(int y=0 ; y<c ; y++){
                System.out.print("* ");
            }
            System.out.println();
        }


        // This is a box pattern program
        int m=10;
        for(int k=0 ; k<m ; k++){
            for(int l=0 ; l<m ; l++ ){
                if(k==0 || l==0 || k==m-1 || l==m-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        
        // This is a pattern program for A
        int Q=10;
        for(int k=0 ; k<Q ; k++){
            for(int l=0 ; l<Q ; l++ ){
                if(k==0 || l==0 || k==(Q-1)/2 || l==Q-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        System.out.println(" ");

        // This is a pattern program for H
        int p=10;
        for(int k=0 ; k<p ; k++){
            for(int l=0 ; l<p ; l++ ){
                if(l==0 || k==(p-1)/2 || l==p-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        // This is a pattern program for A
        int s=10;
        for(int k=0 ; k<s ; k++){
            for(int l=0 ; l<s ; l++ ){
                if(k==0 && l>0 && l<(s-1)/2 || l==0 && k>0 || k==(s-1)/2 && l<=(s-1)/2 || l==(s-1)/2 && k>0  ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        // This is a pattern program for D
        int B=10;
        for(int i=0 ; i<B ; i++){
            for(int j=0 ; j<B ; j++ ){
                if(i==0 && j<(B-1)/2 || j==0 || j==(B-1)/2 && i>0 && i<B-1 || i==B-1 && j<(B-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // This is a pattern program for a different pattern
        int n=19;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                if(i==j || i+j == n-1 || i==0 || j==0 || i==n-1 || j==n-1 || i+j == (n-2)/2 || i-j==(n-1)/2 || j-i==(n-1)/2 || i+j==n-1 + (n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("         ");
            
            // This is a pattern program for a diagonal pattern
                for(int j=0 ; j<n ; j++){
                    if(i+j == (n-1)/2 || i-j==(n-1)/2 || j-i==(n-1)/2 || i+j==n-1 + (n-1)/2 || i==0 || j==0 || i==n-1 || j==n-1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            System.out.print("         ");
            
            // This is a pattern program for a diagonal pattern
                for(int j=0 ; j<n ; j++){
                    if(i==0 && j<=(n-1)/2 || j==0 && i<=(n-1)/2 || i+j<=(n-1)/2 || i==0 && j>=(n-1)/2 || j==n-1 && i<=(n-1)/2 || j-i>=(n-1)/2 ||  j==0 && i>=(n-1)/2 || i==n-1 && j<=(n-1)/2 || i-j>=(n-1)/2 || j==n-1 && i>=(n-1)/2 || i==n-1 && j>(n-1)/2 || i+j>=n-1 + (n-1)/2 ){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            
        }

    }
}
