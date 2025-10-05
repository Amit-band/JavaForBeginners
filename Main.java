import java.util.*;

public class Main{

        // ===============================Funvtions in java========================================//
        // Functions are a block of code which is used to execute a particular task, it is also called as methods.\
        // Fun1ction reduces code redundancy and increases reusability.
        // Function are of many types in java:
        // we will discuss them later, now this is a basic syntax to write any function in java
        // return_type function_name(data_type parameter1, data_type parameter2, ...){
        //     // body of the function
        //     return value;
        // }
        // return_type: it can be any data type like int, float, char, String, boolean, void etc.
        // function_name: it is the name of the function, it should be meaningful and should follow the naming conventions.
        // parameter: it is the input to the function, it can be of any data type, we can also pass multiple parameters to a function.
        // return value: it is the output of the function, it should be of the same data type as the return_type.
        // if the return_type is void, then we don't need to return any value.


    // Example: A function to print my name
    // public static void printMyname(String name){
    //     System.out.println("My name is " + name);
    // }

    // Example 2: add 2 numbers
    public static int add(int a,int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // printMyname(name);// calling the function

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result =  add(num1,num2);
        System.out.println("Result  is "+result);
        sc.close();
    }
}
