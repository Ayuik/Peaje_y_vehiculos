package dev.ayelen.toll_and_vehicles;

import dev.ayelen.toll_and_vehicles.enums.Toll;
import dev.ayelen.toll_and_vehicles.models.Vehicle;

public interface InterfaceChargeToll {
    public float chargeToll_car(Vehicle vehicle, Toll toll);

}
