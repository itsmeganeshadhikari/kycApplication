package com.ganesh.application.utils.enums;

public enum FormType
{
    ADB("ADB", "Agriculture Deveploment Bank Ltd"),
    NIC("NIC", "NIC Asia Bank Ltd"),
    SIPRABI("SIPRABI", "Siprabi"),
    NALTA("NALTA", "Nalta");


    private String type;
    private String display;

    FormType(String type, String display) {
        this.type = type;
        this.display = display;
    }

    public String getType() {
        return type;
    }

    public String getDisplay() {
        return display;
    }

    public static FormType getByType(String type) {

        for (FormType entry : FormType.values()) {
            if (entry.type.equals(type)) {
                return entry;
            }
        }
        return null;
    }

    public static FormType getByDisplay(String display) {
        for (FormType entry : FormType.values()) {
            if (entry.display.equals(display)) {
                return entry;
            }
        }
        return null;
    }

    public static String[] getByList() {
        int i = 0;
        String[] animalTypeList = new String[FormType.values().length];
        for (FormType entry : FormType.values()) {
            animalTypeList[i] = entry.display;
            i++;
        }
        return animalTypeList;
    }


}
