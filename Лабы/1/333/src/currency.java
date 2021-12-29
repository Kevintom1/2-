public class currency {

    enum Currency {

        Ruble,

        Euro,

        Dolar,

        Japaneseyen,

        Pound,

        Franc

    }

    public static void main(String[] args) {

        Currency c = Currency.Ruble;

        switch(c) {

            case Euro:

                System.out.println("Официальная валюта 19 стран «еврозоны» (Австрии, Бельгии, Германии, Греции, Ирландии, Испании, Италии, Кипра, Латвии, Литвы, Люксембурга, Мальты, Нидерландов, Португалии, Словакии, Словении, Финляндии, Франции, Эстонии). Кроме того, евро используется в Черногории и Косово.");

                break;

            case Ruble:

                System.out.println(" Денежная единица Российской Федерации. На территории Российской Федерации использование других валют резидентами, с некоторыми исключениями, наказывается штрафом в размере от трёх четвертей до одного размера транзакции.");

                break;

            case Dolar:

                System.out.println(" Денежная единица США, одна из основных резервных валют мира. 1 доллар = 100 центов. Символьное обозначение в англоязычных текстах: $. Буквенный код валюты: USD. Правом денежной эмиссии обладает Федеральная резервная система (англ. Federal Reserve System), выполняющая в США функции центрального банка.");

                break;

            case Pound:

                System.out.println(" Денежная единица, являющаяся:\r\n"

                        + "\r\n"

                        + "национальной валютой Соединённого Королевства Великобритании и Северной Ирландии (Великобритании), включающего Англию, Шотландию, Уэльс и Северную Ирландию;\r\n"

                        + "параллельной валютой коронных земель Гернси, Джерси и Острова Мэн;\r\n"

                        + "законным средством платежа для британских заморских территорий: Фолклендские острова, Гибралтар, Острова Святой Елены, Вознесения и Тристан-да-Кунья.");

                break;

            case Japaneseyen:

                System.out.println(" Денежная единица Японии, одна из основных резервных валют мира. Делится на 100 сен (счётная денежная единица, в 1954 году изъята из обращения). Международный код: JPY. Символом иены является знак ¥. В виде серебряных и золотых монет стала чеканиться в 1869—1871 годах.");

                break;

            case Franc:

                System.out.println(" Валюта и законное платёжное средство Швейцарии и Лихтенштейна, а также в итальянском эксклаве Кампионе-д'Италия и в немецком эксклаве Бюзинген-ам-Хохрайн. Банкноты франков выпускает центральный банк Швейцарии (Национальный банк Швейцарии), в то время как монеты выпускаются федеральным Швейцарским монетным двором.");

                break;

        }

    }

}