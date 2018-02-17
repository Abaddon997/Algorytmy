package Zajecia20170203;

public class WyszukiwanieLidera {
    public static void main(String[] args) {
        String input = "[1,2,2,2,1,6,2]";
        String values = input.substring(input.indexOf("[") + 1, input.indexOf("]")).trim();
        String[] val = values.split(",");
        int[] zliczanie = new int[val.length];
        for (int i = 0; i < val.length; i++) {
            zliczanie[i] = Integer.parseInt(val[i]);
        }

        int max = -1;
        for (int i = 0; i < zliczanie.length; i++) {
            if (max < zliczanie[i])
                max = zliczanie[i];

        }
        int[] countingTable = new int[max + 1];
        //zliczanie
        for (int i = 0; i < zliczanie.length; i++) {
            countingTable[zliczanie[i]]++;
        }
        for (int i = 0; i < countingTable.length; i++) {
            while (countingTable[i] > 0) {
                System.out.printf(i + " ");
                countingTable[i]--;
            }
        }
    }
}
