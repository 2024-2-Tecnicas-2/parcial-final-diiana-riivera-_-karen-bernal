package logicaNegocio;

class Delfin extends Animal {
    // TODO: Aquí va tu código
    public Delfin() {
        this.habitat = TipoHabitat.ACUATICO;
    }
 
    public String emitirSonido() {
        return "Chirrido";
    }
    
    public String obtenerDieta() {
        return "Pescado";
    }
}
