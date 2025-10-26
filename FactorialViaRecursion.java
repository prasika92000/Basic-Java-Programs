import java.util.Scanner;

public class FactorialViaRecursion {
    
    int fact=1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        FactorialViaRecursion factNo = new FactorialViaRecursion();
        factNo.calFact(num);     // perform recursion
        System.out.println("Factorial of " + num + " is : " + factNo.fact);

    }

    public void calFact(int num){
        if (num >1) {
            fact= fact * num;
            calFact(num - 1); // recursive call
            
        }

    }
}
