package com.bupt.liwshuo.utils;

import java.util.Calendar;

/**
 * Created by shuo on 2015/4/10.
 */
public class TimeUtils {

    /**
     * 获取当前时间，格式为 year-month-day hour:minute:second
     * @return current time String format: year-month-day hour:minute:second
     */
    private String getCurrentTime() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        StringBuilder dateTime = new StringBuilder();
        dateTime.append(year);
        dateTime.append("-");
        dateTime.append(month);
        dateTime.append("-");
        dateTime.append(day);
        dateTime.append(" ");
        dateTime.append(hour);
        dateTime.append(":");
        dateTime.append(minute);
        dateTime.append(":");
        dateTime.append(second);
        return dateTime.toString();
    }
}
