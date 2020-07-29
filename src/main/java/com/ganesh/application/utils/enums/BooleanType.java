package com.ganesh.application.utils.enums;

public enum BooleanType
{

        NO("NO","No"),
        YES("YES","Yes");

        private String type;
    private String display;

    BooleanType(String type, String display) {
        this.type = type;
        this.display = display;
    }

    public String getType() {
        return type;
    }

    public String getDisplay() {
        return display;
    }

    public static BooleanType getByType(String type) {

        for (BooleanType entry : BooleanType.values()) {
            if (entry.type.equals(type)) {
                return entry;
            }
        }
        return null;
    }

    public static BooleanType getByDisplay(String display) {
        for (BooleanType entry : BooleanType.values()) {
            if (entry.display.equals(display)) {
                return entry;
            }
        }
        return null;
    }

    public static String[] getByList() {
        int i = 0;
        String[] animalTypeList = new String[BooleanType.values().length];
        for (BooleanType entry : BooleanType.values()) {
            animalTypeList[i] = entry.display;
            i++;
        }
        return animalTypeList;
    }



}
