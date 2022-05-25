package src;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter figure");
        double x = sc.nextDouble();

        System.out.println("please enter figure");
        double y = sc.nextDouble();

        System.out.println("please enter operation");
        char o = sc.next().charAt(0);

        double r = 0;

        if (o == '+') {
            r = Utils.Topla(x,y);
        } else if (o == '-') {
            r = Utils.Cixma(x,y);
        } else if (o == '*') {
            r = Utils.Vurma(x,y);
        } else if (o == '/') {
            r = Utils.Bolme(x,y);
        }else {
            System.out.println("operation not found");
        }
        System.out.println(r);
    }
}
