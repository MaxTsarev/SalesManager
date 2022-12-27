public class SalesManager {

    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int indexMax() {
        int indMax = 0;
        int maxVal = sales[0];
        for (int i = 1; i < sales.length; i++) {
            if (maxVal < sales[i]) {
                maxVal = sales[i];
                indMax = i;
            }
        }
        return indMax + 1;
    }
}
