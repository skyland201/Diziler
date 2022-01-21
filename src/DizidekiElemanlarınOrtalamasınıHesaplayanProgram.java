public class DizidekiElemanlarınOrtalamasınıHesaplayanProgram {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double sum = 1;
        double toplam=0;
        for (int i = 0; i < numbers.length; i++) {
            sum /= numbers[i];
            toplam+=sum;
        }

        System.out.println(toplam );
    }
}
