import java.util.ArrayList;
import java.util.Arrays;

public class DizidekiTekrarEdenSayılarıBulanProgram {
    public static void main(String[] args) {
        int[] dizi={3,7,3,3,2,9,10,21,1,33,9,1,2,4,4,6,6};

        //ArrayList<Integer> duplicate = new ArrayList<Integer>();
        int[]duplicate=new int[dizi.length];

        for (int i = 0; i <dizi.length ; i++) {
            for (int j = 0; j <dizi.length ; j++) {
                if(i!=j&&dizi[i]==dizi[j]&&dizi[i]%2==0){
duplicate[i]=dizi[i];
                }else{

                }

            }


            }
        for (int k = 0; k <dizi.length ; k++) {
            for (int l = 0; l < dizi.length; l++) {
                if(k!=l&&duplicate[k]==duplicate[l]&&duplicate[k]!=0){
                    duplicate[l]=0;
                   /* for (int arr :duplicate
                    ) {
                        System.out.println(duplicate);*/

            }
               for (int i = 0; i < dizi.length ; i++) {
                   for (int m = 1; m < dizi.length ; m++) {
                       if(duplicate[i]!=0&&duplicate[i]!=duplicate[m]){

                       }
                           //System.out.println(duplicate[i]);
                   }
               }


                }

               }
        for (int arr :duplicate
        ) {
            if(arr!=0)
            System.out.println(arr);

            }
        }

    }

