package com.ganesh.application.utils.enums;

public enum OccupationType {

    BUSINESS("BUSINESS", "Business"),
    JOB("JOB", "Job"),
    HOUSEWIFE("HOUSEWIFE", "Housewife"),
    AGRICULTURE("AGRICULTURE", "Agriculture"),
    STUDENT("STUDENT", "Student"),
    OTHERS("OTHERS", "Others");

    private String type;
    private String display;

    OccupationType(String type, String display) {
        this.type = type;
        this.display = display;
    }

    public String getType() {
        return type;
    }

    public String getDisplay() {
        return display;
    }

    public static OccupationType getByType(String type) {

        for (OccupationType entry : OccupationType.values()) {
            if (entry.type.equals(type)) {
                return entry;
            }
        }
        return null;
    }

    public static OccupationType getByDisplay(String display) {
        for (OccupationType entry : OccupationType.values()) {
            if (entry.display.equals(display)) {
                return entry;
            }
        }
        return null;
    }

    public static String[] getByList() {
        int i = 0;
        String[] animalTypeList = new String[OccupationType.values().length];
        for (OccupationType entry : OccupationType.values()) {
            animalTypeList[i] = entry.display;
            i++;
        }
        return animalTypeList;
    }
}
