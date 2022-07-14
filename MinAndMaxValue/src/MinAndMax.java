import java.util.Scanner ;

public class MinAndMax {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int limit, n, theSmallest = 0 , theBiggest = 0 ;
        System.out.print("Enter the limit : ");
        limit = input.nextInt();
        

        for (int i = 1 ; i <= limit ; i++){

            System.out.print("Enter the number : ");
            n = input.nextInt();


            if (i == 1){
                theSmallest = n ;
                theBiggest = n ;
            }

            if (theSmallest > n){
                theSmallest = n ;

            }
            if (theBiggest < n){
                theBiggest = n ;
            }

        }
        System.out.println("The smallest value = " + theSmallest);
        System.out.println("The biggest value = " + theBiggest);
    }
}
