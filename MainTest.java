package example;

import java.Main;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    void testFiltrarMulheres() {
        List<String> entrada = List.of("MARCIO-m", "LUARA-f", "LETICIA-f");
        List<String> listaDeNomes = List.of("LUARA-f", "LETICIA-f");

        List<String> resultado = Main.filtrarMulheres(entrada);

        assertEquals(listaDeNomes, resultado);
    }
}