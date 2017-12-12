import java.util.Random;

public class Zad01 {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] tab = new int[10];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = rand.nextInt(10);
        }

        int j = 1;
        for (int i = 0; i < tab.length * 2; i++) {
            if(i < tab.length){
                System.out.print(tab[i] + " ");
            } else {
                System.out.print(tab[i - j] + " ");
                j += 2;
            }
        }
    }
}
