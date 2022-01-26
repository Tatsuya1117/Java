package bronze.Java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World !!");
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("入力してください > ");

        String input_text = scanner.nextLine();

        System.out.println(input_text + "が入力されました。");

        scanner.close();
    
    }

}

