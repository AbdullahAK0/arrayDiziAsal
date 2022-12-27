import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayAndArrayListQuestion {

    public static void main(String[] args) {


                // verilen bir arraydeki en buyuk ve en kucuk degerleri dahil etmeden geri kalan
                // sayilarin toplamini, listesini ve merkezi ortalamasini bize donduren bir method olusturun

                int[] arr = {3,22,1,4,5,6,7,8,9,10,11};
                System.out.println("en buyuk ve en kucuk sayilar haric merkezi ortalama: "+merkeziOrtalama(arr));

            }
            public static double merkeziOrtalama(int[] arr){

                List<Integer> yeniList = new ArrayList<>();
                int max = arr[0];
                int min = arr[0];
                int toplam = 0;

                for (int i = 0; i <arr.length ; i++) {

                    if (min>arr[i]){
                        min=arr[i];
                    }
                    if (max<arr[i]){
                        max=arr[i];

                    }
                    toplam+=arr[i];
                    yeniList.add(arr[i]);
                }
                Collections.sort(yeniList); // bu kismi yaptıgımızda yukaridaki if bloklarına gerek kalmaz
                                            // cunku sort yapildiginda en kucuk index(0), en buyuk index(size-1)
                                            // olacaktir dogal olarak. Bu durumda toplami da direkt olarak hesaplayabiliriz.
                                            // ancak bircok ozelligi kullanmak icin bu durumlari da cozume dahil ettik.
                yeniList.remove(0);
                yeniList.remove(yeniList.size()-1);
                toplam=toplam-(min+max);
                System.out.println("En buyuk ve en kucuk sayilar haric toplam: "+toplam);
                System.out.println("en buyuk ve en kucuk sayilar haric liste: "+yeniList);
                return (toplam/ (arr.length-2));
            }

        }

