package com.ganesh.application.utils.enums;

public enum MartialStatus {

    SINGLE("SINGLE", "Single"),
    MARRIED("MARRIED", "Married"),
    OTHER("OTHER", "Other");

    private String type;
    private String display;

    MartialStatus(String type, String display) {
        this.type = type;
        this.display = display;
    }

    public String getType() {
        return type;
    }

    public String getDisplay() {
        return display;
    }

    public static MartialStatus getByType(String type) {

        for (MartialStatus entry : MartialStatus.values()) {
            if (entry.type.equals(type)) {
                return entry;
            }
        }
        return null;
    }

    public static MartialStatus getByDisplay(String display) {
        for (MartialStatus entry : MartialStatus.values()) {
            if (entry.display.equals(display)) {
                return entry;
            }
        }
        return null;
    }

    public static String[] getByList() {
        int i = 0;
        String[] animalTypeList = new String[MartialStatus.values().length];
        for (MartialStatus entry : MartialStatus.values()) {
            animalTypeList[i] = entry.display;
            i++;
        }
        return animalTypeList;
    }

}
