package com.ganesh.application.utils.enums;

public enum IncomeType
{

    BUSINESSINCOME("BUSINESSINCOME", "Business Income"),
    SALARY("SALARY", "Salary"),
    INVESTMENT("INVESTMENT", "Return on investment"),
    RENT("RENT", "House rent"),
    SECURITIES("RENT", "Securities transactions"),
    OLDINCOME("OLD INCOME", "old Income"),
    INTREST("INTREST", "Interest"),
    OTHERS("OTHERS", "others");



    private String type;
    private String display;

    IncomeType(String type, String display) {
        this.type = type;
        this.display = display;
    }

    public String getType() {
        return type;
    }

    public String getDisplay() {
        return display;
    }

    public static IncomeType getByType(String type) {

        for (IncomeType entry : IncomeType.values()) {
            if (entry.type.equals(type)) {
                return entry;
            }
        }
        return null;
    }

    public static IncomeType getByDisplay(String display) {
        for (IncomeType entry : IncomeType.values()) {
            if (entry.display.equals(display)) {
                return entry;
            }
        }
        return null;
    }

    public static String[] getByList() {
        int i = 0;
        String[] animalTypeList = new String[IncomeType.values().length];
        for (IncomeType entry : IncomeType.values()) {
            animalTypeList[i] = entry.display;
            i++;
        }
        return animalTypeList;
    }


}
