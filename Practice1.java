import  java.util.*;
public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//         //Q1
//         // int a = sc.nextInt();
//         // int b= sc.nextInt();
//         // int c = sc.nextInt();
//         // System.out.println("Average of 3 number is "+(a+b+c)/3);


//         // Q2
//         // int n = sc.nextInt();
//         // int sumEven = 0;
//         // int sumOdd = 0;
//         // for(int i =1;i<=n;i++){
//         //     if(i%2==0){
//         //         sumEven = sumEven +i;
//         //     }
//         //     else{
//         //         sumOdd = sumOdd+i;
//         //     }
//         // }
//         // System.out.println("Sum of Even number is "+sumEven);        
//         // System.out.println("Sum of Odd number is "+sumOdd);
        
        
//         // Q3 & Q4
//         // int n = sc.nextInt();
//         // int r = sc.nextInt();
//         // if(n>r){
//         //     System.out.println(n+" is greater");
//         // }else if(n==r){
//         //     System.out.println(n+" is equal to "+r);
//         // }else{
//         //     System.out.println(r+" is greater");
//         // }
//         // System.err.println("Circumference for given radius is "+2*3.14*r);


//         // Q5
//         // int r = sc.nextInt();
//         // if(r>=18){
//         //     System.out.println("You can Vote");
//         // }else{
//         //     System.out.println("You can't vote,yet");
//         // }


//         // Q6
//         // int i = 0;
//         // do { 
//         //     System.out.println("Amit"+i);
//         //     i++;
//         // } while (true);


//         // // Q7
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int exp =a;
        // for(int i =1;i<b;i++){
        //      exp = exp*a;
        // }
        // System.out.println("Exp is "+exp);
        // System.out.println("Enter how many numbers you want to enter");
        // int n = sc.nextInt();
        System.out.println("Enter any character to Start");
        int posn = 0;
        int negn = 0;
        int zeron = 0;
        String choice = sc.next();
        do { 
            System.out.println("Enter a number");
            int a = sc.nextInt();
            if(a>0){
                posn++;
            }else if(a==0){
                zeron++;
            }
            else{
                negn++;
            }
            System.out.println("Enter Y or y to Exit, any other character to continue");
            choice = sc.next();
       } while (!(choice.equals("Y") || choice.equals("y")));

        System.out.println("Positive numbers are "+posn);
        System.out.println("Negative numbers are "+negn);
        System.out.println("Zero numbers are "+zeron);



// fibonacci series
        // System.out.println("Enter the length of the series");
        // int n = sc.nextInt();
        // System.out.println("Enter the starting 2 numbers");
        // int n1 = sc.nextInt();
        // int n2 = sc.nextInt();
        // int n3 =0;
        // System.out.print("Fibonacci series is "+n1+" "+n2);
        // for(int i =1;i<=n-2;i++){
        //     n3 = n1+n2;
        //     n1 = n2;
        //     n2 = n3;
        //     System.out.print(" "+n3);
        // }

    }
}
// o/p = 0 1 1 2 3 5 8 13.......

