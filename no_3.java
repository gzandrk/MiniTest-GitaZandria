import java.util.Scanner;
import java.util.Arrays;

public class no_3{
    static int[] numbers = new int[6];
    static Scanner up= new Scanner (System.in);

	public static void main(String[] ayam) {
        pilih();
		System.out.println(Arrays.toString(numbers));
    }

    static void pilih()
    {
        
        int temp;
        boolean valid;
        for (int i = 0; i < 6; i++) {
            do {
                valid = true;
                System.out.print("Masukkan angka antara 1 sampai 100: ");
                temp = up.nextInt();
                if (temp < 1 || temp > 101) {
                    System.out.println("Error: Angka salah");
                    valid = false;
                }
                for (int j = 0; j < i; j++) {
                    if (numbers[j] == temp) {
                        System.out.println("Anda telah memasukkan angka ini");
                        valid = false;
                        break;
                    }
                }
                numbers[i] = temp;
            } while (!valid);
        }
    }
}