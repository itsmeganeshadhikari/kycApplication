package com.ganesh.application.utils.enums;

public enum InvestmentCompanies {

    NO("NO","No"),
    YES("YES","Yes");

    private String type;
    private String display;

    InvestmentCompanies(String type, String display) {
        this.type = type;
        this.display = display;
    }

    public String getType() {
        return type;
    }

    public String getDisplay() {
        return display;
    }

    public static InvestmentCompanies getByType(String type) {

        for ( InvestmentCompanies entry : InvestmentCompanies.values()) {
            if (entry.type.equals(type)) {
                return entry;
            }
        }
        return null;
    }

    public static InvestmentCompanies getByDisplay(String display) {
        for (InvestmentCompanies entry: InvestmentCompanies.values()) {
            if (entry.display.equals(display)) {
                return entry;
            }
        }
        return null;
    }

    public static String[] getByList() {
        int i = 0;
        String[] animalTypeList = new String[ InvestmentCompanies.values().length];
        for (InvestmentCompanies entry : InvestmentCompanies.values()) {
            animalTypeList[i] = entry.display;
            i++;
        }
        return animalTypeList;
    }


}
