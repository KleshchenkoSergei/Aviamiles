public class Main {
    public static void main(String[] args) {
        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной милли

        // Рассчитываете количество бонусных милль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран

        // Входные данные
        int price = 4501;
        int mileCost = 20;

        // Формулы
        int bonus = price / mileCost;
        System.out.println("Количесвто бонусных милей за перелет: " + bonus);
    }
}
