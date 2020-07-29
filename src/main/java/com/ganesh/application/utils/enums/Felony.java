package com.ganesh.application.utils.enums;

public enum Felony {


    NO("NO","No"),
    YES("YES","Yes");

    private String type;
    private String display;

    Felony(String type, String display) {
        this.type = type;
        this.display = display;
    }

    public String getType() {
        return type;
    }

    public String getDisplay() {
        return display;
    }

    public static Felony getByType(String type) {

        for (Felony entry : Felony.values()) {
            if (entry.type.equals(type)) {
                return entry;
            }
        }
        return null;
    }

    public static Felony getByDisplay(String display) {
        for (Felony entry : Felony.values()) {
            if (entry.display.equals(display)) {
                return entry;
            }
        }
        return null;
    }

    public static String[] getByList() {
        int i = 0;
        String[] animalTypeList = new String[Felony.values().length];
        for (Felony entry : Felony.values()) {
            animalTypeList[i] = entry.display;
            i++;
        }
        return animalTypeList;
    }



}
