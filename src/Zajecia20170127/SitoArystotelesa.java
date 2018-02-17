package Zajecia20170127;

public class SitoArystotelesa {
    public static void main(String[] args) {
        boolean[] table = new boolean[101];
        int a = 2;
        for (int i = 0; i < table.length; i++) {
            table[i] = true;
        }
        for (int i = 2; i < table.length; i++) {
            for (int j = i + i; j < table.length; j += i) {
                table[j] = false;
            }
        }
        for (int i = 0; i < table.length; i++) {
            if (table[i])
                System.out.printf("%d ", i);
        }
    }
}



