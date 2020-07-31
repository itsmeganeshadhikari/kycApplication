package com.ganesh.application.utils.enums;

public enum Municipality
{
    RURALMUNICIPALITY("RURALMUNICIPALITY", "Rural Municipality"),
    SUBMETEROPOLITIANCITY("SUBMETEROPOLITIANCITY", "Sub Meteropolitian City"),
    MUNICIPALITY("MUNICIPALITY", "Municipality"),
    METROPOLITIANCITY("METEROPOLITIANCITY", "Meteropolitian city");

    private String type;
    private String display;

    Municipality(String type, String display) {
        this.type = type;
        this.display = display;
    }

    public String getType() {
        return type;
    }

    public String getDisplay() {
        return display;
    }

    public static Municipality getByType(String type) {

        for (Municipality entry : Municipality.values()) {
            if (entry.type.equals(type)) {
                return entry;
            }
        }
        return null;
    }

    public static Municipality getByDisplay(String display) {
        for (Municipality entry : Municipality.values()) {
            if (entry.display.equals(display)) {
                return entry;
            }
        }
        return null;
    }

    public static String[] getByList() {
        int i = 0;
        String[] animalTypeList = new String[Municipality.values().length];
        for (Municipality entry : Municipality.values()) {
            animalTypeList[i] = entry.display;
            i++;
        }
        return animalTypeList;
    }

}
