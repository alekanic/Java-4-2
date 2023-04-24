package ru.netology.stats;

public class StatsService {

    public int sumOfSales(int[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
            }

        return sum;
    }

    public int averageSales(int[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }

        int averageSales = sum / sales.length;
        return averageSales;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }


    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int belowTheAverage(int[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }

        int middleSales = sum / sales.length;

        int amountOfDays = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < middleSales) {
                amountOfDays++;
            }
        }
        return amountOfDays;
    }

    public int aboveTheAverage(int[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }

        int middleSales = sum / sales.length;

        int amountOfDays = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > middleSales) {
                amountOfDays++;
            }
        }
        return amountOfDays;
    }

}
