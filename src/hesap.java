
import java.util.Scanner;

public class hesap{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen kare ya da dikdortgen seciniz:");
        String sekil = input.nextLine();

        if (sekil==("kare")) {
            System.out.println("Kare alanini mi cevresini mi hesaplamak istersiniz?");
            String hesap = input.nextLine();
            if (hesap==("alan")) {
                System.out.println("Lutfen kare kenar uzunlugunu giriniz:");
                double kenar = input.nextDouble();
                double alan = kenar * kenar;
                System.out.println("Kare alanı: " + alan);
            } else if (hesap==("cevre")) {
                System.out.println("Lutfen kare kenar uzunlugunu giriniz:");
                double kenar = input.nextDouble();
                double cevre = 4 * kenar;
                System.out.println("Kare cevresi: " + cevre);
            }
        } else if (sekil==("dikdortgen")) {
            System.out.println("Dikdortgen alanini mi cevresini mi hesaplamak istersiniz?");
            String hesap = input.nextLine();
            if (hesap.equals("alan")) {
                System.out.println("Lutfen dikdortgen uzun kenar uzunlugunu giriniz:");
                double uzunKenar = input.nextDouble();
                System.out.println("Lutfen dikdortgen kisa kenar uzunlugunu giriniz:");
                double kisaKenar = input.nextDouble();
                double alan = uzunKenar * kisaKenar;
                System.out.println("Dikdortgen alanı: " + alan);
            } else if (hesap.equals("cevre")) {
                System.out.println("Lutfen dikdortgen uzun kenar uzunlugunu giriniz:");
                double uzunKenar = input.nextDouble();
                System.out.println("Lutfen dikdortgen kisa kenar uzunlugunu giriniz:");
                double kisaKenar = input.nextDouble();
                double cevre = 2 * (uzunKenar + kisaKenar);
                System.out.println("Dikdortgen cevresi: " + cevre);
            }
        }

    }
}
