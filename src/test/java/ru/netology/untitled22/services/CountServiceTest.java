package ru.netology.untitled22.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class CountServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/count.csv")

    public void shouldCalculateCount(int income, int expenses, int threshold,
                                     int moreExpenses, int expected ) {
        CountService service = new CountService();


        // вызываем целевой метод:
        long actual = service.calculate(income, expenses, threshold, moreExpenses);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);


    }

}
