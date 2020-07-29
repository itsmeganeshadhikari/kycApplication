package com.ganesh.application.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConvertToNepaliDate {


    public String returnLocalDate() {
        LocalDateTime now = LocalDateTime.now();

//        System.out.println("Before : " + now);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String formatDateTime = now.format(formatter);

//        System.out.println("After : " + formatDateTime);

        return formatDateTime;
    }

    public String addYear(int year) {

//        System.out.println(DateUtils.getDateInBS(returnLocalDate()));
        if (year > 0) {
            String nepaliDate = DateUtils.getDateInBS(returnLocalDate());
            String bsDateMonth = nepaliDate.split("-")[1];
            String bsDateDay = nepaliDate.split("-")[2];
            int bsDate = Integer.parseInt(nepaliDate.split("-")[0]) + year;

            String stringYear = Integer.toString(bsDate);
            String stringMonth = getDaysOrMonthInTwoDigit(Integer.parseInt(bsDateMonth));
            String stringDays = getDaysOrMonthInTwoDigit(Integer.parseInt(bsDateDay));

            String resultDate = stringYear + "-" + stringMonth + "-" + stringDays;
            return resultDate;
        } else {
            return "Please pass positive value";
        }
    }

    public String addMonth(int month) {

        if (month > 0) {
            String nepaliDate = DateUtils.getDateInBS(returnLocalDate());
            String bsDateMonth = nepaliDate.split("-")[1];
            String bsDateDay = nepaliDate.split("-")[2];
            int bsYear = Integer.parseInt(nepaliDate.split("-")[0]);
            int bsMonth = Integer.parseInt(nepaliDate.split("-")[1]);
            int bsDays = Integer.parseInt(nepaliDate.split("-")[2]);
            String tempVal = findMonthYear(month);
            int quotient = 0;
            int remainder = 0;
            int gainBsYear = 0;
            int gainBsMonth = 0;
            String stringBsYear = "";
            String stringBsMonth = "";
            String stringBsDays = "";
            quotient = Integer.parseInt(tempVal.split("-")[0]);
            if (tempVal.contains("-")) {
                remainder = Integer.parseInt(tempVal.split("-")[1]);
                gainBsYear = bsYear + quotient;
                gainBsMonth = bsMonth + remainder;
                if (bsMonth + remainder > 12) {
                    gainBsYear += 1;
                    gainBsMonth = (bsMonth + remainder) - 12;
                }
            } else {
                gainBsYear = bsYear;
                gainBsMonth = bsMonth + Integer.parseInt(tempVal);
                if (gainBsMonth > 12) {
                    int monthRemainder = gainBsMonth % 12;
                    int yearQuotient = gainBsMonth / 12;

                    gainBsYear += yearQuotient;
                    gainBsMonth = monthRemainder;
                }
            }

            stringBsYear = Integer.toString(gainBsYear);
            stringBsMonth = getDaysOrMonthInTwoDigit(gainBsMonth);
            stringBsDays = getDaysOrMonthInTwoDigit(bsDays);
            return stringBsYear + "-" + stringBsMonth + "-" + stringBsDays;
        } else {
            return "Please pass positive value";
        }
    }


    public String addDays(int days) {

        if (days > 0) {
            String currentDate1 = returnLocalDate();
            String currentDate = DateUtils.getDateInBS(currentDate1);
//        String currentDate = "2077-8-30";
            String currentBsYear = currentDate.split("-")[0];
            String currentBsMonth = currentDate.split("-")[1];
            String currentDay = currentDate.split("-")[2];
            String twoDigitMonths = "";
            String twoDigitDays = "";
            int bsYear = Integer.parseInt(currentBsYear);
            int bsMonth = Integer.parseInt(currentBsMonth);
            int initialSubtractDays = 0;
            int temploopValue = 0;
            int tempVal = 0;
            int resultedMonths = 0;
            int totalDaysOfMonths = DateUtils.getDays(Integer.parseInt(currentBsYear), Integer.parseInt(currentBsMonth));
            initialSubtractDays = totalDaysOfMonths - Integer.parseInt(currentDay);
            if (days > totalDaysOfMonths) {
                while (days > totalDaysOfMonths) {
                    temploopValue++;
                    if (tempVal == 0) {
                        days = days - initialSubtractDays; //the month value need to be increased by one after this action
                        if (bsMonth == 12) {
                            bsYear += 1;
                            bsMonth = 1;
                        } else {
                            bsMonth++;
                        }
                    } else {
//                    totalDaysOfMonths = DateUtils.getDays(bsYear, bsMonth);
                        days = days - totalDaysOfMonths;

                        if (bsMonth == 12) {
                            bsYear += 1;
                            bsMonth = 1;
                        } else {
                            bsMonth++;
                        }
                    }

                    tempVal++;


                    totalDaysOfMonths = DateUtils.getDays(bsYear, bsMonth);


                }


                resultedMonths = temploopValue;
                int reqYear = Integer.parseInt(currentBsYear);
                int reqMonth = 0;
                int reqDays = 0;
                if (resultedMonths >= 12) {
                    int getYear = resultedMonths / 12;
                    int getMonth = resultedMonths % 12;
                    reqYear = Integer.parseInt(currentBsYear) + getYear;
                    reqMonth = Integer.parseInt(currentBsMonth) + getMonth;

                    /**if days crosses the total day of the month*/

//                    System.out.println("reqMonth = " + reqMonth);
//                    System.out.println("reqYear = " + reqYear);
                    if (reqMonth > 12) {
                        reqYear += 1;
                        if (reqMonth == 13) {
                            reqMonth = 1;
                        } else if (reqMonth == 14) {
                            reqMonth = 2;
                        } else if (reqMonth == 15) {
                            reqMonth = 3;
                        } else if (reqMonth == 16) {
                            reqMonth = 4;
                        } else if (reqMonth == 17) {
                            reqMonth = 5;
                        } else if (reqMonth == 18) {
                            reqMonth = 6;
                        } else if (reqMonth == 19) {
                            reqMonth = 7;
                        } else if (reqMonth == 20) {
                            reqMonth = 8;
                        } else if (reqMonth == 21) {
                            reqMonth = 9;
                        } else if (reqMonth == 22) {
                            reqMonth = 10;
                        } else if (reqMonth == 23) {
                            reqMonth = 11;
                        } else if (reqMonth == 24) {
                            reqMonth = 12;
                        }
                    }

                    if (days > DateUtils.getDays(reqYear, reqMonth)) {
                        days = days - DateUtils.getDays(reqYear, reqMonth);
                        reqMonth += 1;
                    }
                    twoDigitMonths = getDaysOrMonthInTwoDigit(reqMonth);
                    twoDigitDays = getDaysOrMonthInTwoDigit(days);
                    return reqYear + "-" + twoDigitMonths + "-" + twoDigitDays;
                } else {
                    reqMonth = Integer.parseInt(currentBsMonth) + resultedMonths;
                    if (reqMonth >= 12) {
                        int getYear = reqMonth / 12;
                        int getMonth = reqMonth % 12;

                        reqYear = Integer.parseInt(currentBsYear) + getYear;
                        reqMonth = getMonth;

                        /**if days crosses the total day of the month*/
                        if (days > DateUtils.getDays(reqYear, reqMonth)) {
                            days = days - DateUtils.getDays(reqYear, reqMonth);
                            reqMonth += 1;
                        }
                    }

                    twoDigitMonths = getDaysOrMonthInTwoDigit(reqMonth);
                    twoDigitDays = getDaysOrMonthInTwoDigit(days);
                    return reqYear + "-" + twoDigitMonths + "-" + twoDigitDays;

                }

            } else {
                //this is for if the days is less than the total month days
                int reqYear = Integer.parseInt(currentBsYear);
                int checkDays = days + Integer.parseInt(currentDay);
                int reqMonth = 0;

                if (checkDays > totalDaysOfMonths) {
                    days = checkDays - totalDaysOfMonths;
                    reqMonth = Integer.parseInt(currentBsMonth) + 1;
                    if (reqMonth > 12) {
                        reqYear += 1;
                        reqMonth = reqMonth - 12;

                        /**if days crosses the total day of the month*/


                        if (days > DateUtils.getDays(reqYear, reqMonth)) {
                            days = days - DateUtils.getDays(reqYear, reqMonth);
                            reqMonth += 1;
                        }
                    }
                } else {
                    reqMonth = Integer.parseInt(currentBsMonth);
                    days = checkDays;
                }

                twoDigitMonths = getDaysOrMonthInTwoDigit(reqMonth);
                twoDigitDays = getDaysOrMonthInTwoDigit(days);
                return reqYear + "-" + twoDigitMonths + "-" + twoDigitDays;

            }
        } else {
            return "Please pass positive value";
        }

    }

    public String removeYear(int year) {
//        System.out.println(DateUtils.getDateInBS(returnLocalDate()));
        if (year > 0) {
            String nepaliDate = DateUtils.getDateInBS(returnLocalDate());
            String bsDateMonth = nepaliDate.split("-")[1];
            String bsDateDay = nepaliDate.split("-")[2];
            int bsDate = Integer.parseInt(nepaliDate.split("-")[0]) - year;

            String stringYear = Integer.toString(bsDate);
            String stringMonth = getDaysOrMonthInTwoDigit(Integer.parseInt(bsDateMonth));
            String stringDays = getDaysOrMonthInTwoDigit(Integer.parseInt(bsDateDay));

            String resultDate = stringYear + "-" + stringMonth + "-" + stringDays;
            return resultDate;
        } else {
            return "Please pass positive value";
        }
    }

    public String removeMonth(int month) {
        if (month > 0) {
//        System.out.println(DateUtils.getDateInBS(returnLocalDate()));
            String nepaliDate = DateUtils.getDateInBS(returnLocalDate());
            String bsDateMonth = nepaliDate.split("-")[1];
            String bsDateDay = nepaliDate.split("-")[2];
            int bsYear = Integer.parseInt(nepaliDate.split("-")[0]);
            int bsMonth = Integer.parseInt(nepaliDate.split("-")[1]);
            int bsDays = Integer.parseInt(nepaliDate.split("-")[2]);
            int resultBsYear = 0;
            int resultMonth = 0;
            int resultDays = 0;
            if (month < bsMonth) {
                resultMonth = bsMonth - month;
                String stringMonth = getDaysOrMonthInTwoDigit(resultMonth);
                String stringDays = getDaysOrMonthInTwoDigit(bsDays);
                return bsYear + "-" + stringMonth + "-" + stringDays;
            } else {
                int tempYear = bsYear - 1;
                int tempMonth = month - bsMonth;
                String getMonthAndYear = findMonthYear(tempMonth);
                if (getMonthAndYear.contains("-")) {
                    resultBsYear = Integer.parseInt(getMonthAndYear.split("-")[0]);
                    resultMonth = Integer.parseInt(getMonthAndYear.split("-")[1]);
                    int reqYear = tempYear - resultBsYear;
                    int reqMonth = 12 - resultMonth;


                    String stringMonth = getDaysOrMonthInTwoDigit(reqMonth);
                    String stringDays = getDaysOrMonthInTwoDigit(bsDays);
                    return reqYear + "-" + stringMonth + "-" + stringDays;
                } else {
                    int reqMonth = 12 - Integer.parseInt(getMonthAndYear);
                    if (reqMonth == 0) {
                        tempYear -= 1;
                        reqMonth = 12;
                    }
                    String stringMonth = getDaysOrMonthInTwoDigit(reqMonth);
                    String stringDays = getDaysOrMonthInTwoDigit(bsDays);
                    return tempYear + "-" + stringMonth + "-" + stringDays;
                }

            }
        } else {
            return "Please pass positive value";
        }

    }


    public String removeDays(int days) {
        if (days > 0) {
            String currentDate1 = returnLocalDate();
            String currentDate = DateUtils.getDateInBS(currentDate1);
            String currentBsYear = currentDate.split("-")[0];
            String currentBsMonth = currentDate.split("-")[1];
            String currentDay = currentDate.split("-")[2];
            int bsYear = Integer.parseInt(currentBsYear);
            int bsMonth = Integer.parseInt(currentBsMonth);
            int initialSubtractDays = 0;
            int temploopValue = 0;
            int tempVal = 0;
            int resultedMonths = 0;
            int reqYear = 0;
            int reqMonth = 0;
            int reqDays = 0;
            String stringReqYear = "";
            String stringReqMonth = "";
            String stringRegDays = "";
            int resultedYear = Integer.parseInt(currentBsYear);
            int totalDaysOfMonths = DateUtils.getDays(Integer.parseInt(currentBsYear), Integer.parseInt(currentBsMonth));

            initialSubtractDays = Integer.parseInt(currentDay);
            if (days > totalDaysOfMonths) {
                while (days > totalDaysOfMonths) {
                    temploopValue++;
                    if (tempVal == 0) {
                        days = days - initialSubtractDays;

                        if (bsMonth == 1) {
                            bsYear -= 1;
                            bsMonth = 12;

                        } else {
                            bsMonth--;
                        }

                    } else {
//                    totalDaysOfMonths = DateUtils.getDays(bsYear, bsMonth);
                        days = days - totalDaysOfMonths;
                        if (bsMonth == 1) {
                            bsYear -= 1;
                            bsMonth = 12;

                        } else {
                            bsMonth--;
                        }
                    }


                    tempVal++;

                    totalDaysOfMonths = DateUtils.getDays(bsYear, bsMonth);

                }

                reqYear = bsYear;
                reqMonth = bsMonth;
                reqDays = days;
                int referenceValue = DateUtils.getDays(reqYear, reqMonth);

                if (referenceValue > reqDays) {
                    reqDays = referenceValue - reqDays;
                } else {
                    reqMonth = reqMonth - 1;
                    if (reqMonth < 1) {
                        reqYear -= 1;
                        reqMonth = 12;
                    }
                    referenceValue = DateUtils.getDays(reqYear, reqMonth);
                    reqDays = referenceValue;
                }


                stringReqYear = Integer.toString(reqYear);
                stringReqMonth = getDaysOrMonthInTwoDigit(reqMonth);
                stringRegDays = getDaysOrMonthInTwoDigit(reqDays);


                return stringReqYear + "-" + stringReqMonth + "-" + stringRegDays;


            } else {

                int checkDays = Integer.parseInt(currentDay) - days;

                if (checkDays <= 0) {
                    if (Integer.parseInt(currentBsMonth) == 1) {
                        resultedMonths = 12;
                        resultedYear -= 1;
                        int getLastDayOfPreviousMonth = DateUtils.getDays(resultedYear, resultedMonths);
                        days = getLastDayOfPreviousMonth + checkDays; //the checkdays is in negative so the action is positive to perform substraction
                    } else {
                        resultedMonths = Integer.parseInt(currentBsMonth) - 1;
                        int getLastDayOfPreviousMonth = DateUtils.getDays(Integer.parseInt(currentBsYear), resultedMonths);
                        days = getLastDayOfPreviousMonth + checkDays; //the checkdays is in negative so the action is positive to perform substraction
                    }

                } else {
                    resultedMonths = Integer.parseInt(currentBsMonth);
                    days = checkDays;
                }

                stringReqYear = Integer.toString(bsYear);
                stringReqMonth = getDaysOrMonthInTwoDigit(resultedMonths);
                stringRegDays = getDaysOrMonthInTwoDigit(days);

                return stringReqYear + "-" + stringReqMonth + "-" + stringRegDays;
            }
        } else {
            return "Please pass positive value";
        }

    }


    public String findMonthYear(int month) {
        int remainder = 0;
        int quotient = 0;
        if (month > 12) {
            remainder = month % 12;
            quotient = month / 12;

            return quotient + "-" + remainder;
        } else {
            return Integer.toString(month);
        }
    }

    public String getDaysOrMonthInTwoDigit(int value) {
        int tempVal = String.valueOf(value).length();
        String reqVal = "";
        if (tempVal == 2) {
            reqVal = Integer.toString(value);
        } else if (tempVal == 1) {
            reqVal = "0" + Integer.toString(value);
        }
//        System.out.println("reqVal="+reqVal);

        return reqVal;
    }

    public static void main(String[] args) {
/*
        LocalDateTime now = LocalDateTime.now();

        System.out.println("Before : " + now);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String formatDateTime = now.format(formatter);

        System.out.println("After : " + formatDateTime);
*/


        ConvertToNepaliDate convertToNepaliDate = new ConvertToNepaliDate();
/*
        System.out.println("next BS Date:" + convertToNepaliDate.addYear(6));

        System.out.println("-------------------------------------------------");

        System.out.println("previous BS Date:" + convertToNepaliDate.removeYear(6));
*/

       /* System.out.println("====================================================");


        System.out.println("next BS month:" + convertToNepaliDate.addMonth(60));

        System.out.println("-------------------------------------------------");

        System.out.println("previous BS month:" + convertToNepaliDate.removeMonth(60));*/

        System.out.println("====================================================");


        System.out.println("next addDays:" + convertToNepaliDate.addDays(1095));

        System.out.println("-------------------------------------------------");

        System.out.println("previous removeDays:" + convertToNepaliDate.removeDays(1095));

//        System.out.println("sdafasfas="+DateUtils.getDays(2075,10));


    }


}
