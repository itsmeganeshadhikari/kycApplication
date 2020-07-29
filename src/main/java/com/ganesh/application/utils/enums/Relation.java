package com.ganesh.application.utils.enums;

public enum Relation {

    FATHER("FATHER", "Father"),
    MOTHER("MOTHER", "Mother"),
    HUSBAND("HUSBAND", "Husband"),
    WIFE("WIFE", "Wife"),
    BROTHER("BROTHER", "Brother"),
    SISTER("SISTER", "Sister"),
    SISTERINLAW("SISTERINLAW", "Sister-In-Law"),
    BROTHERINLAW("BROTHERINLAW", "Brother-In-Law"),
    SON("SON", "Son"),
    DAUGHTER("DAUGHTER", "Daughter"),
    UNCLE("UNCLE", "Uncle"),
    AUNT("AUNT", "Aunt"),
    OTHER("OTHER", "Other");

    private String type;
    private String display;

    Relation(String type, String display) {
        this.type = type;
        this.display = display;
    }

    public String getType() {
        return type;
    }

    public String getDisplay() {
        return display;
    }

    public static Relation getByType(String type) {

        for (Relation entry : Relation.values()) {
            if (entry.type.equals(type)) {
                return entry;
            }
        }
        return null;
    }

    public static Relation getByDisplay(String display) {
        for (Relation entry : Relation.values()) {
            if (entry.display.equals(display)) {
                return entry;
            }
        }
        return null;
    }

    public static String[] getByList() {
        int i = 0;
        String[] animalTypeList = new String[Relation.values().length];
        for (Relation entry : Relation.values()) {
            animalTypeList[i] = entry.display;
            i++;
        }
        return animalTypeList;
    }

}
