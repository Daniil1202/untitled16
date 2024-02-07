package src.GenderType;

public enum Gender {
    MALE("Мужской"),
    FAMALE("Женский");
    private final String label;

    Gender(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
