import java.util.Scanner;

public class count {

    Scanner scanObj = new Scanner(System.in);

    Scanner scanObj2 = new Scanner(System.in);

    public void abc() throws ArithmeticException {

        System.out.println("Введите первое число: ");

        int num1 = scanObj.nextInt();

        System.out.println("Введите второе число: ");

        int num2 = scanObj2.nextInt();

        try {

            System.out.println("Деление первого числа на второе = " + num1/num2);

        }

        catch (ArithmeticException e) {

            System.err.println("Деление первого на второе: ОШИБКА! Разделить на ноль нельзя!");

        }

        try {

            System.out.println("Деление второго числа на перовое = " + num2/num1);

        }

        catch (ArithmeticException e) {

            System.err.println("Деление второго на первое: ОШИБКА! Разделить на ноль нельзя!");

        }

    }

}
