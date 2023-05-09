import java.util.Scanner;

public class no_1{
	public static void main(String[] ayam) {
		Scanner up= new Scanner (System.in);

        int bintang;

        System.out.println("Silahkan masukkan banyaknya tinggi segitiga piramida  : ");

        bintang = up.nextInt();

        star(bintang);
    }

    static int star (int bintang)
    {
        int i, j, k;
        k = 2 * bintang - 2;
        for(i=0;i<bintang;i++)
        {
            for(j=0;j<k;j++)
            {
                System.out.print(" ");
                k = k-1;
            }
            for(j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        return bintang;
    }
}
