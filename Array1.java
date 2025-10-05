import java.util.*;
public class Array1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            // --------------------------Arrays in java---------------------------//
            // Arrays are used to store similar types of data(homogeneous data)
            // Arrays folow indexing from 0 to n-1(where n is the size of the array)

            // Array Syntax:size not know
            // type[] arrayName = new[size of the array];  //type can be String,float,double,int,other premetive DT

            // example of array
            // System.out.println("Enter the size of array");
            // int n = sc.nextInt();
            // int arr[] = new int[n]; //storing n element in the array;
            // System.out.println("Enter the "+n+" Array element");
            // for(int i =0;i<=n-1;i++){
            //     arr[i]=sc.nextInt(); //taking the array element input from index 0 to n-1
            // }
            //  for(int i =0;i<=n-1;i++){
            //     // System.out.println("Array element "+i+" is "+arr[i]); //printing the result from index 0 to n-1
            // }
            // System.out.println("Array index out of bound error"+arr[6]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5



            // Syntacx of array" size know
            // int[] arr1 = {5,4,67,12,56};// size must be know before hand
            // for(int i =0;i<=arr1.length-1;i++){
            //     System.out.println(arr1[i]);
            // }


            // type error in java
            // int[] arr1 = {5,4,67,12,56,"Amit"};// heterogeneous arry not allowed
            // // array1.java:35: error: incompatible types: String cannot be converted to int
            // for(int i =0;i<=arr1.length-1;i++){
            //     System.out.println(arr1[i]);
            // }


            // array without any values
            // int arr2[] = {};
            // System.out.println(arr2);//[I@6f496d9f garbage value



            // Q1 Linear Search
            // System.out.println("Enter the size of the array");
            // int size = sc.nextInt();
            // int arr[] = new int[size];
            // System.out.println("Enter the Array elemnt");
            // for(int i =0;i<=size-1;i++){
            //     arr[i]=sc.nextInt();
            // }
            // System.out.println("Enter the element you wan to find");
            // int key = sc.nextInt();
            // for(int i =0;i<=size-1;i++){
            //     if(arr[i]==key){
            //         System.out.println("Array elemnt found at index "+i);
            //         return;
            //     }
            // }
            // System.out.println("element not found in the given array");

            

            // Array with String.
            // System.out.println("Enter the size of array");
            // int n = sc.nextInt();
            // String arr[] = new String[n]; //storing n element in the array;
            // System.out.println("Enter the "+n+" Array element");
            // for(int i =0;i<=n-1;i++){
            //     arr[i]=sc.next(); //taking the array element input from index 0 to n-1
            // }
            //  for(int i =0;i<=n-1;i++){
            //     System.out.println("Array element "+i+" is "+arr[i]); //printing the result from index 0 to n-1
            // }



            // // min & max from array
            // int arr[]={45,67,34,255,667,789};
            // int max = arr[1];
            // int min = arr[1];
            // for(int i =0;i<arr.length;i++){
            //     if(arr[i]>max){
            //         max = arr[i];
            //     }
            // }
            // System.out.println("Max is "+max);
            // for(int i =0;i<arr.length;i++){
            //     if(arr[i]<min){
            //         min = arr[i];
            //     }
            // }
            // System.out.println("Min is "+min);


            // array ordered or not
            // int arr[]={1,2,3,7,5,6};
            // boolean ordered = true;
            // for(int i = 0;i<arr.length-1;i++){
            //     if(arr[i]>arr[i+1]){
            //         ordered = false;
            //     }
            // }
            // if(ordered){
            //     System.out.println("Array is sorted");
            // }
            // else{
            //     System.out.println("Array is not sorted");
            // }
    }
}