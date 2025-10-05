import java.util.*;
public class Pattern2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
       
        // -------------------------------------Pattern-2-------------------------------// 

        // 10. Butterfly pattern
        //*       *
        // **    **
        // ***  ***
        // ********
        // ********
        // ***  ***
        // **    **
        // *      *
        // int n = sc.nextInt();
        // upper half
        // for(int i =1;i<=n;i++){
        //     // inner 1st part pattern
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     spaces
        //      int spaces = 2*(n-i);
        //     for(int k =1;k<=spaces;k++){
        //         System.out.print(" ");
        //     }
        //      for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        //          Lowe-half
        // for(int i =n;i>=1;i--){
        //     // inner 1st part pattern
        //     for(int j=i;j>=1;j--){
        //         System.out.print("*");
        //     }
        //     for(int k =1;k<=2*(n-i);k++){
        //         System.out.print(" ");
        //     }
        //      for(int j=i;j>=1;j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }




        // 11. Solid Rhombus
        //    *****
        //   *****
        //  *****
        // *****
        //*****
        // int n = sc.nextInt();
        // for(int i=1;i<=n;i++){
        // spaces
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        // patterns
        //     for(int j=1;j<=n;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // 13. Number pyramid
        //    1 
        //   2 2
        //  3 3 3
        // 4 4 4 4 
        //5 5 5 5 5
        // int n =sc.nextInt();
        // for(int i = 1;i<=n;i++){
        //     // spaces
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     // numbers
        //     for(int j =1;j<=i;j++){
        //         System.out.print(i);
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }



        // 13.plaindrome pattern
//             1
//            212
//           32123
//          4321234
//         543212345
        // int n= 5;
        // //outer loop
        // for(int i = 1;i<=n;i++){
        //     // spaces
        //     for(int j =1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     // Numbers for 1st half
        //     for(int j =i;j>=1;j--){
        //         System.out.print(j);
        //     }
        //     // 2nd half number
        //     for(int j=2;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }



        // 14. Diamond Pattern
        int n = 4;
        for(int i = 1;i<=n;i++){
            // spaces
            for(int j = 1;j<=n-i;j++){
                    System.out.print(" ");
            }
            // stars pattern
            for(int j = 1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower half
        for(int i = n;i>=1;i--){
            // spaces
            for(int j = 1;j<=n-i;j++){
                    System.out.print(" ");
            }
            // stars pattern 
            for(int j = 1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}