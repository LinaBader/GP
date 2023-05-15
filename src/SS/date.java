/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SS;

/**
 *
 * @author leena
 */
public class date {
    private int day;
    private int month;
    private int year;

    public date(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day<=31&&day>0)
        this.day = day;
        else 
            this.day=0;
    }

    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        if(month<=12&&month>0)
        this.month = month;
        else 
            month=0;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    @Override
    public String toString(){
        return String.format("%dd-%dm=&dy", day, month, year);
    }

}
