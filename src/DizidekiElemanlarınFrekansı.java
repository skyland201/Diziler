public class DizidekiElemanlarınFrekansı {
    public static void main(String[] args) {
        int dizi[]={10,20,20,10,10,20,5,20,20,5};
        System.out.println("Tekrar sayıları");
        System.out.print("Dizi :[");
        for (int arr:dizi) {
            System.out.print(arr+" ");
        }
        System.out.print("]"+"\n");
        for (int i = 0; i < dizi.length ; i++) {
            int tekrar=1;
            for (int j = 0; j < dizi.length ; j++) {
                if(i!=j&&dizi[i]==dizi[j]&&dizi[i]!=0){
                    dizi[j]=0;
                    tekrar++;
                }else{
                }
            }
            if(dizi[i]!=0){
                System.out.println(dizi[i]+" sayısı "+tekrar+" kere tekrar edildi.");
            }

        }
    }
}
