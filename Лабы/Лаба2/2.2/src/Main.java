import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int maxNumber = 10;

        Scanner scanObj = new Scanner(System.in);

        Scanner scanObj2 = new Scanner(System.in);

        System.out.println("Введите два числа начиная с которых вы хотите посчитать последовательность Фибоначии.\nВведите первое число: ");

        int previousNumber = scanObj.nextInt();

        System.out.println("Введите второе число: ");

        int nextNumber = scanObj.nextInt();

        System.out.print("Последовательность Фибоначчи с ограничением в "+maxNumber+" чисел:");

        for (int i = 1; i <= maxNumber; ++i)
        {
            System.out.print(previousNumber+" ");


            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }

    }

}