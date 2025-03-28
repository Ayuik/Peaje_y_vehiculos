package dev.ayelen.toll_and_vehicles.controllers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dev.ayelen.toll_and_vehicles.models.Tollbooth;
import dev.ayelen.toll_and_vehicles.models.Vehicle;
import dev.ayelen.toll_and_vehicles.views.TollboothViews;

public class TollboothControllerTest {
    Tollbooth tollbooth;
    TollboothController controller;
    TollboothViews views;

    @BeforeEach
    void setUp() {
        tollbooth = new Tollbooth();
        controller = new TollboothController(tollbooth, views);
    }

    @Test
    @DisplayName("Should create a vehicle and add it to the list with the information received from view")
    void testSaveVehicle() {
        int axles = 2;
        String plate = "123asd";
        int type = 3;
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
        float toll = controller.saveVehicle(plate, type, axles);
        assertThat(toll, is(100F));
    }

    @Test
    @DisplayName("Should update earnings")
    void testSaveVehicle_updateearnings() {
        int axles = 2;
        String plate = "123asd";
        int type = 3;
        TollboothController controller = new TollboothController(tollbooth);
        controller.saveVehicle(plate, type, axles);
        assertThat(tollbooth.getEarnings(), is(100F));
    }

    @Test
    @DisplayName("Should ask Views to run index")
    void testIndex() {
        TollboothViews mockViews = mock(TollboothViews.class);
        TollboothController controller = new TollboothController(tollbooth, mockViews); 
        controller.index();
        verify(mockViews).index();
    }

}