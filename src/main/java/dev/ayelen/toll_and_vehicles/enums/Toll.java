package dev.ayelen.toll_and_vehicles.enums;

public enum Toll {
    CAR (100F), MOTORCYCLE (50F);

    private final float value;

    Toll(float value) {
        this.value = value;
    }

    public float getValue() {
        return value;
    }
}
