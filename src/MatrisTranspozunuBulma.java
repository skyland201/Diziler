public class MatrisTranspozunuBulma {
    public static void main(String[] args) {
        int[][] arr={{2,3,4},{5,6,4}};
        int sayı=arr[0].length;
        int[][] transpoz=new int[sayı][arr.length];
        System.out.println("Matris :");
        for (int i = 0; i < arr.length ; i++) {
            int row[]=arr[i];
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+"  ");
                if((j==arr[i].length-1))
                    System.out.println();
            }
        }
        System.out.println("Transpoze :");
        for (int i = 0; i <sayı ; i++) {
            for (int j = 0; j <transpoz[i].length ; j++) {
                  transpoz[i][j]=arr[j][i];
                System.out.print(transpoz[i][j]+"  ");
                if((j==transpoz[i].length-1))
                    System.out.println();
            }
        }
    }
}
