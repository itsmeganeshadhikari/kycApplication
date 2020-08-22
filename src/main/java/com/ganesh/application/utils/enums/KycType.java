package com.ganesh.application.utils.enums;

public enum KycType
{
    BROKER("BROKER", "Broker"),
    BANK("BANK", "Bank");


    private String type;
    private String display;

    KycType (String type, String display) {
        this.type = type;
        this.display = display;
    }

    public String getType() {
        return type;
    }

    public String getDisplay() {
        return display;
    }

    public static KycType getByType(String type) {

        for (KycType entry : KycType.values()) {
            if (entry.type.equals(type)) {
                return entry;
            }
        }
        return null;
    }

    public static KycType  getByDisplay(String display) {
        for (KycType  entry : KycType.values()) {
            if (entry.display.equals(display)) {
                return entry;
            }
        }
        return null;
    }

    public static String[] getByList() {
        int i = 0;
        String[] animalTypeList = new String[KycType.values().length];
        for (KycType entry :KycType.values()) {
            animalTypeList[i] = entry.display;
            i++;
        }
        return animalTypeList;
    }

}
