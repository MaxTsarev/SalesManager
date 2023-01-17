public class SalesManager {

    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long indexMax() {
        long indMax = 0;
        long maxVal = sales[0];
        for (int i = 1; i < sales.length; i++) {
            if (maxVal < sales[i]) {
                maxVal = sales[i];
                indMax = i;
            }
        }
        return indMax + 1;
    }
}
