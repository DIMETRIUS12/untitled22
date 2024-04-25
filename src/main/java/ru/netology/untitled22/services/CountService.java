package ru.netology.untitled22.services;


public class CountService {
    public long calculate(int income, int expenses, int threshold, int moreExpenses) {
        int count = 0;
        int money = income - expenses;
        int vocantion = money - moreExpenses;
        for (int month = 0; month < 13; month++) {
            if (money > threshold) { //отдыхаем!
                count++; // увеличиваем счётчик месяцев отдыха.
                money = vocantion;
            } else {
                money = money + income - expenses;
            }
        }

        return count;

    }
}
