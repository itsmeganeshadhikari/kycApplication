package com.ganesh.application.utils.enums;

public enum BrokerFormType
{

    SIPRABI("SIPRABI", "Siprabi"),
    NALTA("NALTA", "Nalta");


    private String type;
    private String display;

    BrokerFormType(String type, String display) {
        this.type = type;
        this.display = display;
    }

    public String getType() {
        return type;
    }

    public String getDisplay() {
        return display;
    }

    public static BrokerFormType getByType(String type) {

        for (BrokerFormType entry : BrokerFormType.values()) {
            if (entry.type.equals(type)) {
                return entry;
            }
        }
        return null;
    }

    public static BrokerFormType getByDisplay(String display) {
        for (BrokerFormType entry : BrokerFormType.values()) {
            if (entry.display.equals(display)) {
                return entry;
            }
        }
        return null;
    }

    public static String[] getByList() {
        int i = 0;
        String[] animalTypeList = new String[BrokerFormType.values().length];
        for (BrokerFormType entry : BrokerFormType.values()) {
            animalTypeList[i] = entry.display;
            i++;
        }
        return animalTypeList;
    }


}
