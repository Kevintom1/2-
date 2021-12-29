import java.io.File;

import java.io.FileNotFoundException;

import java.util.Scanner;

public class Names {

    String name;

    String name2;

    String s;

    String c;

    public void file() {

        try {

            File myObj = new File("Имена1.txt");

            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {

                name = myReader.nextLine();

                System.out.println(name);

            }

            myReader.close();

        } catch (FileNotFoundException e) {

            System.out.println("Ошибка!");

            e.printStackTrace();

        }

        try {

            File my = new File("Имена2.txt");

            Scanner myReader = new Scanner(my);

            while (myReader.hasNextLine()) {

                name2 = myReader.nextLine();

                System.out.println(name2);

            }

            myReader.close();

        } catch (FileNotFoundException e) {

            System.out.println("ОШИБКА!");

            e.printStackTrace();

        }

        String[] a = name.split(" ");

        c = "";

        for (int i = 4; i >= 0;i--) {

            c += a[i] + " ";

        }

        System.out.println(c);

        String[] b = name2.split(" ");

        s = "";

        for (int i = 4; i >= 0;i--) {

            s += b[i] + " ";

        }

        System.out.println(s);

    }

}