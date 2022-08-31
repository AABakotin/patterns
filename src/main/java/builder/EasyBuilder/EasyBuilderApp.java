package builder.EasyBuilder;

public class EasyBuilderApp {

    public static void main(String[] args) {

        Report report = new Report
                .Builder("Отчет")
                .setContent("за первый квартал")
                .setPageNumber(2)
                .setTable("таблица расходов")
                .setTitle("расходники").build();
        System.out.println(report);

    }
}
