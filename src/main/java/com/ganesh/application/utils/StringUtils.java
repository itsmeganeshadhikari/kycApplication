package com.ganesh.application.utils;

import javax.servlet.http.HttpServletRequest;

public class StringUtils {
    public static boolean isNull(String string) {

        return string == null || string.trim().equals("") || "null".equalsIgnoreCase(string);
    }

    public static boolean isNotNull(String string) {

        return !isNull(string);
    }

    public static boolean isEmpty(String string) {

        return string != null && string.length() == 0;
    }

    public static boolean isNotEmpty(String string) {

        return !isEmpty(string);
    }

    public static boolean isNumeric(String str) {
        return StringUtils.isNotNull(str) && (str.trim().matches("[-\\+]?\\d+(\\.\\d+)?") || str.trim().matches("[-\\+]?+(\\.\\d+)?") || /*match a -ve number that ends with (.) */ str.trim().matches("[-\\+]?\\d+(\\.)?"));  //match a number with optional '-' and decimal.
    }

    public static String left(String text, int length) {
        return !isNull(text) && text.length() > length ? text.substring(0, length) : text;
    }

    public static String right(String text, int length) {
        return !isNull(text) && text.length() > length ? text.substring(text.length() - length, text.length()) : text;
    }

    private static String getClientIp(HttpServletRequest request) {

        String remoteAddr = "";

        if (request != null) {
            remoteAddr = request.getHeader("X-FORWARDED-FOR");
            if (remoteAddr == null || "".equals(remoteAddr)) {
                remoteAddr = request.getRemoteAddr();
            }
        }

        return remoteAddr;
    }


}
