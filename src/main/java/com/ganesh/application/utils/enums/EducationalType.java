package com.ganesh.application.utils.enums;

public enum EducationalType
{
   UNDERGRDADUATE("UNDERGRDADUATE","Undergradute"),
    MASTER("MASTER","Master"),
    PHD("PHD","P.H.d");



    private String type;
    private String display;

    EducationalType(String type, String display) {
        this.type = type;
        this.display = display;
    }

    public String getType() {
        return type;
    }

    public String getDisplay() {
        return display;
    }

    public static EducationalType getByType(String type) {

        for (EducationalType  entry : EducationalType.values()) {
            if (entry.type.equals(type)) {
                return entry;
            }
        }
        return null;
    }

    public static EducationalType  getByDisplay(String display) {
        for (EducationalType entry : EducationalType.values()) {
            if (entry.display.equals(display)) {
                return entry;
            }
        }
        return null;
    }

    public static String[] getByList() {
        int i = 0;
        String[] animalTypeList = new String[EducationalType .values().length];
        for (EducationalType  entry : EducationalType .values()) {
            animalTypeList[i] = entry.display;
            i++;
        }
        return animalTypeList;
    }
}
