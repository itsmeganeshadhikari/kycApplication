package com.ganesh.application.utils.enums;

public enum Nationality
{

    Nepalese("Nepalese", "Nepalese"),
    OTHER("OTHER", "Other");

    private String type;
    private String display;

    Nationality(String type, String display) {
        this.type = type;
        this.display = display;
    }

    public String getType() {
        return type;
    }

    public String getDisplay() {
        return display;
    }

    public static Nationality getByType(String type) {

        for (Nationality entry : Nationality.values()) {
            if (entry.type.equals(type)) {
                return entry;
            }
        }
        return null;
    }
    public static Nationality getByDisplay(String display) {
        for (Nationality entry : Nationality.values()) {
            if (entry.display.equals(display)) {
                return entry;
            }
        }
        return null;
    }
    public static String[] getByList() {
        int i = 0;
        String[] animalTypeList = new String[Nationality.values().length];
        for (Nationality entry : Nationality.values()) {
            animalTypeList[i] = entry.display;
            i++;
        }
        return animalTypeList;
    }

}
