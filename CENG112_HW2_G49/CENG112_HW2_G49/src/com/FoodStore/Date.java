package com.FoodStore;
import java.util.StringTokenizer;

public class Date {

    private int day = -1;
    private int month;
    private int year;
    private String dateAsString;
    private final String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    public Date(String dateAsString) {
        this.dateAsString = dateAsString;

        convertFromString();
    }

    public Date(int month, int year) {
        this.day = -1;
        this.month = month;
        this.year = year;

        convertToString();
    }

    public Date(int day, int month, int year) {
        this.month = month;
        this.year = year;

        convertToString();
    }

    public Date(String dateAsString, int monthBackFromDate) {

        this.dateAsString = dateAsString;
        convertFromString();

        this.year = this.year - (monthBackFromDate / 12);
        this.month = (this.month - (monthBackFromDate % 12)) % 12;

        convertToString();
    }

    private void convertFromString() {
        StringTokenizer st = new StringTokenizer(dateAsString, "-");
        if (st.countTokens() == 3) {
            this.day = Integer.parseInt(st.nextToken());
        }

        this.month = findMonthIndex(st.nextToken());
        this.year = Integer.parseInt(st.nextToken());
    }

    private void convertToString() {
        String tempDate = "";
        String delimiter = "-";

        if (day != -1) {
            tempDate += String.valueOf(day);
            tempDate += delimiter;
        }
        tempDate += months[month];
        tempDate += delimiter;
        tempDate += String.valueOf(year);
        this.dateAsString = tempDate;
    }

    private int findMonthIndex(String month) {
        for (int i = 0; i < months.length; i++) {
            if (months[i].equals(month)) {
                return i;
            }
        }
        return -1;
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

    public String getDateAsString() {
        return dateAsString;
    }

    public void setDateAsString(String dateAsString) {
        this.dateAsString = dateAsString;
    }

    @Override
    public String toString() {
        return dateAsString;
    }
}
