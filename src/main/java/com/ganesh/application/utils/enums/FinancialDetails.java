package com.ganesh.application.utils.enums;

public enum FinancialDetails {



    UPTO("UPTO", "Upto Rs.5,00,000"),
    FROM("FROM", "From  Rs.5,00,000 to Rs.10,00,000"),
    ABOVE("ABOVE", "Above Rs.10,00,000");

    private String type;
    private String display;

    FinancialDetails(String type, String display) {
        this.type = type;
        this.display = display;
    }

    public String getType() {
        return type;
    }

    public String getDisplay() {
        return display;
    }

    public static FinancialDetails getByType(String type) {

        for (FinancialDetails entry : FinancialDetails.values()) {
            if (entry.type.equals(type)) {
                return entry;
            }
        }
        return null;
    }

    public static FinancialDetails getByDisplay(String display) {
        for (FinancialDetails entry : FinancialDetails.values()) {
            if (entry.display.equals(display)) {
                return entry;
            }
        }
        return null;
    }

    public static String[] getByList() {
        int i = 0;
        String[] animalTypeList = new String[FinancialDetails.values().length];
        for (FinancialDetails entry : FinancialDetails.values()) {
            animalTypeList[i] = entry.display;
            i++;
        }
        return animalTypeList;
    }











}
