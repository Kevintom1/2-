public class task1 {

    public String name;

    public int age;

    public String gender;

    public task1(String n,int a,String g) {

        this.name = n;

        this.age = a;

        this.gender = g;

        System.out.println("первый конструктор");

    }

    public task1() {

        this.name = "Имя по умолчанию";

        this.age = 0;

        System.out.println("Второй конструктор");

    }

    public task1(String n) {

        this.name = n;

        System.out.println("Третий конструктор");

    }

    public task1(int n) {

        this.age = 1;

        this.name = "Канеки";

        this.gender = "Мальчик";

        System.out.println("Четвертый конструктор");

    }

}