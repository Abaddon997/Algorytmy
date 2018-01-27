package Sortowania;

public class SortowanieBabelkowe {
    public static void main(String[] args) {
        int[] tablica = {5, 4, 3, 2, 1};
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica.length - 1; j++) {
                if (tablica[j] > tablica[j + 1]) {
                    //swap
                    int temp = tablica[j + 1];
                    tablica[j + 1] = tablica[j];
                    tablica[j] = temp;
                }

            }
        }

    }
}
