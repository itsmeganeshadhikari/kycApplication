package com.ganesh.application.utils;


import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Laxman on 16-07-2017.
 */
public class DateUtils {
    public static Date getInitialDateTime(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.MILLISECOND, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        return calendar.getTime();
    }


    public static Boolean checkTodayDate(Date date) {
        Boolean flag = false;
        if (org.apache.commons.lang3.time.DateUtils.isSameDay(date, new Date())) {
            flag = true;
        }
        return flag;
    }

    public static Date getStartOfDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    public static Date getFirstDateOfCurrentMonth() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
        calendar.set(Calendar.MILLISECOND, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        return calendar.getTime();
    }

    public static Date getEndOfDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 999);
        return calendar.getTime();
    }

    public static String getDateInBS(String dateInAd) {  // yyyy-mm-dd

        String[] dates = dateInAd.split("-");
        int year = Integer.parseInt(dates[0]);
        int month = Integer.parseInt(dates[1]);
        int day = Integer.parseInt(dates[2]);

        try {
            String bsDate = new AdToBsConverter().engToNep(year, month, day);
            String bsMonth = bsDate.split("-")[1];
            String bsDay = bsDate.split("-")[2];
            if (bsMonth.length() == 1) {
                bsMonth = "0" + bsMonth;
            }

            if (bsDay.length() == 1) {
                bsDay = "0" + bsDay;
            }

            return bsDate.split("-")[0] + "-" + bsMonth + "-" + bsDay;
//            return new AdToBsConverter().engToNep(year,month,day);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }


    public static String getDateInAD(String dateInBS) {//yyyy-mm-dd
        String[] dates = dateInBS.split("-");
        int year = Integer.parseInt(dates[0]);
        int month = Integer.parseInt(dates[1]);
        int day = Integer.parseInt(dates[2]);

        try {
            String adDate = new BStoAdConverter().nepaliToEnglish(year, month, day);
            String sYear = adDate.split("-")[0];
            String sMonth = adDate.split("-")[1];
            String sDay = adDate.split("-")[2];
            if (sMonth.length() == 1) {
                sMonth = "0" + sMonth;
            }

            if (sDay.length() == 1) {
                sDay = "0" + sDay;
            }
            return sYear + "-" + sMonth + "-" + sDay;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";
    }

    public static String getCurrentBsDate() {
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        String dateInBs = getDateInBS(date);
        return dateInBs;
    }

    public static String getCurrentBsDateWithTwoDigit() {
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        String dateInBs = getDateInBS(date);
        String bsDate = dateInBs.split("-")[0];
        String bsMonth = dateInBs.split("-")[1];
        String bsDay = dateInBs.split("-")[2];
        if (bsMonth.length() == 1) {
            bsMonth = "0" + bsMonth;
        }

        if (bsDay.length() == 1) {
            bsDay = "0" + bsDay;
        }

        return bsDate + "-" + bsMonth + "-" + bsDay;
    }

    public static String getCurrentDateWithTime(Date startDate, Date endDate) {
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String sdate = simpleDateFormat.format(startDate);
        String edate = simpleDateFormat.format(endDate);
        return sdate + " " + "00:00:00" + "@" + edate + " " + "23:59:59";
    }

    public static int getDays(int year, int month) {
//        System.out.println("year===="+year);
        ArrayList<Integer> monthDaysList1 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList2 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList3 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList4 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList5 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList6 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList7 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList8 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList9 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList10 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList11 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList12 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList13 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList14 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList15 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList16 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList17 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList18 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList19 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList20 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList21 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList22 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList23 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList24 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList25 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList26 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList27 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList28 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList29 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList30 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList31 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList32 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList33 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList34 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList35 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList36 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList37 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList38 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList39 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList40 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList41 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList42 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList43 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList44 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList45 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList46 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList47 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList48 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList49 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList50 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList51 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList52 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList53 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList54 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList55 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList56 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList57 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList58 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList59 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList60 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList61 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList62 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList63 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList64 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList65 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList66 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList67 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList68 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList69 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList70 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList71 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList72 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList73 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList74 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList75 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList76 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList77 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList78 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList79 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList80 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList81 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList82 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList83 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList84 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList85 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList86 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList87 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList88 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList89 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList90 = new ArrayList<Integer>();
        ArrayList<Integer> monthDaysList91 = new ArrayList<Integer>();


        Map<Integer, Integer[]> yearMonth = new HashMap<Integer, Integer[]>();
        Integer[] values1 = {30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31};//this is for 2000
        Integer[] values2 = {31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30};//this is for 2001
        Integer[] values3 = {31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30};//this is for 2002
        Integer[] values4 = {31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31};//this is for 2003
        Integer[] values5 = {30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31};//this is for 2004
        Integer[] values6 = {31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30};//this is for 2005
        Integer[] values7 = {31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30};//this is for 2006
        Integer[] values8 = {31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31};//this is for 2007
        Integer[] values9 = {31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 29, 31};//this is for 2008
        Integer[] values10 = {31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30};//this is for 2009
        Integer[] values11 = {31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30};//this is for 2010
        Integer[] values12 = {31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31};//this is for 2011
        Integer[] values13 = {31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30};//this is for 2012
        Integer[] values14 = {31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30};//this is for 2013
        Integer[] values15 = {31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30};//this is for 2014
        Integer[] values16 = {31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31};//this is for 2015
        Integer[] values17 = {31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30};//this is for 2016
        Integer[] values18 = {31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30};//this is for 2017
        Integer[] values19 = {31, 32, 31, 32, 31, 30, 30, 29, 30, 29, 30, 30};//this is for 2018
        Integer[] values20 = {31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31};//this is for 2019
        Integer[] values21 = {31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30};//this is for 2020
        Integer[] values22 = {31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30};//this is for 2021
        Integer[] values23 = {31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30};//this is for 2022
        Integer[] values24 = {31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31};//this is for 2023
        Integer[] values25 = {31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30};//this is for 2024
        Integer[] values26 = {31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30};//this is for 2025
        Integer[] values27 = {31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31};//this is for 2026
        Integer[] values28 = {30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31};//this is for 2027
        Integer[] values29 = {31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30};//this is for 2028
        Integer[] values30 = {31, 31, 32, 31, 32, 30, 30, 29, 30, 29, 30, 30};//this is for 2029
        Integer[] values31 = {31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31};//this is for 2030
        Integer[] values32 = {30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31};//this is for 2031
        Integer[] values33 = {31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30};//this is for 2032
        Integer[] values34 = {31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30};//this is for 2033
        Integer[] values35 = {31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31};//this is for 2034
        Integer[] values36 = {30, 32, 31, 32, 31, 31, 29, 30, 30, 29, 29, 31};//this is for 2035
        Integer[] values37 = {31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30};//this is for 2036
        Integer[] values38 = {31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30};//this is for 2037
        Integer[] values39 = {31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31};//this is for 2038
        Integer[] values40 = {31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30};//this is for 2039
        Integer[] values41 = {31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30};//this is for 2040
        Integer[] values42 = {31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30};//this is for 2041
        Integer[] values43 = {31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31};//this is for 2042
        Integer[] values44 = {31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30};//this is for 2043
        Integer[] values45 = {31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30};//this is for 2044
        Integer[] values46 = {31, 32, 31, 32, 31, 30, 30, 29, 30, 29, 30, 30};//this is for 2045
        Integer[] values47 = {31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31};//this is for 2046
        Integer[] values48 = {31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30};//this is for 2047
        Integer[] values49 = {31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30};//this is for 2048
        Integer[] values50 = {31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30};//this is for 2049
        Integer[] values51 = {31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31};//this is for 2050
        Integer[] values52 = {31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30};//this is for 2051
        Integer[] values53 = {31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30};//this is for 2052
        Integer[] values54 = {31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30};//this is for 2053
        Integer[] values55 = {31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31};//this is for 2054
        Integer[] values56 = {31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30};//this is for 2055
        Integer[] values57 = {31, 31, 32, 31, 32, 30, 30, 29, 30, 29, 30, 30};//this is for 2056
        Integer[] values58 = {31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31};//this is for 2057
        Integer[] values59 = {30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31};//this is for 2058
        Integer[] values60 = {31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30};//this is for 2059
        Integer[] values61 = {31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30};//this is for 2060
        Integer[] values62 = {31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31};//this is for 2061
        Integer[] values63 = {30, 32, 31, 32, 31, 31, 29, 30, 29, 30, 29, 31};//this is for 2062
        Integer[] values64 = {31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30};//this is for 2063
        Integer[] values65 = {31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30};//this is for 2064
        Integer[] values66 = {31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31};//this is for 2065
        Integer[] values67 = {31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 29, 31};//this is for 2066
        Integer[] values68 = {31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30};//this is for 2067
        Integer[] values69 = {31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30};//this is for 2068
        Integer[] values70 = {31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31};//this is for 2069
        Integer[] values71 = {31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30};//this is for 2070
        Integer[] values72 = {31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30};//this is for 2071
        Integer[] values73 = {31, 32, 31, 32, 31, 30, 30, 29, 30, 29, 30, 30};//this is for 2072
        Integer[] values74 = {31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31};//this is for 2073
        Integer[] values75 = {31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30};//this is for 2074
        Integer[] values76 = {31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30};//this is for 2075
        Integer[] values77 = {31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30};//this is for 2076
        Integer[] values78 = {31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31};//this is for 2077
        Integer[] values79 = {31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30};//this is for 2078
        Integer[] values80 = {31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30};//this is for 2079
        Integer[] values81 = {31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30};//this is for 2080
        Integer[] values82 = {31, 31, 32, 32, 31, 30, 30, 30, 29, 30, 30, 30};//this is for 2081
        Integer[] values83 = {30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30};//this is for 2082
        Integer[] values84 = {31, 31, 32, 31, 31, 30, 30, 30, 29, 30, 30, 30};//this is for 2083
        Integer[] values85 = {31, 31, 32, 31, 31, 30, 30, 30, 29, 30, 30, 30};//this is for 2084
        Integer[] values86 = {31, 32, 31, 32, 30, 31, 30, 30, 29, 30, 30, 30};//this is for 2085
        Integer[] values87 = {30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30};//this is for 2086
        Integer[] values88 = {31, 31, 32, 31, 31, 31, 30, 30, 29, 30, 30, 30};//this is for 2087
        Integer[] values89 = {30, 31, 32, 32, 30, 31, 30, 30, 29, 30, 30, 30};//this is for 2088
        Integer[] values90 = {30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30};//this is for 2089
        Integer[] values91 = {30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30};//this is for 2090

        Collections.addAll(monthDaysList1, values1);
        Collections.addAll(monthDaysList2, values2);
        Collections.addAll(monthDaysList3, values3);
        Collections.addAll(monthDaysList4, values4);
        Collections.addAll(monthDaysList5, values5);
        Collections.addAll(monthDaysList6, values6);
        Collections.addAll(monthDaysList7, values7);
        Collections.addAll(monthDaysList8, values8);
        Collections.addAll(monthDaysList9, values9);
        Collections.addAll(monthDaysList10, values10);
        Collections.addAll(monthDaysList11, values11);
        Collections.addAll(monthDaysList12, values12);
        Collections.addAll(monthDaysList13, values13);
        Collections.addAll(monthDaysList14, values14);
        Collections.addAll(monthDaysList15, values15);
        Collections.addAll(monthDaysList16, values16);
        Collections.addAll(monthDaysList17, values17);
        Collections.addAll(monthDaysList18, values18);
        Collections.addAll(monthDaysList19, values19);
        Collections.addAll(monthDaysList20, values20);
        Collections.addAll(monthDaysList21, values21);
        Collections.addAll(monthDaysList22, values22);
        Collections.addAll(monthDaysList23, values23);
        Collections.addAll(monthDaysList24, values24);
        Collections.addAll(monthDaysList25, values25);
        Collections.addAll(monthDaysList26, values26);
        Collections.addAll(monthDaysList27, values27);
        Collections.addAll(monthDaysList28, values28);
        Collections.addAll(monthDaysList29, values29);
        Collections.addAll(monthDaysList30, values30);
        Collections.addAll(monthDaysList31, values31);
        Collections.addAll(monthDaysList32, values32);
        Collections.addAll(monthDaysList33, values33);
        Collections.addAll(monthDaysList34, values34);
        Collections.addAll(monthDaysList35, values35);
        Collections.addAll(monthDaysList36, values36);
        Collections.addAll(monthDaysList37, values37);
        Collections.addAll(monthDaysList38, values38);
        Collections.addAll(monthDaysList39, values39);
        Collections.addAll(monthDaysList40, values40);
        Collections.addAll(monthDaysList41, values41);
        Collections.addAll(monthDaysList42, values42);
        Collections.addAll(monthDaysList43, values43);
        Collections.addAll(monthDaysList44, values44);
        Collections.addAll(monthDaysList45, values45);
        Collections.addAll(monthDaysList46, values46);
        Collections.addAll(monthDaysList47, values47);
        Collections.addAll(monthDaysList48, values48);
        Collections.addAll(monthDaysList49, values49);
        Collections.addAll(monthDaysList50, values50);
        Collections.addAll(monthDaysList51, values51);
        Collections.addAll(monthDaysList52, values52);
        Collections.addAll(monthDaysList53, values53);
        Collections.addAll(monthDaysList54, values54);
        Collections.addAll(monthDaysList55, values55);
        Collections.addAll(monthDaysList56, values56);
        Collections.addAll(monthDaysList57, values57);
        Collections.addAll(monthDaysList58, values58);
        Collections.addAll(monthDaysList59, values59);
        Collections.addAll(monthDaysList60, values60);
        Collections.addAll(monthDaysList61, values61);
        Collections.addAll(monthDaysList62, values62);
        Collections.addAll(monthDaysList63, values63);
        Collections.addAll(monthDaysList64, values64);
        Collections.addAll(monthDaysList65, values65);
        Collections.addAll(monthDaysList66, values66);
        Collections.addAll(monthDaysList67, values67);
        Collections.addAll(monthDaysList68, values68);
        Collections.addAll(monthDaysList69, values69);
        Collections.addAll(monthDaysList70, values70);
        Collections.addAll(monthDaysList71, values71);
        Collections.addAll(monthDaysList72, values72);
        Collections.addAll(monthDaysList73, values73);
        Collections.addAll(monthDaysList74, values74);
        Collections.addAll(monthDaysList75, values75);
        Collections.addAll(monthDaysList76, values76);
        Collections.addAll(monthDaysList77, values77);
        Collections.addAll(monthDaysList78, values78);
        Collections.addAll(monthDaysList79, values79);
        Collections.addAll(monthDaysList80, values80);
        Collections.addAll(monthDaysList81, values81);
        Collections.addAll(monthDaysList82, values82);
        Collections.addAll(monthDaysList83, values83);
        Collections.addAll(monthDaysList84, values84);
        Collections.addAll(monthDaysList85, values85);
        Collections.addAll(monthDaysList86, values86);
        Collections.addAll(monthDaysList87, values87);
        Collections.addAll(monthDaysList88, values88);
        Collections.addAll(monthDaysList89, values89);
        Collections.addAll(monthDaysList90, values90);
        Collections.addAll(monthDaysList91, values91);


        yearMonth.put(2000, values1);
        yearMonth.put(2001, values2);
        yearMonth.put(2002, values3);
        yearMonth.put(2003, values4);
        yearMonth.put(2004, values5);
        yearMonth.put(2005, values6);
        yearMonth.put(2006, values7);
        yearMonth.put(2007, values8);
        yearMonth.put(2008, values9);
        yearMonth.put(2009, values10);
        yearMonth.put(2010, values11);
        yearMonth.put(2011, values12);
        yearMonth.put(2012, values13);
        yearMonth.put(2013, values14);
        yearMonth.put(2014, values15);
        yearMonth.put(2015, values16);
        yearMonth.put(2016, values17);
        yearMonth.put(2017, values18);
        yearMonth.put(2018, values19);
        yearMonth.put(2019, values20);
        yearMonth.put(2020, values21);
        yearMonth.put(2021, values22);
        yearMonth.put(2022, values23);
        yearMonth.put(2023, values24);
        yearMonth.put(2024, values25);
        yearMonth.put(2025, values26);
        yearMonth.put(2026, values27);
        yearMonth.put(2027, values28);
        yearMonth.put(2028, values29);
        yearMonth.put(2029, values30);
        yearMonth.put(2030, values31);
        yearMonth.put(2031, values32);
        yearMonth.put(2032, values33);
        yearMonth.put(2033, values34);
        yearMonth.put(2034, values35);
        yearMonth.put(2035, values36);
        yearMonth.put(2036, values37);
        yearMonth.put(2037, values38);
        yearMonth.put(2038, values39);
        yearMonth.put(2039, values40);
        yearMonth.put(2040, values41);
        yearMonth.put(2041, values42);
        yearMonth.put(2042, values43);
        yearMonth.put(2043, values44);
        yearMonth.put(2044, values45);
        yearMonth.put(2045, values46);
        yearMonth.put(2046, values47);
        yearMonth.put(2047, values48);
        yearMonth.put(2048, values49);
        yearMonth.put(2049, values50);
        yearMonth.put(2050, values51);
        yearMonth.put(2051, values52);
        yearMonth.put(2052, values53);
        yearMonth.put(2053, values54);
        yearMonth.put(2054, values55);
        yearMonth.put(2055, values56);
        yearMonth.put(2056, values57);
        yearMonth.put(2057, values58);
        yearMonth.put(2058, values59);
        yearMonth.put(2059, values60);
        yearMonth.put(2060, values61);
        yearMonth.put(2061, values62);
        yearMonth.put(2062, values63);
        yearMonth.put(2063, values64);
        yearMonth.put(2064, values65);
        yearMonth.put(2065, values66);
        yearMonth.put(2066, values67);
        yearMonth.put(2067, values68);
        yearMonth.put(2068, values69);
        yearMonth.put(2069, values70);
        yearMonth.put(2070, values71);
        yearMonth.put(2071, values72);
        yearMonth.put(2072, values73);
        yearMonth.put(2073, values74);
        yearMonth.put(2074, values75);
        yearMonth.put(2075, values76);
        yearMonth.put(2076, values77);
        yearMonth.put(2077, values78);
        yearMonth.put(2078, values79);
        yearMonth.put(2079, values80);
        yearMonth.put(2080, values81);
        yearMonth.put(2081, values82);
        yearMonth.put(2082, values83);
        yearMonth.put(2083, values84);
        yearMonth.put(2084, values85);
        yearMonth.put(2085, values86);
        yearMonth.put(2086, values87);
        yearMonth.put(2087, values88);
        yearMonth.put(2088, values89);
        yearMonth.put(2089, values90);
        yearMonth.put(2090, values91);


        int a = yearMonth.get(year)[month - 1];
//        System.out.println("test="+a);
        return a;
    }


    public static Date addMonths(Date date, int months) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, months); //minus number would decrement the months
        return cal.getTime();

    }

    public static String getMonthName(int months) {

        System.out.println("inside get month name>>>" + months);

        String name;

        switch (months) {

            case 1:
                name = "Baishakh";
                break;
            case 2:
                name = "Jestha";
                break;
            case 3:
                name = "Asar";
                break;
            case 4:
                name = "Shrawan";
                break;
            case 5:
                name = "Bhadau";
                break;
            case 6:
                name = "Aswin";
                break;
            case 7:
                name = "Kartik";
                break;
            case 8:
                name = "Mansir";
                break;
            case 9:
                name = "Poush";
                break;
            case 10:
                name = "Magh";
                break;
            case 11:
                name = "Falgun";
                break;
            case 12:
                name = "Chaitra";
                break;
            case 0:
                name = "Chaitra";
                break;
            default:
                name = "Invalid Entry";

        }

        return name;

    }
}
