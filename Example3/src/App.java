import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int diziBoyutu;

        do {
            System.out.print("Dizinin boyutunu giriniz (en az 2): ");
            while (!scanner.hasNextInt()) {
                System.out.print("Hatalı giriş! Lütfen bir tamsayı giriniz: ");
                scanner.next();
            }
            diziBoyutu = scanner.nextInt();
        } while (diziBoyutu < 2);

        int[] dizi = new int[diziBoyutu];
        dizi[0] = 0;
        dizi[1] = 1;

        for (int index = 2; index <= dizi.length - 1; index++) {
            dizi[index] = dizi[index - 1] + dizi[index - 2];
        }

        System.out.print("Dizinin elemanları => ");
        for (int diziElemani : dizi) {
            System.out.print(diziElemani + ", ");
        }

    }
}
