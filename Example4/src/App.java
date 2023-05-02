import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void tekVeCiftSayilarinToplaminiBulma(ArrayList<Integer> sayiDizisi) {

        int tekSayilarinToplami = 0;
        int ciftSayilarinToplami = 0;

        for (int sayi : sayiDizisi) {
            if (sayi % 2 != 0) {
                tekSayilarinToplami += sayi;
            } else if (sayi % 2 == 0) {
                ciftSayilarinToplami += sayi;
            }
        }

        System.out.println("Tek sayıların toplamı: " + tekSayilarinToplami);
        System.out.println("Çift sayıların toplamı: " + ciftSayilarinToplami);
    }

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> sayiDizisi = new ArrayList<>();
        String girilenDeger;
        int girilenSayi;

        while (true) {

            System.out.println("************************************************");
            System.out.println("Dizine eklemek istediğiniz sayıyı giriniz:");
            System.out.println("İşlemi sonlandırmak için Q'ya basınız.");
            girilenDeger = scanner.nextLine();

            if (girilenDeger.equalsIgnoreCase("q")) {
                break;
            }

            try {
                girilenSayi = Integer.valueOf(girilenDeger);
            } catch (Exception e) {
                System.out.println("Hatalı Giriş! Lütfen tekrar deneyiniz.");
                continue;
            }

            sayiDizisi.add(girilenSayi);
            System.out.println("Dizine " + girilenSayi + " eklendi.");
        }

        tekVeCiftSayilarinToplaminiBulma(sayiDizisi);
        System.out.println("İşlem sonlandırılıyor...");
    }
}
