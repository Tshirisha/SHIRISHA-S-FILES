import java.util.*;
public class EvenOdd1 {
    public static void main (String[] args){
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=reader.nextInt();
        if(number %2 ==0)
        System.out.println(number+"is even number");
        else
        System.out.println(number+"is odd number");


    }

}
