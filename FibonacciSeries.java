public class FibonacciSeries {
    public static void main(String[] args) {
       int n1=0;
       int n2=1;
       int sum=0;
       int count=10; 
       System.out.print(n1 + " " + n2);
       //loop starts from 2 becoz 0 and 1 already printed
       for(int i =2;i<=count;i++){
        sum=n1+n2;
        System.out.print(" " +  sum);
        n1=n2;
        n2=sum;
       }
    }
}



/* The Fibonacci Series is a sequence of numbers where Each number is the sum of the two previous numbers.
fibonaci series starts with o and 1 S
0 1 1 2 3 5 8 13
so here 0+1=1 ; 1+1=2 ; 2+1=3 ; 3+5=8 and so on  */