import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void sinavSonuclariniGosterme(ArrayList<Integer> sinavSonuclariArrayList) {
        System.out.println("***********************************************");
        if (sinavSonuclariArrayList.isEmpty()) {
            System.out.print("Herhangi bir sınav sonucu girilmedi.");
        } else {
            System.out.print("Sınav Sonuçları: ");
            for (int sinavSonucu : sinavSonuclariArrayList) {
                System.out.print(sinavSonucu + " ");
            }
        }
        System.out.println();
    }

    public static void enYuksekSinavSonucunuBulma(ArrayList<Integer> sinavSonuclariArrayList) {
        System.out.println("***********************************************");
        int enYuksekSinavSonuc = sinavSonuclariArrayList.get(0);
        for (int index = 1; index < sinavSonuclariArrayList.size(); index++) {
            if (enYuksekSinavSonuc < sinavSonuclariArrayList.get(index)) {
                enYuksekSinavSonuc = sinavSonuclariArrayList.get(index);
            }
        }
        System.out.println("En yüksek sınav sonucu: " + enYuksekSinavSonuc);
    }

    public static void enDusukSinavSonucunuBulma(ArrayList<Integer> sinavSonuclariArrayList) {
        System.out.println("***********************************************");
        int enDusukSinavSonuc = sinavSonuclariArrayList.get(0);
        for (int index = 1; index < sinavSonuclariArrayList.size(); index++) {
            if (enDusukSinavSonuc > sinavSonuclariArrayList.get(index)) {
                enDusukSinavSonuc = sinavSonuclariArrayList.get(index);
            }
        }
        System.out.println("En düsük sınav sonucu: " + enDusukSinavSonuc);
    }

    public static void aritmetikOrtalamaBulma(ArrayList<Integer> sinavSonuclariArrayList) {
        System.out.println("***********************************************");
        int sinavSonuclariToplami = 0;
        int ogrenciSayisi = sinavSonuclariArrayList.size();

        for (int sinavSonucu : sinavSonuclariArrayList) {
            sinavSonuclariToplami += sinavSonucu;
        }
        System.out.println("Sınav sonuçlarının aritmetik ortalaması: " + (sinavSonuclariToplami / ogrenciSayisi));
    }

    public static void main(String[] args) {

        ArrayList<Integer> sinavSonuclari = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        String girilenDeger;
        int girilenSayi;

        while (true) {
            System.out.println("***********************************************");
            System.out.println("Çıkmak için Q'ya basınız.");
            System.out.println("Bir sayı giriniz: ");
            girilenDeger = scanner.nextLine();

            if (girilenDeger.equalsIgnoreCase("q")) {
                System.out.println("Program sonlandırılıyor...");
                break;
            }

            try {
                girilenSayi = Integer.parseInt(girilenDeger);
            } catch (Exception e) {
                System.out.println("Hatalı giriş! Lütfen bir sayı giriniz.");
                continue;
            }
            sinavSonuclari.add(girilenSayi);
        }

        sinavSonuclariniGosterme(sinavSonuclari);
        enDusukSinavSonucunuBulma(sinavSonuclari);
        enYuksekSinavSonucunuBulma(sinavSonuclari);
        aritmetikOrtalamaBulma(sinavSonuclari);
    }
}