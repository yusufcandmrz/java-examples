import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void tekrarEdenSayilariBulma(ArrayList<Integer> sayiDizisi) {
        ArrayList<Integer> tekrarEdenSayilar = new ArrayList<>();

        for (int i = 0; i < sayiDizisi.size(); i++) {
            int sayi = sayiDizisi.get(i);

            for (int j = i + 1; j < sayiDizisi.size(); j++) {
                int digerSayi = sayiDizisi.get(j);

                if (sayi == digerSayi && !tekrarEdenSayilar.contains(sayi)) {
                    tekrarEdenSayilar.add(sayi);
                    break;
                }
            }
        }
        System.out.println("Tekrar eden sayılar: " + tekrarEdenSayilar);
    }

    public static void main(String[] args) {

        ArrayList<Integer> sayiDizisi = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String girilenDeger;
        int girilenSayi;

        System.out.println("Verilen bir dizi içinde tekrar eden sayıları bulan program");
        while (true) {
            System.out.println("**********************************************");
            System.out.println("Diziye eklemek istediğiniz sayıyı giriniz: ");
            System.out.println("Programı sonlandırmak için Q'ya basınız.");
            girilenDeger = scanner.nextLine();

            if (girilenDeger.equalsIgnoreCase("q")) {
                System.out.println("Program sonlandırılıyor...");
                break;
            }

            try {
                girilenSayi = Integer.parseInt(girilenDeger);
                sayiDizisi.add(girilenSayi);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        tekrarEdenSayilariBulma(sayiDizisi);
    }
}