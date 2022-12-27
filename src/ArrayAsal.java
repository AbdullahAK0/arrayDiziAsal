import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayAsal {

        public static void main(String[] args) {

            // kullanicidan dizinin elemanlarini alip bu sayilardan
            // asal olan ve olmayanlari ayri bir dizide olusturalim.

            Scanner scan = new Scanner(System.in);
            System.out.println("lutfen dizinin kac elemanli oldugunu giriniz");
            int uzunluk = scan.nextInt();

            int[] dizi = new int[uzunluk];
            List<Integer> asalSayi = new ArrayList<>();
            List<Integer> asalSayiDegil = new ArrayList<>();

            for (int i = 0; i < dizi.length; i++) {
                System.out.println("lutfen dizinin " + i + ". indeksindeki elemani giriniz");
                int eleman = scan.nextInt();
                dizi[i] = eleman;

            }

            for (int sayi:dizi) {
                boolean asalMi=true;
                for (int k = 2; k <sayi; k++) {
                    if (sayi % k == 0) {
                        asalMi=false;
                        break;
                    }
                }
                if (asalMi){
                    asalSayi.add(sayi);
                }else {
                    asalSayiDegil.add(sayi);
                }

            }

            System.out.println("Kullanici tarafindan olusturulan dizi: "+ Arrays.toString(dizi));
            System.out.println("asal sayi listesi: " + asalSayi);
            System.out.println("asal olmayan sayilar listesi: " + asalSayiDegil);
        }
    }

