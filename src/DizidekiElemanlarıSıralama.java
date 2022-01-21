import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class DizidekiElemanlarıSıralama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Dizinin boyutunu giriniz: ");
        int boyut= input.nextInt();
        int[]dizi=new int[boyut];
        for (int i = 0; i <boyut ; i++) {

            System.out.println("Dizinin "+(i+1)+". elemanını giriniz: ");
            int eleman= input.nextInt();
            dizi[i]=eleman;

        }
        Arrays.sort(dizi);
        System.out.print("Sıralama: ");
        for (int arr:dizi) {
            System.out.print(arr+" ");
        }

    }
}
