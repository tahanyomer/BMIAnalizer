package com.pc.splashactivity.recycleView;

public class BMIRecord {
    int weight;
    int length;
    int date;
/*User constractor*/
    public BMIRecord(int weight, int length, int date) {
        this.weight = weight;
        this.length = length;
        this.date = date;
    }
/*Generate for getter and setter*/
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
