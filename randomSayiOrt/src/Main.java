import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        int[] sayilar = rasgeleSayilarUret();
        double ortalama = asalOrtalama(sayilar);
        System.out.println("Ortalama: "+ortalama);
        ekranaYaz(sayilar,ortalama);
    }

    private static void ekranaYaz(int[] sayilar, double ortalama) {
        for (int i = 0; i < sayilar.length; i++){
            if (sayilar[i] >= ortalama) System.out.println(sayilar[i]);
        }
    }

    private static int[] rasgeleSayilarUret() {
        Random r = new Random();
        int[] dizi = new int[100];
        for (int i = 0; i< dizi.length; i++){
            dizi[i] = r.nextInt(250,750);
        }
        return dizi;
    }

    private static double asalOrtalama(int[] sayilar) {
        int toplam = 0;
        int asalSayisi = 0;
        for(int i = 0; i <sayilar.length; i++){
            boolean k = asalBul(sayilar[i]);
            if (k==true){
                asalSayisi++;
                toplam +=sayilar[i];
            }
        }
        if(asalSayisi == 0) return 0;
        double ort = 1.0*toplam/asalSayisi;
        return ort;
    }

    private static boolean asalBul(int sayi) {
        if (sayi < 2) return false;
        for (int i = 2; i < sayi; i++){
            if(sayi % i == 0) return false;
        }
        return true;
    }


}