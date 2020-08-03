package com.ganesh.application.utils.enums;

public enum AccountType
{

    SAVING("SAVING","Saving"),
    CURRENT("CURRENT","Current");

    private String type;
    private String display;

    AccountType(String type, String display) {
        this.type = type;
        this.display = display;
    }

    public String getType() {
        return type;
    }

    public String getDisplay() {
        return display;
    }

    public static AccountType getByType(String type) {

        for (AccountType entry:AccountType .values()) {
            if (entry.type.equals(type)) {
                return entry;
            }
        }
        return null;
    }

    public static AccountType getByDisplay(String display) {
        for (AccountType  entry : AccountType.values()) {
            if (entry.display.equals(display)) {
                return entry;
            }
        }
        return null;
    }

    public static String[] getByList() {
        int i = 0;
        String[] animalTypeList = new String[AccountType.values().length];
        for(AccountType entry:AccountType.values()) {
            animalTypeList[i] = entry.display;
            i++;
        }
        return animalTypeList;
    }






}
