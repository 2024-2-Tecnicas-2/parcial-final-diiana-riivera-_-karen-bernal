import ParcialFinal2.Domestico;
import ParcialFinal2.Perro;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DomesticoTest {

    @Test
    void testInteraccionConHumano() {
        Domestico perro = (Domestico) new Perro(null);
        assertEquals("El perro mueve la cola y ladra de felicidad", perro.interactuarConHumano());
    }
}
