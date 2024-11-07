import ParcialFinal2.Animal;
import ParcialFinal2.Domestico;
import ParcialFinal2.Perro;
import ParcialFinal2.TipoHabitat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PerroTest extends AnimalTest {

    @Override
    @Test
    void testEmitirSonido() {
        Animal perro = new Perro(null);
        assertEquals("Ladrido", perro.emitirSonido());
    }

    @Override
    @Test
    void testObtenerDieta() {
        Animal perro = new Perro(null);
        assertEquals("Omnívoro", perro.obtenerDieta());
    }

    @Test
    void testPerroHabitat() {
        Animal perro = new Perro(null);
        assertEquals(TipoHabitat.TERRESTRE, perro.getHabitat());
    }

    @Test
    void testPerroInteractuarConHumano() {
        Domestico perro = (Domestico) new Perro(null);
        assertEquals("El perro mueve la cola y ladra de felicidad", perro.interactuarConHumano());
    }
}
