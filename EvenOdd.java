public class EvenOdd {
    public static void main(String[] args) {
      //  int n=55;
      //  EvenOddNumberCheck(n);
      for(int i=1 ;i<=100;i++){
        EvenOddNumberCheck(i);
      }
    }

    public static void EvenOddNumberCheck(int n){
        if (n%2==0) {
            System.out.println("It is even ::: " + n);
            
        }else{
            System.out.println("It is odd ::: " + n);
        }
    }
}





// Lists to store even and odd numbers

/*         ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        // Loop from 1 to 100
        for (int i = 1; i <= 100; i++) {
            if (isEven(i)) {
                evenNumbers.add(i); // Add to even list
            } else {
                oddNumbers.add(i);  // Add to odd list
            }
        }

        // Print even numbers
        System.out.println("Even Numbers:");
        System.out.println(evenNumbers);

        // Print odd numbers
        System.out.println("Odd Numbers:");
        System.out.println(oddNumbers);
    }

    // Method to check if a number is even
    public static boolean isEven(int n) {
        return n % 2 == 0;
    } */