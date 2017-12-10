import java.util.Arrays;
import java.util.Random;

public class Zad01 {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] tab = new int[10];
        int[] tab1 = new int[10];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = rand.nextInt(10);
            tab1[tab.length - 1 - i] = tab[i];
        }
        System.out.println(Arrays.toString(tab) + Arrays.toString(tab1));


    }
}
