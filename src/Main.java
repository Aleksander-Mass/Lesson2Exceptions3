import java.util.Scanner;

/**
 === Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.

 Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.equals(""))
            throw new IllegalArgumentException("Пустую строку вводить нельзя!");
        else System.out.println("Введенная строка: " + s);
    }
}