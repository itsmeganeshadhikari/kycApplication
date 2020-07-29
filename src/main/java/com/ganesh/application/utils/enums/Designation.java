package com.ganesh.application.utils.enums;

public enum Designation
{
    DIRECTOR(" DIRECTOR", "Director"),
    EXECUTIVE("EXECUTIVE", "Executive"),
    SHAREHOLDER("SHAREHOLDER", "Shareholder"),
    EMPLOYEE("EMPLOYEE", "Employee"),
    OTHERS("OTHERS", "Others");

    private String type;
    private String display;

    Designation(String type, String display) {
        this.type = type;
        this.display = display;
    }

    public String getType() {
        return type;
    }

    public String getDisplay() {
        return display;
    }

    public static Designation getByType(String type) {

        for (Designation entry : Designation.values()) {
            if (entry.type.equals(type)) {
                return entry;
            }
        }
        return null;
    }

    public static Designation getByDisplay(String display) {
        for (Designation entry : Designation.values()) {
            if (entry.display.equals(display)) {
                return entry;
            }
        }
        return null;
    }

    public static String[] getByList() {
        int i = 0;
        String[] animalTypeList = new String[Designation.values().length];
        for (Designation entry : Designation.values()) {
            animalTypeList[i] = entry.display;
            i++;
        }
        return animalTypeList;
    }
}
