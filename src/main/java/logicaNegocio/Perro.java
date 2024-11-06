package logicaNegocio;

public class Perro {
class Perro extends Animal implements Domestico {
    public Perro() {
        this.habitat = TipoHabitat.TERRESTRE;
    }
 
    public String emitirSonido() {
        return "Ladrido";
    }
 
    public String obtenerDieta() {
        return "Omnívoro";
    }
 
    public String interactuarConHumano() {
        return "El perro mueve la cola y ladra de felicidad";
    }
}
}
