package dev.ayelen.toll_and_vehicles.views;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TollboothViewsTest {
    @Test
    @DisplayName("Should print correct output")
    void testIndexPrintsOutput() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        TollboothViews views = new TollboothViews();
        views.index();
        String expectedOutput = "=======================================\n" +
                                "    Estación de Peaje: \"Peaje Central\"\n" +
                                "    Ciudad: Llanera, Asturias\n";
        assertTrue(outContent.toString().contains(expectedOutput));
        System.setOut(System.out);
    }

}
