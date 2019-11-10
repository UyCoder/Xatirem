package javaBasics;

import java.text.SimpleDateFormat;
import java.time.LocalTime;

public class clock {
    public static void main(String[] args) {
        //System.out.println(java.time.LocalDateTime.now());
        System.out.println(String.valueOf(java.time.LocalDate.now().getMonthValue()) + (java.time.LocalDate.now().getDayOfMonth()));
        //System.out.println(java.time.LocalTime.now());
        //System.out.println(java.util.Calendar.getInstance().getTime());

        }

    }

