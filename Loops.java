import java.util.*;
public class Loops{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // ------------------------------------Loops in java-----------------------------------//
        // loops are used to execute a block of code repeatedly until a certain condition is met.
        // There are three main types of loops in Java: for loop, while loop, and do-while loop.
        
        
        
        // 1. For Loop ==>for loop is used when the number of iterations is known beforehand.
        // System.out.println("For Loop:");
        // Syntax:
        // for (initialization; condition; update) {// where initialization is starting point, condition is the ending point, and update is the increment or decrement step.
        //     // code to be executed
        // }
        // for(int i=1; i<=5; i++){
        //     System.out.println("Iteration: " + i);// This will print numbers from 1 to 5
        // }

        
        
        
        // 2. While Loop==> while loop is used when the number of iterations is not known beforehand and depends on a condition.
        // System.out.println("While Loop:");
        // // Syntax:
        // // while (condition) {
        // //     // code to be executed
        // //     // update the condition
        // // }
        // int i = 1;
        // while (i <= 5) {
        //     System.out.println("Iteration: " + i);// This will print numbers from 1 to 5
        //     i++;
        // }



        // 3. Do-While Loop ==> do-while loop is similar to while loop, but it guarantees that the code block will be executed at least once, even if the condition is false.
        System.out.println("Do-While Loop:");
        // Syntax:
        // do {
        //     // code to be executed
        //     // update the condition
        // } while (condition);
        // int i = 1;
        // do {
        //     System.out.println("Iteration: " + i);// This will print numbers from 1 to 5
        //     i++;
        // } while (i <= 5);

        // special case of do-while loop
        // int i = 6;
        // do {
        //     System.out.println("Iteration: " + i);// This will print 6 once, even though the condition is false
        //     i++;
        // } while (i <= 5);

// remmerber to use break and continue statements in loops
// break statement is used to exit the loop prematurely when a certain condition is met.
// continue statement is used to skip the current iteration and move to the next iteration of the loop.
// dicuss them in near future.


// print the sum of n natural number
// System.out.println("Enter a number");
// double n = sc.nextDouble();
// double sum = 0;
// for(int i = 1;i<=n;i++){
//     sum = sum+i;
// }
// System.out.println("Smm of n natural number is: "+sum);



// print a table for n from 1 to t
System.out.println("Enter the number you want a table for");
int n = sc.nextInt();
System.out.println("Enter the length of the table");
int t = sc.nextInt();
for(int i =1;i<=t;i++){
    System.out.println(n+" X "+i+" = "+n*i);
} 
    }
}