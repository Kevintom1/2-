import java.io.FileWriter;

import java.io.IOException;

import java.util.Random;

public class randomizer {

    public void file() {

        Random rand = new Random();

        String st = "";

        int temp;

        for (int i = 0; i <= 200; i++) {

            temp = rand.nextInt(5000);

            st += (i) + " : " + (temp) + ", ";

        }

        try {

            FileWriter myWriter = new FileWriter("200 случайных чисел.txt");

            myWriter.write(st);

            myWriter.close();

            System.out.println("Файл успешно создан.");

        } catch (IOException e) {

            System.out.println("ОШИБКА!");

            e.printStackTrace();

        }

    }

}