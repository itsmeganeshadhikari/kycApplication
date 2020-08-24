package com.ganesh.application.utils.enums;

public enum TitleType
{
    INDIVIDUAL("INDIVIDUAL", "Individual"),
    JOINT("JOINT", "Joint"),
    CUSTODIAL("CUSTODIAL", "Custodial"),
    TRUST("TRUST", "Trust");



    private String type;
    private String display;

    TitleType(String type, String display) {
        this.type = type;
        this.display = display;
    }

    public String getType() {
        return type;
    }

    public String getDisplay() {
        return display;
    }

    public static TitleType  getByType(String type) {

        for (TitleType  entry : TitleType.values()) {
            if (entry.type.equals(type)) {
                return entry;
            }
        }
        return null;
    }

    public static TitleType  getByDisplay(String display) {
        for (TitleType  entry : TitleType .values()) {
            if (entry.display.equals(display)) {
                return entry;
            }
        }
        return null;
    }

    public static String[] getByList() {
        int i = 0;
        String[] animalTypeList = new String[TitleType.values().length];
        for (TitleType  entry : TitleType .values()) {
            animalTypeList[i] = entry.display;
            i++;
        }
        return animalTypeList;
    }
}

