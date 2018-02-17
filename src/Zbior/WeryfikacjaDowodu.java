package Zbior;

import java.util.Random;

public class WeryfikacjaDowodu {
    public static void main(String[] args) {
        String generateDO () {
            String seria = "", numer = "";
            Random random = new Random();
            int suma = 0;
            int waga[] = {7, 3, 1, 7, 3};
            for (int i = 0; i < 3; i++) {
                seria += (char) (random.nextInt('Z' - 'A') + 'A');
                suma += waga[i] * (seria.charAt(i) - 'A' + 10);
            }

            for (int i = 0; i < 5; i++) {
                numer += (char) (random.nextInt('9' - '0') + '0');
                suma += waga[i] * (numer.charAt(i) - '0');
            }
            return seria + suma % 10 + numer;
        }
    }
}
