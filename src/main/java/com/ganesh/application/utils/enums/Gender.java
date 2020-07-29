package com.ganesh.application.utils.enums;

public enum Gender {

    MALE("MALE", "Male"),
    FEMALE("FEMALE", "Female"),
    OTHER("OTHER", "Other");

    private String type;
    private String display;

    Gender(String type, String display) {
        this.type = type;
        this.display = display;
    }

    public String getType() {
        return type;
    }

    public String getDisplay() {
        return display;
    }

    public static Gender getByType(String type) {

        for (Gender entry : Gender.values()) {
            if (entry.type.equals(type)) {
                return entry;
            }
        }
        return null;
    }

    public static Gender getByDisplay(String display) {
        for (Gender entry : Gender.values()) {
            if (entry.display.equals(display)) {
                return entry;
            }
        }
        return null;
    }

    public static String[] getByList() {
        int i = 0;
        String[] animalTypeList = new String[Gender.values().length];
        for (Gender entry : Gender.values()) {
            animalTypeList[i] = entry.display;
            i++;
        }
        return animalTypeList;
    }
}
