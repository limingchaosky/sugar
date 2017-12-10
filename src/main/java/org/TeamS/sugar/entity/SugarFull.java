package org.TeamS.sugar.entity;

import java.util.Date;

public class SugarFull {

    private int id;

    private double fastingSugar;

    private double breakfastSugar;

    private double lunchSugar;

    private double dinnerSugar;

    private Date sugarDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getFastingSugar() {
        return fastingSugar;
    }

    public void setFastingSugar(double fastingSugar) {
        this.fastingSugar = fastingSugar;
    }

    public double getBreakfastSugar() {
        return breakfastSugar;
    }

    public void setBreakfastSugar(double breakfastSugar) {
        this.breakfastSugar = breakfastSugar;
    }

    public double getLunchSugar() {
        return lunchSugar;
    }

    public void setLunchSugar(double lunchSugar) {
        this.lunchSugar = lunchSugar;
    }

    public double getDinnerSugar() {
        return dinnerSugar;
    }

    public void setDinnerSugar(double dinnerSugar) {
        this.dinnerSugar = dinnerSugar;
    }

    public Date getSugarDate() {
        return sugarDate;
    }

    public void setSugarDate(Date sugarDate) {
        this.sugarDate = sugarDate;
    }

    @Override
    public String toString() {
        return "SugarFull{" +
                "id=" + id +
                ", fastingSugar=" + fastingSugar +
                ", breakfastSugar=" + breakfastSugar +
                ", lunchSugar=" + lunchSugar +
                ", dinnerSugar=" + dinnerSugar +
                ", sugarDate=" + sugarDate +
                '}';
    }
}
