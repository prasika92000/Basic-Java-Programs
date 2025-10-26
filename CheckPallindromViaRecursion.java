import java.util.Scanner;

public class CheckPallindromViaRecursion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine(); // read full line including spaces whereas sc.next -- only read first string
       
        CheckPallindromViaRecursion obj = new CheckPallindromViaRecursion(); 
        //System.out.println(obj.isPallindrome(s ,0 ,s.length() - 1));  //initial string s , initially starting index i as 0 and last index j as s.length()-1 
        boolean result = obj.isPallindrome(s, 0, s.length() - 1);  // call using object

         if (result) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }
    }
/* Cannot make a static reference to the non-static method isPallindrome(issue at line no 9)
happens because: main() is static, so it cannot directly call a non-static method. for solving this u have to make your isPallindrome method as static or either you have to create a class object and through this object u can call the method i use this approach above  */
    
    public boolean isPallindrome(String s , int i ,int j){
        if (s.charAt(i) != s.charAt(j)){
            return false;
        }
        if (i <= j) {   // base condition
            return true;
        }

        return isPallindrome(s ,i + 1 ,j -1);
    }
}


/* Dry Run with "madam" i starting index , j last index every tym starting index i + i incremented by 1 and last index decremented by 1 j -1 
Call	i	j	s.charAt(i)	   s.charAt(j)	   Return / Next Call
1	    0   4	    'm'	           'm'             i<j → recurse
2	    1	3	    'a'            'a'	           i<j → recurse
3	    2	2	    'd'	           'd'	           i>=j → return true
2	    1	3	                                   → returns true		
1	    0	4	                                   → returns true		
Final result: true → "It is a Palindrome" */




/* public class CheckPalindromeIterative {   //pallindrome without recursion
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        if (isPalindrome(s)) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }
    }

    public static boolean isPalindrome(String s) {
        int i = 0;               // start index
        int j = s.length() - 1;  // end index

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false; // mismatch found
            }
            i++;
            j--;
        }

        return true; // no mismatch found
    } */