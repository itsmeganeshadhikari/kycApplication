package com.ganesh.application.utils.enums;

public enum DebtInformation {




    NO("NO","No"),
    YES("YES","Yes");







    private String type;
    private String display;

    DebtInformation(String type, String display) {
        this.type = type;
        this.display = display;
    }

    public String getType() {
        return type;
    }

    public String getDisplay() {
        return display;
    }

    public static DebtInformation getByType(String type) {

        for ( DebtInformation entry : DebtInformation.values()) {
            if (entry.type.equals(type)) {
                return entry;
            }
        }
        return null;
    }

    public static DebtInformation getByDisplay(String display) {
        for (DebtInformation entry: DebtInformation.values()) {
            if (entry.display.equals(display)) {
                return entry;
            }
        }
        return null;
    }

    public static String[] getByList() {
        int i = 0;
        String[] animalTypeList = new String[ DebtInformation.values().length];
        for ( DebtInformation entry : DebtInformation.values()) {
            animalTypeList[i] = entry.display;
            i++;
        }
        return animalTypeList;
    }



}
