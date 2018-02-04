package com.ubs.opsit.interviews;

public interface TimeConverter {

    String convertTime(String aTime);
    String getSeconds(int number);
    String getTopHours(int number);
    String getBottomHours(int number);
    String getTopMinutes(int number);
    String getBottomMinutes(int number);
    public String[] convertToBerlinTime(String time);

}
