import java.util.Scanner;

public class HitungFaktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka bulat positif: ");
        int n = input.nextInt();

        if (n < 0) {
            System.out.println("angka harus positif!");
        } else {
            long faktorial = 1;

            for (int i = 1; i <= n; i++) {
                faktorial *= i;
            }

            System.out.println("Faktorial dari " + n + " adalah: " + faktorial);
        }
    }
}
