import java.util.Arrays;

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

    public int min() {
        int[] sales2 = sales.clone();
        Arrays.sort(sales2);
        int min = sales2[0];
        return min;
    }

    public int indexMax() {
        int indMax = 0;
        int maxVal = sales[0];
        for (int i = 1; i < sales.length; i++) {
            if (maxVal < sales[i]) {
                maxVal = sales[i];
                indMax = i + 1;
            }
        }
        return indMax;
    }

    public int indexMin() {
        int indMin = 0;
        int minVal = sales[0];
        for (int i = 1; i < sales.length; i++) {
            if (minVal > sales[i]) {
                minVal = sales[i];
                indMin = i + 1;
            }
        }
        return indMin;
    }

    public int average(int [] sales, int minInd, int maxInd) {
        int result = 0;
        int [] newSales = new int[sales.length - 1];
        int minInd2 = minInd - 1;
        for(int i = 0; i < sales.length; i++) {
            if(i != minInd2) {
                int newRes = i < minInd2 ? i : i - 1;
                newSales[newRes] = sales[i];
            }
        }

        int [] newSales2 = new int[newSales.length - 1];
        int maxInd2 = maxInd - 2;
        for(int i = 0; i < newSales.length; i++) {
            if(i != maxInd2) {
                int newRes = i < maxInd2 ? i : i - 1;
                newSales2[newRes] = newSales[i];
            }
        }

        int sum = 0;
        for(int a = 0; a < newSales2.length; a++) {
            sum += newSales2[a];
        }
        result = sum / newSales2.length;

        return result;
    }
}
