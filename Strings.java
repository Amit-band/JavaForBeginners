
import java.util.Scanner;

public class Strings{
    public static void main(String[] args) {
        
    // -----------------------Strings in java-----------------------------------//
        // string are collection of charecter.
        // ex:
        // String name = "Amit";
        // String Lname = "Band";
        // System.out.println("First Name "+name+" Last Name "+Lname);


        // user input strings
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();//ends when space( ) is used
        // String name = sc.nextLine();//does not with space
        // System.out.println("Name is "+name);



        // Operation on string
        // String Fname = sc.nextLine();
        // String Lname = sc.nextLine();


        // 1.concatenation (adding two string)
        // String fullName = Fname.concat(Lname);//Fane + Lname
        // System.out.println("Full name is "+fullName);

        // 2.length
        // System.out.println("Length of string "+fullName.length());

        // 3.CharAt(to print char individually)
        // for(int i =0;i<fullName.length();i++){
        //     System.out.println(fullName.charAt(i));
        // }

        // 4.Compare
        String Fname = "Amit Band";
        // String Lname ="Amit" ;
        // if(Fname.compareTo(Lname)==0){//based on ascii values
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("String are not equal");
        // }
        // if(Fname==Lname){//not advisible
        // if(new String("Amit")== Fname){//not equal because it is in heap memory.
        //     System.out.println("Equal");
        // }
        // else{
        //     System.out.println("Not equal");
        // }

        
        // 5.Substring
        String sub = Fname.substring(0,4);//(starting index,ending index
        System.out.println("Substring is "+sub);//print 0 to 3 index characters.
    }
}
