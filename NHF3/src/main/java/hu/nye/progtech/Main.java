package hu.nye.progtech;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<String> data = new ArrayList<>();

        Scanner myObj = new Scanner(System.in);
        System.out.println("Kérem adja meg a nevét és a nyelvet (hu, en, ru)!\n");

        data.add(myObj.nextLine());
        data.add(myObj.nextLine());

        switch (data.get(1)){
            case "hu":
                System.out.printf("Szia, " + data.get(0) + "!");
                break;
            case "en":
                System.out.printf("Hi, " + data.get(0) + "!");
                break;
            case "ru":
                System.out.printf("Привет, " + data.get(0) + "!");
                break;
            default:
                System.out.printf("Szia, " + data.get(0) + "!");
                break;
        }

    }
}