public class Main {

    public static void main(String[] args) {

        long[] sales = {5, 2, 4, 7};

        SalesManager show = new SalesManager(sales);

        System.out.println("В январе больше всего было продано автомобилей в " + show.indexMax() + " неделю месяца: " + show.max() + " шт.");

    }
}
