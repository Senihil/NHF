package hu.nye.progtech;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] t = new String[2];

        Scanner myObj = new Scanner(System.in);
        System.out.println("Kérem adja meg a nevét és a nyelvet (hu, en, ru)!\n");
        for (int i = 0; i < 2; i++) {
            t[i] = myObj.next();
        }

        switch (t[1]){
            case "hu":
                System.out.printf("Szia, " + t[0] + "!");
            case "en":
                System.out.printf("Hi, " + t[0] + "!");
            case "ru":
                System.out.printf("Привет, " + t[0] + "!");
            default:
                System.out.printf("Szia, " + t[0] + "!");
        }
    }
}