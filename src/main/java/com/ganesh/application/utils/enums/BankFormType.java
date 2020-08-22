package com.ganesh.application.utils.enums;

public enum BankFormType
{

    ADB("ADB", "adb"),
    NIC("NIC", "Nic");


    private String type;
    private String display;

    BankFormType(String type, String display) {
        this.type = type;
        this.display = display;
    }

    public String getType() {
        return type;
    }

    public String getDisplay() {
        return display;
    }

    public static BankFormType getByType(String type) {

        for (BankFormType entry : BankFormType.values()) {
            if (entry.type.equals(type)) {
                return entry;
            }
        }
        return null;
    }

    public static BankFormType getByDisplay(String display) {
        for (BankFormType entry : BankFormType.values()) {
            if (entry.display.equals(display)) {
                return entry;
            }
        }
        return null;
    }

    public static String[] getByList() {
        int i = 0;
        String[] animalTypeList = new String[BankFormType.values().length];
        for (BankFormType entry : BankFormType.values()) {
            animalTypeList[i] = entry.display;
            i++;
        }
        return animalTypeList;
    }


}
