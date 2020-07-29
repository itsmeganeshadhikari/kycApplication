package com.ganesh.application.utils.enums;

public enum Political {


    NO("NO","No"),
    YES("YES","Yes");

    private String type;
    private String display;

    Political(String type, String display) {
        this.type = type;
        this.display = display;
    }

    public String getType() {
        return type;
    }

    public String getDisplay() {
        return display;
    }

    public static Political getByType(String type) {

        for (Political entry : Political.values()) {
            if (entry.type.equals(type)) {
                return entry;
            }
        }
        return null;
    }

    public static Political getByDisplay(String display) {
        for (Political entry : Political.values()) {
            if (entry.display.equals(display)) {
                return entry;
            }
        }
        return null;
    }

    public static String[] getByList() {
        int i = 0;
        String[] animalTypeList = new String[Political.values().length];
        for (Political entry : Political.values()) {
            animalTypeList[i] = entry.display;
            i++;
        }
        return animalTypeList;
    }



}
