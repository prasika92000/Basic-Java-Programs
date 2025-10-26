public class FibonacciViaRecursion {
        int n1=0;
        int n2=1;
        int count=10;
        int sum=0;
        int temp=0;
        public static void main(String[] args) {
        FibonacciViaRecursion fiboseries= new FibonacciViaRecursion();
        System.out.print(fiboseries.n1 + " " + fiboseries.n2); 
        fiboseries.printFiboSeries(fiboseries.count - 2);  //here count = 10, we already printed 2 numbers (0 and 1),
                                                           //so we still need to print 10 - 2 = 8 more numbers.
                                                           //That’s why we call: fiboseries.printFiboSeries(fiboseries.count - 2);
    }

    public void printFiboSeries(int count){
        if (count > 0){
            sum= n1+ n2;
            System.out.print(" " +sum);
            n1=n2;
            n2=sum;
            printFiboSeries(count - 1);
        }
    }
}
