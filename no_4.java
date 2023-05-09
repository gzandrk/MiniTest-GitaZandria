import java.util.*;

public class no_4{
	public static void main(String[] ayam) {
        for(int i=1; i<=100; i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.print("FizzBizz, ");
            }
            if(i%5==0)
            {
                System.out.print("Bizz, ");
            }
            if(i%3==0)
            {
                System.out.print("Fizz, ");
            }
            if(i%3!=0 && i%5!=0){
                System.out.print(i+", ");
            }
        }
    }
}