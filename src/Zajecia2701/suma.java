package Zajecia2701;

import java.util.Scanner;

public class suma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ilość liczb");
        int n = 0;
        try {
            n = sc.nextInt();
        } catch (Exception ex) {
            System.out.println("podałeś błędne dane");
        }
        int suma = 0;
        for (int i = 0; i < n; i++)
            try {
                suma += sc.nextInt();
                System.out.println(suma);
            } catch (Exception ex) {
                sc.next();//wazne!!
                System.out.println(suma);

            }


    }
}
