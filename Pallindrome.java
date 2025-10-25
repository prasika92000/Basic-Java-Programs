public class Pallindrome {
    public static void main(String[] args) {
        int num=151;
        int sum=0;
        int rem=0;
        int temp=num;

        while(num>0){    //5>0    1>0
            rem = num % 10;   //151%10=1    15%10=5   1%10=1
            sum = (sum * 10)+rem;       //(0*10)+1     (1*10)+5=15      (15*10)+1=151
            num = num/ 10;           //151/10=15       15/10=1   1/10=0
        }
        if (temp == sum) {
            System.out.println("It is a Pallindrome");
        }else{
            System.out.println("It is not a Pallindrome");

        }
    }
}


//no that is same after reverse 
//for example -151 reverse is 151 ,171 reverse is 171