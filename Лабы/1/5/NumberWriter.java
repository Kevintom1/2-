public class BasicHW4 {
    public static void main(String[] args) {
        System.out.println(convertNumberToUpperCase(631));
        System.out.println(convertNumberToUpperCase(1));
        System.out.println(convertNumberToUpperCase(11));
        System.out.println(convertNumberToUpperCase(99));
        System.out.println(convertNumberToUpperCase(121));
        System.out.println(convertNumberToUpperCase(234));
        System.out.println(convertNumberToUpperCase(355));
        System.out.println(convertNumberToUpperCase(771));
        System.out.println(convertNumberToUpperCase(999));
    }

    //3.    Вводим число (0-999), получаем строку с прописью числа.
    public static String convertNumberToUpperCase(int number) {
        String[] BELOW_TWENTY = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
        String[] TENS = {"сто", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
        String[] THOUSANDS = {"тысяча", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};
        while (true) {
            if ( number < 0 || number > 1000 ) {
                System.out.println("Попробуй ещё раз...");
                continue;
            }

            if ( number < 20 )
                return BELOW_TWENTY[number];
            if (number > 10 && number < 100 ) {
                int high = number / 10;
                int low = number % 10;
                String text = TENS[high];
                if ( low != 0 )
                    text = text + " " + BELOW_TWENTY[low];
                return text;
            }
            else if (number > 100 && number < 1000) {
                int high = number / 100;
                int low = number % 10;
                String text = THOUSANDS[high];
                if ( low != 0 )
                    text = text + " " +TENS[low] + " " +BELOW_TWENTY[low] ;
                return text;
            }
            else if (number == 100) {
                return (TENS[0]); }
        }
    }

}