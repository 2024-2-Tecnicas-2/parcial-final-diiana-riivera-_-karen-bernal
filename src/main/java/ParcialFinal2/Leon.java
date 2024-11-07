package ParcialFinal2;

class Leon extends Animal {
    public Leon() {
        this.habitat = TipoHabitat.TERRESTRE;
    }
 
    @Override
    public String emitirSonido() {
        return "Rugido";
    }
 
    public String obtenerDieta() {
        return "Carnívoro";
    }
}
