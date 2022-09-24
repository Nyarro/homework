import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if( num%2>0)
            System.out.println("Число нечетное");
        else System.out.println("Число четное");

         /*


       String res = (num%2)>0? "нечетное" : "четное";
        System.out.println(res);

          */


    }
}