package com.gdn.onboarding.java.two.onboardingjava.service.impl;

import com.gdn.onboarding.java.two.onboardingjava.service.CalendarService;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CalendarServiceImpl implements CalendarService {

    private int monthNumber;

    public CalendarServiceImpl() {
    }

    @Override
    public String getMonthName(int monthNumber) {
        this.setMonthNumber(monthNumber);
        String monthName = "";
        switch (monthNumber) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                throw new IllegalArgumentException("No month name");
        }
        return monthName;
    }
}
