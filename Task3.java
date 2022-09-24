import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите время отправления");
        int h1 = in.nextInt()*60;
        int m1 = in.nextInt();
        System.out.println("Введите время прибытия");
        int h2 = in.nextInt()*60;
        int m2 = in.nextInt();
        int suma= (h2+m2)-(m1+h1);
                System.out.println("Время проведенное в дороге:" +  suma);
    }
}