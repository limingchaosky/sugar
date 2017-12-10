package org.TeamS.sugar.entity;

import java.util.Date;

public class Sugar {

    private int id;

    private double sugarData;

    private String sugarType;

    private Date sugarDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSugarData() {
        return sugarData;
    }

    public void setSugarData(double sugarData) {
        this.sugarData = sugarData;
    }

    public String getSugarType() {
        return sugarType;
    }

    public void setSugarType(String sugarType) {
        this.sugarType = sugarType;
    }

    public Date getSugarDate() {
        return sugarDate;
    }

    public void setSugarDate(Date sugarDate) {
        this.sugarDate = sugarDate;
    }

    @Override
    public String toString() {
        return "Sugar{" +
                "id=" + id +
                ", sugarData=" + sugarData +
                ", sugarType='" + sugarType + '\'' +
                ", sugarDate=" + sugarDate +
                '}';
    }
}
