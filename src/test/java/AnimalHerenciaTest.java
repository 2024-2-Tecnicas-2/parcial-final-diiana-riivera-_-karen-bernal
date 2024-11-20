import ParcialFinal2.Animal;
import ParcialFinal2.Delfin;
import ParcialFinal2.Domestico;
import ParcialFinal2.Leon;
import ParcialFinal2.Perro;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnimalHerenciaTest {
    @Test
    void testLeonIsAnimal() {
        Animal leon = new Leon(TipoHabitat.TERRESTRE);
        assertTrue(leon instanceof Animal);
    }

    @Test
    void testDelfinIsAnimal() {
        Animal delfin = new Delfin(TipoHabitat.ACUATICO);
        assertTrue(delfin instanceof Animal);
    }

    @Test
    void testPerroIsAnimalAndDomestico() {
        Animal perro = new Perro(TipoHabitat.TERRESTRE);
        assertTrue(perro instanceof Animal);
        assertTrue(perro instanceof Domestico);
    }
    