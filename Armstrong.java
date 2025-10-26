public class Armstrong {
    public static void main(String[] args) {
       // int num=153;
        int num = 94714;
        int temp=num;
        int rem=0;
        int result=0;

         // Count number of digits
        int digits = String.valueOf(num).length();   // converts the integer num into a string

       /*  while(num > 0){   //15>0   1>0      for three digit logic
            rem = num % 10;  //153%10=3   15%10=5   1%10=1
            num = num / 10;  //153/10=15   15/10=1   1/10=0
            result = result + (rem*rem*rem);  //0+(3*3*3)=27   27+(5*5*5)=152  157+(1)=153
        } */

        // Use for loop instead of while
         /* while (num > 0) {   //for four digit to any digits
            rem = num % 10;
            result = result + (int)Math.pow(rem, digits); // Raise to the power of digits
            num = num / 10;
        }  */
          
        for (int n = num; n > 0; n = n / 10) {
            rem = n % 10;
            result += Math.pow(rem, digits);
        }
        
        if(result == temp){
            System.out.println("It is a Armstrong number");
        }else{
            System.out.println("It is not a Armstrong number");

        }
    }
}





// each digit is raised to the power of the number of digits, and the sum of those values is equal to the original number.
/* 153 → 3-digit number
1^3+5^3+3^3 = 1+125+27 =153
9474 → 4-digit number
9^4+4^4+7^4+4^4 = 6561+256+2401+256=9474 */


/* Dry Run : 
Initial values:
num = 153
temp = 153
rem = 0
result = 0

Step 1: Count digits
digits = String.valueOf(num).length(); 


👉 String.valueOf(153) → "153"
👉 .length() → 3

✅ digits = 3

Step 2: Start the loop
for (int n = num; n > 0; n = n / 10)

🔸 Iteration 1:
n = 153
rem = n % 10 = 153 % 10 = 3
result += Math.pow(rem, digits)
result = 0 + 3³ = 27


👉 After loop body:
n = n / 10 = 153 / 10 = 15

✅ result = 27

🔸 Iteration 2:
n = 15
rem = n % 10 = 15 % 10 = 5
result += Math.pow(5, 3) = 27 + 125 = 152

👉 After loop body:
n = n / 10 = 15 / 10 = 1

✅ result = 152

🔸 Iteration 3:
n = 1
rem = n % 10 = 1 % 10 = 1
result += Math.pow(1, 3) = 152 + 1 = 153


👉 After loop body:
n = n / 10 = 1 / 10 = 0

✅ result = 153

Step 3: Exit loop

Loop ends because n > 0 is now false (n = 0).

Step 4: Compare
if(result == temp)

👉 result = 153, temp = 153

✅ They are equal. */