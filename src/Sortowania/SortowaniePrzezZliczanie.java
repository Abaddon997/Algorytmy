package Sortowania;

public class SortowaniePrzezZliczanie {
    public static void main(String[] args) {
        int[] toSort = {6, 3, 6, 1, 4, 9, 0, 1, 8, 2, 6, 4, 9, 3, 7, 5, 9, 2, 7, 3, 2, 4, 1, 8, 7, 0, 8, 5, 8, 3, 6, 2, 5, 3};
//wyszukanie maxa
        int max=-1;
        for (int i = 0; i <toSort.length ; i++) {
          if (max<toSort[i])
              max=toSort[i];

        }
    int [] countingTable=new int [max+1];
        //zliczanie
        for (int i = 0; i <toSort.length ; i++) {
            countingTable[toSort[i]]++;
        }
        for (int i = 0; i <countingTable.length ; i++) {
            while (countingTable[i]>0){
                System.out.printf(i+" ");
            countingTable[i]--;
        }}
    }
}
