import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void maxCarpimAltDiziBul(ArrayList<Integer> sayiDizisi) {
        int birinciSayi;
        int ikinciSayi;
        int[] altSayiDizisi = new int[2];
        int sonuc;
        int maxSonuc = 0;

        for (int index = 0; index < sayiDizisi.size() - 1; index++) {
            birinciSayi = sayiDizisi.get(index);
            ikinciSayi = sayiDizisi.get(index + 1);
            sonuc = birinciSayi * ikinciSayi;
            if (sonuc > maxSonuc) {
                maxSonuc = sonuc;
                altSayiDizisi[0] = birinciSayi;
                altSayiDizisi[1] = ikinciSayi;
            }
        }
        System.out.println("Dizi: " + sayiDizisi);
        System.out.println("Alt dizi: " + Arrays.toString(altSayiDizisi));
        System.out.println("Maksimum Sonuc: " + maxSonuc);
    }

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> sayiDizisi = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Verilen bir sayı dizisinde, ardışık elemanların çarpımının en büyük olduğu alt diziyi bulan program");
        String girilenDeger;
        int girilenSayi;

        while (true) {
            System.out.println("*************************************************");
            System.out.println("Diziye girmek istediğiniz sayıyı giriniz:");
            System.out.println("(Çıkmak için Q'ya basınız.)");
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
        maxCarpimAltDiziBul(sayiDizisi);
    }
}
