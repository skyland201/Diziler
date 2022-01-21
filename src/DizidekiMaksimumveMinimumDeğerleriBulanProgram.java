import java.util.Arrays;

public class DizidekiMaksimumveMinimumDeğerleriBulanProgram {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        Arrays.sort(list);

        System.out.println("Minimum Değer " + (list[list.length-2]));
        System.out.println("Maximum Değer " + list[1]);
    }
}
