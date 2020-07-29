package com.ganesh.application.utils.enums;

public enum BusinessType {
    MANUFACTURING("MANUFACTURING", "Manufacturing"),
    SERVICEORIENTED("SERVICEORIENTED", "Service-Oriented"),
    OTHERS("OTHERS", "Others");

    private String type;
    private String display;

    BusinessType(String type, String display) {
        this.type = type;
        this.display = display;
    }

    public String getType() {
        return type;
    }

    public String getDisplay() {
        return display;
    }

    public static BusinessType getByType(String type) {

        for (BusinessType entry : BusinessType.values()) {
            if (entry.type.equals(type)) {
                return entry;
            }
        }
        return null;
    }

    public static BusinessType getByDisplay(String display) {
        for (BusinessType entry : BusinessType.values()) {
            if (entry.display.equals(display)) {
                return entry;
            }
        }
        return null;
    }

    public static String[] getByList() {
        int i = 0;
        String[] animalTypeList = new String[BusinessType.values().length];
        for (BusinessType entry : BusinessType.values()) {
            animalTypeList[i] = entry.display;
            i++;
        }
        return animalTypeList;
    }
}
