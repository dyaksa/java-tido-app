package utils;

import java.util.Scanner;

public class InputUtil {

    private static final Scanner scanner = new Scanner(System.in);

    public static String input(String info){
        System.out.println(info + ": ");
        return scanner.nextLine();
    }
}
