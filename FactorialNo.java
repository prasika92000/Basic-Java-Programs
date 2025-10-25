import java.math.BigInteger;

public class FactorialNo {
    public static void main(String[] args) {
        int num = 5 ;
        int fact = 1;
        //int num = 90 ;
       // BigInteger fact = BigInteger.ONE;  //Use **java.math.BigInteger** to store large values like 90! factorial.


        for(int i=1;i<=num;i++){
            fact = fact * i;
            //fact = fact.multiply(BigInteger.valueOf(i)); //Multiply current value of fact by i and store the result(this only for large numbers)
        }
        System.out.println("factorial of the " + num + " is " + fact );
    }
}




//5=5*4*3*2*1
//6=6*5*4*3*2*1