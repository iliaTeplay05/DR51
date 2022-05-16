import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int[] masA = new int[21];
        masA[0] = 0;
        int[] masB = new int[21];
        masB[0] = 0;
        int[] masSum = new int[21];

        System.out.println("Программа складывает двадцатизначные числа.");

        for (int i = 1; i < 21; i++) {
            masA[i] = random.nextInt(9);
            System.out.print(masA[i]);
        }
        System.out.println();

        for (int i = 1; i < 21; i++) {
            masB[i] = random.nextInt(9);
            System.out.print(masB[i]);
        }
        System.out.println();

        System.out.println("Сумма этих чисел равна: ");

        for (int i = 1; i < 21; i++) {
            if (masA[i] + masB[i] < 10) {
                masSum[i] = masA[i] + masB[i];
            } else {
                masSum[i-1] = masSum[i-1] + 1;
                masSum[i] = (masA[i] + masB[i]) - 10;
            }
        }

        for (int i = 0; i < 21; i++) {
            System.out.print(masSum[i]);
        }
    }
}