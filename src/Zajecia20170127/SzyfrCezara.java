package Zajecia20170127;

import java.util.Scanner;

public class SzyfrCezara {

    public static void main(String[] args) {


        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
                't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj text");
        char[] toCode = sc.next().toCharArray();
        System.out.println("podaj przesuniecie");
        int key = sc.nextInt();

        for (int i = 0; i < toCode.length;i++){
            int letter=0;
            for (int j = 0; j < letters.length; j++) {
                if (letters[j]==toCode[i]){
                    letter=j;
                    break;
                }
            }
            System.out.print(letters[(letter+key)%26]);
        }

    }
}
