package Sortowania;

import java.util.Scanner;

public class SortowaniePrzezZliczanieKluczWartosc {
    public static void main(String[] args) {

        //Część 1: generowanie kluczy i wartości

        char[] arr = {'A', 'B', 'C'};
        String[] keys = new String[27];

        StringBuilder sb = new StringBuilder();
        int counter = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    sb.append(arr[i]).append(arr[j]).append(arr[k]);
                    keys[counter] = sb.toString();
                    sb.setLength(0);
                    counter++;
                }
            }
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Ilość ciągów:");
        int n = Integer.parseInt(sc.nextLine());//wazne

        String[] inputUser = new String[n];
        for (int i = 0; i < n; i++) {
            inputUser[i] = sc.nextLine().toUpperCase();
        }

        int[] counterArray = new int[27];
        for (int i = 0; i < inputUser.length; i++) {
            for (int j = 0; j < keys.length; j++) {
                if (keys[j].equals(inputUser[i])) {
                    counterArray[j]++;
                    break;
                }
            }
        }

        for (int i = 0; i < counterArray.length; i++) {
            while (counterArray[i] > 0) {
                System.out.print(keys[i] + " ");
                counterArray[i]--;
            }
        }
    }
}


//
//  sprawdzic!!!
//for(char c1 = 'A'; c1 <= 'Z'; c1++){
//  for(char c2 = 'A'; c2 <= 'Z'; c2++){
//    for(char c3 = 'A'; c3 <= 'Z'; c3++){
//      System.out.println("" + c1 + c2 + c3);
//            }
//        }

//        String s = "AAA";
//        int counter = 0;
//        StringBuilder ss = new StringBuilder(s);
//        char ccc = ss.charAt(0);
//        for (int i = 0; i < 3; i++) {
//
//
//            ss = ss.replace(0, 1, Character.toString(ccc++));
//
//            char cc = ss.charAt(1);
//            for (int j = 0; j < 3; j++) {
//
//                ss = ss.replace(1, 2, Character.toString(cc++));
//                char c = ss.charAt(2);
//                for (int k = 0; k < 3; k++) {
//
//                    ss = ss.replace(2, 3, Character.toString(c++));
//                    counter++;
//                    System.out.println(ss + " " + counter);
//                }
//                ss.replace(2, 3, "A");
//            }
//            ss.replace(1, 2, "A");
//        }
//    }
//}
