package com.ganesh.application.utils.enums;

public enum CitizenShipType
{
    BIRTH("BIRTH", "Citizenship by birth"),
    DESCENT("DESCENT", "Citizenship by virtue of Nepali descent or blood"),
    NATURALIZTION("NATURALIZTION", "Citizenship by naturalization");



    private String type;
    private String display;

    CitizenShipType(String type, String display) {
        this.type = type;
        this.display = display;
    }

    public String getType() {
        return type;
    }

    public String getDisplay() {
        return display;
    }

    public static CitizenShipType  getByType(String type) {

        for (CitizenShipType  entry : CitizenShipType .values()) {
            if (entry.type.equals(type)) {
                return entry;
            }
        }
        return null;
    }

    public static CitizenShipType  getByDisplay(String display) {
        for (CitizenShipType  entry : CitizenShipType .values()) {
            if (entry.display.equals(display)) {
                return entry;
            }
        }
        return null;
    }

    public static String[] getByList() {
        int i = 0;
        String[] animalTypeList = new String[CitizenShipType .values().length];
        for (CitizenShipType  entry : CitizenShipType .values()) {
            animalTypeList[i] = entry.display;
            i++;
        }
        return animalTypeList;
    }
}
