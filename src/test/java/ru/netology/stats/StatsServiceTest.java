package ru.netology.stats;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {

    @Test

    public void sumOfSale() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.sumOfSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void averageOfSale() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void maxSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void minSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void belowTheAverag() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.belowTheAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void aboveTheAverag() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.aboveTheAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

}
