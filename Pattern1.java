import java.util.*;
public class Pattern1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Most Aksed types of pattern part-1
        // 1. print this solid rectangle
        // *****
        // *****
        // *****
        // *****
        // System.out.println("Enter the Row");
        // int n = sc.nextInt();
        // System.out.println("Enter the column");
        // int c = sc.nextInt();
        // for(int i = 1;i<=n;i++){
        //     for(int k=0;k<=c;k++){
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        // }




        // 2. print this hollow rectangle
        // *****
        // *   *
        // *   *
        // *****
        // System.out.println("Enter the Row");
        // int n = sc.nextInt();
        // System.out.println("Enter the column");
        // int k = sc.nextInt();
        // // outer loop = row
        // for (int i = 1; i <= n; i++) {
        //     // inner looop = column
        //     for (int j = 1; j <= k; j++) {
        //         // cell = i,j

        //         if(i==1 || j==1 || i==n||j==k){
        //             System.out.print("*");
        //         }else{
        //              System.out.print(" ");
        //         }
        //     }
        //     System.out.print("\n");
        // }




        // 3.half pyramid
        // *
        // **
        // ***
        // ****
        // *****
       // System.out.println("Enter the Row");
        // int n = sc.nextInt();
        // for( int i =1;i<=n;i++){
        //     for(int j =1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }




        // 4.inverted half pyramid
        // *****
        // ****
        // ***
        // **
        // *
        //  System.out.println("Enter the Row");
        // int n = sc.nextInt();
        // // outer loop
        // for(int i =n; i>=1 ;i--){
        //     // inner loop
        //     for(int j =1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();;
        // }




        // 5.180 rotated half pyramid
        // int n = 4;
        // // outer loop
        // for(int i = 1;i<=n;i++){
        //     // inner loop for spcae
        //     for(int j =1;j<=n-i;j++){
        //         System.err.print(" ");
        //     }
        //         // inner for stars 
        //         for (int j = 1; j <=i ; j++) {
        //             System.out.print("*");
        //         }
        //         System.out.println();
        // }




        // 6. half pyramid with numbers
        // 1
        // 12
        // 123
        // 1234
        // 12345
        // System.out.println("Enter the Row");
        // int n = sc.nextInt();
        // // outer loop
        // for(int i =1; i<=n ;i++){
        //     // inner loop
        //     for(int j =1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();;
        // }



        // 7.print this half pyramid
        // 12345
        // 1234
        // 123
        // 12
        // 1
        // System.out.println("Enter the Row");
        // int n = sc.nextInt();
        // // outer loop
        // for(int i =n; i>=1 ;i--){
        //     // inner loop
        //     for(int j =1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();;
        // }




        // 8.print this number half pyramid
        // 54321
        // 4321
        // 321
        // 21
        // 1
    //     System.out.println("Enter the Row");
    //     int n = sc.nextInt();
    //     // outer loop
    //     for(int i =n; i>=1 ;i--){
    //         // inner loop
    //         for(int j =i;j>=1;j--){
    //             System.out.print(j);
    //         }
    //         System.out.println();;
    //     }



    // 9. Flyod's triangles
    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10
    // 11 12 13 14 15
    //     System.out.println("Enter the Row");
    //     int n = sc.nextInt();
    //     int l =1;
    //     // outer loop
    //     for(int i =1; i<=n ;i++){
    //         // inner loop
    //         for(int j =1;j<=i;j++){
    //             System.out.print(l+" ");
    //             l++;
    //         }
    //         System.out.println();;
    //     }



    // 0-1 trianlge
    // int n =5;
    // // outer loop
    // for(int i =1;i<=n;i++){
    //     // inner loop
    //     for(int j = 1;j<=i;j++){
    //         int k = i+j;
    //         if(k%2==0){
    //             System.out.print("1 ");
    //         }else{
    //             System.out.print("0 ");
    //         }
    //     }
    //     System.out.println();
    // }
    }
}