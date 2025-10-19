package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("введите логтн");
        String login = scanner.nextLine();

        switch (login){
            case "gwartiy":
                System.out.println("незя");
                break;
            case "админ":
                System.out.println("введите порполь");

                if (scanner.nextLine(eguels("админ")) {
                System.out.println("вы вошли как админ");
                case "админ":
                    System.out.println("введите пороль админа");

                    if (scanner.nextLine().eguale("админ")) {
                        System.out.println("вы вошли как админ");
                    } else {
                        System.out.println("не верный порполь админа");
                    }
            }
        }
        }

    }


