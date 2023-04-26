import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class App {

    public static void enBuyukIkiSayiyiBulma(ArrayList<Integer> sayilar) {

        if (sayilar.isEmpty()) {
            System.out.println("Herhangi bir sayı girmediniz.");
        } else {

            System.out.print("Girmiş olduğunuz sayılar: ");
            for (int sayi : sayilar) {
                System.out.print(sayi + ", ");
            }
            System.out.println("");
            Collections.sort(sayilar);

            System.out.println("Girmiş olduğunuz sayıların en büyüğü: " + sayilar.get(sayilar.size() - 1));
            System.out.println("Girmiş olduğunuz sayıların ikinci en büyüğü: " + sayilar.get(sayilar.size() - 2));
        }
    }

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> sayilar = new ArrayList<Integer>();
        String girilenDeger;
        int girilenSayi;

        while (true) {
            System.out.println("******************************");
            System.out.println("Çıkmak için Q'ya basınız.");
            System.out.println("Bir sayı giriniz:");

            girilenDeger = scanner.nextLine();

            if (girilenDeger.equalsIgnoreCase("q")) {
                System.out.println("Program sonlandırılıyor...");
                break;
            }

            try {
                girilenSayi = Integer.parseInt(girilenDeger);
            } catch (Exception e) {
                System.out.println("Hatalı giriş! Lütfen bir sayı giriniz...");
                continue;
            }

            sayilar.add(girilenSayi);
        }

        enBuyukIkiSayiyiBulma(sayilar);
    }
}
