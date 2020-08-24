package com.ganesh.application.utils.enums;

public enum PassportType
{
    BIRTH("BIRTH", "Passport by birth"),
    DESCENT("DESCENT", "Passport by virtue of Nepali descent or blood"),
    NATURALIZTION("NATURALIZTION", "Passport by naturalization");



    private String type;
    private String display;

    PassportType(String type, String display) {
        this.type = type;
        this.display = display;
    }

    public String getType() {
        return type;
    }

    public String getDisplay() {
        return display;
    }

    public static PassportType  getByType(String type) {

        for (PassportType  entry : PassportType .values()) {
            if (entry.type.equals(type)) {
                return entry;
            }
        }
        return null;
    }

    public static PassportType  getByDisplay(String display) {
        for (PassportType  entry : PassportType .values()) {
            if (entry.display.equals(display)) {
                return entry;
            }
        }
        return null;
    }

    public static String[] getByList() {
        int i = 0;
        String[] animalTypeList = new String[PassportType .values().length];
        for (PassportType  entry : PassportType .values()) {
            animalTypeList[i] = entry.display;
            i++;
        }
        return animalTypeList;
    }
}
