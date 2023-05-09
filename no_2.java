import java.util.Scanner;

public class no_2{
	public static void main(String[] ayam) {
		Scanner up= new Scanner (System.in);

        String asli="";

        System.out.println("Silahkan masukkan kata  : ");

        asli = up.nextLine();

        cek(asli);
    }

    static String cek (String asli)
    {
        String balik = "";
        int huruf = asli.length() - 1;
        int b = huruf;

        for(int i=b; i>=0; i--)
        {
            balik = balik + asli.charAt(i);
        }
        if (asli.toLowerCase().equals(balik.toLowerCase()))  
        {
            System.out.println("Kata yang anda masukkan termasuk palindrome");
            System.out.println(balik);
        }
        else  
        {
            System.out.println("Kata yang anda masukkan bukan termasuk palindrome");
        }

        return asli;
    }
}