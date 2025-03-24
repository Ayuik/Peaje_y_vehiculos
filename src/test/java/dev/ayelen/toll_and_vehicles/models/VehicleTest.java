package dev.ayelen.toll_and_vehicles.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class VehicleTest {

    @Test
    @DisplayName("Should create a vehicle with a plate and a type")
    void testVehicle() {
        Vehicle vehicleOne = new Vehicle();
        vehicleOne.setPlate("ABC123");
        vehicleOne.setType(VehicleType.CAR);
        String plate = vehicleOne.getPlate();
        VehicleType type = vehicleOne.getType();
        assertThat(plate, is("ABC123"));
        assertThat(type, is(VehicleType.CAR));        
    }
}
