import java.util.*;
public class Conditional{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // -----------conditional statements-------------------//
        // conditional stmt are those stmt which decide/control the flow of program.
        // ex : if age is more than 18 or not.
        // Types of conditonal stmt
        // if,if-else,else-if ladder,switch & break.


        // 1. if ==> check stmt & print result if true.
        // ex:
        // int a =10;
        // if(a==10){
        //     System.out.println(a);
        // }


        //2. if-else ==> check stmt & prints answer
        // ex:
        // int a = 10;
        // int b = 20;
        // if(a>=b){
        //     System.out.println("a is greater");
        // }else{
        //     System.out.println("b is greater");
        // }


        // 3.else-if ladder
        // check multiple stmt, 1st stmt after 2nd stmt & so on.
        // ex:
        // int a = sc.nextInt();
        // if(a>=18){
        //     System.out.println("you can vote");
        // }
        // else if(a<0){
        //     System.out.println("negative age");
        // }
        // else{
        //     System.out.println("not eligible to vote");
        // }



        // 4. switch stmt ==>allows us to execute multiple operation. a single variable "switch" execute mutliple conditions.
        // break ==> after execution of specific stmt we end it using break. 
        // ex: calclulator
        // System.out.println("Enter 2 numbers & operator");
        // float a = sc.nextFloat();
        // float b = sc.nextFloat();
        // System.out.println("Enter operator");
        // String ch = sc.next();
        // switch (ch) {
        //     case "+":
        //         System.out.println(a+b);
        //         break;
        //     case "-":
        //         System.out.println(a-b);
        //         break;
        //     case "*":
        //         System.out.println(a*b);
        //         break;
        //     case "/":
        //         System.out.println(a/b);
        //         break;
        //     default:
        //         System.out.println("fuck you");
        // }
        
    }
}