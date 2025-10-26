import java.util.Scanner;

public class FindingNaturalNoViaRecursion {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    printNaturalNo(num);

    /* printNaturalNoAscending(1, num); // start from 1 to num(1 2 3 4 5 instead of 5 4 3 2 1 ) -- another approach using one additional variable

    public static void printNaturalNoAscending(int current, int num) {
        if (current > num) {   // base case
            return;
        }
        System.out.println(current);      // print current number
        printNaturalNoAscending(current + 1, num); // recursive call for next number
    } */
           
    }

    public static void printNaturalNo(int num){
        if (num == 0) {   // base case
            return;
        }
        printNaturalNo(num - 1);
        System.out.println(num);
        
    }
}



/* public class FindingNaturalNoIterative {   // finding natural no without recursion
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        for (int i = num; i >= 1; i--) {  // start from num down to 1
            System.out.println(i);
        }
    }

Print Natural Numbers in Ascending Order (1 to n) then 
for (int i = 1; i <= num; i++) {
    System.out.println(i);
}
} */
