public class SmartWatch extends SmartDevice{
    // atributos
    String tamanyoCorrea;
    boolean boton;

    // Contructores
    public SmartWatch(String pantalla, Boolean conexionSatelite, int precio, String tamanyoCorrea, boolean boton) {
        super(pantalla, conexionSatelite, precio);
        this.tamanyoCorrea = tamanyoCorrea;
        this.boton = boton;
    }

    public SmartWatch() {
    }

    // Getters & Setters

    public String getTamanyoCorrea() {
        return tamanyoCorrea;
    }

    public void setTamanyoCorrea(String tamanyoCorrea) {
        this.tamanyoCorrea = tamanyoCorrea;
    }

    public boolean isBoton() {
        return boton;
    }

    public void setBoton(boolean boton) {
        this.boton = boton;
    }

    // Metodo To String

    @Override
    public String toString() {
        return "SmartWatch{" +
                "pantalla='" + pantalla + '\'' +
                ", conexionSatelite=" + conexionSatelite +
                ", precio=" + precio +
                ", tamanyoCorrea='" + tamanyoCorrea + '\'' +
                ", boton=" + boton +
                '}';
    }
}
