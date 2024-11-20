import ParcialFinal2.Animal;
import ParcialFinal2.Delfin;
import ParcialFinal2.Leon;
import ParcialFinal2.TipoHabitat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public abstract class AnimalTest {
@Test
void testHabitatSetterAndGetter() {
    Animal leon = new Leon(TipoHabitat.TERRESTRE);
    assertEquals(TipoHabitat.TERRESTRE, leon.getHabitat());
    
    Animal delfin = new Delfin(TipoHabitat.ACUATICO);
    assertEquals(TipoHabitat.ACUATICO, delfin.getHabitat());
   }
}
