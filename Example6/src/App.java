import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void sayiEsleriniBulma(ArrayList<Integer> sayiDizisi) {
        int birinciSayi;
        int ikinciSayi;
        int hedefSayisi = 8;

        for (int i = 0; i < sayiDizisi.size(); i++) {
            for (int j = i + 1; j < sayiDizisi.size(); j++) {
                if (sayiDizisi.get(i) + sayiDizisi.get(j) == 8) {
                    System.out.println("[" + sayiDizisi.get(i) + "," + sayiDizisi.get(j)
                            + "] sayıların toplamı hedef sayısına eşittir.");
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> sayiDizisi = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String girilenDeger;
        int girilenSayi;

        System.out.println(
                "Verilen bir dizide, toplamları hedef değere eşit olan tüm olası sayı çiftlerini bulan program");
        System.out.println("Hedef sayısı \"8\" olarak belirlenmiştir.");
        while (true) {
            System.out.println("---------------------------------------------");
            System.out.println("Diziye eklemek istediğiniz sayıyı giriniz:");
            System.out.println("(Çıkış için Q'ya basınız.)");
            girilenDeger = scanner.nextLine();

            if (girilenDeger.equalsIgnoreCase("q")) {
                System.out.println("Program sonlandırılıyor...");
                break;
            }

            try {
                girilenSayi = Integer.parseInt(girilenDeger);
                sayiDizisi.add(girilenSayi);
            } catch (Exception e) {
                System.out.println("HATALI GİRİŞ! Lütfen tekrar deneyiniz.");
            }
        }

        sayiEsleriniBulma(sayiDizisi);
    }
}
