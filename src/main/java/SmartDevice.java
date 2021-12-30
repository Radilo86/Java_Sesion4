// Clase abstracta desde la que se heredara
public abstract class SmartDevice {
    // atributos
    String pantalla;
    Boolean conexionSatelite;
    int precio;

    // Constructor con parametros
    public SmartDevice(String pantalla, Boolean conexionSatelite, int precio) {
        this.pantalla = pantalla;
        this.conexionSatelite = conexionSatelite;
        this.precio = precio;
    }
    // Consructor vacio
    public SmartDevice() {
    }

    // Metodos Getter & Setter
    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public Boolean getConexionSatelite() {
        return conexionSatelite;
    }

    public void setConexionSatelite(Boolean conexionSatelite) {
        this.conexionSatelite = conexionSatelite;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    // Metodo ToString para presentar por pantalla.
    @Override
    public String toString() {
        return "SmartDevice{" +
                "pantalla='" + pantalla + '\'' +
                ", conexionSatelite=" + conexionSatelite +
                ", precio=" + precio +
                '}';
    }
}
