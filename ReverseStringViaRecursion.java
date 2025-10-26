import java.util.Scanner;

public class ReverseStringViaRecursion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the string to reverse: ");
         String s = sc.nextLine(); // read full line including spaces whereas sc.next -- only read first string 
        System.out.println("Reversed string: " + reverseString(s, "",s.length() - 1));    //initially for reversing the string we pass this three parameter 
                                                                    // assume s is the original string like a b c d 
                                                                    //string is immutable so we cant modify the same string so we create one empty string (second parameter - r)
                                                                    //and we want a last index of string - s.length-1 (4-1= 3)
    }

    static String reverseString(String s, String r, int i){
           if (i < 0){
            return r;
           }
           return(reverseString (s , r + s.charAt(i),i-1));
    }
}



/* public class ReverseStringIterative {            //reverse string without recursion
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to reverse: ");
        String s = sc.nextLine();
        sc.close();

        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed = reversed + s.charAt(i); // append characters from end to start
        }

        System.out.println("Reversed string: " + reversed);
    } */