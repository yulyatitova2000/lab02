public class Main {
    public static void main(String[] args) {
        String source = "Hello 12 world Hello 43 world";

        System.out.println("Проверка repeat");
        System.out.println(StringProcessor.repeat("1", 3));
        System.out.println(StringProcessor.repeat("1", 0));

        System.out.println("Проверка countOf");
        System.out.println(StringProcessor.countOf(source, "o"));
        System.out.println(StringProcessor.countOf(source, "world"));

        System.out.println("Проверка replace");
        System.out.println(StringProcessor.replace(source));

        System.out.println("Проверка removeEvery2");
        StringBuilder changeable = new StringBuilder(source);
        System.out.println(changeable);
        StringProcessor.removeEvery2(changeable);
        System.out.println(changeable);


        Payment payment1 = new Payment("Иванов Михаил Иванович", 2025, 2, 14, 53553);
        Payment payment2 = new Payment("Иванов Иван Иванович", 2025, 2, 13, 343242);
        Payment payment3 = new Payment("Петров Иван Иванович", 2025, 2, 3, 45757);
        Payment payment4 = new Payment("Иванов Иван Иванович", 2025, 2, 9, 8979979);

        FinanceReport report1 = new FinanceReport("Иванов Иван Иванович", 2025, 2, 14);

        report1.addPayment(payment1);
        report1.addPayment(payment2);
        report1.addPayment(payment3);
        report1.addPayment(payment4);

        FinanceReport report2 = new FinanceReport(report1);
        report2.getPayment(1).setFio("Иванов Сергей Сергеевич");

        System.out.println("Сравнение отчётов после изменений. изменение ФИО у 2-го плательщика");
        System.out.println(report1);
        System.out.println(report2);

        System.out.println("Фильтр: фамилия начинается с символа 'П'");
        System.out.println(FinanceReportProcessor.familyFilter(report2, 'П'));
        System.out.println("Фильтр: платежи меньше 677 руб. 55 коп.");
        System.out.println(FinanceReportProcessor.amountFilter(report2, 67755));
    }
}