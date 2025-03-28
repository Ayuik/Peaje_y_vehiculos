package dev.ayelen.toll_and_vehicles.controllers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dev.ayelen.toll_and_vehicles.models.Tollbooth;
import dev.ayelen.toll_and_vehicles.models.Vehicle;


public class TollboothControllerTest {

    @Test
    @DisplayName("Should create a vehicle and add it to the list with the information received from view")
    void testSaveVehicle() {
        int axles = 2;
        String plate = "123asd";
        int type = 3;
        Tollbooth tollbooth = new Tollbooth();
        TollboothController controller = new TollboothController(tollbooth);
        controller.saveVehicle(plate, type, axles);
        List<Vehicle> list = tollbooth.getVehiclesList();
        assertThat(list.size(), is(1));

    }

    @Test
    @DisplayName("Should return the toll for the created vehicle")
    void testSaveVehicle_providetoll() {
        int axles = 2;
        String plate = "123asd";
        int type = 3;
        Tollbooth tollbooth = new Tollbooth();
        TollboothController controller = new TollboothController(tollbooth);
        float toll = controller.saveVehicle(plate, type, axles);
        assertThat(toll, is(100F));
    }

}