package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double total  =  amount + (amount * percent / 100);
        while (total > 0) {
            total = total - salary;
            year += 1;
        }
        return year;
    }
}

/*
Вы взяли кредит на 100 рублей под кредитную ставку 50% в год. Каждый год вы зарабатываете 120 рублей.
К концу года нужно заплатить 150 рублей. За первый год вы выплатите 120 рублей.
На второй год останется заплатить 30 рублей. Итого: 2 года на погашение кредита.

amount - сумма выданная по кредиту,
salary - годовой доход,
percent - процентная ставка по кредиту.
*/