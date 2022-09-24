import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите рост: ");
        int rost = sc.nextInt();;
        System.out.println("Введите вес: ");
        int ves = sc.nextInt();;

        if (rost >  ves) {

            System.out.println("Ваш рост: " + rost);
        System.out.println("Ваш вес: " + ves);
        } else {
            System.out.println("не верю"); }



        sc.close();
    }
}