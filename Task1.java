
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Задайте время, чтобы рассчитать время в секундах");
        System.out.println("Введите часы");
        int hours = in.nextInt();
        System.out.println("Введите минуты");
        int mins = in.nextInt();
        System.out.println("Введите секунды");
        int sec = in.nextInt();
        int hours1 = hours * 3600;
        int mins1 = mins *60 ;


        System.out.print("Время в секундах с начала дня:");
        System.out.print(hours1+mins1+sec);

    }


}