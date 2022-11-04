package com.java21days;

import java.util.BitSet;

public class HolidaySchedule {
    BitSet sked;

    public HolidaySchedule(){
        sked = new BitSet(365);
        int[] holiday = { 1, 15, 50, 148, 185, 246, 281, 316, 326, 359};
        for(int i=0; i<holiday.length; i++){
            System.out.println("Adding " + holiday[i]);
            addHoliday(holiday[i]);
        }
    }

    public void addHoliday(int dayToAdd){
        sked.set(dayToAdd);
    }
}
