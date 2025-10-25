public class SwappingNo {
    public static void main(String[] args) {
        int n1=50;
        int n2= 90;
        int temp=0; 
        System.out.println("NUmbers before swapping : "+ n1 + " " + n2 );

        //swapping using third variable 
        /* temp =n1; //n1=50
        n1 = n2;  //n1=90
        n2 = temp;  //n2=50
        System.out.println("NUmbers after swapping : "+ n1 + " " + n2 );
 */
        //swapping without using third variable 
        n1 =n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;
        System.out.println("NUmbers after swapping : "+ n1 + " " + n2 );



    }
}
