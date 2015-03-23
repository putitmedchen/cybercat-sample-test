package org.mita.automation.reports;

import java.util.Calendar;

/**
 * Created by sgo on 3/17/2015.
 */
public class TestClass {

    public static void main(String[] args) {

//        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//        String date = "";
//
//        String s = String.valueOf(new SimpleDateFormat(date));
//
//        System.out.println(dateFormat.format(date));

        Long timeStamp = new Long("1426586704396");
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeStamp);
        int mYear = calendar.get(Calendar.YEAR);
        int mMonth = calendar.get(Calendar.MONTH);
        int mDay = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println(calendar.getTime());

        

      //  System.out.println(date);
    }
}
