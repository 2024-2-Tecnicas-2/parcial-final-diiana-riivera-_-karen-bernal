package ParcialFinal2;

public class Perro {

    public Perro(Object par0) {
    }

    public Object emitirSonido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
class Perro extends Animal implements Domestico {
    public Perro() {
        this.habitat = TipoHabitat.TERRESTRE;
    }
 
    @Override
    public String emitirSonido() {
        return "Ladrido";
    }
 
    @Override
    public String obtenerDieta() {
        return "Omnívoro";
    }
 
    @Override
    public String interactuarConHumano() {
        return "El perro mueve la cola y ladra de felicidad";
    }
}
}
