package ru.netology.stats;

public class StatsService {

    public int sumOfSales(int[] sales) {  // сумма всех продаж
        int sum = 0;

        for (int sale : sales) {
            sum += sale;
        }

        return sum;
    }

    public int averageSales(int[] sales) { // средняя сумма продаж за месяц
        int averageSales = sumOfSales(sales) / sales.length;
        return averageSales;

    }

    public int maxSales(long[] sales) { // номер месяца с пиком продаж
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }


    public int minSales(long[] sales) { // номер месяца с дном продаж
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int belowTheAverage(int[] sales) { // количеством месяцев, где продажи ниже среднего
        int sum = 0;

        int amountOfDays = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales(sales)) {
                amountOfDays++;
            }
        }
        return amountOfDays;
    }

    public int aboveTheAverage(int[] sales) { // количество месяцев, где продажи выше среднего
        int sum = 0;

        int amountOfDays = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales(sales)) {
                amountOfDays++;
            }
        }
        return amountOfDays;
    }

}
