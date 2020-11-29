package Task2Ex7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Введите номер для недели :");
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        String daysString;
        switch (days) {
            case 1 :
                daysString = "Понедельник.";
                break;
            case 2 :
                daysString = "Вторник.";
                break;
            case 3 :
                daysString = "Среда.";
                break;
            case 4 :
                daysString = "Четверг.";
                break;
            case 5 :
                daysString = "Пятница.";
                break;
            case 6 :
                daysString = "Суббота.";
                break;
            case 7 :
                daysString = "Воскресенье.";
                break;
            default:
                daysString = "Такого дня нет !";
                break;
        }
        System.out.println(daysString);

    }
}
