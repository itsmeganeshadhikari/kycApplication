package com.ganesh.application.utils.enums;

public enum Beneficary {


    NO("NO","No"),
    YES("YES","Yes");

    private String type;
    private String display;

    Beneficary(String type, String display) {
        this.type = type;
        this.display = display;
    }

    public String getType() {
        return type;
    }

    public String getDisplay() {
        return display;
    }

    public static Beneficary getByType(String type) {

        for (Beneficary entry : Beneficary.values()) {
            if (entry.type.equals(type)) {
                return entry;
            }
        }
        return null;
    }

    public static Beneficary getByDisplay(String display) {
        for (Beneficary entry : Beneficary.values()) {
            if (entry.display.equals(display)) {
                return entry;
            }
        }
        return null;
    }

    public static String[] getByList() {
        int i = 0;
        String[] animalTypeList = new String[Beneficary.values().length];
        for (Beneficary entry : Beneficary.values()) {
            animalTypeList[i] = entry.display;
            i++;
        }
        return animalTypeList;
    }



}
