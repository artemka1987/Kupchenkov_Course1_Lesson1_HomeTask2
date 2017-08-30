/**
 * Created by Artemka on 30.08.2017.
 */
import java.util.Scanner;

public class QuadraticEquation {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double a;
        double b;
        double c;
        double D;
        double x1;
        double x2;
        String result = "";

        System.out.println("Укажите аргументы \"a\",\"b\" и \"c\" для уравнения вида: \"ax*x + bx + c = 0\"");
        System.out.print("a = ");
        a = getDoubleValueFromConsole();
        System.out.print("b = ");
        b = getDoubleValueFromConsole();
        System.out.print("c = ");
        c = getDoubleValueFromConsole();

        D = b * b - (4 * a * c);

        if (D < 0){
            result = "Корней нет";
        }
        if (D > 0){
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            result = "x1 = " + x1 + "; x2 = " + x2;
        }
        if(D == 0){
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            result = "x = " + x1;
        }

        System.out.println("Решением уравнения: \"" + a + "x*x + " + b + "x + c = 0\" является : " + result);
    }

    // Метод считывания аргументов с консоли
    private static double getDoubleValueFromConsole(){
        double result;
        boolean checkEnd = true;
        do {
            if (scanner.hasNextDouble()){
                result = scanner.nextDouble();
                checkEnd = false;
            }else {
                System.out.println("Вы неверно ввели число , попробуйте еще раз...");
                scanner.next();
                result = 0.0/0;
            }
        }while (checkEnd);
        return result;
    };

}

