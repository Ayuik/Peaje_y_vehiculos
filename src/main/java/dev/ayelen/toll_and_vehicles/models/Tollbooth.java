package dev.ayelen.toll_and_vehicles.models;

import dev.ayelen.toll_and_vehicles.InterfaceChargeToll;
import dev.ayelen.toll_and_vehicles.enums.Toll;
import dev.ayelen.toll_and_vehicles.enums.VehicleKind;

public class Tollbooth implements InterfaceChargeToll {
    protected String name;
    protected String city;
    protected float earnings;

    public Tollbooth() {
        this.name = name;
        this.city = city;
        this.earnings = 0F;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public float getEarnings() {
        return earnings;
    }

    public void updateEarnings(float newEarnings) {
        this.earnings += newEarnings;
    }

    @Override
    public float chargeToll(Vehicle vehicle) {
        if (vehicle.getType() == VehicleKind.CAR) {
            return Toll.CAR.getValue();
        } else if (vehicle.getType() == VehicleKind.MOTORCYCLE) {
            return Toll.MOTORCYCLE.getValue();

        }
        return 0F;
    }

}
