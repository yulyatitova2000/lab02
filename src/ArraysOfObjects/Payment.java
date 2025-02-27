package ArraysOfObjects;

import java.util.Objects;

public class Payment {
    private String fio;
    private int day;
    private int month;
    private int year;
    private int amount;

    public Payment(String fio, int year, int month, int day, int amount) {
        this.fio = fio;
        this.year = year;
        this.month = month;
        this.day = day;
        this.amount = amount;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }


    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }


    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Payment getClone() {
        return new Payment(fio, year, month, day, amount);
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return day == payment.day && month == payment.month && year == payment.year && amount == payment.amount && Objects.equals(fio, payment.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, day, month, year, amount);
    }

    @Override
    public String toString() {
        return String.format("Плательщик: %s, дата: %d.%d.%d, сумма: %d руб. %d коп.", fio, year,month,day,amount/100,amount%100);
    }
}
