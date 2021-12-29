public class Main {

    public static void main(String[] args) {
        for(int i = 1000; i < 10000; i++) {

            int a = i/1000;
            int b = i/100%10;
            int c = i/10%10;
            int d = i%10;

            if((a * 10 + b) * (c * 10 + d) == i || (b * 10 + a) * (d * 10 + c) == i ||
                    (a * 10 + d) * (b * 10 + c) == i || (d * 10 + a) * (c * 10 + b) == i ||
                    (a * 10 + c) * (b * 10 + d) == i || (c * 10 + a) * (d * 10 + b) == i ||
                    (a * 10 + b) * (d * 10 + c) == i || (b * 10 + a) * (c * 10 + d) == i ||
                    (b * 10 + c) * (d * 10 + a) == i || (c * 10 + b) * (a * 10 + d) == i ||
                    (a * 10 + c) * (d * 10 + b) == i || (c * 10 + a) * (b * 10 + d) == i)
                System.out.println(i + " это вампир.");

        }
    }
}